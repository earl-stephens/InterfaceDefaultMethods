package application;

public class Machine implements DefaultRunnable {

	@Override
	public void run() {
		System.out.println("machine running");
		
	}
	/* Can delete this now that it is a default
	 * in the interface
	public void displayDetails() {
		System.out.println("I am a machine");
	}
	*/
}
