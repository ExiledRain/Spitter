package exiled.spittr.data;

import exiled.spittr.orders.Order;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.mongodb.repository.MongoRepository;

@CachePut(value = "spittleCache", key = "#result.id")
public interface OrderRepository extends MongoRepository<Order, String> {
}
