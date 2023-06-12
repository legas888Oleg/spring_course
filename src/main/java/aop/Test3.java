package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method Main() starts");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        String nameBook = library.returnBook();
        System.out.println("В библиотеку вернули книгу " + nameBook);

        context.close();
        System.out.println("Method Main() ends");
    }
}
