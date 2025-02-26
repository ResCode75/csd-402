package division;

public abstract class Division{
    private String divName;
    private int accountNumber;

    protected Division(String divName, int accountNumber){
        this.divName = divName;
        this.accountNumber = accountNumber;
    }

    public String getDivName(){
        return this.divName;
    }

    public void setDivName(String divName){
        this.divName = divName;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public abstract String display();

}