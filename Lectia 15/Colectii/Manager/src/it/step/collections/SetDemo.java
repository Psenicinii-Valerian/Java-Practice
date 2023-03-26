package it.step.collections;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MatchGenerator;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        Set<Student> texts = new HashSet<>();

        Student st = new Student("John", "Smith");
        System.out.println(st.hashCode());
        texts.add(st);

        Student std = new Student("John", "Smith");
        System.out.println(std.hashCode());
        texts.add(std);


        texts.add(new Student("John", "Smith"));
        texts.add(new Student("John", "Smith"));
        texts.add(new Student("John", "Smith"));
        texts.add(new Student("John", "Smith"));
        texts.add(new Student("John", "Smith"));

        System.out.println(texts.size());

        for (Student el:texts) {
            System.out.println("Element: " + el.firstName + el.lastName);
        }

    }
}

class Student {

    String firstName;
    String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean equals (Object o) {
        if (this.getClass() != o.getClass()) {
            return false;
        }

        Student s = (Student) o;
        return this.firstName.equalsIgnoreCase(s.firstName) && this.lastName.equalsIgnoreCase(s.lastName);
    }

    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

}
