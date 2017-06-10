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
		driveDirect(500, 500);
		sleep(3000);
		driveDirect(0, 1000);
		sleep(4000);
		driveDirect(200, 200);
		sleep(3000);
		driveDirect(500, 500);
		sleep(5000);
		driveDirect(500, 500);
		sleep(4000);
		driveDirect(500, 0);
		sleep(3000);
		driveDirect(1000, 1000);
		sleep(5000);
        driveDirect(2000,0);

	}

	public void loop() {

	}
}
