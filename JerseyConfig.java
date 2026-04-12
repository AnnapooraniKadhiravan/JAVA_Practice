package com.wipro.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.ws.rs.ApplicationPath;

@Configuration
@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(com.wipro.Movies.MovieResource.class);
    }
}