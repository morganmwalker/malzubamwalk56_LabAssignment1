package LA1Q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pair<Y, N> {
    public static void main(String[] args) {
        header(); // print header

        ArrayList<Integer> studentYear = new ArrayList(Arrays.asList(2, 3, 4, 3, 2, 2));

        ArrayList<String> studentName = new ArrayList(Arrays.asList("Harry", "Lavender", "Ron", "Hermione", "Luna", "Vincent"));

        Pair[] yn = new Pair[studentYear.size()];

        // populate array with student leader year and name
        for (int i = 0; i < yn.length; i++) {
            yn[i] = new Pair(studentYear.get(i), studentName.get(i));
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("Let’s check out the leaders from different year of program.");

        char cont = 'y';
        do {
            System.out.print("From which academic year would you like to list the names of the leaders: ");
            int year = 0;

            try {
                year = scan.nextInt();
            } catch (Exception e) {
                scan.nextLine();
            }

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

            while ((cont != 'n') && (cont != 'y')) {
                System.out.print("Invalid Entry! Enter y or n: ");
                cont = scan.next().charAt(0);
            }

        } while (cont == 'y' || cont == 'Y');

        System.out.println("\nHere are the students reps: ");
        getRep_MariamMorgan(yn);

        footer(); // print footer
    }

    private Y key;
    private N value;

    public Pair(Y key, N value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(Y key) {
        this.key = key;
    }

    public void setValue(N value) {
        this.value = value;
    }

    public Y getKey() {
        return key;
    }

    public N getValue() {
        return value;
    }

    // question (d)
    public static <E> ArrayList<E> getRep_MariamMorgan(Pair[] pa) {
        ArrayList<String> repArray = new ArrayList<String>();

        for (int i = 0; i < pa.length; i++) {
            if (repArray.contains(pa[i].getKey().toString()) == false) {
                repArray.add(pa[i].getKey().toString());
                repArray.add(pa[i].getValue().toString());
            }
        }

        for (int i = 0; i < repArray.size(); i += 2) {
            System.out.print(repArray.get(i) + " - ");
            System.out.println(repArray.get(i + 1));
        }

        //System.out.println(repArray);

        return (ArrayList<E>) repArray;
    }

    public static void header() {
        System.out.println("*****************************");
        System.out.println("Name: Morgan Walker and Mariam Al-Zubaidi\nStudent Number: 251183118 and 251077904");
        System.out.println("Goal of this project: ");
        System.out.println("*****************************\n");
    }

    public static void footer() {
        System.out.println("\n*****************************");
        System.out.println("This is timeOfDay on theDate");
        System.out.println("Completion of Lab Assignment 1 is successful");
        System.out.println("Goodbye! Morgan Walker and Mariam Al-Zubaidi");
        System.out.println("*****************************");
    }
}
