package com.omkesh.omkdi;

import com.omkesh.omkdi.controller.ConstructorInjectController;
import com.omkesh.omkdi.controller.SetterInjectController;
import com.omkesh.omkdi.controller.MyController;
import com.omkesh.omkdi.controller.PropertyInjectController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OmkDiApplication {

	public static void main(String[] args) {
	ApplicationContext cntx = SpringApplication.run(OmkDiApplication.class, args);
		MyController controller = (MyController) cntx.getBean("myController");
		String greeting =controller.sayHello();
		System.out.println(greeting);
		System.out.println("-------------------property inject context check");
		PropertyInjectController propertyInjectController  = (PropertyInjectController) cntx.getBean("propertyInjectController");
		System.out.println(propertyInjectController.getGreeting());
		System.out.println("-------------------Setter inject context check");
		SetterInjectController setterInjectController =(SetterInjectController) cntx.getBean("setterInjectController");
		System.out.println(setterInjectController.getGreeting());
		System.out.println("-------------------Constructor inject context check");
		ConstructorInjectController constructorInjectController =(ConstructorInjectController) cntx.getBean("constructorInjectController");
		System.out.println(constructorInjectController.getGreeting());
	}

}
