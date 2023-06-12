package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {

    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetSecurityAdvance(){
        System.out.println("beforeGetSecurityAdvance: проверка прав доступа для получения книги/журнала");
    }

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvance(){
        System.out.println("beforeAddSecurityAdvance: проверка прав доступа для добавления книги/журнала");
        System.out.println("----------------------------------------------------------------------------");
    }

}