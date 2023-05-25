package com.lcwd.core;

import com.lcwd.core.coupling.Animal;
import com.lcwd.core.coupling.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import test.Test;

@SpringBootApplication
@ComponentScan(basePackages = {"com.lcwd.core","test"})
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);
		Person personBean = context.getBean(Person.class);
		personBean.playWithAnimal();
		System.out.println(personBean);


	}

}

/*

--------------------- Types of Injection ----------------------------

	Different ways of Dependency Injection

		1. Constructor based Dependency Injection
				@Autowired
				public Student(args){

				}
		2. Setter based Dependency Injection
				private Animal animal;
				@Autowired
				public void setAnimal(Animal animal){
				this.animal = animal;
				}
		3. Field or Property-based Dependency Injection
				@Autowired
				private Animal animal;



 */
