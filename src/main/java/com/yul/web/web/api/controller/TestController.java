package com.yul.web.web.api.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {
	
	@PostMapping("/test01")
	Map<String, Object> test(@RequestBody Map<String, Object> param) {
		System.out.println("param ::: " + param);
		System.out.println("name ::: " + param.get("name"));
		System.out.println("age ::: " + param.get("age"));
		return param;
	}
	
}
