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
        boolean response = true;
        do {
            String randomGuessedNumber = String.valueOf(generateRandomNumber()); // convert generate number into String
            System.out.println("Enter your guessed number.");
            Scanner scan = new Scanner(System.in);
            String guessedNumber = scan.nextLine().trim();

            if (guessedNumber.equals("1")) {
                break;
            }

            System.out.println("\033[1;94m" + "The generated number is " + randomGuessedNumber + "." + "\033[0m");

            char[] first = randomGuessedNumber.toCharArray();
            char[] second = guessedNumber.toCharArray();

            int countCows = 0;
            int countBulls = 0;

        } while (response == true);
    }
}