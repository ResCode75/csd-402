// Rachel Shaw - mod3.3 Assignment - 1/19/25
// The purpose of this program is to print a centered triangle of numbers that increase by 2 on one side and decrease by 2 on the other. 

/* SOURCES:
 * Simply Coding. (2020, November 9). How to solve any Star Pattern Program. YouTube. https://www.youtube.com/watch?v=xzstcj3Cuso
 * (this video helped me understand the logic behind creating the shape of a triangle in Java)
 */

public class Shaw_M3_3 {
    // centers triangle by changing the spaces between two digit numbers 
    public static String spaces(int num){
        if (num < 10){
            String space = "  ";
            return space;
        }
        else{
            String space = " ";
            return space;
        }

    }
 
  public static void main(String[] args){
    
    int rows = 7;
    
    //outer for loop that repeats [rows] number of times
    for (int cols = 1; cols<=rows; cols++){
        //Variable that holds the number that will be printed
        int number = 1;

        //first space triangle loop
        for (int i=cols; i <= rows; i++){
            System.out.print("   ");
           
        }
        //increasing triangle loop  ([i] keeps track of iterations)
        for (int i = 1; i < cols; i++){
            System.out.print(number + spaces(number));
            number*=2;
            
        }
        //decreasing triangle loop
       for (int i = 1; i <= cols; i++){
            // if loop stops adding spaces to the end of the triangle 
            if (number == 1){
                System.out.print(number++);
            }
            else{
                System.out.print(number++ + spaces(number));
                number/=2;

            }   
       }
       //spaces triangle loop for the end
       for (int i = cols; i<=rows; i++){
            System.out.print("   ");
       }

        System.out.print("@");
        System.out.println();
        System.out.println();

    }
        
  }
}


    



