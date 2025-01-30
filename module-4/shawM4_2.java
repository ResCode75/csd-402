//Rachel Shaw - Module 4.2 Assignment - 1/22/2025
//The purpose of this program is to display  arrays of different data types along with their averages

public class shawM4_2 {
    public static void main(String[] args) {
        //create Arrays
        short[] shortArray = {1, 2, 6, 7, 4};
        int[] intArray = {2, 5, 6, 9, 3, 2, 7, 4, 8, 14};
        long[] longArray = {1002, 1590, 1596, 1554, 1302, 1104};
        double[] doubleArray = {10.5, 15.6, 20.5, 24.1, 33.8, 17.9, 13.5};

        //Print Array of Shorts and it's average
        System.out.println("<<Array of Shorts>>");
        for (int i = 0; i < shortArray.length; i++){
            System.out.print(shortArray[i] + " ");
        }
        System.out.println();
        System.out.println("Length = " + shortArray.length + " values");
        System.out.println("Average = " + average(shortArray));
        System.out.println();
        
        //print Array of Ints and it's average
        System.out.println("<<Array of Ints>>");
        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        System.out.println("Length = " + intArray.length + " values");
        System.out.println("Average = " + average(intArray));
        System.out.println();

        //print array of longs and it's average
        System.out.println("<<Array of Longs>>");
        for (int i = 0; i < longArray.length; i++){
            System.out.print(longArray[i] + " ");
        }
        System.out.println();
        System.out.println("Length = " + longArray.length + " values");
        System.out.println("Average = " + average(longArray));
        System.out.println();

        //print array of doubles and its average
        System.out.println("<<Array of Doubles>>");
        for (int i = 0; i < doubleArray.length; i++){
            System.out.print(doubleArray[i] + " ");
        }
        System.out.println();
        System.out.println("Length = " + doubleArray.length +" values");
        System.out.println("Average = " + average(doubleArray));
        System.out.println();
        
 
      
    }

    //overloaded methods for the average of each data type:
    public static short average(short [] array){
        short sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
    
        
        short average = (short)(sum/array.length);
        return average;
    }
    public static int average(int [] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
    
        
        int average = (sum/array.length);
        return average;
    }
    public static long average(long [] array){
        long sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
    
        
        long average = (long)(sum/array.length);
        return average;
    }
    public static double average(double [] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
    
        
        double average = (double)(sum/array.length);
        return average;
    }
    
}
