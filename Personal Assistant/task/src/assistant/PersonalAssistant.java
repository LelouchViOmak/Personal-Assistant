package assistant;

import java.util.Scanner;

public class PersonalAssistant {
    public static void main(String[] args) {
        Credentials ();
        Counting ();
        knowledge ();

    }


    private static void Credentials() {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Hello! My Name is Aid.\n" +
                "I was created in 2018.\n" +
                "Please, remind me your name." );
        String name = in.next ();
        System.out.println ( "What a great name you have,\t" + name + "!\n" +
                "Let me guess your age.\n" +
                "Enter remainders of dividing your age by 3, 5 and 7." );
        int[] age = new int[3]; // age array deceleration.
        for (int i = 0; i < 3; i++) { //input taking loop.
            age[i] = in.nextInt ();
        }
        int yourAge = ((age[0] % 3) * 70 + (age[1] % 5) * 21 + (age[2] % 7) * 15) % 105;
        System.out.println ( "Your age is\t" + yourAge + "; that's a good time to start programming!" );
    }

    private static void Counting() {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Now I will prove to you that I can count to any number you want." );
        int i, count;
        count = in.nextInt ();
        for (i = 0; i <= count; i++) {
            System.out.println ( i + "!" );
        }
        //System.out.println ( "Completed, have a nice day!" );
    }

    private static void knowledge() {
        Scanner in = new Scanner ( System.in );
        int choice;

        System.out.println ( "Let's test your programming knowledge.\n" +
                "Why do we use methods?\n" +
                "1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program." );

        choice = in.nextInt ();
        boolean condition = false;
        do {
            if (choice == 2) {
                condition = true;
                System.out.println ( "Congratulations, have a nice day!" );
            } else {
                System.out.println ( "Please, try again." );
                choice = in.nextInt ();
            }
        } while (condition == false);
        /*if (choice == 2) {
            System.out.print ( "Congratulations, have a nice day!" );
        }*/
    }
}


