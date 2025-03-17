package models;

public class CurrentAccount extends Account {

	public CurrentAccount(Client client) {
		super(client);
	}

	@Override
	public void printStatement() {
		System.out.println("=== Current Account Statement ===");
		super.showInformation();
	}
}
