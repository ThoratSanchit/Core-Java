import java.io.*;
import java.nio.file.*;
import java.util.List;

public class FileIODemo {
    public static void main(String[] args) {

        String filePath = "sample.txt";

        // =============================================
        // 1. WRITE using Files (NIO — modern, preferred)
        // =============================================
        try {
            Files.writeString(Path.of(filePath), "Hello, Java File I/O!\nLine 2\nLine 3\n");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        // =============================================
        // 2. READ entire file as String (Java 11+)
        // =============================================
        try {
            String content = Files.readString(Path.of(filePath));
            System.out.println("File content:\n" + content);
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }

        // =============================================
        // 3. READ line by line using NIO
        // =============================================
        try {
            List<String> lines = Files.readAllLines(Path.of(filePath));
            System.out.println("Line count: " + lines.size());
            lines.forEach(line -> System.out.println("  > " + line));
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }

        // =============================================
        // 4. APPEND to file
        // =============================================
        try {
            Files.writeString(Path.of(filePath), "Appended line\n", StandardOpenOption.APPEND);
            System.out.println("Appended successfully.");
        } catch (IOException e) {
            System.out.println("Append error: " + e.getMessage());
        }

        // =============================================
        // 5. BufferedReader — classic way (try-with-resources)
        // =============================================
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Reading with BufferedReader:");
            while ((line = br.readLine()) != null) {
                System.out.println("  " + line);
            }
        } catch (IOException e) {
            System.out.println("BufferedReader error: " + e.getMessage());
        }

        // =============================================
        // 6. BufferedWriter — classic way
        // =============================================
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write("Written with BufferedWriter");
            bw.newLine();
            bw.write("Second line");
            System.out.println("BufferedWriter write done.");
        } catch (IOException e) {
            System.out.println("BufferedWriter error: " + e.getMessage());
        }

        // =============================================
        // 7. File metadata using File class
        // =============================================
        File file = new File(filePath);
        System.out.println("Exists: " + file.exists());
        System.out.println("Size: " + file.length() + " bytes");
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Is file: " + file.isFile());
        System.out.println("Is directory: " + file.isDirectory());

        // =============================================
        // 8. Delete file
        // =============================================
        try {
            Files.deleteIfExists(Path.of("output.txt"));
            System.out.println("output.txt deleted.");
        } catch (IOException e) {
            System.out.println("Delete error: " + e.getMessage());
        }
    }
}
