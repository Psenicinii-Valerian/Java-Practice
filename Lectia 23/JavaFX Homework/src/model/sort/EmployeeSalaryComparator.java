package model.sort;

import model.Employee;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

//                              codul MEU:
//        return o1.getSalary() - o2.getSalary() == 0 ? 0 :
//                o1.getSalary() - o2.getSalary() > 0 ? 1 : -1;

        return (int) (o1.getSalary() - o2.getSalary());

    }
}
