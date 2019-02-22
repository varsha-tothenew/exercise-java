package java2;

public class Question12 {
    public static void main(String[] args) {
        Grandparent grandparent = new Grandparent();
        System.out.println();

        Parent parent = new Parent();
        System.out.println();

        Child child = new Child();
        System.out.println();

        Grandparent grandparent1 = new Parent();
        System.out.println();

        Grandparent grandparent2 = new Child();
        System.out.println();

        Parent parent1 = new Child();

        //Child child1=new Parent();
    }
}

class Grandparent {

    static {
        System.out.println("static - grandparent");
    }

    {
        System.out.println("instance - grandparent");
    }

    public Grandparent() {
        System.out.println("constructor - grandparent");
    }
}

class Parent extends Grandparent {

    static {
        System.out.println("static - parent");
    }

    {
        System.out.println("instance - parent");
    }

    public Parent() {
        System.out.println("constructor - parent");
    }
}

class Child extends Parent {

    static {
        System.out.println("static - child");
    }

    {
        System.out.println("instance - child");
    }

    public Child() {
        System.out.println("constructor - child");
    }
}