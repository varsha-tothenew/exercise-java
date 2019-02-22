package java2;

import java.util.LinkedList;
import java.util.Queue;

public class Question10 {
    //    private static Customer customerQueue;
    private Barista barista;
    private Cashier cashier;

    public Question10() {
        System.out.println("Welcome to Varsha's Cafe...!!");
    }

    public void setBarista(Barista barista) {
        this.barista = barista;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public static void main(String[] args) {
        Question10 cafe =  new Question10();
        Barista barista = new Barista("b1");
        Cashier cashier = new Cashier("c1");
        cafe.setBarista(barista);
        cafe.setCashier(cashier);

//       create customers
        Customer customer1 = new Customer("customer1", "t1");
        Customer customer2 = new Customer("customer2", "t2");
        Customer customer3 = new Customer("customer3", "t3");
        Customer customer4 = new Customer("customer4", "t4");

        // create orders
        Order order1 = new Order("O1", "abc", 100);
        Order order2 = new Order("O2", "xyz", 500);
        Order order3 = new Order("O3", "efg", 700);
        Order order4 = new Order("O4", "rst", 200);

//        Begin opeations
        customer1.placeOrder();
        customer1.showDetails();
        cashier.createNewOrder();
        order1.showDetails();
        cashier.giveToken();
        barista.generateToken();
        barista.prepareCoffee();
        barista.serveCoffee();
        customer1.enjoyDrink();
        barista.getNextOrder();

    }
}
 class Barista {
    String baristaId;


    public Barista(String baristaId) {
        this.baristaId = baristaId;
    }

    void getNextOrder()
    {
        System.out.println("getting the next order from the order queue");
    }

    void prepareCoffee(){
        System.out.println("your coffee is being prepared");
    }

    void generateToken(){
        System.out.println("you have been assigned a token...your coffee will arrive soon!!");
    }

    void serveCoffee(){
        System.out.println("enjoy your coffee... Thank you for visiting us!!!");
    }

}
 class Cashier {
    String cashierId;

    public Cashier(String cashierId) {
        this.cashierId = cashierId;
    }

    void createNewOrder(){
        System.out.println("Creating new Order");
    }

    void giveToken(){
        System.out.println("Assign tokens to respective orders");
    }

}
class Customer {
    String customerId;
    String tokenNumber;

    public Customer(String customerId, String tokenNumber) {
        this.customerId = customerId;
        this.tokenNumber = tokenNumber;
    }

    void showDetails(){
        System.out.println("customer id :: " + customerId + " token number :: " + tokenNumber);
    }

    void placeOrder(){
        System.out.println("take my order");
    }

    void enjoyDrink(){
        System.out.println("thank you");
    }

}
class Order {
    String orderId;
    String itemName;
    double itemPrice;

    public Order(String orderId, String itemName, double itemPrice) {
        this.orderId = orderId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

   void showDetails(){
       System.out.println("order id :: " + orderId + " , item name :: " + itemName + " , item price :: " +itemPrice);
   }
}