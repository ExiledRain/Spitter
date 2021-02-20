package exiled.spittr.data;

import exiled.spittr.Spitter;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

public interface SpitterRepository {
    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);

    @CacheEvict("spittleCache")
    void remove();
}
