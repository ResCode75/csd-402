import java.util.ArrayList;
import java.util.Scanner;

public class shaw8_2 {

    public static void main(String[] args) {

        ArrayList<Integer> myArray = new ArrayList<>();

        RachelArrayListTest.makeList(myArray);
    }

}

class RachelArrayListTest{

    public static ArrayList makeList(ArrayList array){
        Scanner input = new Scanner(System.in);
        int count = 1;

        while (count != 0){
            count = input.nextInt();
            array.add(count);
        }

        return array;
    }

}

    

