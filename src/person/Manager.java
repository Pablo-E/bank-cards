package person;

import bank.Banks;

public class Manager extends Person {
	  private Banks bank;

	public Banks getBank() {
		return bank;
	}

	public void setBank(Banks bank) {
		this.bank = bank;
	}
	}