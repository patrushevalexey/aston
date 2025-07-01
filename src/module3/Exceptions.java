package module3;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;

public class Exceptions {
    static int counter = 1;

    public static void addNewLine(String newStr) throws FileProcessingException {
        try {
            counter++;
            Files.write(
                    Paths.get("C:\\Users\\Alexey\\IdeaProjects\\aston\\src\\module3\\exceptions.txt"),
                    (newStr + "\n").getBytes(),
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            throw new FileProcessingException("Ошибка при записи в файл", e);
        }
    }

    public static void printData(String filenamePath) throws FileProcessingException {
        try {
            List<String> lines = Files.readAllLines(Paths.get(filenamePath), StandardCharsets.UTF_8);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new FileProcessingException("Ошибка при чтении из файла", e);
        }
    }
}
