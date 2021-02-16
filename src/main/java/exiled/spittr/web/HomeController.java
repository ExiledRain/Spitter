package exiled.spittr.web;

import exiled.spittr.orders.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping({"/","/home"})
public class HomeController {
    @Autowired
    private MongoOperations mongo;



    @RequestMapping(method = GET)
    public String home() {
        mongo.save(new Order(),"order");
        return "home";
    }
}
