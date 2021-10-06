package LA1Q2;

public class StackDemo0 {
    public static void main(String[] args) {
        header();

        // create an empty String stack
        MyStack stringStack = new MyStack(0);

        // print the stack content with the help of the toString() method
        stringStack.toString();

    }

    public static void header() {
        System.out.println("*************************");
        System.out.println("Names: Morgan Walker and Mariam Al-Zubaidi\nStudent Number: 251183118 and 251077904");
        System.out.println("Goal of this project: ");
        System.out.println("*************************\n");
    }
}
