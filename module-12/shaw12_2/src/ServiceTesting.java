
public class ServiceTesting{
     public static void main (String[] args){
        //create new service instance for a Honda Civic
        Service HondaCivic = new Service("Honda Civic");

        System.out.println(HondaCivic.yearlyService());
        System.out.println();
        System.out.println(HondaCivic.yearlyService(50.00));
        System.out.println();
        System.out.println(HondaCivic.yearlyService(50.00, 75.00));
        System.out.println();
        System.out.println(HondaCivic.yearlyService(50.00, 75.00, 15));

        System.out.println();

        //create new service instance for a Mini Cooper
        Service miniCooper = new Service("Mini Cooper");
        System.out.println(miniCooper.yearlyService());
        System.out.println();
        System.out.println(miniCooper.yearlyService(70.00));
        System.out.println();
        System.out.println(miniCooper.yearlyService(70.00, 50.00));
        System.out.println();
        System.out.println(miniCooper.yearlyService(70.00, 50.00, 20.00));


    }

}

