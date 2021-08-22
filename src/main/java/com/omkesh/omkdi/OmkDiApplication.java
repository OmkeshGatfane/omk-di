package com.omkesh.omkdi;

import com.omkesh.omkdi.controller.MyController;
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
	}

}
