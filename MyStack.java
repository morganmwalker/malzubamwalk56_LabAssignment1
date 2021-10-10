package LA1Q2;

import java.util.Arrays;

public class MyStack<E> {
    private Object[] objectArray;
    private int length;

    // constructor
    public MyStack(int length) {
        objectArray = new MyStack[length];
    }

    // method to test if the stack is empty
    public boolean empty() {
        if (length == 0) {
            return true;
        } else {
            return false;
        }
    }

    //method that returns the value at the top of the array
    public E peek() {
        return (E) objectArray[length - 1];
    }

    //method that will remove the object at the top of the stack abd returns it
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
        return popped;   //returns removed item
    }


    // method that will push items to the top of the stack
    public E push(E data) {
        //increment array size by 1
        length++;
        Object[] newArray = new Object[length];
        //copy values from original array to the new Array
        System.arraycopy(objectArray, 0, newArray, 0, objectArray.length);
        //size of the array will be the passed parameter data
        newArray[objectArray.length] = data;
        objectArray = newArray;
        return data;
    }

    // method that will search the stack for the value that the program wants to find
    public int search(Object valueToBeFound) {
        //loop to search for the value
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] == valueToBeFound) {
                //returns 1-based position with respect to top of stack
                return objectArray.length - i;
            }
        }
        //returns -1 if the element doesn't exist in the stack
        return -1;
    }

    //toString method that will print the contents in the stack
    @Override
    public String toString() {
        if (empty()) {
            System.out.print("The stack is Empty! ");
        }
        return "The stack: " + Arrays.toString(objectArray);
    }
}
