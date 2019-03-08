package sk.jaroslavbeno.services.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sk.jaroslavbeno.services.HelloWorldService;

@Service
@Profile("cze")
public class CzechHelloWorld implements HelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("Ahoj, světe!!!");
    }
}

