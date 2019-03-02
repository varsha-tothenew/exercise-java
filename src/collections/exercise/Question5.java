package collections.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//5.Write a program to sort the Student objects based on Score ,if the score are same then sort on First Name .
// Class Student{ String Name; Double Score; Double Age

//doubt? how to do same if student elements were unique using sets?
public class Question5 {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student("var",90d,21d));
        studentList.add(new Student("abc",30d,20d));
        studentList.add(new Student("def",90d,21d));
        studentList.add(new Student("jkl",50d,20d));
        studentList.add(new Student("ghi",80d,19d));

        Collections.sort(studentList,new CompareStudents());
        Student.display(studentList);
    }
}
class Student{
    String name;
    Double score;
    Double age;

    public Student(String name, Double score, Double age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Double getScore() {
        return score;
    }

    public Double getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", age=" + age +
                '}';
    }

    public static void display(List<Student> studentList){
        for(Student student:studentList){
            System.out.println(student);
        }
    }
}

class CompareStudents implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        //all comparision
        int compareName = o1.getName().compareTo(o2.getName());
        int compareScore = o1.getScore().compareTo(o2.getScore());
        int compareAge = o1.getAge().compareTo(o2.getAge());

        // comparison using if-else block
        if(compareScore == 0) {
            return compareName;
        }
        return compareScore;
    }
}
