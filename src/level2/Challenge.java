package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(200, 200);
		sleep(3000);
		driveDirect(600,700);
		sleep(4000);
		driveDirect(400,300);
		sleep(5000);
		driveDirect(500,500);
       

	}

	public void loop() {

	}
}
