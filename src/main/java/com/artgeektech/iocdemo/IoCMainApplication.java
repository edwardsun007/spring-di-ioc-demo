package com.artgeektech.iocdemo;

import com.artgeektech.iocdemo.tesla.Tesla;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IoCMainApplication {

    public static void main(String[] args) {

//        ApplicationContext IoCContainer = new AnnotationConfigApplicationContext();
//        ((AbstractApplicationContext) IoCContainer).refresh();
        ApplicationContext IoCContainer = SpringApplication.run(IoCMainApplication.class, args);
        //Tesla tesla = new Tesla();

        Tesla tesla = IoCContainer.getBean(Tesla.class);

        tesla.start();
    }
}
