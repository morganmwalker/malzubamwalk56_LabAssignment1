package LA1Q2;

import LA1Q1.Pair;

import java.util.Arrays;

public class MyStack<E> {

    private Object[] objectArray;

    private int length;

    // constructor
    public MyStack(int length) {
        objectArray = new MyStack[length];
    }

    // methods (return values are placeholders)
    public boolean empty() {
        return true;
    }

    public <E> boolean peek() {
        return true;
    }

    public <E> boolean pop() {
        return true;
    }

    public <E> void push(E anyName) {

    }

    public int search(Object nName) {
        return 0;
    }

    @Override
    public String toString() {
        return "MyStack{}";
    }
}
