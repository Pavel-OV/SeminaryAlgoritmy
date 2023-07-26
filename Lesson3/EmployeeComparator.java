package Lesson3;

import java.util.Comparator;

public class EmployeeComparator  implements Comparator<Employee>{
    private SortType sortType;


    public EmployeeComparator(SortType sortType) {
        this.sortType = sortType;
    }

  



    @Override
    public int compare(Employee o1, Employee o2) {
       int resName= sortType == sortType. Ascending ? o1.getName().compareTo(o2.getName()):
       o2.getName().compareTo(o1.getName());
       if(resName==0)
            return sortType==sortType. Ascending? Integer.compare(o1.getAge(), o2.getAge()):
             Integer.compare(o2.getAge(), o1.getAge());
       return resName;
       
    }
    
}
