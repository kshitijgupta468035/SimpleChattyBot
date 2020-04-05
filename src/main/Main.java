/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: kshitijgupta468035
 *   Date: 05/04/20
 *   Time: 19:29 PM
 */

package main;

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
        } while (response == true);
    }
}
