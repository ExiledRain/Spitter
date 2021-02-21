package exiled.spittr.config;

import exiled.spittr.Spittle;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.io.Serializable;

public class SpittlePermissionEvaluator implements PermissionEvaluator {
    private static final GrantedAuthority ADMIN_AUTHORITY = new SimpleGrantedAuthority("ROLE_ADMIN");

    @Override
    public boolean hasPermission(Authentication authentication, Object o, Object permission) {
        if (o instanceof Spittle) {
            Spittle spittle = (Spittle) o;
            String username = spittle.getSpitter().getUsername();
            if ("delete".equals(permission)) {
                return isAdmin(authentication) ||
                        username.equals(authentication.getName());
            }
        }

        throw new UnsupportedOperationException(
                "hasPermission not supported for object <" + o + "> and permission <" + permission + ">"
        );
    }

    @Override
    public boolean hasPermission(Authentication authentication, Serializable serializable, String s, Object o) {
        throw new UnsupportedOperationException();
    }

    private boolean isAdmin(Authentication authentication) {
        return authentication.getAuthorities().contains(ADMIN_AUTHORITY);
    }
}
