package ci.hk.designpatterns.structural.adapter;

public class Client {
	
	public static void main(String ...args) {
		
		Ride car = new Car();
		Ride bycicle = new Bycicle();
		Ride plane1 = new ClassAdapterPlane();
		Ride plane2 = new ObjectAdapterPlane();
		
		car.ride();
		bycicle.ride();
		plane1.ride();
		plane2.ride();
		
	}

}
