package ua.lviv.lgs.Animal;

public class Application {
	public static void main(String[] args) {

		Animal animal = new Animal("Леопард", 7, 20);
		System.out.println("Назва тварини = " + animal.getName() + "," + " Швидкість тварини = " + animal.getSpeed()
				+ "км/год," + " Вік тварини = " + animal.getAge() + " років ");
		System.out.println();
		animal.setName("Бик");
		animal.setSpeed(2);
		animal.setAge(14);
		System.out.println("Назва тварини = " + animal.getName() + "," + " Швидкість тварини = " + animal.getSpeed()
				+ "км/год," + " Вік тварини = " + animal.getAge() + " років ");
	}

}
