package com.example.constructorInjection.service;

import org.springframework.stereotype.Component;

import com.example.constructorInjection.MessageService;

//component 주석을 달아서 
//Spring container가 자동으로 Spring bean을 생성하고 
//life cycle를 관리하게끔 한다.

@Component("smsService")
public class SMSService implements MessageService{
	
	@Override
	public void sendMessage(String message) {
		System.out.println(message);
	}
}
