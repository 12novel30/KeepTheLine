package com.fastcampus.keeptheline.controller.api;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import java.net.URI;
import java.util.List;

import static org.springframework.web.servlet.function.ServerResponse.ok;
import static org.springframework.web.servlet.function.ServerResponse.created;

@Component
public class APIPlaceHandler {
    // for 함수형 구현 - 핸들러

    public ServerResponse getPlaces(ServerRequest request){
        return ok().body(List.of("place1", "place2"));
    }
    public ServerResponse createPlace(ServerRequest request){
        return created(URI.create("api/places/1"))
                .body(true); // TODO: 1은 구현할 때 제대로 넣어줄 것
    }    public ServerResponse getPlaceDetail(ServerRequest request){
        return ok().body("place" + request.pathVariable("placeId"));
    }    public ServerResponse modifyPlace(ServerRequest request){
        return ok().body(true);
    }    public ServerResponse removePlace(ServerRequest request){
        return ok().body(true);
    }
}
