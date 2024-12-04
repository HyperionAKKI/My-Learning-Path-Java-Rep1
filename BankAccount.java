public class BankAccount extends Bank {
    public String UserName;
    private Double AccountNumber;
    private Double BankBalance;
    public BankAccount(){
        this.Branch = "asg";
        this.IFSCCode = "SBIN0000443";
    }
    public Double getBankBalance(){
        return this.BankBalance;
    }

    public Boolean depositMoney(Double amount){
        try{
            this.BankBalance = this.BankBalance + amount;
            return true;
        }
        catch (Exception ex){
            System.out.println("Something went wrong");
            return false;
        }
    }

    private void updateLoanAmount(){

    }

    private void transaction(int amountDeducted){
        Integer a;
        int b;
    }
    private void transaction(Double amountDeducted){

    }
}
