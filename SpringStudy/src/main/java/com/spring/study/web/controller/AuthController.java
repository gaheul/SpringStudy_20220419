package com.spring.study.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AuthController {
	@RequestMapping(value = "/auth/signin", method = RequestMethod.GET) //value : mapping주소
	public String signin() {
		return "auth/signin"; //viewresolver에서 처리(/WEB-INF/views/... .jsp)
	}
	
	@RequestMapping(value = "/auth/signup", method = RequestMethod.GET)
	public String signup() {
		return "auth/signup";
	}
	
	@ResponseBody //viewresolver를 거치지 않고 client에게 바로 response
	@RequestMapping(value = "/auth/signin/data", method = RequestMethod.GET , produces = "text/plain;charset=utf-8")
	public String signinData() {
		return "일반 텍스트 데이터를 응답합니다.";
	}
}
