package entity;

public class Car implements Comparable<Car>{
	private int cId;
	private String brand;
	private String color;
	private double price;
	private	String fuelType;
	private int  model;
	private int milage;
	
	
	public Car(int cId,String brand, String color, double price, String fuelType, int model, int milage) {
		this.cId=cId;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.fuelType = fuelType;
		this.model = model;
		this.milage = milage;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	@Override
	public String toString() {
		return "cId=" + cId + ", brand=" + brand + ", color=" + color + ", price=" + price + ", fuelType="
				+ fuelType + ", model=" + model + ", milage=" + milage;
	}
	@Override
	public int compareTo(Car o) {
		if(this.cId>o.getcId())
		{
			return 1;
		}
		else if(this.cId<o.getcId())
		{
			return -1;
		}
		return 0;
	}
	
	
	
	

}
