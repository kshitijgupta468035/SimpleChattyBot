/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: kshitijgupta468035
 *   Date: 05/04/20
 *   Time: 12:13 PM
 */

package third_task;

import java.util.Scanner;

public class ThirdTask implements ThirdTaskADT {
    // create two private instance varaibles
    private int firstNumber;
    private int secondNumber;

    // Constructor to initalize the instance variables
    public ThirdTask(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    // getter method for private variable firstNumber
    public int getFirstNumber() {
        return firstNumber;
    }

    // setter method for private variable firstNumber
    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    // getter method for private variable secondNumber
    public int getSecondNumber() {
        return secondNumber;
    }

    // setter method for private variable secondNumber
    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    /**
     * This method is used when the user will enter the incorrect value of
     * the operator for the calculation.
     */
    private void invalidValueHandler() {
        System.out.println("\nIf you want to enter the operator again press y else n.");

        Scanner scan = new Scanner(System.in);
        String response = scan.nextLine().trim();

        if (response.equals("y")) {
            System.out.println("Enter the operator.");
            String operator = scan.nextLine().trim();
            basicCalculator(operator);
        } else if (response.equals("n")) {
            return;
        }
    }

    @Override
    public void basicCalculator(String operator) {
        // for checking the operator
        switch (operator) {
            case "+":
                System.out.println("\033[1;94m" + "\nYour answer is " + (firstNumber + secondNumber) + "." + "\033[0m");
                break;
            case "-":
                System.out.println("\033[1;94m" + "\nYour answer is " + (firstNumber - secondNumber) + "." + "\033[0m");
                break;
            case "*":
                System.out.println("\033[1;94m" + "\nYour answer is " + (firstNumber * secondNumber) + "." + "\033[0m");
                break;
        }
    }
}