package org.example;

import org.example.Toys;

import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void writeToFile(Toys toy) throws IOException {
        FileWriter writer = new FileWriter("results.txt", true);
        writer.write(toy.toString());
        writer.write("\n");
        writer.flush();

    }
}
