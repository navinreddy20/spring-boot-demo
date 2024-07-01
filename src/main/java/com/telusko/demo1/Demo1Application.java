package com.telusko.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Demo1Application.class, args);

		Alien paras = context.getBean(Alien.class);
		paras.setAge(12);
		paras.build();

		Alien gokul = context.getBean(Alien.class);
		gokul.build();

	}

}
