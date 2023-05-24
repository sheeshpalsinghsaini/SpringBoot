package core.lcwd.core.coupling;

import org.springframework.stereotype.Component;

//@Component
public class Dog implements Animal{
    @Override
    public void play() {
        System.out.println("Dog is playing....");
    }
}
