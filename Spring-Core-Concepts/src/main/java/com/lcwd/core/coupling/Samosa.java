package com.lcwd.core.coupling;

public class Samosa {

    String name;
    public Samosa(String name){
        System.out.println("This is "+name);
        this.name = name;
    }
    public void eat(){
        System.out.println("This is a "+name);
    }
}
