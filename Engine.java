package RaceEngineer;

public class Engine {
	boolean on;
	int revolutions;
	
	public Engine() {
	}
	
	public void on() {
		System.out.println("Engine is now on");
//		on = true;
	}
	
	public void off() {
//		on = false;
		System.out.println("Engine is now off");
	}
	
//	public void engineOn() {
//		if (on) {
//			System.out.println("Engine is now on");
//			
//		}
//		
//	}
//	
//	public void engineOff() {
//		if (on) {
//			System.out.println("Engine is now off");
//		}
//	}
	
	public void setRevolutions(int revolutions) {
		this.revolutions = revolutions;
	}
	
	public void warm() {
		revolutions = 12000;
		System.out.println("Engine is warming up to " + revolutions + " RPM");
	
	}
	
	public void idle() {
		revolutions = 9000;
		System.out.println("Engine is now idling at " + revolutions + " RPM");
	}

}
