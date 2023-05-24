package core.lcwd.core.coupling;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component   // now it become bean, it use to declare as a bean.
public class Person {


    @Autowired
    Animal animal; // dependencies injection by spring

//    public Person(Animal animal) { // dependencies injection manual
//        this.animal = animal;
//    }

    public void playWithAnimal(){
        //using animal
        animal.play();
    }
}
