import java.util.Scanner;

public class FileManagerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя директории: ");
        String directoryName = scanner.nextLine().trim();
        Directory directory = new Directory(directoryName);

        System.out.print("Введите имя текстового файла: ");
        String fileName = scanner.nextLine().trim();
        TextFile textFile = new TextFile(fileName);

        directory.addFile(textFile);

        directory.listFiles();

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

        System.out.println("Содержимое текстового файла:");
        textFile.printContent();

        System.out.print("Введите новое имя файла: ");
        String newFileName = scanner.nextLine().trim();
        textFile.rename(newFileName);

        System.out.print("Очистить содержимое файла? (Да/Нет): ");
        String clearResponse = scanner.nextLine().trim().toLowerCase();
        if (clearResponse.equals("да")) {
            textFile.clearContent();
        }

        System.out.print("Удалить файл из директории? (Да/Нет): ");
        String removeResponse = scanner.nextLine().trim().toLowerCase();
        if (removeResponse.equals("да")) {
            directory.removeFile(textFile);
        }

        directory.listFiles();

        scanner.close();
    }
}
