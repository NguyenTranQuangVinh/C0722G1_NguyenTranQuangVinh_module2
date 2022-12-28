package sort;

import model.Employee;

import java.util.Comparator;

public class AddressNameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o2.getName().compareTo(o1.getName()) > 0){
            return 1;
        }else if(o2.getName().compareTo(o1.getName()) == 0){
            return 0;
        }
        return -1;
    }
}
