package day5.multilevelinheritance.vehicle;

public class VehicleDemo {
	public static void main(String[] args) {
		Car c;
		c=new Car();
		c.vehicleType();
		
		Maruti m=new Maruti();
		m.vehicleType();
		m.brand();
		m.speed();
		
		Maruti8000 m1=new Maruti8000();
		m1.vehicleType();
		m1.brand();
		m1.speed();
		
		
	}

}