public class Service {
    String model;
    // represents a standard service charge
    double serviceCharge;

    Service(){
        this.model = null;
        this.serviceCharge = 75.00;
    }
    Service(String model){
        this.model = model;
        this.serviceCharge = 75.00;
    }
    
    //set the service charge to something else if needed
    public void setServiceCharge(double charge){
        this.serviceCharge = charge;
    }
    public double getServiceCharge(){
        return this.serviceCharge;
    }

    // returns price of yearly service
    public String yearlyService(){
        return ("--Yearly Service Charge for " + this.model + " --\n" + "Service charge = " + this.serviceCharge + "\n Total = ");
    }

    //returns price of yearly service and an oil change
    public String yearlyService(double oilChange){
        double total = this.serviceCharge + oilChange;
        String title = ("--Yearly Service Charge for " + this.model +  " With Oil Change" + "--\n");
        return (title + "Service Charge = " + this.serviceCharge + "\n Oil Change = " + oilChange + "\n Total = " + total);
    }

    // returns price of yearly service, oil change, and a tire rotation
    public String yearlyService(double oilChange, double tireRotation){
        double total = this.serviceCharge + oilChange + tireRotation;
        String title = ("--Yearly Service Charge for " + this.model +  " With Oil Change and Tire rotation" + "--\n");

        return(title  + "Service Charge = " + this.serviceCharge + "\n Oil Change = " + oilChange + "\n Tire Rotation = " + tireRotation + "\n Total = " + total);
    }

    // returns price of yearly service, oil change, and tire rotation with a coupon for a discount 
    public String yearlyService(double oilChange, double tireRotation, double coupon){
        double couponValue = (coupon/100);
        double discount = ((this.serviceCharge + oilChange + tireRotation)*couponValue); 
        double total = (this.serviceCharge + oilChange + tireRotation) - discount;
        String title = ("--Yearly Service Charge for " + this.model +  " With Oil Change and Tire rotation" + "--\n");
        return ( title + "Service Charge = " + this.serviceCharge + "\n Oil Change = " + oilChange + "\n Tire Rotation = " + tireRotation + "\n Discount = " + "-" + discount + "\n Total = " + total);
    }
}
