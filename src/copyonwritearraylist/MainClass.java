package copyonwritearraylist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainClass {

	public static void main(String[] args) {

		// constructors
		CopyOnWriteArrayList<String> bestDestinationOfWorld = new CopyOnWriteArrayList<String>();

		// add
		System.out.println(bestDestinationOfWorld);
		bestDestinationOfWorld.add("Tokyo");
		bestDestinationOfWorld.add("Seul");
		bestDestinationOfWorld.add("Bogota");
		bestDestinationOfWorld.add("Pattaya");
		bestDestinationOfWorld.add("Kuala Lumpur");
		bestDestinationOfWorld.add("Cornwall");
		System.out.println(bestDestinationOfWorld);

		// addFirst
		bestDestinationOfWorld.addFirst("Chicago");
		System.out.println(bestDestinationOfWorld);

		// addLast
		bestDestinationOfWorld.addLast("Casablanca");
		System.out.println(bestDestinationOfWorld);

		// add for position
		bestDestinationOfWorld.add(2, "Tapei");
		System.out.println(bestDestinationOfWorld);

		// addAll
		CopyOnWriteArrayList<String> anotherDestinations = new CopyOnWriteArrayList<String>();
		anotherDestinations.add("Beijing");
		anotherDestinations.add("Hamburg");
		bestDestinationOfWorld.addAll(anotherDestinations);
		System.out.println(bestDestinationOfWorld);

		// addAll for position
		CopyOnWriteArrayList<String> britishDestinations = new CopyOnWriteArrayList<String>();
		britishDestinations.add("Edinburg");
		britishDestinations.add("Belfast");
		bestDestinationOfWorld.addAll(3, britishDestinations);
		System.out.println(bestDestinationOfWorld);

		// contains
		System.out.println(bestDestinationOfWorld);
		System.out.println(bestDestinationOfWorld.contains("Edinburg"));
		System.out.println(bestDestinationOfWorld.contains("Wrexham"));

		// containsAll
		System.out.println(bestDestinationOfWorld.containsAll(britishDestinations));

		// forEach
		bestDestinationOfWorld.forEach(n -> System.out.println(n.toUpperCase()));

		// get
		System.out.println(bestDestinationOfWorld.get(0));
		System.out.println(bestDestinationOfWorld.get(1));

		// getFirst
		System.out.println(bestDestinationOfWorld.getFirst());

		// getLast
		System.out.println(bestDestinationOfWorld.getLast());

		// getClass
		System.out.println(bestDestinationOfWorld.getClass());

		// indexOf(Object o)
		System.out.println(bestDestinationOfWorld.indexOf("Tokyo"));
		System.out.println(bestDestinationOfWorld.indexOf("Seul"));

		// equals
		System.out.println(bestDestinationOfWorld.equals(anotherDestinations));

		// isEmpty()
		boolean isEmpty = bestDestinationOfWorld.isEmpty();
		System.out.println(isEmpty);

		// iterator()
		Iterator<String> iterator = bestDestinationOfWorld.iterator();
		while (iterator.hasNext()) {
			String destination = iterator.next();
			System.out.println(destination);
		}

		// lastIndexOf(Object o)
		CopyOnWriteArrayList<Integer> compoundRate = new CopyOnWriteArrayList<>();
		compoundRate.add(1);
		compoundRate.add(2);
		compoundRate.add(3);
		compoundRate.add(3);
		System.out.println(compoundRate.lastIndexOf(3));

		// listIterator()
		CopyOnWriteArrayList<String> namesOfCities = new CopyOnWriteArrayList<>();
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
		CopyOnWriteArrayList<Long> zipCodesOfNewYorkCity = new CopyOnWriteArrayList<Long>();
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

		// removeIf(Predicate<? super E> filter)
		CopyOnWriteArrayList<String> districtOfIstanbul = new CopyOnWriteArrayList<String>();
		districtOfIstanbul.add("Sisli");
		districtOfIstanbul.add("Beyoglu");
		districtOfIstanbul.add("Besiktas");
		districtOfIstanbul.add("Usküdar");
		System.out.println(districtOfIstanbul);
		districtOfIstanbul.removeIf(n -> n.startsWith("B"));
		System.out.println(districtOfIstanbul);

		// removeRange(int fromIndex, int toIndex)
		CopyOnWriteArrayList<String> neighbourhoodOfIstanbul = new CopyOnWriteArrayList<String>();
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
		CopyOnWriteArrayList<Integer> fibonacciSequence = new CopyOnWriteArrayList<Integer>();
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
		CopyOnWriteArrayList<Integer> listOne = new CopyOnWriteArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		CopyOnWriteArrayList<Integer> listTwo = new CopyOnWriteArrayList<>(Arrays.asList(3, 4, 6));
		System.out.println(listOne.retainAll(listTwo));

		// set(int index, E element)
		CopyOnWriteArrayList<String> streetFoodOfUSA = new CopyOnWriteArrayList<String>();
		streetFoodOfUSA.add("Hamburger");
		streetFoodOfUSA.add("Doughnuts");
		streetFoodOfUSA.add("Hot Dog");
		streetFoodOfUSA.add("Burrito");
		streetFoodOfUSA.set(3, "Döner");
		System.out.println(streetFoodOfUSA);

		// size()
		System.out.println(streetFoodOfUSA.size());

		// sort(Comparator<? super E> c)
		CopyOnWriteArrayList<Integer> randomNumbers = new CopyOnWriteArrayList<>();
		randomNumbers.add(5);
		randomNumbers.add(2);
		randomNumbers.add(8);
		randomNumbers.add(1);
		randomNumbers.add(3);
		randomNumbers.sort(Comparator.reverseOrder());
		System.out.println(randomNumbers);

		// stream()
		CopyOnWriteArrayList<Integer> sequence = new CopyOnWriteArrayList<>();
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
		CopyOnWriteArrayList<String> ffruits = new CopyOnWriteArrayList<>(Arrays.asList("apple", "banana", "orange"));
		String[] fruitArray = ffruits.toArray(new String[0]);
		for (String fruit : fruitArray) {
			System.out.println(fruit);
		}

		// toString
		String string = streetFoodOfUSA.toString();
		System.out.println(string);

		// clear
		System.out.println(bestDestinationOfWorld);
		bestDestinationOfWorld.clear();
		System.out.println(bestDestinationOfWorld);

	}

}
