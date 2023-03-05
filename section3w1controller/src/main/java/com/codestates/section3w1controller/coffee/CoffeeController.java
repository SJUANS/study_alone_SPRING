package com.codestates.section3w1controller.coffee;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/coffees", produces = MediaType.APPLICATION_JSON_VALUE)
public class CoffeeController {
    @PostMapping
    public String postCoffee(@RequestParam("engName") String engName,
                             @RequestParam("korName") String korName,
                             @RequestParam("price") int price){
        String response =
                "{\"" +
                        "engName\":\""+engName+"\"," +
                        "\"korName\":\""+korName+"\"," +
                        "\"price\":\""+price+
                        "\"}";
        return response;
    }
    @GetMapping("{coffee-id}")
    public String getCoffee(@PathVariable("coffee-id") long coffeeId){
//        System.out.println("# "+korName()); 지역변수 안에 이름 변수가 없으므로 프린트 불가
        System.out.println("# coffeeId:" + coffeeId);
        return null;
    }
    @GetMapping
    public String getCoffee(){
        System.out.println("# All coffees list");
        return null;
    }
}
