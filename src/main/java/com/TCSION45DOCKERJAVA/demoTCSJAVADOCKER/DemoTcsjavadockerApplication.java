package com.TCSION45DOCKERJAVA.demoTCSJAVADOCKER;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoTcsjavadockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoTcsjavadockerApplication.class, args);
	}
	
/*	
	FROM openjdk:8-jdk-alpine
	EXPOSE 8080:8080
	ARG JAR_FILE=target.jar
	COPY ${JAR_FILE} app.jar
	ENTRYPOINT ["java","-jar","/app.jar"]
	*/

}
