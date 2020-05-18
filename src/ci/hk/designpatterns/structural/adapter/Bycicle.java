package ci.hk.designpatterns.structural.adapter;

public class Bycicle implements Ride {

	@Override
	public void ride() {
		System.out.println("I'm riding my bicycle");
	}

}
