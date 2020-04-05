/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: kshitijgupta468035
 *   Date: 05/04/20
 *   Time: 15:58 PM
 */

package fourth_task;

public class FourthTask implements FourthTaskADT {
    /**
     * This method will use to generate a random Number.
     *
     * @return the generated number.
     */
    private int generateRandomNumber() {
        int randomNumber = (int) (Math.random() * 100000); // generating random number

        return randomNumber;
    }

    @Override
    public void guessGame() {

    }
}
