package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("100 тысяч лье над уровнем моря")
    private String name;

    public String getName() {
        return name;
    }
}
