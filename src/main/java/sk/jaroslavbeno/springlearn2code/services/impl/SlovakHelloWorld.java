package sk.jaroslavbeno.springlearn2code.services.impl;

import org.springframework.stereotype.Service;
import sk.jaroslavbeno.springlearn2code.services.HelloWorldService;

@Service
public class SlovakHelloWorld implements HelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("Ahoj, svet!!!");
    }
}

