package Lab1;

public class Main {

    public static void main(String args[]){
        BankAccount account = new BankAccount("Anuj", 45);
//        BankAccount account1 = new BankAccount("A", 45);
//        BankAccount account2 = new BankAccount("B", 45);

        account.displayAccountInformation();
        account.depositFunds(20);
        account.depositFunds();
        account.displayAccountInformation();

        account.withDraw(30);
        account.withDraw();
        account.displayAccountInformation();

        BankAccount account1 = new BankAccount("Jack");

        account1.displayAccountInformation();

        account1.depositFunds(90);
        account1.depositFunds();

        account1.displayAccountInformation();

        account1.withDraw(60);
        account1.withDraw();

        account1.displayAccountInformation();

    }

}
