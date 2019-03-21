package sk.jaroslavbeno.springlearn2code.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import sk.jaroslavbeno.springlearn2code.services.impl.PrintService;

@Configuration
@PropertySource("classpath:jarko.properties")
public class JarkoConfig {

    @Value("${jarko.meno}")
    String meno;

    @Value("${jarko.priezvisko}")
    String priezvisko;

    @Bean
    public PrintService printService(){
        PrintService printService = new PrintService();
        printService.setData(meno + ", "+ priezvisko);
        return printService;
    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }


}
