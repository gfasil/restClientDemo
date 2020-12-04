package com.fayaman.restclient;

import com.fayaman.restclient.domain.Invitation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestclientApplication implements CommandLineRunner {

    @Autowired
    RestOperations restTemplate;
    public static void main(String[] args) {
        SpringApplication.run(RestclientApplication.class, args);
    }
    @Bean
    public RestTemplate restTemplate(){
        RestTemplate restTemplate=new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
        return restTemplate;
    }
    @Override
    public void run(String... args) throws Exception {
        Invitation result=restTemplate.getForObject("http://localhost:8081/hello", Invitation.class);
        System.out.println(result.getMessage());
    }
}
