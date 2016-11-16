
public class UsedCar extends Car {

	private int miles;

	public UsedCar(String model, String make, int year, double price, int miles) {
		super(model, make, year, price);
		this.miles = miles; 
		
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	
}
