package com.rajat.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author rajatsrivastava
 **/
public class FileReadRunner {
    public static void main(String[] args) throws IOException {

        Path pathFileToRead = Paths.get("./resources/data.txt");
        List<String> lines = Files.readAllLines(pathFileToRead);
        System.out.println(lines);

        Files.lines(pathFileToRead)
                .map(String::toUpperCase)
                .filter(s -> s.contains("E"))
                .forEach(System.out::println);
    }
}
