package core.lcwd.core;

import core.lcwd.core.coupling.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {

		Person p = new Person();
		p.playWithAnimal();

		SpringApplication.run(SpringCoreConceptsApplication.class, args);
	}

}
