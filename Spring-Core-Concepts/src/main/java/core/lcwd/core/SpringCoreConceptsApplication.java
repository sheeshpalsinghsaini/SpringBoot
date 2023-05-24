package core.lcwd.core;

import core.lcwd.core.coupling.Animal;
import core.lcwd.core.coupling.Cat;
import core.lcwd.core.coupling.Dog;
import core.lcwd.core.coupling.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {

		Animal animal = new Dog();
		Animal animal2 = new Cat();
		Person p = new Person(animal);
		Person p2 = new Person(animal2);
		p.playWithAnimal();
		p2.playWithAnimal();

		/*
		now we resolve the issue of tight coupling. but still we are
		creating object our self and inject in a class. it can we can
		be done by spring MVC. checkout out next commit.
		 */
		SpringApplication.run(SpringCoreConceptsApplication.class, args);
	}

}
