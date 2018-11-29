package myspring.di.xml.test;

import myspring.di.xml.Hello;
import myspring.di.xml.Printer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloBeanTest {
    public static void main(String[] args){
        //1.IoC 컨테이너 생성
        ApplicationContext context = new GenericXmlApplicationContext("file:src/main/java/config/beans.xml");
        //2. Hello Bean 가져오기
        Hello hello = (Hello)context.getBean("hello");
        hello.print();
        //3. StringPrinter Bean 가져오기
        Printer printer = (Printer)context.getBean("printer");
        System.out.println(printer.toString());

        Hello hello2 = context.getBean("hello",Hello.class);
        hello2.print();
        System.out.println(hello==hello2);
    }
}
