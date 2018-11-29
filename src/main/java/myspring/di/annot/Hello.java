package myspring.di.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class Hello {
    @Value("${myname}")
    String name;

    /*@Autowired
    @Qualifier("stringPrinter")//Printer type인 consolePrinter와 stringPrinter 중에서 정해줘야함
    */
    @Resource(name = "${printer1}")
    Printer printer;

    private List<String> names;

    //Annotation을 통해서 의존관계를 주입하면 setter가 필요없다.

    public String sayHello(){
        return "Hello "+name;
    }

    public void print(){
        this.printer.print(sayHello());
    }
}
