package Task;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		ZooClub zc = new ZooClub();

		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();

			switch (sc.next()) {
			case "1":
				zc.addMember();
				System.out.println("Учасника додано");
				break;
			case "2":
				zc.addAnimal();
				System.out.println("Тваринку додано");
				break;
			case "3":
				zc.deleteAnimal();
				System.out.println("Тваринку видалено");
				break;
			case "4":
				zc.deleteMember();
				System.out.println("Учасника видалено");
				break;
			case "5":
				zc.deleteAnimalFromALL();
				System.out.println("Тваринку видалено з усіх учасників");
				break;
			case "6":
				System.out.println("Zoo Club:");
				zc.showZooClub();
				break;
			case "7":
				System.out.println("До зустрічі!");
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}

	private static void menu() {
		System.out.println("Натисніть 1, щоб додати учасника клубу");
		System.out.println("Натисніть 2, щоб додати тваринку до учасника клубу");
		System.out.println("Натисніть 3, щоб видалити тваринку з учасника клубу");
		System.out.println("Натисніть 4, щоб видалити учасника з клубу");
		System.out.println("Натисніть 5, щоб видалити конкретну тваринку зі всіх власників");
		System.out.println("Натисніть 6, щоб вивести на екран зооклуб");
		System.out.println("Натисніть 7, щоб вийти з програми");

	}

}
