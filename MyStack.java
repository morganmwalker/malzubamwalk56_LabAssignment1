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
        } else {
            return false;
        }
    }

    //returns the value at the top of the array
    public E peek() {
        return (E) objectArray[length - 1];
    }


    public E pop() {
        E popped;
        Object[] newArray = new Object[length];

        //save the popped data in the variable popped
        popped = (E) objectArray[objectArray.length - 1];
        //decrement length by 1
        length--;
        newArray = new Object[objectArray.length - 1];
        //copy the other elements from myArray to newArray without copying the popped element
        System.arraycopy(objectArray, 0, newArray, 0, newArray.length);
        //myArray is referring to the copied array one
        objectArray = newArray;
        return popped;
    }


    public E push(E data) {
        //increment array size by 1
        length++;
        Object[] newArray = new Object[length];
        //copy values from original array to the new Array
        System.arraycopy(objectArray, 0, newArray, 0, objectArray.length);
        newArray[objectArray.length] = data;
        objectArray = newArray;
        return data;
    }

    public int search(Object valueToBeFound) {
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] == valueToBeFound) {
                return objectArray.length - i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        if (empty()) {
            System.out.print("The stack is Empty! ");
        }
        return "The stack: " + Arrays.toString(objectArray);
    }
}
