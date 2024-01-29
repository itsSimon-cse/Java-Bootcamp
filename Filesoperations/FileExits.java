package Filesoperations;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExits {
    public static void main(String[] args) {
        // Specify the path to the file
        Path filePath = Paths.get("C:\\Users\\Simon\\Desktop\\newfile.txt");

        // Check if the file exists
        boolean fileExists = Files.exists(filePath);

        System.out.println("File exists: " + fileExists);
    }
}
