package Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ZooClub {

	Map<Person, List<Animal>> map = new HashMap<>();

	public void addMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть ≥м'€ учасника");
		String name = sc.nextLine();
		System.out.println("¬вед≥ть в≥к учасника");
		int age = sc.nextInt();
		map.put(new Person(name, age), new ArrayList<Animal>());
	}

	public void addAnimal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть ≥м'€ учасника, €кому хочете додати тваринку");
		String name = sc.nextLine();
		System.out.println("¬вед≥ть тип тварини");
		String type = sc.nextLine();
		System.out.println("¬вед≥ть ≥м'€ тварини");
		String nameAnimal = sc.nextLine();

		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(name)) {
				List<Animal> value = next.getValue();
				value.add(new Animal(type, nameAnimal));
				next.setValue(value);
			}
		}
	}

	public void deleteAnimal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть ≥м'€ учасника, тваринку €кого хочете видалити");
		String name = sc.nextLine();
		System.out.println("¬вед≥ть ≥м'€ тварини, €ку хочете видалити");
		String nameAnimal = sc.nextLine();

		Iterator<Entry<Person, List<Animal>>> iterator2 = map.entrySet().iterator();

		while (iterator2.hasNext()) {
			Entry<Person, List<Animal>> next = iterator2.next();
			if (next.getKey().getName().equals(name)) {
				List<Animal> value2 = next.getValue();
				Iterator<Animal> iterator3 = value2.iterator();
				while (iterator3.hasNext()) {
					Animal next2 = iterator3.next();
					if (next2.getName().equals(nameAnimal)) {
						iterator3.remove();
					}
				}
			}
		}
	}

	public void deleteMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть ≥м'€ учасника, €кого хочете видалити");
		String name = sc.nextLine();

		Iterator<Entry<Person, List<Animal>>> iterator4 = map.entrySet().iterator();

		while (iterator4.hasNext()) {
			Entry<Person, List<Animal>> next = iterator4.next();
			if (next.getKey().getName().equals(name)) {
				iterator4.remove();
			}
		}
	}

	public void deleteAnimalFromALL() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть ≥м'€ тварини, €ку хочете видалити");
		String nameAnimal = sc.nextLine();

		Iterator<Entry<Person, List<Animal>>> iterator5 = map.entrySet().iterator();
		while (iterator5.hasNext()) {
			Entry<Person, List<Animal>> next = iterator5.next();
			List<Animal> value3 = next.getValue();
			Iterator<Animal> iterator6 = value3.iterator();
			while (iterator6.hasNext()) {
				Animal next3 = iterator6.next();
				if (next3.getName().equals(nameAnimal));
				iterator6.remove();
			}
		}
	}

	public void showZooClub() {
		System.out.println(map);

	}

}
