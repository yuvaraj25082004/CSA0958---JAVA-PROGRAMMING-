import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFileName = "source.txt"; 
        String destinationFileName = "destination.txt"; 

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); 
            }
            System.out.println("Data copied successfully from " + sourceFileName + " to " + destinationFileName);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
