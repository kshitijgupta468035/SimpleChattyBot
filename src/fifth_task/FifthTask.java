/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: kshitijgupta468035
 *   Date: 05/04/20
 *   Time: 16:45 PM
 */

package fifth_task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class FifthTask implements FifthTaskADT {

    @Override
    public String createNewFile() throws IOException {
        System.out.println("Enter the name of the file.");
        Scanner scan = new Scanner(System.in);
        String nameOfFile = scan.nextLine().trim();

        File f = new File(nameOfFile); // creating new file

        System.out.println("Enter the data you want to add.");
        String data = scan.nextLine();
        Writer fw = new FileWriter(f);
        fw.write(data);
        fw.write("\n");
        System.out.println("\n\033[1;94m" + "Your file is created. Exit the program to see changes." + "\033[0m");
        fw.close();

        System.out.println("\nIf you want to do anything else in you notebook press 'y' otherwise 'n'.");
        String tempResponse = scan.nextLine().trim();
        tempResponse = tempResponse.toLowerCase();

        return tempResponse;
    }

    @Override
    public String addDataToFile() throws IOException {
        return null;
    }

    @Override
    public String readDataFromFile() throws IOException {
        return null;
    }

    @Override
    public String deleteFile() throws IOException {
        return null;
    }
}
