package exiled.spittr.data.impl;

import exiled.spittr.Spitter;
import exiled.spittr.Spittle;
import exiled.spittr.data.SpitterRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.access.prepost.PreFilter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpitterRepositoryImpl implements SpitterRepository {

    @PostAuthorize("returnObject.spitter.username==principal.username")
    @Override
    public Spitter save(Spitter spitter) {
        return null;
    }

    @Override
    @PreAuthorize("hasRole('ROLE_SPITTER')")
    @Cacheable("spittleCache")
    public Spitter findByUsername(String username) {
        return null;
    }

    @Secured("ROLE_SPITTER")
    @Override
    public void remove() {

    }

    @PreAuthorize("hasAnyRole({'ROLE_ADMIN','ROLE_SPITTER'})")
    @PreFilter("hasRole('ROLE_ADMIN') || " +
            "targetObject.spitter.username == principal.name")
    public void deleteSpittles(List<Spittle> spittles){

    }

    @PreAuthorize("hasAnyRole({'ROLE_ADMIN','ROLE_SPITTER'})")
    @PreFilter("hasPermission(targetObject,'delete')")
    public void deleteSpittle(List<Spittle> spittles){

    }
}
