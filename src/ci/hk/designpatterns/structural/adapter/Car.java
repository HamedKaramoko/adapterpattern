package ci.hk.designpatterns.structural.adapter;

public class Car implements Ride {

	@Override
	public void ride() {
		System.out.println("I'm riding my car");
	}

}
