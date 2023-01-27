package com.fastcampus.keeptheline.controller.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import java.util.List;

import static org.springframework.web.servlet.function.RouterFunctions.route;
import static org.springframework.web.servlet.function.RequestPredicates.path;

@Configuration
public class APIPlaceRouter {
    // 함수형 프로그래밍 예시
    // APIPlaceController 와 상응

    @Bean
    public RouterFunction<ServerResponse> placeRouter(
            APIPlaceHandler apiPlaceHandler
    ){
        return route().nest(path("/api/places"), builder -> builder
                .GET("", apiPlaceHandler::getPlaces)
                .POST("", apiPlaceHandler::createPlace)
                .GET("/{placeId}", apiPlaceHandler::getPlaceDetail)
                .PUT("/{placeId}", apiPlaceHandler::modifyPlace)
                .DELETE("/{placeId}", apiPlaceHandler::removePlace)
        ).build();
    }
}
