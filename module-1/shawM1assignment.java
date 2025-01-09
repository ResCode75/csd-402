// Rachel Shaw - M1 programming assignment - 01/9/2025

// import scanner
import java.util.Scanner;

public class shawM1assignment {
    public static void main(String[] args) {
        // create scanner instance
        Scanner input = new Scanner(System.in);
        
        // ask user for water mass
        System.out.println("Enter water mass (kg)");
        double watermass = input.nextDouble();
        
        // ask user for initial temperature
        System.out.println("Enter initial temperature (celcius)");
        double inittemp = input.nextDouble();

        // ask user for final temperature 
        System.out.println("Enter final temperature (celcius)");
        double finaltemp = input.nextDouble();
        
        // calculate energy needed to heat water 
        double Joules = watermass*(finaltemp - inittemp) * 4184;
        System.out.println("The amount of energy needed to heat " + watermass + " from " + inittemp + "° celcius to " + finaltemp + "° celcius is " + Joules + " joules");

    }
}
