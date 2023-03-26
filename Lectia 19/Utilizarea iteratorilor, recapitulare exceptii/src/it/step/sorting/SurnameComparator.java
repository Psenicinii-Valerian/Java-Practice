package it.step.sorting;

import java.util.Comparator;
import java.util.concurrent.ConcurrentMap;

public class SurnameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.surname.compareTo(o2.surname);
    }
}
