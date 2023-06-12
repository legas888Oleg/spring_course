package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginingAndSecurityAspect {
    @Pointcut("execution(* get*())")
    private void allGetMethods(){}

    @Before("allGetMethods()")
    public void beforeGetLoggingAdvance(){
        System.out.println("beforeGetLoggingAdvance: попытка получить книгу/журнал");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvance(){
        System.out.println("beforeGetSecurityAdvance: попытка прав доступа для получения книги/журнала");
    }
}
