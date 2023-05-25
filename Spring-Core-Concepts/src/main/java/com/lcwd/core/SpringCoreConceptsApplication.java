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

		//---------------------

		Test testBean = context.getBean(Test.class);
		testBean.testing();
		
		//--------------------- get the bean qualifier name
		Animal catBean = context.getBean("cat", Animal.class);
		catBean.play();
		Animal dogBean = context.getBean("dog", Animal.class);
		dogBean.play();
		

	}

}

/*

Removing Bean Conflict using @Qualifier

When we are declaring a class as bean using @Component at that time we can provide the name of
bean in "@Component("dog")". 	: this bean name is 'dog' now
if we don't want to given name in @component then we can use @Qualifier("dog") and can give name
here. it is also same above.


when we are auto wire bean at that time we need to specify which bean we want to use.

like in the Person bean we use

	@Qualifier("cat") // now spring boot will inject only cat bean in Person class.



----------------------------------------
if you are using constructor then use Qualifier in constructor

		@Autowired  // constructor autowired
		public Person( @Qualifier("dog") Animal animal ) {
				this.animal = animal;
				}

---------------------------------------
we can also get the bean from context using qualifier name


 */
