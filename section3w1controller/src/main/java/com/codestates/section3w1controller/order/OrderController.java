package com.codestates.section3w1controller.order;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/orders", produces = {MediaType.APPLICATION_JSON_VALUE})
public class OrderController {
    @PostMapping
    public String postOrder(@RequestParam("memberId") long memberId,
                            @RequestParam("coffeeId") long coffeeId) {
        System.out.println("# memberId: " + memberId);
        System.out.println("# coffeeId: " + coffeeId);

        String response =
                "{\"" +
                        "memberId\":\""+memberId+"\"," +
                        "\"coffeeId\":\""+coffeeId+"\"" +
                        "}";
        return response;
    }
    @GetMapping("/{order-id}")
    // 특정 주문 제공하는 메소드
    public String getOrder(@PathVariable("order-id") long orderId) {
        System.out.println("# orderId: " + orderId);
        return null; // 리턴타입이 있는 함수에 null return 가능하나... 비어있는 객체나 Optional 반환이 바람직하다
        // 컬렉션, 스트림, 배열, 옵셔널 같은 컨테이너 타입은 비어있는 객체 반환이 바람직
    }
    @GetMapping
    public String getOrders() {
        System.out.println("# get Orders");

        // not implementation
        return null;
    }
}
