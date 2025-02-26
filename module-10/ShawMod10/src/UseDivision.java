
import division.*;

public class UseDivision{
    public static void main(String[] args){
        //create instance of international division and display it 
        InternationalDivision secDivision = new InternationalDivision("International Division of Security", 2235, "France", "French");
        System.out.println(secDivision.display());
        System.out.println();

        //create another instance of international division and display it 
        InternationalDivision healthDiv = new InternationalDivision("International Division of Health", 3245, "Japan", "Japanese");
        System.out.println(healthDiv.display());
        System.out.println();

        //create instance of domestic division and display it 
        DomesticDivision alaskaResearch = new DomesticDivision("Alaskan Division of Science", 4987, "Alaska");
        System.out.println(alaskaResearch.display());
        System.out.println();

        //create another instance of domestic division and display it
        DomesticDivision ncFinance = new DomesticDivision("NC Division of Finances", 8732, "North Carolina");
        System.out.println(ncFinance.display());
    }
}






