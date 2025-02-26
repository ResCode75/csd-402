package division;


public class InternationalDivision extends Division{
    private String country;
    private String language;

    public InternationalDivision(String divName, int accountNumber, String country, String language){
        super(divName, accountNumber);

        this.country = country;
        this.language = language;
    }

    public String getLanguage(){
        return this.language;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    public String getCountry(){
        return this.country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    @Override
    public String display(){
        return ("Division Name: " + super.getDivName() + "\n Account Number: " + super.getAccountNumber() + "\n Country: " + this.country + "\n Language: " + this.language);
    }

}