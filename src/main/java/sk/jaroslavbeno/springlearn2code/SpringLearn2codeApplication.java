package sk.jaroslavbeno.springlearn2code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sk.jaroslavbeno.springlearn2code.repositories.impl.MovieServiceImpl;

@SpringBootApplication
public class SpringLearn2codeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearn2codeApplication.class, args);
	}

}
