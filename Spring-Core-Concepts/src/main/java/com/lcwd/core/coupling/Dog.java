package com.lcwd.core.coupling;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dog")
//@Primary
public class Dog implements Animal{
    @Override
    public void play() {
        System.out.println("Dog is playing....");
    }
}
