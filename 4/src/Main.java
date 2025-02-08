import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод имени директории
        System.out.print("Введите имя директории (по умолчанию 'MyDirectory'): ");
        String directoryName = scanner.nextLine().trim();
        if (directoryName.isEmpty()) {
            directoryName = "MyDirectory";
        }
        Directory directory = new Directory(directoryName);

        // Ввод имени текстового файла
        System.out.print("Введите имя текстового файла (по умолчанию 'MyTextFile.txt'): ");
        String fileName = scanner.nextLine().trim();
        if (fileName.isEmpty()) {
            fileName = "MyTextFile.txt";
        }
        TextFile textFile = new TextFile(fileName);

        // Добавление файла в директорию
        directory.addFile(textFile);

        // Вывод файлов в директории
        directory.listFiles();

        // Добавление содержимого в текстовый файл
        System.out.println("Введите содержимое для текстового файла (пустая строка завершает ввод):");
        StringBuilder contentBuilder = new StringBuilder();
        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            contentBuilder.append(line).append("\n");
        }
        textFile.addContent(contentBuilder.toString());

        // Вывод содержимого текстового файла
        System.out.println("Содержимое текстового файла:");
        textFile.printContent();

        // Переименование файла
        System.out.print("Введите новое имя файла (или оставьте пустым, чтобы оставить преждней): ");
        String newFileName = scanner.nextLine().trim();
        if (!newFileName.isEmpty()) {
            textFile.rename(newFileName);
        }

        // Удаление содержимого текстового файла
        System.out.print("Очистить содержимое файла? (Да/Нет): ");
        String clearResponse = scanner.nextLine().trim().toLowerCase();
        if (clearResponse.equals("Да")) {
            textFile.clearContent();
        }

        // Удаление файла из директории
        System.out.print("Удалить файл из директории? (Да/Нет): ");
        String removeResponse = scanner.nextLine().trim().toLowerCase();
        if (removeResponse.equals("Да")) {
            directory.removeFile(textFile);
        }

        // Вывод файлов в директории после удаления
        directory.listFiles();

        scanner.close();
    }
}