package java8.exercise;

//Create an Employee Class with instance variables (String) name, (Integer)age, (String)city and get the instance of the Class using constructor reference
interface EmployeeRef {
    Employee makeEmp(String name,Integer age,String city);
}

class Employee{
    String name;
    Integer age;
    String city;

    public Employee(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
public class Question4 {
    public static void main(String[] args) {
        EmployeeRef employeeRef = Employee::new;
        Employee emp=employeeRef.makeEmp("vasrha ",21," faridabad");
        System.out.println(emp.toString());
        //doing without constructor refernce
        Employee emp2=new Employee("anu ", 21 ," delhi");
        System.out.println(emp2.toString());
    }
}
