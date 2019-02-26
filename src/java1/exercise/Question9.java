package exercise;

//Q9.Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)
enum House {
    one_bhk(12), two_bhk(24), three_bhk(40), bunglow(80);
    private int price;

    House(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}

public class Question9 {
    public static void main(String args[]) {
        System.out.println("All house prices:");
        for (House c : House.values())
            System.out.println(
                    c + " costs " + c.getPrice() + " lakh ");
    }
}