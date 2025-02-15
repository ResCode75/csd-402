//Rachel Shaw - Module 9.2 Part 1 - 2/14/2025

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ShawMod9_2_1{
    public static void main(String[] args) throws InputMismatchException{

        
       
        //create ArrayList
        ArrayList<String> protagList = new ArrayList<>();
        protagList.add("Luffy");
        protagList.add("Denji");
        protagList.add("Okarun");
        protagList.add("Frieren");
        protagList.add("Rimeru");
        protagList.add("Senku");
        protagList.add("Yuji");
        protagList.add("Eren");
        protagList.add("Guts");
        protagList.add("Lelouch");

        //print each element in the ArrayList
        System.out.println("-- Anime Protagonists --");
        for(String name : protagList){
            System.out.println("Name " + (protagList.indexOf(name) + 1) + " is " + name);
        }
        
    
        
        System.out.println("Which name would you like to see again?");

        //User inputs a number, exception is caught if they try to input a data type other than Int
        try{
            Scanner input = new Scanner(System.in);
            int request = input.nextInt();
            //call getName method, catch indexoutofbounds exception if thrown. 
            try {
                System.out.println(getName(protagList, request));
    
            } 
            catch (IndexOutOfBoundsException e) {
                System.out.println("Exception Thrown: index out of bounds");
            }

            //close scanner
            input.close();

        }
        catch (InputMismatchException ex){
            System.out.print("Exception Thrown: Input Mismatch. Please enter a number");
        }
        
    }

    //retrieves element at given index from given list 
    public static String getName(ArrayList<String> list, int name) throws IndexOutOfBoundsException {

        if (name > list.size()){
            throw new IndexOutOfBoundsException("Out of bounds");
            
        }
        else {
            return ("Name " + name + " is " + list.get(name - 1));
        }
        
    }
}
