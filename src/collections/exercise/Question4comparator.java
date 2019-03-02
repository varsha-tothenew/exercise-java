package collections.exercise;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//4.Write a program to sort Employee objects based on highest salary using Comparator.
// Employee class{ Double Age; Double Salary; String Name

public class Question4comparator {

    public static void main(String[] args) {
        Set<Employee3> employee3Set = new TreeSet<>(new Compare());
        employee3Set.add(new Employee3(1, "var", 21d, 15000d));
        employee3Set.add(new Employee3(2, "anu", 21d, 15000d));
        employee3Set.add(new Employee3(3, "abc", 20d, 5000d));
        employee3Set.add(new Employee3(4, "def", 20d, 4000d));
        employee3Set.add(new Employee3(5, "ghi", 19d, 3000d));
        employee3Set.add(new Employee3(6, "jkl", 29d, 1000d));
        //same sal sort by age then by id
        employee3Set.add(new Employee3(7, "akl", 19d, 1000d));
        //emplyoyee with same name diff sal
        employee3Set.add(new Employee3(8, "jkl", 19d, 12000d));
        //duplicate object not added bcoz of property of set
        employee3Set.add(new Employee3(6, "jkl", 29d, 1000d));
        //duplicate id but diff age
        employee3Set.add(new Employee3(6, "jkl", 29d, 1000d));
        System.out.println(employee3Set.size());
        // Employee2.showDetails(employee2Set);
        Employee3.display(employee3Set);
    }
}

class Employee3 {

    Integer id;
    String name;
    Double age;
    Double salary;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public Employee3(Integer id, String name, Double age, Double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void display(Set<Employee3> employee2Set) {
        for (Employee3 emp : employee2Set) {
            System.out.println(emp);
        }
    }

}

class Compare implements Comparator<Employee3> {
    public int compare(Employee3 m1, Employee3 m2) {
        if ((int)m1.getId() != (int)m2.getId()) {
            if((double)m1.getSalary()==(double)m2.getSalary() && (double)m1.getAge()==(double)m2.getAge()){
                return m1.getId().compareTo(m2.getId());
            }
            else if ((double)m1.getSalary()==(double)m2.getSalary() && (double)m1.getAge()!=(double)m2.getAge()){
                return (m1.getAge().compareTo(m2.getAge()));
            }
            return (m1.getSalary().compareTo(m2.getSalary()));
        } else
            return (m1.getId().compareTo(m2.getId()));
    }
}
//Class to compare Employees by salary //correct
/*
class Compare implements Comparator<Employee3> {
    public int compare(Employee3 m1, Employee3 m2) {
        if ((double)m1.getSalary() == (double)m2.getSalary()) {
            return (m1.getId().compareTo(m2.getId()));
        } else
            return (m1.getSalary().compareTo(m2.getSalary()));
    }
}
*/