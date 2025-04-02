package com.rajat.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

/**
 * @author rajatsrivastava
 **/
public class DirectoryScanRunner {
    public static void main(String[] args) throws IOException {

        Path currentDir = Paths.get(".");
        //  Files.list(currentDir).forEach(System.out::println);

        /*Predicate<? super Path> predicate
                = path -> String.valueOf(path).contains(".java");

        Files.walk(currentDir, 5)
                // .filter(f -> f.endsWith(".java"))
                .filter(predicate)
                .forEach(System.out::println);
*/
        BiPredicate<Path, BasicFileAttributes> javaMatcher =
                (path, attributes) -> String.valueOf(path).contains(".java");

        BiPredicate<Path, BasicFileAttributes> directoryMatcher =
                (path, attributes) -> attributes.isDirectory();

        Files.find(currentDir, 5, javaMatcher)
                .forEach(System.out::println);

        Files.find(currentDir, 5, directoryMatcher)
                .forEach(System.out::println);
    }
}
