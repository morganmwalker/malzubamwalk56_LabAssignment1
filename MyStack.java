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
    }

    public E push(E data) {
        //increment array size by 1
        length++;
        Object[] newArray = new Object[length];
        System.arraycopy(objectArray,0,newArray,0,objectArray.length);
        newArray[objectArray.length] = data;
        objectArray = newArray;
        newArray = null;
        return data;
    }

        public E pop() {
            E popped;
            Object[] newArray = new Object[length];

            //save the popped data in the variable popped
            popped = (E) objectArray[objectArray.length - 1];
            //decrement array size by 1
            length--;
            newArray = new Object[objectArray.length - 1];
            //except the popped element, copy the other elements from myArray to newArray
            System.arraycopy(objectArray, 0, newArray, 0, newArray.length);
            objectArray = newArray;
            newArray = null;
            return popped;
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
