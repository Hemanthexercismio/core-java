package com.frozen.write;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
public class Write {
    public static void main(String[] args) {
        String intro = "iam from dvg";
        try {
            // Writes string to the specified path using UTF-8 charset by default
            Files.write(Paths.get("output.txt"), intro.getBytes());
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
}}
