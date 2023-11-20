package ie.atu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class WriteToFile {
    public static void main(String[] args) {
        // Specify file name
        String fileName = "File13.txt";


        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {

            writer.println("This line will be formatted correctly ");
            System.out.println("Content successfully added to file ");
        }
        catch(IOException e){
            System.out.println("An error occurred while creating the file. ");
            e.printStackTrace();

        }
    }
}