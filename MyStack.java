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
        return null;
    }

    public E pop() {
        return null;
    }

    public E push(E data) {
        //increment array size by 1
        length++;
        objectArray = new Object[length];
//copy the existing elements from myArray to newArray
        //System.arraycopy(myArray,0,newArray,0,myArray.length);
//push the new data to the top
        objectArray[length-1] = data;
        //myArray = newArray;
        //objectArray = null; //not mandatory but it is a good practice
        return data;
    }

    public int search(Object nName) {
        return 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(objectArray) ;
    }
}
