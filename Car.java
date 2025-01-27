package pack1;

public class Car {
	private String brand;
	private double price;
	private String color;
	private int model;
	

	

	public Car(String brand, double price, String color, int model) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.model = model;
	}

	@Override
	public String toString() {
		return  brand + " , "+ price + " , "+ color +" , " + model ;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}
}
