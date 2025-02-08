import java.io.*;
import java.util.*;

public class ReverseFileContent {

    public static void main(String[] args) {
        String inputFileName = "Input.java";
        String outputDirName = "output";
        String outputFileName = "output.java";

        File outputDir = new File(outputDirName);
        if (!outputDir.exists()) {
            outputDir.mkdir();
        }

        File outputFile = new File(outputDir, outputFileName);

        try (BufferedReader br = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            List<String> lines = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }

            for (int i = lines.size() - 1; i >= 0; i--) {
                String reversedLine = new StringBuilder(lines.get(i)).reverse().toString();
                bw.write(reversedLine);
                bw.newLine();
            }

            System.out.println("Результаты записаны в файл: " + outputFile.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Ошибка при обработке файла: " + e.getMessage());
        }
    }
}
