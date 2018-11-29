package myspring.di.annot.test;

import myspring.di.annot.Hello;
import myspring.di.annot.Printer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:C:\\Users\\tjdwn\\test\\src\\main\\java\\config\\annot.xml")
public class HelloBeanAnnotationTest {
    @Autowired
    ApplicationContext context;

    @Test
    public void test(){
        Hello hello = context.getBean("hello",Hello.class);
        assertEquals("Hello Spring",hello.sayHello());
    }
}
