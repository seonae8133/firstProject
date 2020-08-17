package inherit;

public class Vehicle {
	void run() {
		System.out.println("자동차 달리깅=3");
		
	}
}


class Bus extends Vehicle {

	@Override
	void run() {
      System.out.println("버스 달리깅 ==3");
//		super.run();
	}
	
}

class Taxi extends Vehicle {

	@Override
	void run() {
		System.out.println("택시 달리기===3 ");
//		super.run();
	}
	
}