package LA1Q1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Pair<Y, N> {
    public static void main(String[] args) {
        header(); // print header

        //ArrayLists to store the names and years of the students
        ArrayList<Integer> studentYear = new ArrayList(Arrays.asList(2, 3, 4, 3, 2, 2));
        ArrayList<String> studentName = new ArrayList(Arrays.asList("Harry", "Lavender", "Ron", "Hermione", "Luna", "Vincent"));

        //an array that with the length of the studentYear ArrayList
        Pair[] yn = new Pair[studentYear.size()];

        // populate array with student leader year and name
        for (int i = 0; i < yn.length; i++) {
            yn[i] = new Pair(studentYear.get(i), studentName.get(i));
        }

        //user input to get the year
        Scanner scan = new Scanner(System.in);

        // loop to ask the user what year they want the names from
        char cont = 'y';
        do {
            System.out.print("From which academic year would you like to list the names of the leaders: ");
            int year = 0;

            //try-catch to check if the user doesnt input an int
            try {
                year = scan.nextInt();
            } catch (Exception e) {
                scan.nextLine();
            }

            //try-catch to check if the user inputs years from 2-4
            while (year != 2 && year != 3 && year != 4) {
                System.out.print("Invalid Entry! Enter a valid number between 2 and 4: ");

                try {
                    year = scan.nextInt();

                } catch (Exception ex) {
                    scan.nextLine();
                }
            }


            int count = 0; // holds number of students from user input year
            String names = ""; // holds list of names from user input year

            for (int i = 0; i < yn.length; i++) {
                if (year == studentYear.get(i)) {
                    count++;
                    names += yn[i].getValue().toString() + "\n";
                }
            }

            // prints list of names from user specified year
            System.out.printf("We found %s student leader(s) from year %s and here is the list: \n", count, year);
            System.out.print(names);

            System.out.print("Do you want to continue? (y/n): ");
            cont = scan.next().charAt(0);

            //to check if the entry is anything other than y or n it will print Invalid Entry!
            while (((cont != 'n') && (cont != 'y')) && ((cont != 'N') && (cont != 'Y')) ) {
                System.out.print("Invalid Entry! Enter y or n: ");
                cont = scan.next().charAt(0);
            }

            //the code will loop if the user enters y
        } while (cont == 'y' || cont == 'Y');

        //print statement for the reps
        System.out.println("\nHere are the students reps: ");
        //calling the getRep method to get the names of the reps
        getRep_MariamMorgan(yn);

        footer(); // print footer
    }

    //data fields
    private Y key;
    private N value;

    //constructor with parameters
    public Pair(Y key, N value) {
        this.key = key;
        this.value = value;
    }

    //set methods for key and value

    public void setKey(Y key) {
        this.key = key;
    }

    public void setValue(N value) {
        this.value = value;
    }

    //get methods for key and value

    public Y getKey() {
        return key;
    }

    public N getValue() {
        return value;
    }

    // method that will check the Pair[] array and add the first number and corresponding name to a new array
    // and if that number exists again it will ignore it
    public static <E> ArrayList<E> getRep_MariamMorgan(Pair[] pa) {
        //creating a new ArrayList that is empty
        ArrayList<String> repArray = new ArrayList<String>();

        //...
        for (int i = 0; i < pa.length; i++) {
            if (repArray.contains(pa[i].getKey().toString()) == false) {
                repArray.add(pa[i].getKey().toString());
                repArray.add(pa[i].getValue().toString());
            }
        }

        //for loop to print the years by starting at repArray[0] and incrementing it 2 so it prints repArray[2]
        //then to print the names it starts at 1 and increments by 2; to print repArray[3]
        for (int i = 0; i < repArray.size(); i += 2) {
            System.out.print(repArray.get(i) + " - ");
            System.out.println(repArray.get(i + 1));
        }

        //returns new array that contains only the reps
        return (ArrayList<E>) repArray;
    }

    //header method
    public static void header() {
        System.out.println("*****************************");
        System.out.println("Name: Morgan Walker and Mariam Al-Zubaidi\nStudent Number: 251183118 and 251077904");
        System.out.println("Goal of this project: ");
        System.out.println("*****************************\n");
    }

    //footer method
    public static void footer() {
        Date time = new Date();
        SimpleDateFormat theDate = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        SimpleDateFormat theTime = new SimpleDateFormat("HH:mm:ss");
        System.out.println("\n*****************************");
        System.out.printf("This is %s on %s\n", theTime.format(time), theDate.format(date));
        System.out.println("Completion of Lab Assignment 1 is successful");
        System.out.println("Goodbye! Morgan Walker and Mariam Al-Zubaidi");
        System.out.println("*****************************");
    }
}
