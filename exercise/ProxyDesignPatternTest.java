package design_pattern.exercise;

//8. Implement proxy design for accessing Record of a student and allow the access only to Admin.
class ProxyStudent {
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    int ID;
    String Name;

    public ProxyStudent(int ID, String studentName) {
        this.ID = ID;
        this.Name = studentName;
    }

    public void getStudents(){
        System.out.println("Student Id is: "+this.getID()+" and Name is: "+this.getName());
    }
}

interface Access{
    void access(ProxyStudent proxyStudent);
}

class Teacher implements Access{

    public Teacher() {
        System.out.println("A NON ADMIN Teacher");
    }

    public void access(ProxyStudent proxyStudent){
        System.out.println("I have NO ACCESS to student details");
    }
}

class Admin  implements Access{
    public Admin() {
        System.out.println("I'm an Admin");
    }

    public void access(ProxyStudent proxyStudent){
        System.out.println("I can access the student");
        proxyStudent.getStudents();
    }
}

public class ProxyDesignPatternTest {
    public static void main(String[] args) {
        ProxyStudent proxyStudent = new ProxyStudent(1, "Divya");
        Access accessor1 = new Teacher();
        accessor1.access(proxyStudent);
        Access accessor2 = new Admin();
        accessor2.access(proxyStudent);

    }
}
