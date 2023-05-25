package com.lcwd.core;

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

		//---------------------

		Test testBean = context.getBean(Test.class);
		testBean.testing();

	}

}

/*
when we create two beans of interface and try to inject in project at that time
spring will found two beans. but it's required one. so it will rise an exception.

like in this case we have Cat and Dog beans which we are using in Person.

To specify any one to run that one only so for that we will use @Primary annotation
on that beans. so spring will give higher priority to that bean.

@Primary on Dog bean : it will be injected now.
@Primary on Cat bean : now Cat will be injected.
 */
