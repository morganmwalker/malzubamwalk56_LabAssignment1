package LA1Q2;

public class StackDemo0 {
    public static void main(String[] args) {
        header();   //calling header method

        // create an empty String stack
        MyStack<String> newStack = new MyStack<>(0);

        // print the stack content with the help of the toString() method
        System.out.println(newStack.toString());

        // creating a String array with names and student numbers
        String[] student = {"251077904", "Al-Zubaidi", "Mariam", "251183118", "Walker", "Morgan"};

        //pushing each element of the student array to the stack using push() method
        System.out.println("Pushing the String values to the stack....");
        for (int i = 0; i < student.length; i++) {
            newStack.push(student[i]);
        }
        //printing the stack that now contains the names and student numbers
        System.out.println(newStack.toString());

        // printing the top of the stack using the peek method
        System.out.println("The value at the top is: " + newStack.peek());

        //search the stack for the first student number
        System.out.println("Searching for 251183118...");
        System.out.println("The item has been found in distance " + newStack.search("251183118") + " with reference to the top");

        // store the distance metric as a String variable
        String studentNumber = student[(newStack.search("251183118"))];

        // convert student number to integer using parseInt method
        int sn = (Integer.parseInt(studentNumber));

        // find last digit
        int snLast = sn % 10;

        // find first digit
        int snFirst = 0;
        while(sn != 0) {
            snFirst = sn % 10;
            sn /= 10;
        }

        System.out.println("The first number in the student ID is " + snFirst);
        System.out.println("The last number in the student ID is " + snLast);

        // print the average of the first and last digit
        System.out.println("The average of these two numbers is: " + ((double)snFirst + (double)snLast)/2);

        footer(newStack);   //calling the footer method
    }


    //header method
    public static void header() {
        System.out.println("*************************");
        System.out.println("Names: Morgan Walker and Mariam Al-Zubaidi\nStudent Number: 251183118 and 251077904");
        System.out.println("Goal of this project: ");
        System.out.println("*************************\n");
    }

    //footer method
    public static void footer(MyStack finalStack) {
        //the parameter v is the newStack that contains all the values
        //casting it to be able to use it inside the footer() method
        //MyStack<String> finalStack = (MyStack<String>) v;
        //Team Member 1 info:
        System.out.println("\nTeam Member 1 info.....");
        //popping the stack 3 times
        System.out.println("    First Name: " + finalStack.pop());
        System.out.println("    Last Name: " + finalStack.pop());
        System.out.println("    Student Number: " + finalStack.pop());

        //Team Member 2 info:
        System.out.println("Team Member 2 info.....");
        //popping the stack 3 times
        System.out.println("    First Name: " + finalStack.pop());
        System.out.println("    Last Name: " + finalStack.pop());
        System.out.println("    Student Number: " + finalStack.pop());
        System.out.println("Here is the status of the Stack...");
        System.out.println(finalStack.toString() );
        System.out.println("Goodbye!");
    }

}
