package exiled.spittr.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Arrays;

@Configuration
@EnableMongoRepositories("orders")
public class MongoConfig extends AbstractMongoClientConfiguration {
    @Autowired
    private Environment env;

    @Bean
    public Mongo mongo() {
        MongoCredential credential = MongoCredential.createMongoCRCredential(
                env.getProperty("mongo.username"),
                "orders",
                env.getProperty("mongo.password").toCharArray()
        );
        return new MongoClient(
                new ServerAddress("localhost", 37017),
                Arrays.asList(credential)
        );
    }

//    @Bean
//    public MongoOperations mongoTemplate(Mongo mongo) {
//        return  new MongoTemplate(mongo,"orders");
//    }

    @Override
    protected String getDatabaseName() {
        return "orders";
    }
}
