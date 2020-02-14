package person;

public class Address {

	  private String street;
	  private int number;
	  private String city;
	  private String state;
	  private final String country = "Mex";

	  protected Address(String street, int number, String city, String state){
	    this.street = street;
	    this.number = number;
	    this.city = city;
	    this.state = state;
	  }

	  public void setStreet(String street) {
	    this.street = street;
	  }
	  public String getStreet() {
	    return this.street;
	  }
	  
	  public void setNumber(int number) {
	    this.number = number;
	  }
	  public int getNumber() {
	    return this.number;
	  }

	  public void setCity(String city) {
	    this.city = city;
	  }
	  public String getCity() {
	    return this.city;
	  }

	    public void steState(String state) {
	    this.state = state;
	  }
	  public String getState() {
	    return this.state;
	  }

	  public String getCountry() {
	    return this.country;
	  }
	}
