package com.lcwd.core.coupling;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component   // now it become bean, it use to declare as a bean.
public class Person {


    Animal animal;
    Student student;

    //constructor based Injection

    @Autowired
    public Person(Animal animal,Student student){
        System.out.println("calling constructor... Autowiring");
        this.animal = animal;
        this.student = student;
    }
    public void playWithAnimal(){
        //using animal
        animal.play();
        student.detail();
    }
}
