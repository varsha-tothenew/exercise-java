package java2;

import java.util.Scanner;

/*      1. Create Java classes having suitable attributes for Library management system.
        Use OOPs concepts in your design.Also try to use interfaces and abstract classes.
*/
public class Question1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Library lb1 = new Library();
        lb1.show();
        lb1.showBooks();

        System.out.println("\nEnter the Student Name and ID");
        String name = s.nextLine();
        String id = s.next();
        s.nextLine();
        System.out.println("Enter Book Name and Book id");
        String bookname = s.nextLine();
        String id1 = s.next();
        System.out.println("Enter the author name");
        s.nextLine();

        String author1 = s.nextLine();

        System.out.println("Enter issue date");
        String issu = s.nextLine();
        System.out.println("Enter the return date");
        String ret = s.nextLine();
        lb1.set(name, id, bookname, id1, author1, issu, ret);
        System.out.println("\n Press 1 to display the record of issuer");
        int ch = s.nextInt();
        if (ch == 1) {
            lb1.getDetail();
        } else {
            System.exit(0);
        }
    }
}

//Interface for fully abstraction
interface Librarian {
    String lib_name = "Mr Mohan Das";
    String lib_id = "1012E";

    void show();
}

//Private shows Encapsulation which can be accessed using Getter and Setter
class Student {

    private String stu_name;
    private String stu_id;

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
}

//Abstract classses for abstraction
abstract class Book {


    private String bookname;
    private String book_id;
    private String author;


    public Book() {

    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }


    public String getBook_id() {
        return book_id;
    }


    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String bookname, String book_id, String author) {
        this.bookname = bookname;
        this.book_id = book_id;
        this.author = author;
    }

    public abstract void showBooks();
}

class Library extends Book implements Librarian {
    Student s = new Student();
    private Student stu;
    private String issue_date;
    private String return_date;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public String getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(String issue_date) {
        this.issue_date = issue_date;
    }

    public String getReturn_date() {
        return return_date;
    }


    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    public void set(String stu, String stu_id, String bookname, String book_id, String author, String issue_date, String return_date) {
        s.setStu_name(stu);
        s.setStu_id(stu_id);
        setBookname(bookname);
        setBook_id(book_id);
        setAuthor(author);
        setIssue_date(issue_date);
        setReturn_date(return_date);
    }

    public void show() {
        System.out.println("Librarian -" + lib_name);
        System.out.println("Librarian ID -" + lib_id);
    }

    public void showBooks() {
        System.out.println("\nAvailable books-");
        System.out.println("Book Name    \t \tID   \tAuthor");
        System.out.println("1)Two States    \t10122 \tChetan Bhagat");
        System.out.println("2)Silent Honor   \t1015  \tCilia Ahern");
        System.out.println("3)Digital Imaging\t1035\tR K Yadav");

    }

    public void getDetail() {
        System.out.println("Student Name- " + s.getStu_name());
        System.out.println("Student id- " + s.getStu_id());
        System.out.println("Book Name- " + getBookname());
        System.out.println("Book ID- " + getBook_id());
        System.out.println("Author Name- " + getAuthor());
        System.out.println("Issue Date- " + getIssue_date());
        System.out.println("Return Date- " + getReturn_date());


    }
}
