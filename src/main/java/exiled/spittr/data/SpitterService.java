package exiled.spittr.data;

import exiled.spittr.Spitter;
import exiled.spittr.Spittle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpitterService {
    List<Spittle> getRecentSpittles(int count);

    void saveSpittle(Spittle spittle);

    void saveSpittler(Spitter spitter);

    Spitter getSpitter(long ig);

    void startFollowing(Spitter follower, Spitter followee);

    List<Spittle> getSpittlesForSpitter(Spitter spitter);

    List<Spittle> getSpittlesForSpitter(String username);

    Spitter getSpitter(String username);

    Spittle getSpittleById(long id);

    void deleteSpittle(long id);

    List<Spitter> getAllSpitters();
}
