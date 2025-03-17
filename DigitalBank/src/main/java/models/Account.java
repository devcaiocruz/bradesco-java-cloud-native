package models;

import interfaces.AccountInterface;

public abstract class Account implements AccountInterface {
	
	private static final int DEFAULT_AGENCY = 1;
	private static int SEQUENTIAL_ACCOUNT_NUMBER = 1;

	private final int agency;
	private final int number;
	private double balance;
	private final Client client;

	public Account(Client client) {
		this.agency = Account.DEFAULT_AGENCY;
		this.number = SEQUENTIAL_ACCOUNT_NUMBER++;
		this.client = client;
		this.balance = 0;
	}

	@Override
	public void withdraw(double value) {
		this.balance -= value;
	}

	@Override
	public void deposit(double value) {
		this.balance += value;
	}

	@Override
	public void transfer(double value, AccountInterface targetAccount) {
		this.withdraw(value);
		targetAccount.deposit(value);
	}

	protected void showInformation() {
		System.out.printf("Client Name: %s%n", this.getClient().getName());
		System.out.printf("Agency: %d%n", this.getAgency());
		System.out.printf("Account Number: %d%n", this.getNumber());
		System.out.printf("Balance: %.2f%n", this.getBalance());
	}

	public int getAgency() {
		return agency;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public Client getClient() {
		return client;
	}
}
