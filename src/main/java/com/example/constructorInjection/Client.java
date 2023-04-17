package com.example.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		//보낼 메시지를 저장한다.
		String message = "Hi, Good morning. Have a nice day!";
		
		//ApplicationContext: spring container를 초기화하고 구성 파일에서 등록된 빈을 가지고 오는 역할을 한다.
		//AnnotationConfigApplicationContext 클래스: Java구성 클래스에서 Bean구성정보를 가져와서 Spring Container를 초기화 한다.
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Spring containter에서 MessageSender Bean을 가져온다. 
		//getBean() 메서드는 Bean이름이나 타입으로 검색 할 수 있다. 
		MessageSender messageSender = applicationContext.getBean(MessageSender.class);
		
		/*
		 * 가져온 MessageSender 빈을 사용해서 메시지를 보낸다. 
		 */
		messageSender.sendMessage(message);
	}
}
