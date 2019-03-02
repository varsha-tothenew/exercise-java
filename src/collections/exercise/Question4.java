package collections.exercise;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

//4.Write a program to sort Employee objects based on highest salary using Comparator.
// Employee class{ Double Age; Double Salary; String Name
public class Question4 {
    public static void main(String[] args) {
        //  Set<Employee2> employee2Set=new HashSet<>();
        //to use comparable use tree set insetad of hash set
        Set<Employee2> employee2Set = new TreeSet<>();

        employee2Set.add(new Employee2(1, "var", 21d, 15000d));
        employee2Set.add(new Employee2(2, "anu", 21d, 15000d));
        employee2Set.add(new Employee2(3, "abc", 20d, 5000d));
        employee2Set.add(new Employee2(4, "def", 20d, 4000d));
        employee2Set.add(new Employee2(5, "ghi", 19d, 3000d));
        employee2Set.add(new Employee2(6, "jkl", 19d, 1000d));
        //comparable wont show same salary items with diff id
        employee2Set.add(new Employee2(7, "akl", 19d, 1000d));
        //emplyoyee with same name diff sal
        employee2Set.add(new Employee2(8, "akl", 19d, 12000d));
        //duplicate value not added bcoz hashc ode and equals overriden by id
        employee2Set.add(new Employee2(6, "jkl", 19d, 1000d));
        Employee2.display(employee2Set);

        System.out.println();


    }
}

class Employee2 implements Comparable<Employee2> {
    int id;
    String name;
    Double age;
    Double salary;

    public Double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee2 = (Employee2) o;
        return id == employee2.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public Employee2(int id, String name, Double age, Double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //without overriding toString method
//    public static void showDetails(Set<Employee2> employee2Set) {
//        for (Employee2 emp : employee2Set) {
//            System.out.println("id:: " + emp.id + " name:: " + emp.name + " age:: " + emp.age + " salary:: " + emp.salary);
//        }
//    }
    public static void display(Set<Employee2> employee2Set) {
        for (Employee2 emp : employee2Set) {
            System.out.println(emp);
        }
    }

    @Override
    public int compareTo(Employee2 o) {
        return this.salary.compareTo(o.salary);
    }
}

