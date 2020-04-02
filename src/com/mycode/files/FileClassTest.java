package com.mycode.files;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
/*
11. Using the listFiles(FileClassTest) and isDirectory methods of the java.io.File class,
        write a method that returns all subdirectories of a given directory.
        Use a lambda expression instead of a FileClassTest object.
12. Using the list(FilenameFilter) method of the java.io.File class,
        write a method that returns all files in a given directory with a given extension.
13. Given an array of File objects, sort it so that directories come before files,
       and within each group, elements are sorted by path name. Use a lambda expression to specify the Comparator.   */

public class FileClassTest {
    public static void allDirectories(File file) {
        File[] listOfFiles = file.listFiles(pathname -> true);
        if (listOfFiles != null) {
            for (File listOfFile : listOfFiles) {
                if (listOfFile.isDirectory()) {
                    allDirectories(listOfFile);
                    System.out.printf("Directory: %s%n", listOfFile.getAbsolutePath());
                }
            }
        }
    }

    public static void allFiles(File file) {
        File[] files = file.listFiles(pathname -> true);
        assert files != null;
        for (File listOfFile : files) {
            if (listOfFile.isFile()) {
                System.out.printf("File: %s%n", listOfFile.getName());
            } else {
                allFiles(listOfFile);
            }
        }
    }

    public static void sortDirectoryContent(File file) {
        File[] files = file.listFiles();
        assert files != null;
        Arrays.sort(files, Comparator.comparing(File::isDirectory));

        System.out.println(Arrays.toString(files));
    }

    public static void main(String[] args) {
       allDirectories(new File("."));
        System.out.println();
        allFiles(new File("."));
        System.out.println();
        sortDirectoryContent(new File("."));
    }

}
