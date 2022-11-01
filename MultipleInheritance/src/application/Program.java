package application;

import model.devices.ComboDevice;
import model.devices.ConcretePrinter;
import model.devices.ConcreteScanner;

public class Program {
    public static void main(String[] args) {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My letter");
        p.print("My letter");

        System.out.println();
        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My email");
        System.out.println("Scan result: " + s.scan());

        System.out.println();
        ComboDevice c = new ComboDevice("9689");
        c.processDoc("My notes");
        c.print("My notes");
        System.out.println("Scan result: " + c.scan());
    }

}
