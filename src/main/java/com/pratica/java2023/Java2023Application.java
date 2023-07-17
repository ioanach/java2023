package com.pratica.java2023;

import com.pratica.java2023.controller.AccountController;
import com.pratica.java2023.service.AccountService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Java2023Application {

    public static void main(String[] args) {
//        System.out.println("Q1:What is Spring?");
//        System.out.println("A1: An open source framework for Java application development");
//        System.out.println("A1: Spring framework provides comprehensive support for building enterprise-level apps,
//        including WEB apps, RESTful APIS and microservice.");
//
//        System.out.println("Q2:What is a framework?");
//        System.out.println("A2: A configurable layer of code, built on top of language primitive APIs");
//		System.out.println("A2: A framework deals with common app problems and provides patterns and structure");
//		System.out.println("A3: Common problems: authentication, logging, database connectivity");
//
//		System.out.println("Q3:What are the differences between framework and libraries?");
//		System.out.println("A3: A library is a collection of classes, build mostly for code reuse and have a well defined API");
//		System.out.println("A3: A framework is a structural, backbone of an app. A framework uses multiple libraries and provides patterns");
//
//		System.out.println("Q4:What common problems does Spring handle?(core features)");
//		System.out.println("A4:1. Inversion of control (IOC)");
//
//		System.out.println("Spring will create a container.It will wrap your application in a Spring Application Context");
//		System.out.println("It will manage object creation and it will handle their dependencies and wiring");

        ConfigurableApplicationContext context = SpringApplication.run(Java2023Application.class, args);

		//Not a bean, I need to instantiate myself with new
		Account account = new Account("012");
		System.out.println(account);

		//a bean, so I just get it from the context
		AccountService as1 = context.getBean(AccountService.class);
		AccountService as2 = context.getBean(AccountService.class);
		System.out.println(as1.toString());
		System.out.println(as2.toString());
		//each time I want the account service bean, I get the same one ---> singleton pattern

		//checkout all the default beans
		for (String s : context.getBeanDefinitionNames()) {
//			System.out.println("This is a bean: " + s);
		}

		// is Printer a bean? No: because it lives outside the package

//		System.out.println("A4:2. Dependency injection");
//		System.out.println("Objects are injected with their dependencies rather than creating them directly");

		AccountController ac = context.getBean(AccountController.class);
		ac.toString(); //checkout AC to see it has the same AccountService instance at this point --> so spring has injected it for us
//
//		System.out.println("A4:3. AOP - Aspect-oriented Programming");
//		System.out.println("In spring, AOP enables you to apply concepts easily in a declarative manner.Eg: logging, security, transaction management");
//
//		System.out.println("A4:4. Data access and persistence");
//		System.out.println("Spring offers support to work easily with data technologies: jdbc, jpa, hibernate etc. It simplifies access and provides abstraction layers to work with data");
//
//		System.out.println("A4:5. Web development");
//		System.out.println("It offers features like: request handling, view resolution, form handling, validation.Mostly uses MVC; Model-view-controller pattern");
//
//		System.out.println("A4:6. Security");
//		System.out.println("Provides security features: authentication, authorization etc");



	}

}
