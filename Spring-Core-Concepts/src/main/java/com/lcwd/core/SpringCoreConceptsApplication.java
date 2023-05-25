package com.lcwd.core;

import com.lcwd.core.coupling.Animal;
import com.lcwd.core.coupling.Person;
import com.lcwd.core.coupling.Samosa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
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

--------------------- Another way of Creating Bean ----------------------------

	we can declare Bean name inside it like @Bean(name = "samosa1")

	if we don't want to use @Primary then we can use Qualifier at injection time.


 */
