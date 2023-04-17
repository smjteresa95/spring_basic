package com.example.constructorInjection.service;

import org.springframework.stereotype.Component;

import com.example.constructorInjection.MessageService;

/*
 * @Component 주석으로 클래스를 Bean으로 등록한다.
 * @Bean 주석은 메서드를 Bean으로 등록할 때 사용한다. 
 */
@Component
public class EmailService implements MessageService {
	
	@Override
	public void sendMessage(String message) {
		System.out.println(message);
	}

}
