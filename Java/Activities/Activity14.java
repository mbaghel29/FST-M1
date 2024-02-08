package activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("C:/Users/0036T7744/Downloads/newfile.txt");
            boolean fStatus = file.createNewFile();
            if(fStatus) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists at this path.");
            }


            File fileUtil = FileUtils.getFile("C:/Users/0036T7744/Downloads/newfile.txt");

            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));


            File destDir = new File("resources");
            FileUtils.copyFileToDirectory(file, destDir);

            File newFile = FileUtils.getFile(destDir, "newfile.txt");

            String newFileData = FileUtils.readFileToString(newFile, "UTF8");

            System.out.println("Data in new file: " + newFileData);
        } catch(IOException errMessage) {
            System.out.println(errMessage);
        }
    }
}
