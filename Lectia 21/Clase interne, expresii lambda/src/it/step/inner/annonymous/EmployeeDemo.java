package it.step.inner.annonymous;

import com.sun.corba.se.spi.ior.ObjectKey;

public class EmployeeDemo {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();

        Employee programmer = new Employee() {

            public String value;

            public String writeCode(){
                return " Programmer writes code!";
            }
            public void work() {
                hello();
                System.out.println(" Programmer works!");
                value = "   Value: " + writeCode();
                writeCode();
                System.out.println(value);
            }
        };

        programmer.work();
    }
}
