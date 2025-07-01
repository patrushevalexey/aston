package module3;

import java.nio.file.*;

public class RunnerExceptions {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\Alexey\\IdeaProjects\\aston\\src\\module3\\exceptions.txt");

        try {
//            if (Files.notExists(path)) {
//                Files.createFile(path);
//                System.out.println("Файл создан: " + path);
//            }

            Exceptions.addNewLine(Exceptions.counter + ") It's 1st line");
            Exceptions.addNewLine(Exceptions.counter + ") It's 2nd line");
            Exceptions.addNewLine(Exceptions.counter + ") It's new line again");
            Exceptions.printData(String.valueOf(path));
        } catch (FileProcessingException e) {
            System.err.println("Ошибка при работе с файлом: " + e.getMessage());
            System.err.println("Оригинальная причина: " + e.getCause());
        } catch (Exception e) {
            System.err.println("Непредвиденная ошибка: " + e.getMessage());
        }
    }
}
