//Rachel Shaw - 9.2 part 2 - 2/14/2025
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;


public class ShawMod9_2_2 {
    public static void main(String[] args){
     
        try {
            //create filewriter object for data.file with append set to true (it will add to existing file)
            FileWriter testFileWrite = new FileWriter("C:\\csd\\csd-402\\module-9\\data.file", true);
        
            Random random = new Random();
            
            //create Printwriter object for testfile object
            try (PrintWriter write = new PrintWriter(testFileWrite)) {
                //write to files 
                for(int i = 1; i <= 10; i++){
                    int randomNum = random.nextInt(100);
                    write.print(randomNum + " ");
                }
            }
            
            //create file reader object for data.file
            FileReader testFileRead = new FileReader("C:\\csd\\csd-402\\module-9\\data.file");
            //create scanner object for FileReader object 
            try (Scanner reader = new Scanner(testFileRead)) {
                //read file and display it 
                while (reader.hasNext()){
                    System.out.print(reader.next() + " ");
                }
            }
    
        } 
        catch (IOException e) {
            System.out.println("oh no something went wrong:(");
        }

    }
    
}
