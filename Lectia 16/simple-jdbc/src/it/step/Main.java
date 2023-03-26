package it.step;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//       Employee emp = new Employee("David", "Smith", "dsmith@gmail.com");
//       Employee emp2 = new Employee("Peter", "Smith", "psmith@gmail.com");

        DbManager manager = new DbManager();
        manager.create(new Employee("Mikael", "Hors", "mhors@gmail.com"));
        manager.create(new Employee("Victor", "Hugo", "vhugo@gmail.com"));

        manager.update(new Employee(10, "Leonardo", "Bonnes", "leobonnes@gmail.com") );

        manager.delete(9);

        List<Employee> list = manager.selectAll();
        System.out.println(list.size());

        System.out.println();

        for(Employee employee: list){
            System.out.println("id = " + employee.getId());
            System.out.println("nume = " + employee.getName());
            System.out.println("prenume = " + employee.getSurname());
            System.out.println("email = " + employee.getEmail());
            System.out.println();
        }


    }
}
