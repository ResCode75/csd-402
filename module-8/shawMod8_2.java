import java.util.ArrayList;
import java.util.Scanner;

public class shawMod8_2{

    public static void main(String[] args){

        ArrayList<Integer> myArray = new ArrayList<>();

        //testing if max returns 0 if sent an empty array
        System.out.println(RachelArrayListTest.max(myArray));

        //prompting user to populate ArrayList
        RachelArrayListTest.makeList(myArray);  
        //print the user's array
        System.out.println("Your Array: " + myArray);

        //print the largest number in the array
        System.out.println("Largest: " + RachelArrayListTest.max(myArray));
        
    }

}

class RachelArrayListTest{

    //method for adding values to the array
    public static ArrayList makeList(ArrayList array){
        Scanner input = new Scanner(System.in);
        int count = 1;
        System.out.println("Create your ArrayList by typing numbers and pressing ENTER");
        System.out.println("Please enter 0 to end the list (0 will be added to your array)");
        while (count != 0){
            count = input.nextInt();
            array.add(count);
        }

        return array;
    }

    public static Integer max(ArrayList array){
        Integer largest = 0;
        if (array.isEmpty()){
            return 0;
        }
        else{
            for (int eleNum = 0; eleNum < array.size(); eleNum++){
                if ((Integer)array.get(eleNum) > largest){
                    largest = (Integer)array.get(eleNum);
                }
            }
            return largest;
        }


    }

}
