package com.example.springbootmongo.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
public class mongodbconfig {

    @Bean
    public MongoClient mongoClient(){
        return MongoClients.create("mongodb://mongodb:27017");
    }
}
