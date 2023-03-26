package model.old;

import model.sort.EmployeeSalaryComparator;
import model.sort.EmployeeSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee e2 = new Employee("Abigdale", "Smith", 666.7 );
        Employee e1 = new Employee("John", "Johanson", 777.3 );
        Employee e3 = new Employee("Peter", "Miracle", 881.2);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        // sorting
        Collections.sort(employeeList);

        employeeList.sort(EmployeeSorting.byName);

        System.out.println(" Sorting by name length: \n");

        for (Employee emp:employeeList) {
            System.out.println(emp.getName());
        }

        employeeList.sort(EmployeeSorting.bySurname);

        System.out.println("\n Sorting by last name length: \n");

        for (Employee emp:employeeList) {
            System.out.println(emp.getLastName());
        }

        // metoda clasica apelata dintr-o clasa
        employeeList.sort(new EmployeeSalaryComparator());

        // clasa anonima
        employeeList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });

        System.out.println("\n Sorting by salary clasa anonima: \n");

        for (Employee emp:employeeList) {
            System.out.println(emp.getSalary());
        }

        // expresii lambda *nu este obligatorie specificarea tipului de date
        employeeList.sort ((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()) );

        System.out.println("\n Sorting by salary expresie lambda: \n");

        for (Employee emp:employeeList) {
            System.out.println(emp.getSalary());
        }

        EmployeeSalaryComparator comparator = new EmployeeSalaryComparator();

        List<String> texts = new ArrayList<>();

        texts.add(" LOOL");
        texts.add(" DOTA");
        texts.add(" Minecraft");

        Collections.sort(texts);
        texts.sort(new StringLengthComparator());

        System.out.println("\n Sorting by texts length: \n");

        for (String txt: texts) {
            System.out.println(txt);
        }

//        texts.sort((String o1, String o2) -> {
//            return o1.length() - o2.length();
//        });
    }
}
