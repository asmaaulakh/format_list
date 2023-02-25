import java.io.File;                    // Import contacts.txt file
import java.io.FileWriter;              // Import file for output file
import java.io.IOException;             // Import for errors and exceptions
import java.util.Scanner;               // Import Scanner object

public class FormatContacts {

    public static void main(String[] args) throws IOException {

        // Open both files-input file for contacts.txt file and output file for formatted-contacts.txt file
        File inputFile = new File("contacts.txt");
        Scanner scanner = new Scanner(inputFile);


        FileWriter outputFile = new FileWriter("formatted-contacts.txt");

        // Go through each line for input file
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] fields = line.split(", ");

            // Get important info from each line
            String firstName = fields[1];
            String lastName = fields[2];
            String email = fields[3];

            // Reformat the text on each line and write it to output file
            String formattedText = lastName + ", " + firstName + " <" + email;
            outputFile.write(formattedText + ">\n");

            // Close both files
            scanner.close();
            outputFile.close();
        }
    }
}





