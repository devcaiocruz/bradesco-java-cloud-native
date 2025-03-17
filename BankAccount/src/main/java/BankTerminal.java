import model.Account;

import java.util.Scanner;

public class BankTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        System.out.println("Please enter the account number !");
        account.setNumber(scanner.nextInt());

        System.out.println("Please enter the agency number !");
        account.setAgency(scanner.next());

        System.out.println("Please enter your name !");
        account.setClientName(scanner.next());

        System.out.println("Please enter your balance !");
        account.setBalance(scanner.nextDouble());

        System.out.println(
            "Hello " + account.getClientName()
            + ", thank you for creating an account at our bank, your agency is " + account.getAgency()
            + ", account " + account.getNumber() + " and your balance " + account.getBalance()
            + " is now available for withdrawal."
        );
    }
}