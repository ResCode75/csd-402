//Rachel Shaw - Module 6.2 Assignment - 2/1/2025

public class Shaw6_2 {

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(1, true, 5.1, "Green");

        //Print fan 1 status 
        System.out.print("Details of Fan #1:");
        System.out.println(fan1.toString());

        System.out.println();

        //print fan 2 status
        System.out.print("Details of Fan #2:");
        System.out.println(fan2.toString());
        

        System.out.println();

        //Turn Fan 2 off 
        fan2.setStatus(false);
        System.out.println("Fan #2 has been turned " + fan1.getStatusString());
        System.out.println("Speed: " + "(" + fan2.getSpeed() + ") " + fan2.getSpeedString());
        
        System.out.println();

        //Turn Fan2 back on again
        fan2.setStatus(true);
        fan2.setSpeed(2);
        System.out.println("Fan #2 has been turned " + fan1.getStatusString());
        System.out.println("Speed: " + "(" + fan2.getSpeed() + ") " + fan2.getSpeedString());

        System.out.println();

        //turn fan 1 on
        fan1.setStatus(true);
        fan1.setSpeed(3);
        System.out.println("Fan #1 has been turned " + fan1.getStatusString());
        System.out.println("Speed: " + "(" + fan1.getSpeed() + ") " + fan1.getSpeedString());

        System.out.println();

        //turn fan 1 back off 
        fan1.setStatus(false);
        System.out.println("Fan #1 has been turned " + fan1.getStatusString());
        System.out.println("Speed: " + "(" + fan1.getSpeed() + ") " + fan1.getSpeedString());
        
        System.out.println();
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
        speed = STOPPED;
        status = false;
        radius = 6;
        color = "white";

    }

    Fan(int speed, boolean status, double radius, String color){
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    public void setSpeed(int fanSpeed){
        this.speed = fanSpeed;
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
        else{
            return "fast";
        }
        
    }
    
    public void setRadius(int radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setStatus(boolean status){

        if (status == false){
            this.speed = 0;
        }

        this.status = status;
        
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