package sk.jaroslavbeno.services.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sk.jaroslavbeno.services.HelloWorldService;

@Service
@Primary
@Profile({"sk","eng","cze"})
public class PrimaryHelloWorld implements HelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("Ahoj, svet z primary");
    }
}

