package classes;

//basic func has been added into Abstract class
abstract class VehicleAbstract {
	public abstract void start();

	public void stop() {
		System.out.println("Stopping Vehicle in abstract class");
	}
}

class TwoWheeler extends VehicleAbstract {
	@Override
	public void start() {
		System.out.println("Starting Two Wheeler");
	}
	public void stop() {
		System.out.println("Stopping Two Wheeler");
	}
	
}

class FourWheeler extends VehicleAbstract {
	@Override
	public void start() {
		System.out.println("Starting Four Wheeler");
	}
}

public class OopsAbstraction {
	public static void main(String[] args) {
		VehicleAbstract my2Wheeler = new TwoWheeler();
		VehicleAbstract my4Wheeler = new FourWheeler();
		my2Wheeler.start();
		my2Wheeler.stop();
		my4Wheeler.start();
		my4Wheeler.stop();
	}
}

/*
Starting Two Wheeler
Stopping Two Wheeler
Starting Four Wheeler
Stopping Vehicle in abstract class
*/