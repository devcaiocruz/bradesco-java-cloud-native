import models.Account;
import models.Client;
import models.CurrentAccount;
import models.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		Client client = new Client();
		client.setName("Oscar");
		
		Account current = new CurrentAccount(client);
		Account savings = new SavingsAccount(client);

		current.deposit(100);
		current.transfer(100, savings);

		current.printStatement();
		savings.printStatement();
	}

}
