import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String textToWrite = "Computer Science and Engineering";
        String filePath = "example.txt";
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(textToWrite);
            System.out.println("Text written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        try (FileReader reader = new FileReader(filePath)) {
            int character;
            StringBuilder fileContent = new StringBuilder();
            while ((character = reader.read()) != -1) {
                fileContent.append((char) character);
            }
            System.out.println("Text read from the file: " + fileContent.toString());
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}
