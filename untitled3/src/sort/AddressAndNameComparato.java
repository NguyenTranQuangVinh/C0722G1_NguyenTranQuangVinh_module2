package sort;

import model.Employee;

import java.util.Comparator;

public class AddressComparato implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getAddress().equals(o2.getAddress())) {
            return o1.getName().compareTo(o2.getName());
        } else {
            return o2.getAddress().compareTo(o1.getAddress());
        }
    }
}

