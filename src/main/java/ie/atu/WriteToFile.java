package ie.atu;

import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {
    public static void main(String[] args) {
        // Specify file name
        String fileName = "File13.txt";


        try(FileWriter writer = new FileWriter(fileName, true)) {


            writer.write("Train at 6:10pm");
            System.out.println("Content successfully added to file ");
        }
        catch(IOException e){
            System.out.println("An error occurred while creating the file. ");
            e.printStackTrace();

        }
    }
}