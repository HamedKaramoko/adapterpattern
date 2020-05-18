package ci.hk.designpatterns.structural.adapter;

import ci.hk.designpatterns.structural.adapter.otherdevelopper.FlightRide;

public class ObjectAdapterPlane implements Ride {
	
	FlightRide ride = new ci.hk.designpatterns.structural.adapter.otherdevelopper.Plane();

	@Override
	public void ride() {
		this.ride.flight();
	}

}
