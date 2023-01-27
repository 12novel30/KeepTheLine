package com.fastcampus.keeptheline.controller.api;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class APIPlaceController {
    @GetMapping("/places")
    public List<String> getPlaces(){
        return List.of("place1", "place2");
    }
    @PostMapping("/places")
    public Boolean createPlace(){
        return null;
    }
    @GetMapping("/places/{placeId}")
    public String getPlaceDetail(
            @PathVariable Integer placeId
    ){
        return null;
    }
    @PutMapping("/places/{placeId}")
    public Boolean modifyPlace(
            @PathVariable Integer placeId
    ){
        return null;
    }
    @DeleteMapping("/places/{placeId}")
    public Boolean removePlace(
            @PathVariable Integer placeId
    ){
        return null;
    }
}
