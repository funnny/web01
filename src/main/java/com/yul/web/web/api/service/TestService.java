package com.yul.web.web.api.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	public Map<String, Object> test01Service(Map<String, Object> param) {
		System.out.println("service param ::: " + param);
		return param;
	}
}
