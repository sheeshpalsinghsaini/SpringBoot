package com.lcwd.core.coupling;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component   // now it become bean, it use to declare as a bean.
public class Person {


    // Field Injection
    @Autowired
    Animal animal;
    @Autowired
    Student student;

    public void playWithAnimal(){
        //using animal
        animal.play();
        student.detail();
    }
    
}
