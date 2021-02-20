package exiled.spittr.data.impl;

import exiled.spittr.Spittle;
import exiled.spittr.data.SpittleRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpittleRepositoryImpl implements SpittleRepository {
    @Override
    public List<Spittle> findSpittles(long max, int count) {
        return null;
    }

    @Cacheable(
            value = "spittleCache",
            unless = "#result.message.contains('NoCache')",
            condition = "#id >= 10")
    @Override
    public Spittle findOne(long spittleId) {
        return null;
    }

    @Override
    public void save(Spittle spittle) {

    }
}
