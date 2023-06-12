package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary unilibrary = context.getBean("uniLibrary", UniLibrary.class);
//        unilibrary.getBook();
//        unilibrary.getMagazine();
        unilibrary.returnBook();

//        ScoolLibrary scoolLibrary = context.getBean("scoolLibrary", ScoolLibrary.class);
//        scoolLibrary.getBook();

        context.close();
    }
}
