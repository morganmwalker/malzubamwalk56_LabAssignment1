package LA1Q2;

public class StackDemo0 {
    public static void main(String[] args) {
        header();

        // create an empty String stack
        MyStack<String> newStack = new MyStack<>(0);

        // print the stack content with the help of the toString() method
        System.out.println(newStack.toString());

        String[] student = {"251077904", "Al-Zubaidi", "Mariam", "251183118", "Walker", "Morgan"};

        System.out.println("Pushing the String values to the stack....");
        for (int i = 0; i < student.length; i++) {
            newStack.push(student[i]);
        }

        System.out.println(newStack.toString());

        System.out.println("The value at the top is: " + newStack.peek());

    }

    public static void header() {
        System.out.println("*************************");
        System.out.println("Names: Morgan Walker and Mariam Al-Zubaidi\nStudent Number: 251183118 and 251077904");
        System.out.println("Goal of this project: ");
        System.out.println("*************************\n");
    }
}
