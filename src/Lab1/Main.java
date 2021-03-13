package Lab1;

public class Main {

    public static void main(String args[]){
        BankAccount account = new BankAccount("Anuj", 45);
//        BankAccount account1 = new BankAccount("A", 45);
//        BankAccount account2 = new BankAccount("B", 45);

        account.displayAccountInformation();
        account.depositFunds(20);
        account.depositFunds(30,6);
        account.displayAccountInformation();

        account.withDraw(30);
        account.withDraw(30,5);
        account.displayAccountInformation();

        BankAccount account1 = new BankAccount("Jack");

        account1.displayAccountInformation();

        account1.depositFunds(90);
        account1.depositFunds(9,7);

        account1.displayAccountInformation();

        account1.withDraw(60);
        account1.withDraw(10,10);

        account1.displayAccountInformation();

    }

}
