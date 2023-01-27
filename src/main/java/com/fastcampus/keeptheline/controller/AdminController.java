package com.fastcampus.keeptheline.controller;

import com.fastcampus.keeptheline.constant.PlaceType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/admin")
@Controller
public class AdminController {

    @GetMapping("/places")
    public ModelAndView adminPlaces(
            PlaceType placeType,
            String placeName,
            String address){
        // @RequestParam 은 필수-안쓰면 생략 가능
        // http://localhost:8080/admin/places?placeType=COMMON 등으로 전송 가능
        Map<String, Object> map = new HashMap<>();
        map.put("placeType", placeType);
        map.put("placeName", placeName);
        map.put("address", address);
        return new ModelAndView("admin/places", map);
    }
    @GetMapping("/places/{placeId}")
    public String adminPlacesDetail(
            @PathVariable Integer placeId){
        return "admin/place-detail";
    }    @GetMapping("/events")
    public String adminEvents(){
        return "admin/events";
    }    @GetMapping("/events/{eventId}")
    public String adminPlaces(
            @PathVariable Integer eventId
    ){
        return "admin/event-detail";
    }

}
