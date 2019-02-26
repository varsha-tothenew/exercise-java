package collections.exercise;

import java.util.ArrayList;
import java.util.List;

//Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and
// an additional operation getMin() which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))
public class Question7 {
    public static void main(String[] args) {

        SpecialStack specialStack = new SpecialStack();
        System.out.println("stack empty:: " + specialStack.isEmpty());
        System.out.println("stack full :: " + specialStack.isFull());
        specialStack.pop();
        specialStack.push(10);
        specialStack.push(2);
        specialStack.push(30);
        specialStack.push(4);
        specialStack.pop();
        specialStack.display();
        specialStack.getMin();
        System.out.println("stack empty:: " + specialStack.isEmpty());
        System.out.println("stack full :: " + specialStack.isFull());
        specialStack.push(11);
        specialStack.push(1);
        specialStack.display();
        specialStack.getMin();
        System.out.println("stack full :: " + specialStack.isFull());
        specialStack.push(1);
        specialStack.pop();
        specialStack.display();
    }
}

class SpecialStack {
    static final int capacity = 5;
    int min;
    List<Integer> list = new ArrayList(capacity);

    boolean empty = list.isEmpty();
    int topIndex = -1;

    public void push(int el) {

        if (isFull()) {
            System.out.println("stack full cannot push");
        } else if (isEmpty()) {
            list.add(el);
            min = list.get(0);
        } else if (!isFull()) {
            list.add(el);
            if (min > el) {
                min = el;
            }
        }
        empty = false;
        topIndex = list.size() - 1;

    }

    public void pop() {
        if (isEmpty())
            System.out.println("stack empty cannot pop");
        else
            list.remove(topIndex);
    }

    public boolean isEmpty() {
        if (empty)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (topIndex != capacity - 1)
            return false;
        else
            return true;
    }

    public void getMin() {
        if (!isEmpty()) {
            System.out.println("min:: " + min);
//            int min = list.get(0);
//            for (int i = 1; i < list.size(); i++) {
//                if (list.get(i) < min)
//                    min = list.get(i);
//            }
        } else {
            System.out.println("stack empty cannot find min");
        }
    }

    public void display() {
        for (Integer el : list) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
