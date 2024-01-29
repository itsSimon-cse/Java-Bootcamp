package Filesoperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {
    public static void main(String[] args) {
       
        Path filePath = Paths.get("C:\\Users\\Simon\\Desktop\\newfile.txt");

        try {
            // Creating the new file
            Files.createFile(filePath);

            System.out.println("File created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
