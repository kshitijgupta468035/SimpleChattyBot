/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: kshitijgupta468035
 *   Date: 05/04/20
 *   Time: 16:45 PM
 */

package fifth_task;

import java.io.*;
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
        System.out.println("Enter the name of file in " +
                "which you want to add your data.");
        Scanner scan = new Scanner(System.in);
        String nameOfFile = scan.nextLine();

        File f = new File(nameOfFile);
        System.out.println("Enter data in your file.");
        String data = scan.nextLine();

        Writer fw = new FileWriter(f, true);
        fw.write(data); // writing data into file
        fw.write("\n");
        System.out.println("\n\033[1;94m" + "Your data is added. Exit the program to see changes." + "\033[0m");
        fw.close();

        System.out.println("\nIf you want to do anything else in you notebook press 'y' otherwise 'n'.");
        String tempResponse = scan.nextLine().trim();
        tempResponse = tempResponse.toLowerCase();

        return tempResponse;
    }

    @Override
    public String readDataFromFile() throws IOException {
        System.out.println("Enter the name of the file.");
        Scanner scan = new Scanner(System.in);
        String nameOfFile = scan.nextLine().trim();

        File f = new File(nameOfFile);
        Reader r = new FileReader(f);

        // Read data from a file
        BufferedReader br = new BufferedReader(r);
        String msg;
        while ((msg = br.readLine()) != null) {
            System.out.println(msg);
        }
        System.out.println("\n\033[1;94m" + "Data successfully readed." + "\033[0m");
        r.close();

        System.out.println("\nIf you want to do anything else in you notebook press 'y' otherwise 'n'.");
        String tempResponse = scan.nextLine().trim();
        tempResponse = tempResponse.toLowerCase();

        return tempResponse;
    }

    @Override
    public String deleteFile() throws IOException {
        System.out.println("Enter the name of the file.");
        Scanner scan = new Scanner(System.in);
        String nameOfFile = scan.nextLine();

        File f = new File(nameOfFile);
        boolean b = f.delete(); // this will delete the file

        if (b == true) {
            System.out.println("\033[1;94m" + "\nYour file " + nameOfFile + " is deleted. Exit the program to see changes." + "\033[0m");
        } else {
            System.out.println("\033[1;94m" + "\nYour file " + nameOfFile + " is not deleted. Exit the program to see changes." + "\033[0m");
        }

        System.out.println("\nIf you want to do anything else in you notebook press 'y' otherwise 'n'.");
        String tempResponse = scan.nextLine().trim();
        tempResponse = tempResponse.toLowerCase();

        return tempResponse;
    }
}
