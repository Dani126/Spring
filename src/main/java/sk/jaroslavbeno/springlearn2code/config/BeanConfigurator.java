package sk.jaroslavbeno.springlearn2code.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sk.biblia.BibleVerses;

//@Configuration
public class BeanConfigurator {

//    @Bean
    public BibleVerses getBibleVerses(){
        return new BibleVerses();
    }
}
