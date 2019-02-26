package exercise;

//Q11.Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every banks
class Bank {
    private String bank_name;
    private String bank_type;
    private int minimum_balance_required;
    private float rate_of_interest;

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getBank_type() {
        return bank_type;
    }

    public void setBank_type(String bank_type) {
        this.bank_type = bank_type;
    }

    public int getMinimum_balance_required() {
        return minimum_balance_required;
    }

    public void setMinimum_balance_required(int minimum_balance_required) {
        this.minimum_balance_required = minimum_balance_required;
    }

    public float getRate_of_interest() {
        return rate_of_interest;
    }

    public void setRate_of_interest(float rate_of_interest) {
        this.rate_of_interest = rate_of_interest;
    }

    public Bank() {
    }

    public Bank(String bank_name, String bank_type, int minimum_balance_required, float rate_of_interest) {
        this.bank_name = bank_name;
        this.bank_type = bank_type;
        this.minimum_balance_required = minimum_balance_required;
        this.rate_of_interest = rate_of_interest;
    }

    public void setDetails(String bankName, String bank_type, int minimum_balance_required,float rateOfInterest) {
        this.bank_name = bankName;
        this.rate_of_interest = rateOfInterest;
        this.bank_type = bank_type;
        this.minimum_balance_required = minimum_balance_required;
    }

    public Bank getDetails() {
        return new Bank(getBank_name(),getBank_type(),getMinimum_balance_required(),getRate_of_interest());
    }

    public void showDetails() {
        System.out.print(" " + bank_name);
        System.out.print(" " + bank_type);
        System.out.print(" " + rate_of_interest);
        System.out.print(" " + minimum_balance_required);
    }
}

class SBI extends Bank {
    private String branch = "Delhi";

    public String getBranch() {
        return branch;
    }

    public SBI() {
    }

    public SBI(String bank_name, String bank_type, int minimum_balance_required, float rate_of_interest, String branch) {
        super(bank_name, bank_type, minimum_balance_required, rate_of_interest);
        this.branch = branch;
    }

    public void setDetails(String bankName, String bank_type,  int minimum_balance_required,float rateOfInterest, String branch) {
        super.setDetails(bankName, bank_type, minimum_balance_required, rateOfInterest);
        this.branch = branch;
    }

    @Override
    public Bank getDetails() {
        return new SBI(getBank_name(),getBank_type(),getMinimum_balance_required(),getRate_of_interest(),getBranch());
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.print(" " + branch + "\n");
    }
}

class BOI extends Bank {

    private String bankCode = "63jcub32";

    public String getBankCode() {
        return bankCode;
    }

    public BOI() {
    }

    public BOI(String bank_name, String bank_type, int minimum_balance_required, float rate_of_interest, String bankCode) {
        super(bank_name, bank_type, minimum_balance_required, rate_of_interest);
        this.bankCode = bankCode;
    }

    public void setDetails(String bankName, String bank_type, int minimum_balance_required, float rateOfInterest, String bankCode) {
        super.setDetails(bankName, bank_type, minimum_balance_required, rateOfInterest);
        this.bankCode = bankCode;
    }

    @Override
    public Bank getDetails() {
        return new BOI(getBank_name(),getBank_type(),getMinimum_balance_required(),getRate_of_interest(),getBankCode());
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.print(" " + bankCode);
    }
}

class ICICI extends Bank {
   private String bank_controller = "none";

    public String getBank_controller() {
        return bank_controller;
    }

    public ICICI() {
    }

    public ICICI(String bank_name, String bank_type, int minimum_balance_required, float rate_of_interest, String bank_controller) {
        super(bank_name, bank_type, minimum_balance_required, rate_of_interest);
        this.bank_controller = bank_controller;
    }

    public void setDetails(String bankName, String bank_type, float rateOfInterest, int minimum_balance_required, String bank_controller) {
        super.setDetails(bankName, bank_type, minimum_balance_required, rateOfInterest);
        this.bank_controller = bank_controller;
    }
    @Override
    public Bank getDetails() {
        return new ICICI(getBank_name(),getBank_type(),getMinimum_balance_required(),getRate_of_interest(),getBank_controller());
    }
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.print(" " + bank_controller + "\n");
    }
}

public class Question11 {
    public static void main(String[] args) {
        Bank b = new Bank();
        SBI sbi = new SBI();
        sbi.setDetails("SBI", "public", 1000, 5);
        sbi.showDetails();
        ICICI icici = new ICICI();
        icici.setDetails("ICICI", "private", 100000, 2);
        icici.showDetails();
        BOI boi = new BOI();
        boi.setDetails("BOI", "public", 1000, 10);
        boi.showDetails();
    }
}
