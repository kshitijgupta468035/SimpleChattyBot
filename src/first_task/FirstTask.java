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