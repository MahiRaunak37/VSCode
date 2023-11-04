import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class J0001StartingProgram {

    // Start for Total files count
    public static void totalFiles() {
        File directory = new File("P:\\VSCode\\JavaCode");
        int fileCount = countFilesInCurrentDirectory(directory);
        System.out.println("Number of Files:- " + fileCount);
    }

    public static int countFilesInCurrentDirectory(File directory) {
        int count = 0;
        for (File file : directory.listFiles()) {
            if (file.isFile()) {
                count++;
            }
        }
        return count;
    }
    // End of for Total file count

    // Start for counting java files
    public static void javaFileCount() {
        try {

            List<String> files = findFiles(Paths.get("P:\\\\VSCode\\\\JavaCode"), "java");
            System.out.println("Total Java Files:- " + files.size());
            int fileSize = files.size();
            String name = String.format("%04d", fileSize);
            System.out.println("Java Files Number:- " + name);
            if (files.size() < 3000) {
                nameGeneration(files.size());
            } else {
                J2999EndCode.endofVCSCode();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<String> findFiles(Path path, String fileExtension)
            throws IOException {

        if (!Files.isDirectory(path)) {
            throw new IllegalArgumentException("Path must be a directory!");
        }

        List<String> result;

        try (Stream<Path> walk = Files.walk(path)) {
            result = walk
                    .filter(p -> !Files.isDirectory(p))
                    .map(p -> p.toString().toLowerCase())
                    .filter(f -> f.endsWith(fileExtension))
                    .collect(Collectors.toList());
        }

        return result;
    }
    // End for Total Java file counting

    // Start for auto generate the name of the java code
    public static void nameGeneration(int size) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Inside name generation and its size:- "+size);
        String name = String.format("%04d", size);
        System.out.print("Enter the File Name:- ");
        String fileName = scanner.next();

        try {
            File myObj = new File("J" + name + fileName + ".java");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        totalFiles();
        javaFileCount();
    }

}