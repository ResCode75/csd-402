//Rachel Shaw - Mod 5.2 assignment - 1/30/2025

public class ShawM5_2 {
    public static void main(String[] args) {
        
        //create array of doubles
        double[][] doubleArray = new double[5][5]; 
        //populate it with random doubles through 100
        for (int row = 0; row < doubleArray.length; row ++) {
            for (int column = 0; column < doubleArray[row].length; column ++){
                doubleArray[row][column] = (double)(Math.random() * 100);
            }
        }

        //create array of ints
        int [][] intArray = new int[5][5];
        //populate array with random ints through 100
        for (int row = 0; row < intArray.length; row ++) {
            for (int column = 0; column < intArray[row].length; column ++){
                intArray[row][column] = (int)(Math.random() * 100);
            }
        }

        //print array of doubles
        System.out.println("Array of doubles:");
        for (int row = 0; row < doubleArray.length; row ++) {
            for (int column = 0; column < doubleArray[row].length; column ++){
                System.out.print(doubleArray[row][column] + "  ");
            }
            System.out.println();
        }
        
        //print largest double and its locations
        int[] bigDoubleCoords = locateLargest(doubleArray);
        System.out.println("The location of this number is: " + bigDoubleCoords[0] + ", " + bigDoubleCoords[1]);
        //print smallest double and its locations
        int[] littleDoubleCoords = locateSmallest(doubleArray);
        System.out.println("The location of this number is: " + littleDoubleCoords[0] + ", " + littleDoubleCoords[1]);
        System.out.println();

        //print array of ints
        System.out.println("Array of ints:");
        for (int row = 0; row < intArray.length; row ++) {
            for (int column = 0; column < intArray[row].length; column ++){
                System.out.print(intArray[row][column] + "  ");
            }
            System.out.println();
        }
        
        //print largest int and its locations
        int[] bigIntCoords= locateLargest(intArray);
        System.out.println("The coordinates of this number are: " + bigIntCoords[0] + ", " + bigIntCoords[1]);
        //print smallest int and its locations
        int[] littleIntCoords= locateSmallest(intArray);
        System.out.println("The coordinates of this number are: " + littleIntCoords[0] + ", " + littleIntCoords[1]);
 
      
    }

   //Find largest double in an array
    public static int[] locateLargest(double[][] arrayParam){
        int[] coords = new int [3];
        coords[0] = 0;
        coords[1] = 0;
        double largest = 0;
        for (int row = 0; row < arrayParam.length; row ++){
            for (int column = 0; column < arrayParam[row].length; column ++){
                if (arrayParam[row][column] > largest){
                    coords[0] = column;
                    coords[1] = row;
                    largest = arrayParam[row][column];
                    
                }
            }
        }
        System.out.println();
        System.out.println("The Largest double in this array is: " + largest);
        return coords;
    }
    
    //find largest int in an array
    public static int[] locateLargest(int[][] arrayParam){
        int[] coords = new int [3];
        coords[0] = 0;
        coords[1] = 0;
        int largest = 0;
        for (int row = 0; row < arrayParam.length; row ++){
            for (int column = 0; column < arrayParam[row].length; column ++){
                if (arrayParam[row][column] > largest){
                    coords[0] = column;
                    coords[1] = row;
                    largest = arrayParam[row][column];
                    
                }
            }
        }
        System.out.println();
        System.out.println("The largest int in this array is: " + largest);
        return coords;
    }
    
    //find smallest int in an array
    public static int [] locateSmallest(int[][] arrayParam){
        int[] coords = new int [3];
        coords[0] = 0;
        coords[1] = 0;
        int smallest = 100;
        for (int row = 0; row < arrayParam.length; row ++){
            for (int column = 0; column < arrayParam[row].length; column ++){
                if (arrayParam[row][column] < smallest){
                    coords[0] = column;
                    coords[1] = row;
                    smallest = arrayParam[row][column];
                    
                }
            }
        }
        System.out.println();
        System.out.println("The smallest int in this array is: " + smallest);
        return coords;

    }

    //find smallest double in an array
    public static int [] locateSmallest(double[][] arrayParam){
        int[] coords = new int [3];
        coords[0] = 0;
        coords[1] = 0;
        double smallest = 100;
        for (int row = 0; row < arrayParam.length; row ++){
            for (int column = 0; column < arrayParam[row].length; column ++){
                if (arrayParam[row][column] < smallest){
                    coords[0] = column;
                    coords[1] = row;
                    smallest = arrayParam[row][column];
                    
                }
            }
        }
        System.out.println();

        System.out.println("The smallest double in this array is: " + smallest);

        return coords;
    }
}
