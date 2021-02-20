package exiled.spittr.data.impl;

import exiled.spittr.Spitter;
import exiled.spittr.data.SpitterRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class SpitterRepositoryImpl implements SpitterRepository {
    @Override
    public Spitter save(Spitter spitter) {
        return null;
    }

    @Override
    @Cacheable("spittleCache")
    public Spitter findByUsername(String username) {
        return null;
    }

    @Override
    public void remove() {

    }
}
