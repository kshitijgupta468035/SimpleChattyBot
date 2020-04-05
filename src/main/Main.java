/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: kshitijgupta468035
 *   Date: 05/04/20
 *   Time: 19:29 PM
 */

package main;

import first_task.FirstTask;

import java.util.Scanner;

public class Main extends Thread {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in); // Creating Scanner class object name scan

        System.out.println("Hello my name is Tom, I am your personal bot." + "\n" + "What is your name?");
        String userName = scan.nextLine();
        Thread.sleep(300);
        System.out.println("Hello!! " + userName + " Nice to meet you.");

        boolean response = true;
        do {
            Thread.sleep(300);
            System.out.println();
            System.out.println("I am available at your service and these are some tasks" +
                    " that I can do for you. Task are listed below.");

            Thread.sleep(300);
            System.out.println();
            System.out.println("1. I can check for you that the number is whether Strong Number," +
                    " Disarium Number," +
                    "\n   Spy Number, Sunny Number, and Neon Number.\n" +
                    "2. I can caculate Your age." +
                    "\n3. I can be a calculator for you." +
                    "\n4. I can play a guess game with you." +
                    "\n5. I can store your data in my Storage just like notes." +
                    "\n6. Press 6 to exit.");

            Thread.sleep(300);
            System.out.println("\nWhat would you like to do, my Master" + "\n   Press that number to select the task.");

            int selectionOfUser = scan.nextInt();
            scan.nextLine();

            // checking selectionOfUser
            if (selectionOfUser == 1) {
                Thread.sleep(300);
                System.out.println("You selected task 1.");

                Thread.sleep(300);
                do {
                    System.out.println("Write the number to be checked.");
                    int numberToBeChecked = scan.nextInt();

                    Thread.sleep(500);
                    System.out.println("\nNow if you want to check " +
                            "\n     for Strong Number press A" +
                            "\n     for Disarium Number press B" +
                            "\n     for Spy Number press C" +
                            "\n     for Neon Number press D" +
                            "\n     for Sunny Number press E");

                    scan.nextLine();

                    Thread.sleep(300);
                    System.out.println("\nEnter your choice.");
                    String userRequirement = scan.nextLine().trim();
                    userRequirement = userRequirement.toLowerCase();

                    // creating object for class FirstTask
                    FirstTask object1 = new FirstTask(numberToBeChecked);

                    switch (userRequirement) {
                        case "a":
                            object1.checkingNumberForStrongNumber(); // method call for checking Strong Number
                            break;
                        case "b":
                            object1.checkingNumberForDisariumNumber(); // method call for checking Disarium Number
                            break;
                        case "c":
                            object1.checkingNumberForSpyNumber(); // method call for checking Spy Number
                            break;
                        case "d":
                            object1.checkingNumberForNeonNumber(); // method call for checking Neon Number
                            break;
                        case "e":
                            object1.checkingNumberForSunnyNumber(); // method call for checking Sunny Number
                            break;
                        default:
                            System.out.println("Invalid Input.");
                            break;
                    }
                } while (true);
            }
        } while (response == true);
    }
}
