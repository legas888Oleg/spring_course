package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@Aspect
@Order(10)
public class LoggingAspect {
    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvance(){
        System.out.println("beforeGetLoggingAdvance: логирование попытки получить книгу/журнал");
    }

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvance(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")){
            Object[] args = joinPoint.getArgs();
            for (Object arg : args) {
                if(arg instanceof Book)
                    System.out.printf("Информация о книге: \n\t\"%s\"\n\tавтор: %s\n\tдата публикации: %s г.\n",
                            ((Book) arg).getName(), ((Book) arg).getAuthor(), ((Book) arg).getYearOfPublication());
                if(arg instanceof String)
                    System.out.println(arg);
            }

        }







        System.out.println("beforeAddLoggingAdvance: логирование попытки добавления книги/журнала");
        System.out.println("---------------------------------------------------------------------");
    }

}
