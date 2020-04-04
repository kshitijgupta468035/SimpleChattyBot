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

    @Override
    public void checkingNumberForStrongNumber() {

    }

    @Override
    public void checkingNumberForDisariumNumber() {

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
