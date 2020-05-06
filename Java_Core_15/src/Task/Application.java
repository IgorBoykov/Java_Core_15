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
				System.out.println("�������� ������");
				break;
			case "2":
				zc.addAnimal();
				System.out.println("�������� ������");
				break;
			case "3":
				zc.deleteAnimal();
				System.out.println("�������� ��������");
				break;
			case "4":
				zc.deleteMember();
				System.out.println("�������� ��������");
				break;
			case "5":
				zc.deleteAnimalFromALL();
				System.out.println("�������� �������� � ��� ��������");
				break;
			case "6":
				System.out.println("Zoo Club:");
				zc.showZooClub();
				break;
			case "7":
				System.out.println("�� �������!");
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}

	private static void menu() {
		System.out.println("�������� 1, ��� ������ �������� �����");
		System.out.println("�������� 2, ��� ������ �������� �� �������� �����");
		System.out.println("�������� 3, ��� �������� �������� � �������� �����");
		System.out.println("�������� 4, ��� �������� �������� � �����");
		System.out.println("�������� 5, ��� �������� ��������� �������� � ��� ��������");
		System.out.println("�������� 6, ��� ������� �� ����� �������");
		System.out.println("�������� 7, ��� ����� � ��������");

	}

}
