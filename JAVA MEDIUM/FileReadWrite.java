import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        String sourceFileName = "source.txt"; 
        String destinationFileName = "destination.txt"; 
        try (FileReader reader = new FileReader(sourceFileName);
             FileWriter writer = new FileWriter(destinationFileName)) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("Data copied successfully from " + sourceFileName + " to " + destinationFileName);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
