package linkedlist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {

		// constructor
		LinkedList<String> beautifulCities = new LinkedList<String>();

		// add(E e)
		beautifulCities.add("Rome");
		beautifulCities.add("Boston");
		beautifulCities.add("Bristol");
		System.out.println(beautifulCities);

//		add(int index, E element)
		beautifulCities.add(0, "Tulsa");
		System.out.println(beautifulCities);

//		addAll(Collection<? extends E> c)
		LinkedList<String> anotherCities = new LinkedList<>(
				Arrays.asList("Jacksonville", "Nashville", "Columbus", "Jersey City"));
		beautifulCities.addAll(anotherCities);
		System.out.println(beautifulCities);

//		addAll(int index, Collection<? extends E> c)
		LinkedList<String> anotherCitiesTwo = new LinkedList<>(Arrays.asList("New Orleans", "Indianapolis"));
		beautifulCities.addAll(0, anotherCitiesTwo);
		System.out.println(beautifulCities);

//		addFirst(E e)
		beautifulCities.addFirst("Orlando");
		System.out.println(beautifulCities);

//		addLast(E e)
		beautifulCities.addLast("Milwaukee");
		System.out.println(beautifulCities);

//		clear()
		LinkedList<String> myFavouriteSongs = new LinkedList<>();
		myFavouriteSongs.add("Let Her Go");
		myFavouriteSongs.add("American Pie");
		myFavouriteSongs.add("Take on Me");
		myFavouriteSongs.add("Dandelion Wine");
		myFavouriteSongs.add("Society");
		System.out.println(myFavouriteSongs);
		myFavouriteSongs.clear();
		System.out.println(myFavouriteSongs);

//		clone()
		LinkedList<Integer> kaprekarNumbers = new LinkedList<>();
		kaprekarNumbers.add(1);
		kaprekarNumbers.add(9);
		kaprekarNumbers.add(45);
		kaprekarNumbers.add(55);
		kaprekarNumbers.add(99);
		kaprekarNumbers.add(297);
		kaprekarNumbers.add(703);
		kaprekarNumbers.add(999);
		System.out.println(kaprekarNumbers);
		LinkedList<Integer> clone = (LinkedList<Integer>) kaprekarNumbers.clone();
		System.out.println(clone);
		clone.add(2223);
		System.out.println(clone);
		System.out.println(kaprekarNumbers);

//		contains(Object o)
		System.out.println(kaprekarNumbers.contains(55));
		System.out.println(kaprekarNumbers.contains(7));
		System.out.println(kaprekarNumbers.contains(99));
		System.out.println(kaprekarNumbers.contains(222));

//		get(int index)
		LinkedList<String> universityOfUS = new LinkedList<String>();
		universityOfUS.add("MIT");
		universityOfUS.add("Stanford");
		universityOfUS.add("Yale");
		universityOfUS.add("Harvard");
		System.out.println(universityOfUS);
		System.out.println(universityOfUS.get(0));
		System.out.println(universityOfUS.get(2));
		System.out.println(universityOfUS.get(3));

//		getFirst()
		System.out.println(universityOfUS.getFirst());

//		getLast()
		System.out.println(universityOfUS.getLast());

//		indexOf(Object o)
		System.out.println(universityOfUS);
		int indexOf = universityOfUS.indexOf("MIT");
		System.out.println(indexOf);

//		lastIndexOf(Object o)
		LinkedList<Integer> compoundRate = new LinkedList<>();
		compoundRate.add(1);
		compoundRate.add(2);
		compoundRate.add(3);
		compoundRate.add(3);
		System.out.println(compoundRate.lastIndexOf(3));

//		descendingIterator()
		LinkedList<Integer> licensePlateCode = new LinkedList<Integer>();
		licensePlateCode.add(34);
		licensePlateCode.add(36);
		licensePlateCode.add(77);
		licensePlateCode.add(6);
		System.out.println(licensePlateCode);
		Iterator<Integer> descendingIterator = licensePlateCode.descendingIterator();

		while (descendingIterator.hasNext()) {
			Integer next = descendingIterator.next();
			System.out.println(next);
		}

//		listIterator(int index)

		ListIterator<Integer> listIterator = licensePlateCode.listIterator(2);

		while (listIterator.hasNext()) {
			Integer next = listIterator.next();
			System.out.println(next);
		}

//		element()
		LinkedList<String> dinosaurus = new LinkedList<String>();
		dinosaurus.add("Spinosaurus");
		dinosaurus.add("Brontozor");
		dinosaurus.add("Diplodocus");
		dinosaurus.add("Velociraptor");
		dinosaurus.add("Carnotaurus");
		dinosaurus.add("Argentinosaurus");
		System.out.println(dinosaurus);
		String headOfDino = dinosaurus.element();
		System.out.println("Head dinosaur: " + headOfDino);

//		offer(E e)
		boolean offer = dinosaurus.offer("Triceratops");
		System.out.println("Element added: " + offer);
		System.out.println(dinosaurus);

//		offerFirst(E e)
		boolean offerFirst = dinosaurus.offerFirst("Tyrannosaurus Rex");
		System.out.println("Element added: " + offerFirst);
		System.out.println(dinosaurus);

//		offerLast(E e)
		boolean offerLast = dinosaurus.offerLast("Dilophosaurus");
		System.out.println("Element added: " + offerLast);
		System.out.println(dinosaurus);

//		peek()
		String peek = dinosaurus.peek();
		System.out.println(peek);

//		peekFirst()
		String peekFirst = dinosaurus.peekFirst();
		System.out.println(peekFirst);

//		peekLast()
		String peekLast = dinosaurus.peekLast();
		System.out.println(peekLast);

//		poll()
		String poll = dinosaurus.poll();
		System.out.println(poll);

//		pollFirst()
		String pollFirst = dinosaurus.pollFirst();
		System.out.println(pollFirst);

//		pollLast()
		String pollLast = dinosaurus.pollLast();
		System.out.println(pollLast);

//		pop()
		String pop = dinosaurus.pop();
		System.out.println(pop);

//		push(E e)
		dinosaurus.push("");
		System.out.println(dinosaurus);

//		remove()
		LinkedList<String> germanFederalStates = new LinkedList<String>();
		germanFederalStates.add("Bavaria");
		germanFederalStates.add("Baden-Württemberg");
		germanFederalStates.add("Hamburg");
		germanFederalStates.add("Bradenburg");
		System.out.println(germanFederalStates);
		germanFederalStates.remove("Bradenburg");
		System.out.println(germanFederalStates);

//		remove(int index)
		germanFederalStates.remove(0);
		System.out.println(germanFederalStates);

//		removeFirst()
		germanFederalStates.add("Berlin");
		germanFederalStates.add("Saarland");
		germanFederalStates.add("Schleswig-Holstein");
		germanFederalStates.add("Hesse");
		System.out.println(germanFederalStates);
		germanFederalStates.removeFirst();
		System.out.println(germanFederalStates);

//		removeFirstOccurrence(Object o)
		System.out.println("Before removal: " + dinosaurus);
		boolean removed = dinosaurus.removeFirstOccurrence("Velociraptor");
		System.out.println("Removed: " + removed);
		System.out.println("After removal: " + dinosaurus);

//		removeLast()
		germanFederalStates.removeLast();
		System.out.println(germanFederalStates);

//		removeLastOccurrence(Object o)
		System.out.println("Before removal: " + dinosaurus);
		boolean removedd = dinosaurus.removeLastOccurrence("Velociraptor");
		System.out.println("Removed: " + removedd);
		System.out.println("After removal: " + dinosaurus);

//		set(int index, E element)
		LinkedList<String> footballClubs = new LinkedList<String>();
		footballClubs.add("Girona");
		System.out.println(footballClubs);
		footballClubs.set(0, "FC Barcelona");
		System.out.println(footballClubs);

//		size()
		LinkedList<Boolean> signalOut = new LinkedList<Boolean>();
		signalOut.add(true);
		signalOut.add(false);
		signalOut.add(true);
		signalOut.add(false);
		signalOut.add(false);
		signalOut.add(true);
		System.out.println(signalOut.size());

		// sort(Comparator<? super E> c)
		footballClubs.add("Galatasaray");
		footballClubs.sort(Comparator.reverseOrder());
		System.out.println(footballClubs);

//      stream()
		LinkedList<Integer> sequence = new LinkedList<Integer>();
		sequence.add(1);
		sequence.add(2);
		sequence.add(3);
		sequence.add(4);
		sequence.add(5);
		List<Integer> doubledList = sequence.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println(doubledList);

//		toArray()
		List<Integer> numbers = new LinkedList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		Integer[] numberArray = numbers.toArray(new Integer[0]);
		for (int number : numberArray) {
			System.out.println(number);
		}

//      toString
		List<Integer> anotherNumbers = new LinkedList<>();
		anotherNumbers.add(10);
		anotherNumbers.add(20);
		anotherNumbers.add(30);
		anotherNumbers.add(40);
		String listString = anotherNumbers.toString();
		System.out.println(listString);

	}

}
