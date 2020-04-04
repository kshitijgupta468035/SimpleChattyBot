/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: kshitijgupta468035
 *   Date: 04/04/20
 *   Time: 21:40 PM
 */

package first_task;

public class FirstTask implements FirstTaskADT {
    private int userInputNumber; //  private instance varaible

    // Create a constructor which is used to initalize instance variable(userInputNumber)
    public FirstTask(int userInputNumber) {
        this.userInputNumber = userInputNumber;
    }

    // getter method for private varaiable userInputNumber
    public int getUserInputNumber() {
        return userInputNumber;
    }

    // setter method for private varaiable userInputNumber
    public void setUserInputNumber(int userInputNumber) {
        this.userInputNumber = userInputNumber;
    }

    /**
     * This method will find the factorial of a number.
     *
     * @param number the number whose factorial to be find.
     * @return the factorial of a number.
     */
    private int forFindingFactorial(int number) {
        int f = 1;
        for (int i = 1; i <= number; i++) {
            f = f * i;
        }

        return f;
    }

    /**
     * This method will find the sum of a number.
     *
     * @param number the number whose sum to be find.
     * @return the sum of a number.
     */
    private int sumOfNumber(int number) {
        int value;
        int sum = 0;
        while (number > 0) {
            value = number % 10;
            sum = sum + value;
            number = number / 10;
        }

        return sum;
    }

    @Override
    public void checkingNumberForStrongNumber() {
        int temp = userInputNumber;
        int temp1;
        int temp2;
        int sum = 0;

        while (userInputNumber > 0) {
            temp1 = userInputNumber % 10;
            temp2 = forFindingFactorial(temp1);
            sum = sum + temp2;
            userInputNumber = userInputNumber / 10;
        }

        if (temp == sum) {
            System.out.println("\033[1;94m" + "\nYour number is Strong number." + "\033[0m");
        } else {
            System.out.println("\033[1;94m" + "\nYour number is not a Strong Number." + "\033[0m");
        }
    }

    @Override
    public void checkingNumberForDisariumNumber() {
        int temp = userInputNumber;
        int temp1 = userInputNumber;
        int count = 0;
        while (userInputNumber > 0) {
            count++;
            userInputNumber = userInputNumber / 10;
        }

        int sum = 0;
        int f;
        while (temp > 0) {
            f = temp % 10;
            sum = sum + (int) Math.pow(f, count);
            count--;
            temp = temp / 10;
        }

        if (sum == temp1) {
            System.out.println("\033[1;94m" + "Your number is Disarium Number." + "\033[0m");
        } else {
            System.out.println("\033[1;94m" + "\nYour number is not a Disarium Number." + "\033[0m");
        }
    }

    @Override
    public void checkingNumberForSpyNumber() {

    }

    @Override
    public void checkingNumberForNeonNumber() {

    }

    @Override
    public void checkingNumberForSunnyNumber() {

    }
}
