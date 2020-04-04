/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: kshitijgupta468035
 *   Date: 04/04/20
 *   Time: 22:55 PM
 */

package second_task;

public class SecondTask implements SecondTaskADT {
    // create three private instance variables
    private int firstRemainder;
    private int secondRemainder;
    private int thirdRemainder;

    // getter method for private varaible firstRemainder
    public int getFirstRemainder() {
        return firstRemainder;
    }

    // getter method for private varaible secondRemainder
    public int getSecondRemainder() {
        return secondRemainder;
    }

    // getter method for private varaible thirdRemainder
    public int getThirdRemainder() {
        return thirdRemainder;
    }

    // setter method for private varaible firstRemainder
    public void setFirstRemainder(int firstRemainder) {
        this.firstRemainder = firstRemainder;
    }

    // setter method for private varaible secondRemainder
    public void setSecondRemainder(int secondRemainder) {
        this.secondRemainder = secondRemainder;
    }

    // setter method for private varaible thirdRemainder
    public void setThirdRemainder(int thirdRemainder) {
        this.thirdRemainder = thirdRemainder;
    }

    @Override
    public int ageCalculator() {
        // formula to calculate age
        int age = (firstRemainder * 70 + secondRemainder * 21 + thirdRemainder * 15) % 105;

        return age;
    }
}
