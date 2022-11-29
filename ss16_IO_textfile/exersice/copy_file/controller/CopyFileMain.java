package ss16_IO_textfile.exersice.copy_file.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileMain {
    public static List<String> readFile(String pathFile) {
        List<String> listLine = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(pathFile);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                listLine.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return listLine;
    }

    public static void writeFile(String pathFile, List<String> listLine) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(pathFile, true);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (String line : listLine) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Display character in source file...");
        System.out.println(readFile("src/ss16_IO_textfile/exersice/copy_file/data/source_file.csv"));

        System.out.println("Copy file from source file to target file...");
        List<String> listLineInSourceFile = CopyFileMain.readFile("src/ss16_IO_textfile/exersice/copy_file/data/source_file.csv");
        writeFile("src/ss16_IO_textfile/exersice/copy_file/data/target_file.csv", listLineInSourceFile);

        System.out.println("Display character in target file after copy file from source: ");
        System.out.println(readFile("src/ss16_IO_textfile/exersice/copy_file/data/target_file.csv"));
    }
}
