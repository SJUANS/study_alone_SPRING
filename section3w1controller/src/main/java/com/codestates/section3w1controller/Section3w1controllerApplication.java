package com.codestates.section3w1controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*@SpringBootApplication 은 코드 상에서는 보이지 않지만 내부적으로 세가지 일을 해줍니다.

자동 구성을 활성화합니다.
애플리케이션 패키지 내에서 @Component가 붙은 클래스를 검색한 후(scan), Spring Bean으로 등록하는 기능을 활성화합니다.
@Configuration 이 붙은 클래스를 자동으로 찾아주고, 추가적으로 Spring Bean을 등록하는 기능을 활성화합니다.*/

public class Section3w1controllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Section3w1controllerApplication.class, args);
		/*Spring 애플리케이션을 부트스트랩하고, 실행하는 역할을 합니다.
		부트스트랩(Bootstrap)이란?
		애플리케이션이 실행되기 전에 여러가지 설정 작업을 수행하여 실행 가능한 애플리케이션으로 만드는 단계를 의미합니다.*/
	}

}
