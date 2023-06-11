package spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:my.properties")
public class MyConfig {
    @Bean
    @Scope("singleton")
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Person personBean(){
        return new Person(catBean());
    }
}