package pack1;

import java.util.ArrayList;

public class CarObject {
	public static void main(String[] args) {
		ArrayList<Car> al = new ArrayList<Car>();
		al.add(new Car("Toyota", 500000, "Red", 2015));
		al.add(new Car("Honda", 200000, "White", 2017));
		al.add(new Car("Maruti", 100000, "Black", 2012));
		al.add(new Car("BMW", 800000, "Blue", 2016));
		al.add(new Car("Mercedes", 700000, "White", 2019));
		al.add(new Car("Ford", 400000, "Magenta", 2018));
		
		System.out.println("Car Details ----------");
		for(Car c:al) {
			System.out.println(c);
		}
		System.out.println("-----------------------------------");
		System.out.println("Car Object Brand name = TOYOTA -------------------" );
		for(Car c : al) {
			if(c.getBrand().equals("Toyota")) {
				System.out.println(c);
			}
		}
		System.out.println("-----------------------------------");
		System.out.println("Car price more than 4lcs and less than 8lacs ------------------");
		for(int i=0;i<al.size();i++) {
			Car c = al.get(i);
			if(c.getPrice()>=400000 && c.getPrice()<=800000) {
				System.out.println(c);
			}
		}
		System.out.println("-----------------------------------");
		System.out.println("Car colour is either white or black -------------");
		for(Car c:al) {
			if(c.getColor().equalsIgnoreCase("White") || c.getColor().equalsIgnoreCase("Black")) {
				System.out.println(c);
			}
		}
		System.out.println("-----------------------------------");
		System.out.println("Car model between 2015 to 2020 ----------------------");
		for(Car c:al) {
			if(c.getModel()>=2015 && c.getModel()<=2020) {
				System.out.println(c);
			}
		}
	}
}
