package Common;

public class NewThread extends Thread {

	public void run() {
		NewBooking n = new NewBooking(0);
		n.setVisible(true);
	}
}



	
