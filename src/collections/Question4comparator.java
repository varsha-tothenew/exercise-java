package collections;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Question4comparator {
    public static void main(String[] args) {
        Set<Employee3> employee3Set = new TreeSet<>(new SalCompare());
        employee3Set.add(new Employee3(1, "var", 21d, 15000d));
        employee3Set.add(new Employee3(2, "anu", 21d, 15000d));
        employee3Set.add(new Employee3(3, "abc", 20d, 5000d));
        employee3Set.add(new Employee3(4, "def", 20d, 4000d));
        employee3Set.add(new Employee3(5, "ghi", 19d, 3000d));
        employee3Set.add(new Employee3(6, "jkl", 19d, 1000d));
        // wont show same salary items with diff id
        employee3Set.add(new Employee3(7, "akl", 19d, 1000d));
        //emplyoyee with same name diff sal
        employee3Set.add(new Employee3(8, "jkl", 19d, 12000d));
        //duplicate value not added bcoz hashcode and equals overriden by id
        employee3Set.add(new Employee3(6, "jkl", 19d, 1000d));
        // Employee2.showDetails(employee2Set);
        Employee3.display(employee3Set);
    }
}

class Employee3 {
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
        Employee3 employee3 = (Employee3) o;
        return id == employee3.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
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

    public String getName() {
        return name;
    }

    public Employee3(int id, String name, Double age, Double salary) {
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

// Class to compare Employees by name
class NameCompare implements Comparator<Employee3> {
    public int compare(Employee3 m1, Employee3 m2) {
        return m1.getName().compareTo(m2.getName());
    }
}

// Class to compare Employees by salary
class SalCompare implements Comparator<Employee3> {
    public int compare(Employee3 m1, Employee3 m2) {
        return m1.getSalary().compareTo(m2.getSalary());
    }
}