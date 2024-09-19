package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainClass {

	public static void main(String[] args) {

		// constructor
		ArrayList<String> fruits = new ArrayList<>();
		System.out.println(fruits);
		ArrayList<Integer> numbers = new ArrayList<>(100);
		System.out.println(numbers);
		List<String> colors = Arrays.asList("red", "green", "blue");
		ArrayList<String> colorList = new ArrayList<>(colors);
		System.out.println(colorList);

		// add
		ArrayList<String> britishRockBands = new ArrayList<String>();
		System.out.println(britishRockBands);
		britishRockBands.add("Radiohead");
		System.out.println(britishRockBands);

		// addFirst
		britishRockBands.addFirst("Passenger");
		System.out.println(britishRockBands);

		// addLast
		britishRockBands.addLast("Blur");
		System.out.println(britishRockBands);

		// add for position
		britishRockBands.add(2, "Coldplay");
		System.out.println(britishRockBands);

		// addAll
		ArrayList<String> anotherBritishRockBands = new ArrayList<String>();
		anotherBritishRockBands.add("The Who");
		anotherBritishRockBands.add("Led Zeppelin");
		britishRockBands.addAll(anotherBritishRockBands);
		System.out.println(britishRockBands);

		// addAll for position
		ArrayList<String> britishPunkBands = new ArrayList<String>();
		britishPunkBands.add("The Clash");
		britishPunkBands.add("The Damned");
		britishRockBands.addAll(3, britishPunkBands);
		System.out.println(britishRockBands);

		// clear
		System.out.println(britishPunkBands);
		britishPunkBands.clear();
		System.out.println(britishPunkBands);

		// clone
		ArrayList<String> americanCountryBands = new ArrayList<>();
		americanCountryBands.add("Rascal Flatts");
		System.out.println(americanCountryBands);
		ArrayList<String> clonedList = new ArrayList<>(americanCountryBands);
		clonedList.clear();
		System.out.println(clonedList);
		System.out.println(americanCountryBands);

		// contains
		System.out.println(britishRockBands);
		System.out.println(britishRockBands.contains("Queen"));
		System.out.println(britishRockBands.contains("Passenger"));

		// containsAll
		System.out.println(britishRockBands.containsAll(americanCountryBands));

		// ensureCapacity
		ArrayList<String> listOfFruit = new ArrayList<>();
		listOfFruit.add("apple");
		listOfFruit.add("banana");
		listOfFruit.ensureCapacity(5);
		System.out.println(listOfFruit.size());
		listOfFruit.add("watermelon");
		listOfFruit.add("melon");
		listOfFruit.add("blackberry");
		listOfFruit.add("chery");
		System.out.println(listOfFruit.size());

		// forEach
		listOfFruit.forEach(n -> System.out.println(n.toUpperCase()));

		// get
		System.out.println(listOfFruit.get(0));
		System.out.println(listOfFruit.get(1));

		// getFirst
		System.out.println(listOfFruit.getFirst());

		// getLast
		System.out.println(listOfFruit.getLast());

		// getClass
		System.out.println(listOfFruit.getClass());

		// indexOf(Object o)
		System.out.println(britishRockBands.indexOf("The Smiths"));
		System.out.println(britishRockBands.indexOf("The Clash"));

		// equals
		System.out.println(britishRockBands.equals(americanCountryBands));

		// isEmpty()
		System.out.println(britishRockBands.isEmpty());

		// iterator()
		Iterator<String> iterator = listOfFruit.iterator();
		while (iterator.hasNext()) {
			String fruit = iterator.next();
			System.out.println(fruit);
		}

		// lastIndexOf(Object o)
		ArrayList<Integer> compoundRate = new ArrayList<>();
		compoundRate.add(1);
		compoundRate.add(2);
		compoundRate.add(3);
		compoundRate.add(3);
		System.out.println(compoundRate.lastIndexOf(3));

		// listIterator()
		List<String> namesOfCities = new ArrayList<>();
		namesOfCities.add("Seattle");
		namesOfCities.add("Chicago");
		namesOfCities.add("San Francisco");

		ListIterator<String> namesIterator = namesOfCities.listIterator();

		while (namesIterator.hasNext()) {
			System.out.println(namesIterator.next());
		}

		for (String s : namesOfCities) {
			System.out.println(s);
		}

		// remove(int index)
		ArrayList<Long> zipCodesOfNewYorkCity = new ArrayList<Long>();
		zipCodesOfNewYorkCity.add(10001L);
		zipCodesOfNewYorkCity.add(10451L);
		zipCodesOfNewYorkCity.add(10002L);
		zipCodesOfNewYorkCity.add(10452L);
		zipCodesOfNewYorkCity.add(10003L);
		zipCodesOfNewYorkCity.add(10453L);
		System.out.println(zipCodesOfNewYorkCity);
		zipCodesOfNewYorkCity.remove(3);
		System.out.println(zipCodesOfNewYorkCity);

		// remove(Object o)
		boolean isRemove = zipCodesOfNewYorkCity.remove(10003L);
		System.out.println(isRemove);

		// removeAll(Collection<?> c)
		List<String> colorsToRemove = Arrays.asList("Red");
		colors.removeAll(colorsToRemove);
		System.out.println("Colors after removing Red: " + colors);

		// removeIf(Predicate<? super E> filter)
		ArrayList<String> districtOfIstanbul = new ArrayList<String>();
		districtOfIstanbul.add("Sisli");
		districtOfIstanbul.add("Beyoglu");
		districtOfIstanbul.add("Besiktas");
		districtOfIstanbul.add("Usküdar");
		System.out.println(districtOfIstanbul);
		districtOfIstanbul.removeIf(n -> n.startsWith("B"));
		System.out.println(districtOfIstanbul);

		// removeRange(int fromIndex, int toIndex)
		ArrayList<String> neighbourhoodOfIstanbul = new ArrayList<String>();
		neighbourhoodOfIstanbul.add("Aksaray");
		neighbourhoodOfIstanbul.add("Bomonti");
		neighbourhoodOfIstanbul.add("Gümüşsuyu");

		// removeFirst
		neighbourhoodOfIstanbul.removeFirst();
		System.out.println(neighbourhoodOfIstanbul);

		// removeLast
		neighbourhoodOfIstanbul.removeLast();
		System.out.println(neighbourhoodOfIstanbul);

		// replaceAll(UnaryOperator<E> operator)
		ArrayList<Integer> fibonacciSequence = new ArrayList<Integer>();
		fibonacciSequence.add(1);
		fibonacciSequence.add(1);
		fibonacciSequence.add(2);
		fibonacciSequence.add(3);
		fibonacciSequence.add(5);
		fibonacciSequence.add(8);
		fibonacciSequence.add(13);
		System.out.println(fibonacciSequence);
		fibonacciSequence.replaceAll(n -> n * n);
		System.out.println("New Fibonacci Sequence: " + fibonacciSequence);

		// retainAll(Collection<?> c)
		List<Integer> listOne = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		List<Integer> listTwo = new ArrayList<>(Arrays.asList(3, 4, 6));
		System.out.println(listOne.retainAll(listTwo));

		// set(int index, E element)
		ArrayList<String> streetFoodOfUSA = new ArrayList<String>();
		streetFoodOfUSA.add("Hamburger");
		streetFoodOfUSA.add("Doughnuts");
		streetFoodOfUSA.add("Hot Dog");
		streetFoodOfUSA.add("Burrito");
		streetFoodOfUSA.set(3, "Döner");
		System.out.println(streetFoodOfUSA);

		// size()
		System.out.println(streetFoodOfUSA.size());

		// sort(Comparator<? super E> c)
		List<Integer> randomNumbers = new ArrayList<>();
		randomNumbers.add(5);
		randomNumbers.add(2);
		randomNumbers.add(8);
		randomNumbers.add(1);
		randomNumbers.add(3);
		randomNumbers.sort(Comparator.reverseOrder());
		System.out.println(randomNumbers);

		// stream()
		List<Integer> sequence = new ArrayList<>();
		sequence.add(1);
		sequence.add(2);
		sequence.add(3);
		sequence.add(4);
		sequence.add(5);
		sequence.stream().forEach(System.out::println);

		// subList(int fromIndex, int toIndex)
		System.out.println(streetFoodOfUSA.subList(1, 3));

		// toArray()
		System.out.println(streetFoodOfUSA.toArray());

		// toArray(T[] a)
		ArrayList<String> ffruits = new ArrayList<>(Arrays.asList("apple", "banana", "orange"));
		String[] fruitArray = ffruits.toArray(new String[0]);
		for (String fruit : fruitArray) {
			System.out.println(fruit);
		}

		// toString
		String string = streetFoodOfUSA.toString();
		System.out.println(string);

	}

}
