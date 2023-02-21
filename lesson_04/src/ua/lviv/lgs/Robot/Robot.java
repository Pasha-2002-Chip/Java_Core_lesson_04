package ua.lviv.lgs.Robot;

public class Robot {
	private String name;
	private String robotwork;

	Robot(String name, String robotwork) {
		this.name = name;
		this.robotwork = robotwork;
	}

	public String work() {
		return "Я " + name + " - " + robotwork;
	}
}
