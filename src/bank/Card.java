package bank;

import java.util.Date;
import person.Client;

abstract class Card {
	  protected Client client;
	  protected typeCard card;
	  protected int numberCard;
	  protected Date expDate;
	  protected double amount;
	  protected double cost;

	  enum typeCard {
	  CREDIT_CARD, DEBIT_CARD;
	}

	}