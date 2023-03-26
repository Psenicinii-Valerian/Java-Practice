package it.step;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "John", "Smith", "email"));

        // extragerea informatiei dintr-o lista
        System.out.print(" Employee extras cu List : ");
        for(Employee emp: employeeList) {
            if (emp.getId() == 1) {
                System.out.println(emp);
            }
        }

        // extragere informatiei dintr-o mapa - 1 posibilitate
//        Map<Integer, Employee> employeeMap = new HashMap<>();
//        employeeMap.put(1, new Employee(1, "John", "Smith", "email"));
//        employeeMap.get(1);

        // extragere informatiei dintr-o mapa - 2 posibilitate
        Map<Integer, Employee> employeeMap = new HashMap<>();
        Employee employee = new Employee(1, "John", "Smith", "email");
        employeeMap.put(employee.getId(), employee);
        System.out.println(" Employee extras cu HashMap : " + employeeMap.get(1));

        Map<Integer, String> employeeNames = new HashMap<>();
        for(Employee emp: employeeList) {
            employeeNames.put(emp.getId(), emp.getName());
        }

        System.out.println(" Nume Employee extras cu HashMap : " + employeeNames.get(1));

    }
}
