package sk.jaroslavbeno.springlearn2code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"sk.jaroslavbeno.services","sk.jaroslavbeno.springlearn2code"})
public class SpringLearn2codeApplication {

	public static void main(String[] args) {
		ApplicationContext kontext = SpringApplication.run(SpringLearn2codeApplication.class, args);
		kontext.getBean(AppRun.class).run();
	}

}
