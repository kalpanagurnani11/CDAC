package com.demo.comparator;

import java.util.Comparator;
import com.demo.model.Employee;

public class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getId() - ( e2.getId());
    }
}