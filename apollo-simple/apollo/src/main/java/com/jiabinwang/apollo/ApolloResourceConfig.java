package com.jiabinwang.apollo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

@Configuration
@ApplicationPath("/apollo")
public class ApolloResourceConfig extends ResourceConfig {

    @PostConstruct
    public void init() {
        register(ApolloResource.class);
    }
}

