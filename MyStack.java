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
        if (length == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public E peek() {
        return (E) objectArray[length-1];
        //return null;
    }

    public E pop() {
        return null;
    }

    public E push(E data) {
        //increment array size by 1
        length++;
        Object[] newArray = new Object[length];
        System.arraycopy(objectArray,0,newArray,0,objectArray.length);
        newArray[objectArray.length] = data;
        objectArray = newArray;
        return data;
    }

    public int search(Object valueToBeFound) {
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] == valueToBeFound) {
                return objectArray.length - i;
            }
        } return -1;
    }

    @Override
    public String toString() {
        if (empty()) {
            System.out.print("The stack is Empty! ");
        }
        return "The stack: " + Arrays.toString(objectArray);
    }
}
