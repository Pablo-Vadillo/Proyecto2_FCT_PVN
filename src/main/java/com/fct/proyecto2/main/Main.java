package com.fct.proyecto2.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fct.proyecto2.model.Coche;
import com.fct.proyecto2.service.CocheService;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		CocheService cocheService = context.getBean(CocheService.class);
		
		Coche coche = cocheService.crearCoche("Toyota", "Corola");
		System.out.println(coche);
	}

}
