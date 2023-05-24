package core.lcwd.core.coupling;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{
    @Override
    public void play() {
        System.out.println("Cat is playing...");
    }
}
