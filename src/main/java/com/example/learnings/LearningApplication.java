package com.example.learnings;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearningApplication {

    public static void main(String[] args){
       ConfigurableApplicationContext context = SpringApplication.run(LearningApplication.class,args);
       for(String s:context.getBeanDefinitionNames()){
           System.out.println(s);
       }

	}
}

//EnableAutoConfiguration

//component
//configuration
// restcontroller
//controller
//service
//repository





