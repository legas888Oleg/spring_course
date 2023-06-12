package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginingAndSecurityAspect {
    @Pointcut("execution(* aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary(){}

    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
    private void returnMagazineMethodFromUniLibrary(){}

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineMethodFromUniLibrary()")
    private void allMethodsFromUniLibraryButNotReturnMagazineMethodFromUniLibrary(){}

//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){}

//    @Pointcut("execution(* aop.UniLibrary.add*())")
//    private void allAddMethodsFromUniLibrary(){}

//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){}
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvance(){
//        System.out.println("beforeGetLoggingAdvance: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvance(){
//        System.out.println("beforeReturnLoggingAdvance: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvance(){
//        System.out.println("allGetAndReturnMethodsFromUniLibrary: writing Log #3");
//    }

//    @Pointcut("execution(* get*())")
//    private void allGetMethods(){}
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvance(){
//        System.out.println("beforeGetLoggingAdvance: попытка получить книгу/журнал");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvance(){
//        System.out.println("beforeGetSecurityAdvance: попытка прав доступа для получения книги/журнала");
//    }

    @Before("allMethodsFromUniLibraryButNotReturnMagazineMethodFromUniLibrary()")
    public void beforeGetSecurityAdvance(){
        System.out.println("allMethodsFromUniLibraryButNotReturnMagazineMethodFromUniLibrary: writing Log #4");
    }
}
