package exiled.spittr.web;

import exiled.spittr.orders.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.BoundListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping({"/","/home"})
public class HomeController {
    @Autowired
    private JedisConnectionFactory redis;
    @Autowired
    private StringRedisTemplate tm;



    @RequestMapping(method = GET)
    public String home() {
        BoundListOperations<String,Product> cart = tm.boundListOps("cart");
        Product popped = cart.rightPop();
        return "home";
    }
}
