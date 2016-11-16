
public class Car {
	
private String model;
private String make; 
private int year;
private double price;

public Car(String model, String make, int year, double price) {
	super();
	this.model = model;
	this.make = make;
	this.year = year;
	this.price = price;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
} 


}
