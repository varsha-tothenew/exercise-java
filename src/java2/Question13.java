package java2;

//    Q13. Create a custom exception that do not have any stack trace.
class NoNameFoundException extends Exception {
    public NoNameFoundException(String message) {
        super(message);
    }
}

class Manager {
    public Question13 create(String name) throws NoNameFoundException {
        if (!name.equals("Varsha")) {
            return new Question13();
        } else {
            throw new NoNameFoundException("Name " + name + " Already created");
        }
    }
}

public class Question13 {
    public static void main(String[] args) {
        String name = "Varsha";
        Manager mgr = new Manager();
        try {
            Question13 obj = mgr.create(name);
        } catch (NoNameFoundException ex) {
            System.out.println(ex);

        }
    }
}
