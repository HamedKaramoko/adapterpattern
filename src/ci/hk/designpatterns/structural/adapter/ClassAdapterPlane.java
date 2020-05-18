package ci.hk.designpatterns.structural.adapter;

import ci.hk.designpatterns.structural.adapter.otherdevelopper.FlightRide;

public class ClassAdapterPlane implements Ride, FlightRide {
	
	@Override
	public void ride() {
		flight();
	}

	@Override
	public void flight() {
		System.out.println("I'm flying in my new extra expensive plane (ClassAdapter)");
	}

}
