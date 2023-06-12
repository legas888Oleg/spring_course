package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginingAspect {
    @Before("execution(public void getBook())")
    public void beforeGetBookAdvance(){
        System.out.println("beforeGetBookAdvance: попытка получить книгу");
    }
}
