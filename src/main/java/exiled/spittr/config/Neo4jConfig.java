package exiled.spittr.config;

import org.springframework.boot.autoconfigure.neo4j.Neo4jAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableNeo4jRepositories
public class Neo4jConfig extends Neo4jAutoConfiguration {
}
