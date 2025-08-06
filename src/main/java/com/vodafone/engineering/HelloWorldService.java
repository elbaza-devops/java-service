package com.vodafone.engineering;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

	@Value("${spring-service-dh.hello_message}")
	String hello_message;

	public String getHelloMessage() {
		return hello_message;
	}

}
