import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductGenerator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean doneInput = false;

        String ID = "";
        String name = "";
        String description = "";
        String rec = "";
        double cost;

        ArrayList<String> products = new ArrayList<String>();

        // Creates loop to
        do {
            ID = SafeInput.getNonZeroLenString(in, "Enter your ID[000001]");
            name = SafeInput.getNonZeroLenString(in, "Enter your product name");
            description = SafeInput.getNonZeroLenString(in, "Enter your product description");
            cost = SafeInput.getDouble(in, "Enter your product cost");

            rec = ID + " " + name + " " + description + " " + cost;
            Product product = new Product(ID, name, description, cost);

            System.out.println(rec);

            products.add(product.toCSV());

            doneInput = SafeInput.getYNConfirm(in, "Are you done?");
        } while (!doneInput);

        try {
            // Create the BufferedWriter using the filename
            BufferedWriter writer = new BufferedWriter(new FileWriter("ProductData"));

            // Using traditional for loop
            for (int i = 0; i < products.size(); i++) {
                writer.write(products.get(i));
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
