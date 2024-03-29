package com.reactivespring.router;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class ReviewRouter {

  @Bean
  public RouterFunction<ServerResponse> reviewsRoute(){

    return route()
        .GET("/v1/helloworld",(request -> ServerResponse.ok().bodyValue("helloworld")))
        .build();
  }
}
