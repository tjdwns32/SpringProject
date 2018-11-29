package myspring.di.annot.test;

import myspring.di.annot.Hello;
import myspring.di.annot.Printer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:C:\\Users\\tjdwn\\test\\src\\main\\java\\config\\annot.xml")
public class HelloBeanJunitSpringTest {

    @Autowired
    ApplicationContext context;

    @Test
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
        Hello hello2 = context.getBean("hello", Hello.class);
        assertSame(hello,hello2);
        //System.out.println(hello==hello2);
    }
}
