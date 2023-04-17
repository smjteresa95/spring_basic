package com.example.constructorInjection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/*
 * @Configuration
 * 설정클래스(config clas)를 정의할 때 사용한다.
 * configuation 클래스에서 하나 이상의 @Bean 메서드를 정의할 때 사용된다. 
 * 
 * Spring IoC 컨테이너가 Application context 를 
 * 초기화 하는 데 필요한 모든 Bean을 생성하고 등록할 수 있다.  
 */

@Configuration

/*
 *  @ComponentScan
 *  spring bean/components를 스캔하기 위한 base package를 지정하기 위해 사용된다.
 *  
 *  애플리케이션 컴포넌트를 검색하여 자동으로 스프링 빈으로 등록할 수 있다.
 *  
 *  com.example.constructorInjection 패키지 내의 모든 클래스를 스캔한다.
 */
@ComponentScan(basePackages = "com.example.constructorInjection")

public class AppConfig {

}
