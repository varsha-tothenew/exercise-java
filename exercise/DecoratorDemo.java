package design_pattern.exercise;

/**
 * Question 6: Implement the Decorator design pattern to decorate a pizza with toppings
 */

interface Pizza {
    void preparePizzaWithToppings();
}

class PaneerMania implements Pizza {
    String choiceOfCrust;
    boolean hasExtraCheese;

    public PaneerMania(String choiceOfCrust, boolean hasExtraCheese) {
        this.choiceOfCrust = choiceOfCrust;
        this.hasExtraCheese = hasExtraCheese;
    }

    @Override
    public void preparePizzaWithToppings() {
        System.out.println("a " + choiceOfCrust + " base and" + (hasExtraCheese ? " lots of " : " no ") + "extra cheese.");
    }
}

class VeggieLover implements Pizza {
    String choiceOfCrust;
    boolean hasExtraOlives;

    public VeggieLover(String choiceOfCrust, boolean hasExtraOlives) {
        this.choiceOfCrust = choiceOfCrust;
        this.hasExtraOlives = hasExtraOlives;
    }

    @Override
    public void preparePizzaWithToppings() {
        System.out.println("a " + choiceOfCrust + " base and" + (hasExtraOlives ? " lots of " : " no ") + "extra olives.");
    }
}

class PizzaMaharaja implements Pizza {
    Pizza pizza;
    int numberOfPizzas;

    public PizzaMaharaja(Pizza pizza, int numberOfPizzas) {
        this.pizza = pizza;
        this.numberOfPizzas = numberOfPizzas;
    }

    @Override
    public void preparePizzaWithToppings() {
        System.out.println("Here are the " + numberOfPizzas + " " + pizza.getClass().getName() + " pizzas you ordered!");
        System.out.print("Your pizzas have ");
        pizza.preparePizzaWithToppings();
    }
}

public class DecoratorDemo {
    public static void main(String[] args) {
        PizzaMaharaja pizzaMaharaja1 = new PizzaMaharaja(
                new PaneerMania("cheese burst", true),
                2);
        pizzaMaharaja1.preparePizzaWithToppings();

        PizzaMaharaja pizzaMaharaja2 = new PizzaMaharaja(
                new VeggieLover("wheat thin crust", true),
                4);
        pizzaMaharaja2.preparePizzaWithToppings();
    }
}
