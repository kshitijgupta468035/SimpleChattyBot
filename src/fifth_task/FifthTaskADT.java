/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: kshitijgupta468035
 *   Date: 05/04/20
 *   Time: 16:26 PM
 */

package fifth_task;

import java.io.IOException;

/**
 * This interface will be implemented by class FifthTask.
 */
public interface FifthTaskADT {
    /**
     * This method will is used to create a new file.
     *
     * @return the user choice for next instruction.
     * @throws IOException if file not created properly.
     */
    String createNewFile() throws IOException;

}
