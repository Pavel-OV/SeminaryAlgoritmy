package Lesson3;

public class Program {
    public static void main(String[] args) {
       

        Employee employee1= new Employee("EEEEE",19);
        Employee employee= new Employee("AAAAA",28);
        LinkedList<Employee>  linkedList =new  LinkedList<>();
         LinkedList<Employee>  linkedList2 =new  LinkedList<>();
      
        linkedList.addFirst(new Employee("1 AAAAA",41));
        linkedList.addFirst(new Employee("2 BBBBB",25));
        linkedList.addFirst(new Employee("3 CCCCC",41));
        linkedList.addFirst(new Employee("4 DDDDD",31));
       // linkedList.addFirst(employee);
       
        linkedList.addFirst(new Employee("CCCCC",35));
        linkedList.addFirst(new Employee("EEEEE",19));
        linkedList.addFirst(new Employee("AAAAA",30));
        linkedList.addFirst(new Employee("DDDDD",39));
        linkedList.addLast(new Employee("9 WWWWW", 50));
         System.out.println(linkedList);

        // System.out.println(linkedList);
        // linkedList.sort(new EmployeeComparator(SortType.Ascending));
        // System.out.println();
        // System.out.println(linkedList);
        // linkedList.sort(new EmployeeComparator(SortType.Descending));
        // System.out.println();
        // System.out.println(linkedList);

        // LinkedList<Employee>.Node node =linkedList.contains(employee1);
        // if(node!=null)
        // System.out.printf("Элемент найден: %s" ,node.value);
        // else
        // System.out.println("Элемент не найден");
        // linkedList.removFirst();
        // linkedList.removFirst();
        // linkedList.removeLast();
        linkedList.reversNode();
        System.out.println();
         System.out.println(linkedList);
       
    }
    
}
