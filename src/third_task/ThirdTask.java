/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: kshitijgupta468035
 *   Date: 05/04/20
 *   Time: 12:13 PM
 */

package third_task;

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

    @Override
    public void basicCalculator(String operator) {

    }
}
