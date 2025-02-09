// Rachel Shaw - 7.2 Assignment - 2/8/2025

public class Shaw7_2 {

    public static void main(String[] args) {
        
        //create fan instances
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(1, true, 5.1, "Green");
        Fan fan3 = new Fan(3, true, 3, "Red" );
        Fan fan4 = new Fan(2, true, 10, "Blue");

        //Single Fan mathods
        UseFans.display(fan2);
        UseFans.turnOff(fan2);
        UseFans.display(fan2);
        UseFans.turnOn(fan2, 2);
        UseFans.display(fan2);

        //collection of Fans methods
        UseFans.displayCollection(fan1,fan2,fan3,fan4);
        UseFans.turnOffCollection(fan1, fan2, fan3, fan4);
        UseFans.turnOnCollection(3, fan1, fan2);
        UseFans.displayCollection(fan1,fan2,fan3,fan4);


    }
}

class UseFans{

    //displays details for a single fan
    public static void display(Fan fan){
        System.out.println("---" + fan.getColor().toUpperCase() +" FAN DETAILS---");
        System.out.println("Status:" + " " + fan.getStatusString());
        System.out.println("Speed: " + fan.getSpeed() + " (" + fan.getSpeedString() + ")");
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
        System.out.println();
        
    }

    //displays details for a collection of fans
    public static void displayCollection(Fan ...fans){

        System.out.println("---COLLECTION OF FANS---");
        for (int fanNum = 0; fanNum < fans.length; fanNum++) {      
            System.out.println("fan #" + (fanNum + 1) + " (" + fans[fanNum].getColor() + " Fan)");
            System.out.println("Status: " + fans[fanNum].getStatusString());
            System.out.println("Speed: " + fans[fanNum].getSpeed() + " (" + fans[fanNum].getSpeedString() + ") ");
            System.out.println("Radius: " + fans[fanNum].getRadius());
            System.out.println("Color: " + fans[fanNum].getColor());
            System.out.println();
        }
    }
    //turns a fan off 
    public static void turnOff(Fan fan){
        fan.setStatus(false);
        System.out.println("the " + fan.getColor() +" fan has been turned off");
        System.out.println();
    }

    //turns a fan on to the specified speed setting
    public static void turnOn(Fan fan, int speed){
        if (speed <= 3){
            fan.setStatus(true);
            fan.setSpeed(speed);
            System.out.println("the " + fan.getColor() +" fan has been turned on. Speed: " + fan.getSpeedString());
            System.out.println();
        }
        else{
            System.out.println("error: invalid speed setting, please select 1-3");
        }

    }

    //turns a collection of fans off
    public static void turnOffCollection(Fan ...fans){
        for (int fanNum = 0; fanNum < fans.length; fanNum++) {  
            fans[fanNum].setStatus(false);
            System.out.println("the " + fans[fanNum].getColor() +" fan has been turned off");
            System.out.println();
        }
    }

    //turns a collection of fans on to the specified speed setting
    public static void turnOnCollection( int speed, Fan ...fans){
        for (int fanNum = 0; fanNum < fans.length; fanNum++) { 
            if (speed <= 3){
                fans[fanNum].setStatus(true);
                fans[fanNum].setSpeed(speed);
                System.out.println("the " + fans[fanNum].getColor() +" fan has been turned on. Speed: " + fans[fanNum].getSpeedString());
                System.out.println();
            }
            else{
                System.out.println("error: invalid speed setting, please select 0-3");
            }

        }
    }

}

class Fan{
    final static int STOPPED = 0;
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed;
    private boolean status; 
    private double radius;
    String color;

    Fan(){
        this.speed = STOPPED;
        this.status = false;
        this.radius = 6;
        this.color = "White";

    }

    Fan(int speed, boolean status, double radius, String color){
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    public void setSpeed(int speed){
        if (speed <= 3){
            this.speed = speed;
        }
        else{
            System.out.println("error: invalid speed setting, please select 0-3");
        }

    }

    public int getSpeed(){
        
        return this.speed;
    }

    public String getSpeedString(){
        if (this.speed == STOPPED || status == false){
            return "stopped";
        }
        else if (this.speed == SLOW){
            return "slow";
        }
        else if (this.speed == MEDIUM){
            return "medium";
        }
        else if (this.speed == FAST){
            return "fast";
        }
        else{
            return "error: invalid speed set, please set speed to a number 0-3";
        }
        
    }
    
    public void setRadius(int radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void setStatus(boolean status){
        this.status = status;
        if (this.status == false){
            this.speed = 0;
        }
        
    }

    public boolean getStatus(){
        return this.status;
    }

    public String getStatusString(){
        String message = " ";

        if (this.status == false){
            message =  "off";
        }
        if (this.status == true){
             message =  "on";
        }

        return message;

    }



    public String toString(){
        return("\nStatus: " + this.getStatus() + "\n Speed: " + this.getSpeed() + "\n Radius: " + this.getRadius() + "\n color: " + this.getColor());
    }


}