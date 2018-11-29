package myspring.di.xml;

import java.util.List;

public class Hello {
    String name;
    Printer printer;
    List<String> names;

    public void setNames(List<String> names) {
        this.names = names;
    }

    public Hello(){}

    /*public Hello(String name, Printer printer){
        this.name = name;
        this.printer = printer;
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public String sayHello(){
        return "Hello"+name+names.toString();
    }

    public void print(){
        this.printer.print(sayHello());
    }
}
