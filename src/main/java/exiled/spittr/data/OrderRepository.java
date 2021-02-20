package exiled.spittr.data;

import exiled.spittr.orders.Order;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.mongodb.repository.MongoRepository;

@Cacheable
public interface OrderRepository extends MongoRepository<Order, String> {
}
