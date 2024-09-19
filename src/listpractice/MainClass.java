package listpractice;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {

		ArrayList<String> metallica = new ArrayList<String>();
		metallica.add("James");
		metallica.add("Lars");
		metallica.add("Kirk");
		metallica.add("Robert");

		System.out.println(metallica.size());

		System.out.println(metallica.get(0));
		System.out.println(metallica.get(1));
		System.out.println(metallica.get(2));

		metallica.add(2, "Jason");
		System.out.println(metallica.get(2));

		metallica.set(4, "Kaan");
		System.out.println(metallica.get(4));

		System.out.println(metallica);

		metallica.remove(4);
		System.out.println(metallica);

		for (String string : metallica) {
			System.out.println(string);
		}

		String lastMemberOfMetallica = metallica.get(metallica.size() - 1);
		System.out.println(lastMemberOfMetallica);

		// copy
		ArrayList<String> newMetallica = new ArrayList<String>(metallica);
		System.out.println(newMetallica);

		// reverse
		System.out.println(reverseMetallicaBand(metallica));

		// find maximum
		ArrayList<Double> myBirthday = new ArrayList<Double>();
		myBirthday.add((double) 11);
		myBirthday.add((double) 3);
		myBirthday.add((double) 1998);
		System.out.println(findLargestElement(myBirthday));

		//
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		primeNumbers.add(5);
		primeNumbers.add(7);
		primeNumbers.add(11);
		System.out.println(primeNumbers);

		ArrayList<String> names = new ArrayList<String>();
		names.add("Bob");
		names.add(0, "Ann");
		names.remove(1);
		names.add("Cal");
		System.out.println(names);

		// clear
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		System.out.println(fruits);
		fruits.clear();
		System.out.println(fruits);

		ArrayList<String> legendOfBarcelona = new ArrayList<String>();
		legendOfBarcelona.add("Messi");
		legendOfBarcelona.add("Xavi");
		legendOfBarcelona.add("Iniesta");
		System.out.println(legendOfBarcelona.contains("Messi"));
		System.out.println(legendOfBarcelona.contains("messi"));
		System.out.println(legendOfBarcelona.contains("busquest"));
		System.out.println(legendOfBarcelona.indexOf("Messi"));
		System.out.println(legendOfBarcelona.indexOf("Xavi"));

		ArrayList<String> deneme = new ArrayList<>(3);
		deneme.add("deneme");
		deneme.add("deneme");
		deneme.add("deneme");
		System.out.println(deneme);
		System.out.println(deneme.size());
		deneme.add("deneme");
		System.out.println(deneme.size());

		ArrayList<String> items = new ArrayList<>();
		items.add("red");
		System.out.println(items);
		items.add(0, "yellow");
		System.out.println(items);

	}

	public static ArrayList<String> reverseMetallicaBand(ArrayList<String> metallica) {

		ArrayList<String> reverseOfMetallica = new ArrayList<String>();

		for (int i = metallica.size() - 1; i >= 0; i--) {
			reverseOfMetallica.add(metallica.get(i));
		}
		return reverseOfMetallica;
	}

	public static double findLargestElement(ArrayList<Double> arrayOfMyBirthDate) {

		double largest = arrayOfMyBirthDate.get(0);

		for (int i = 0; i < arrayOfMyBirthDate.size(); i++) {
			if (arrayOfMyBirthDate.get(i) > largest) {
				largest = arrayOfMyBirthDate.get(i);
			}
		}
		return largest;

	}

}
