package com.codestates.section3w1controller.member;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
/**Spring MVC에서는 특정 클래스에 @RestController 를 추가하면 해당 클래스가 REST API의 리소스(자원, Resource)를 처리하기 위한 API 엔드포인트(=컨트롤러)로 동작함을 정의합니다.
또한 @RestController 가 추가된 클래스는 애플리케이션 로딩 시, Spring Bean으로 등록해줍니다.*/
@RequestMapping(value = "/v1/members", produces = {MediaType.APPLICATION_JSON_VALUE})
/** @RequestMapping 은 클라이언트의 요청과 핸들러 메서드(Handler Method, 클라이언트 요청을 처리)를 매핑해주는 역할을 합니다.
  또한 클래스 전체에 사용되는 공통 URL(Base URL) 설정을 합니다. */
/** produces애트리뷰트(Attribute)는 응답 데이터를 어떤 미디어 타입으로 클라이언트에게 전송할 지를 설정합니다.
여기서는 JSON 형식의 데이터를 응답 데이터로 전송하겠다는 의미로 MediaType.APPLICATION_JSON_VALUE 값을 설정했습니다.
이 값을 설정하지 않으면 현재 코드에서는 JSON 형식의 데이터를 응답으로 전송하지 않고, 문자열 자체를 전송합니다. */
/** APPLICATION_JSON_VALUE는 JSON 타입에 들어갈 데이터만 담고 있는 요청을 처리하겠다는 의미 */
/** URL 앞에 value 애트리뷰트 설정해야 함(다른 애트리뷰트가 생겼으므로) */
public class MemberController {
    @PostMapping
    public String postMember(@RequestParam("email") String email,
                             /** @RequestParam = HttpServletRequest 객체가 받은 파라미터*/
                             @RequestParam("name") String name,
                             @RequestParam("phone") String phone) {
        System.out.println("# email: " + email);
        System.out.println("# name: " + name);
        System.out.println("# phone: " + phone);

        String response =
                "{\"" +
                        "email\":\""+email+"\"," +
                        "\"name\":\""+name+"\",\"" +
                        "phone\":\"" + phone+
                        "\"}";
        return response;
    }

    @GetMapping("/{member-id}")
    public String getMember(@PathVariable("member-id")long memberId)
    /** @PathVariable역시 핸들러 메서드의 파라미터 종류 중 하나입니다.

     @PathVariable의 괄호 안에 입력한 문자열 값은 @GetMapping("/{member-id}") 처럼 중괄호({ }) 안의 문자열과 동일해야 합니다. 여기서는 두 문자열 모두 “member-id” 로 동일하게 지정해주었습니다.
     만약 두 문자열이 다르다면 MissingPathVariableException이 발생합니다.*/
    {
        System.out.println("# memberId: " + memberId);

        // not implementation
        return null;
    }

    @GetMapping
    public String getMembers() {
        System.out.println("# get Members");

        // not implementation
        return null;
    }
}
