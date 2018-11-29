package myspring.di.xml.test;

import myspring.di.xml.Hello;
import myspring.di.xml.Printer;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.junit.Assert.*;//Assert 생략

public class HelloBeanJunitTest {

    ApplicationContext context;

    @Before
    public void init(){
        context = new GenericXmlApplicationContext("file:src/main/java/config/beans.xml");
    }
    @Test @Ignore
    public void test1(){
        Hello hello = (Hello)context.getBean("hello");
        hello.print();
        Printer printer = (Printer)context.getBean("printer");
        assertEquals("HelloSpring",printer.toString());
        //System.out.println(printer.toString());
    }

    @Test
    public void test2(){
        Hello hello = (Hello)context.getBean("hello");
        Hello hello2 = context.getBean("hello",Hello.class);
        assertSame(hello,hello2);
        //System.out.println(hello==hello2);
    }
}
