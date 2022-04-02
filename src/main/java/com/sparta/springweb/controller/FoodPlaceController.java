package com.sparta.springweb.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FoodPlaceController {
    private final FoodPlaceService foodPlaceService;

    @PostMapping("/restaurant/register")
    pubilc FoodPlace registerFoodPlace(@RequestBody RestaurantDto restaurantDto){
        return FoodPlaceService.registerFoodPlace(restaurantDto);
    }
}
