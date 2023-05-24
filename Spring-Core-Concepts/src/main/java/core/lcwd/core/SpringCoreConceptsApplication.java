package core.lcwd.core;

import core.lcwd.core.coupling.Animal;
import core.lcwd.core.coupling.Cat;
import core.lcwd.core.coupling.Dog;
import core.lcwd.core.coupling.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"",""}) // we can provide package name here
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {

		// about the bean, using @Components
		// about the dependencies, @Autowire
		// where to scan for beans

		//com.lcwd.core.couple
		/*
		@SpringBootApplication will scapn only core package of main class[ core.lcwd.core ]
		will not scan test package.
		if we want to scan test package also we need to tell about it also to
		spring using @ComponentScan
		 */
		ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);// it will return the object of creating beans
		// now we can get all the beans from ApplicationContext[ context ]

		Person personBean = context.getBean(Person.class);
		personBean.playWithAnimal();


	}

}
