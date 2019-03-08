package sk.jaroslavbeno.services.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sk.jaroslavbeno.services.HelloWorldService;

@Service
@Profile({"sk","default"})
public class SlovakHelloWorld implements HelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("Ahoj, svet!!!");
    }
}

