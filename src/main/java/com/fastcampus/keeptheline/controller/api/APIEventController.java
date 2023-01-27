package com.fastcampus.keeptheline.controller.api;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class APIEventController {
    @GetMapping("/events")
    public List<String> getEvents(){
        return null;
    }
    @PostMapping("/events")
    public Boolean createEvent(){
        return null;
    }
    @GetMapping("/events/{eventId}")
    public String getEventDetail(
            @PathVariable Integer eventId
    ){
        return null;
    }
    @PutMapping("/events/{eventId}")
    public Boolean modifyEvent(
            @PathVariable Integer eventId
    ){
        return null;
    }
    @DeleteMapping("/events/{eventId}")
    public Boolean removeEvent(
            @PathVariable Integer eventId
    ){
        return null;
    }
}
