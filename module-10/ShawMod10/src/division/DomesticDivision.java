package division;


public class DomesticDivision extends Division{
    private String state; 
    
    public DomesticDivision(String divName, int accountNumber, String state){
        super(divName, accountNumber);

        this.state = state;
    }

    public String getState(){
        return this.state;
    }

    public void setState(String state){
        this.state = state;
    }

    @Override
    public String display(){
        return ("Division Name: " + super.getDivName() + "\n Account Number: " + super.getAccountNumber() + "\n State: " + this.state);
    }
}