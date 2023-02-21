package ua.lviv.lgs.Robot;

public class Application {

	public static void main(String[] args) {

		Robot r1 = new Robot("Robot", "я просто працюю");
		System.out.println(r1.work());
		CoffeRobot r2 = new CoffeRobot("CoffeRobot", "я варю каву");
		System.out.println(r2.work());
		RobotDancer r3 = new RobotDancer("RobotDancer", "я просто танцюю");
		System.out.println(r3.work());
		RobotCoocker r4 = new RobotCoocker("RobotCoocker", "я просто готую");
		System.out.println(r4.work());
		System.out.println();
		Robot[] arrRobot = { r1, r2, r3, r4 };
		for (int i = 0; i < arrRobot.length; i++) {
			System.out.println(arrRobot[i].work());
		}
	}

}
