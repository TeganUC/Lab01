import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

import static java.nio.file.StandardOpenOption.CREATE;

public class PersonGenerator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean doneInput = false;

        String ID = "";
        String firstName = "";
        String lastName = "";
        String title = "";
        String rec = "";
        int YOB;

        ArrayList<String> people = new ArrayList<String>();

        // Creates loop to
        do {
            ID = SafeInput.getNonZeroLenString(in, "Enter your ID[000001]");
            firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
            lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
            title = SafeInput.getNonZeroLenString(in, "Enter your title");
            YOB = SafeInput.getRangedInt(in, "Enter your year of birth", 1940, 2025);

            rec = ID + " " + firstName + " " + lastName + " " + title + " " + YOB;
            Person person = new Person(ID, firstName, lastName, title, YOB);

            System.out.println(rec);

            people.add(person.toCSV());

            doneInput = SafeInput.getYNConfirm(in, "Are you done?");
        } while (!doneInput);

        try {
            // Create the BufferedWriter using the filename
            BufferedWriter writer = new BufferedWriter(new FileWriter("PersonData"));

            // Using traditional for loop
            for (int i = 0; i < people.size(); i++) {
                writer.write(people.get(i));
                writer.newLine();
            }

            // Close the writer to seal the file and flush the buffer
            writer.close();
            System.out.println("Data file written!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
