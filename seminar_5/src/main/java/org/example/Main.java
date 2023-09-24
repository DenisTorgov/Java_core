package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static java.nio.file.StandardCopyOption.*;

public class Main {
    public static void main(String[] args) throws IOException {
        backup(new File("."));
    }
    public static void backup(File file) throws IOException {

        File[] files = file.listFiles();
        for (File f: files) {
            if (f.getName() != null) {
                if (f.isFile()) {
                    Files.copy(f.toPath(), new File("../backup/" + f.toPath()).toPath(), REPLACE_EXISTING);
                    System.out.println("File ..\\backup\\" + f.toPath().normalize() + " created");
                } else {
                    File dir = new File("../backup/" + f.toPath());
                    dir.mkdirs();
                    System.out.println("Dir  ..\\backup\\" + f.toPath().normalize() + " created");
                    backup(f);
                }
            }
        }
    }
}