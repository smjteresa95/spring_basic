package com.example.constructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
	
	private MessageService emailService;
	private MessageService smsService;

	
	/*
	 * @Autowired
	 * spring bean 의 automatic injection을 위해 사용한다. 
	 * 
	 * 생성자 여러개가 있는 클래스의 경우 @Autowired 주석을 꼭 써주어야 한다. 
	 * 그래야 Spring에서 어느 constructor에 dependency를 주입 할 지 알 수 있다. 
	 */
	
	/*
	 * @qualifer annotation은 @Autowired와 같이 쓰인다. 
	 * 어떤 객체를 주입할지 명시해준다.
	 * 두개 이상의 bean이 같은 타입으로 형성 되었을 때 혼동되지 않게 하기위해 쓴다.
	 */
	
	//생성자
	//@Autowired
	public MessageSender(@Qualifier("emailService") MessageService emailService) {
		
		this.emailService = emailService;
		
		System.out.println("email service: constructor based dependency injection 1");
	}
	
	
	@Autowired
	public MessageSender(@Qualifier("emailService") MessageService emailService, 
						 @Qualifier("smsService") MessageService smsService) {
		
		this.emailService = emailService;
		this.smsService = smsService;
		
		System.out.println("constructor based dependency injection 2");
	}
	
	
	public void sendMessage(String message) {
		
		this.emailService.sendMessage(message);
		this.smsService.sendMessage(message);
	}

	
}
