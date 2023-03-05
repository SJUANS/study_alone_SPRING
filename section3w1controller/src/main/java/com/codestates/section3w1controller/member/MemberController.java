package com.codestates.section3w1controller.member;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/*Spring MVC에서는 특정 클래스에 @RestController 를 추가하면 해당 클래스가 REST API의 리소스(자원, Resource)를 처리하기 위한 API 엔드포인트(=컨트롤러)로 동작함을 정의합니다.
또한 @RestController 가 추가된 클래스는 애플리케이션 로딩 시, Spring Bean으로 등록해줍니다.*/
@RequestMapping("/v1/members")
/*@RequestMapping 은 클라이언트의 요청과 핸들러 메서드(Handler Method, 클라이언트 요청을 처리)를 매핑해주는 역할을 합니다.
  또한 클래스 전체에 사용되는 공통 URL(Base URL) 설정을 합니다.*/
public class MemberController {
}
