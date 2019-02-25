package sk.jaroslavbeno.springlearn2code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLearn2codeApplication {

	public static void main(String[] args) {
		ApplicationContext context =
				SpringApplication.run(SpringLearn2codeApplication.class, args);
		AppRun appRun = context.getBean(AppRun.class);
		appRun.run();

	}

}
