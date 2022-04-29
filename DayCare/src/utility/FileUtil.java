/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

/**
 *
 * @author Nithin Bharadwaj
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
	
    public  List<String> filereader(String fileInputName) {
            List<String> data = new ArrayList<>();
            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(
                                fileInputName));
                String line = reader.readLine();
                while (line != null) {
//                        System.out.println(line);
                        data.add(line);
                        // read next line
                        line = reader.readLine();	
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return data;
    }
	
    public void fileWriter(String[] studentsData, String fileOutputName) {
            System.out.println("Writing the data into to " + fileOutputName + " \n");
            try {
                @SuppressWarnings("resource")
                BufferedWriter writer= new BufferedWriter(new FileWriter(fileOutputName));

                for (String data : studentsData) {
                        writer.write(data);
                        writer.newLine();
                        System.out.println(data);
                        }
                writer.flush();
                System.out.println("\nWriting to "+ fileOutputName +" successfully completed!\n");
            }

            // handle exceptions
            catch (IOException ioe)
            {
                ioe.printStackTrace();
            }
    }
	
}

