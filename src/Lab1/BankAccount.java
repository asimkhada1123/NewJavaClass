package Lab1;

public class BankAccount {

    String name;
    double balance;
    static int accountNumber = 0;

    public BankAccount(String name){
        this.name = name;
        this.balance = 0;
        accountNumber++;
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        accountNumber++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withDraw(double balance){
        this.balance = this.balance - balance;
    }

    public void withDraw(){
        this.balance = this.balance - 0.1 * this.balance;
    }

    public void depositFunds(){
        this.balance = this.balance - 0.1 * this.balance;
    }

    public void depositFunds(double balance){
        this.balance = this.balance + balance;
    }

    public void displayAccountInformation(){
        System.out.println("Name = "+ this.name);
        System.out.println("Balance = " + this.balance);
        System.out.println("Account Number = " + accountNumber);
        System.out.println("+++++++++++++++++++++++++");
    }


}
