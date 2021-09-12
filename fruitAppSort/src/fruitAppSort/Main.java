package fruitAppSort;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();

		m.fruit_run();
	}

	public void fruit_run() {

		ArrayList<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit f1 = new Fruit(101, "mango", 30);
		fl.add(f1);
		Fruit f2 = new Fruit(105, "starfruit", 20);
		fl.add(f2);
		Fruit f3 = new Fruit(106, "apple", 10);
		fl.add(f3);
		Fruit f4 = new Fruit(102, "orange", 10);
		fl.add(f4);
		Fruit f5 = new Fruit(104, "kiwi", 70);
		fl.add(f5);
		Fruit f6 = new Fruit(107, "watermelon", 30);
		fl.add(f6);
		Fruit f7 = new Fruit(111, "melon", 15);
		fl.add(f7);
		Fruit f8 = new Fruit(109, "banana", 70);
		fl.add(f8);
		Fruit f9 = new Fruit(110, "apple", 25);
		fl.add(f9);
		Fruit f10 = new Fruit(112, "pear", 10);
		fl.add(f10);

		Collections.sort(fl, new FruitComparator());
		for (Fruit s : fl)
			System.out.println(s.toString());
	}
}
