package stackPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.function.UnaryOperator;

public class MainClass {

	public static void main(String[] args) {

		// constructor
		Stack<String> countriesFromAfrica = new Stack<String>();

		// add
		countriesFromAfrica.add("Ivory Coast");
		countriesFromAfrica.add("Sierra Leone");
		countriesFromAfrica.add("Tanzania");
		countriesFromAfrica.add("DR Congo");
		countriesFromAfrica.add("Guinea");
		System.out.println(countriesFromAfrica);

		// empty
		boolean isEmpty = countriesFromAfrica.empty();
		System.out.println(isEmpty);

		// peek
		String peek = countriesFromAfrica.peek();
		System.out.println("Top element: " + peek);

		// pop
		String pop = countriesFromAfrica.pop();
		System.out.println("Removed element: " + pop);
		System.out.println("Remaining elements: " + countriesFromAfrica);

		// push
		countriesFromAfrica.push("South Africa");
		System.out.println(countriesFromAfrica);

		// search
		int position = countriesFromAfrica.search("Tanzania");
		System.out.println("Position of 'Tanzania': " + position);

//		add(E e)
		Stack<String> myHighSchoolFriends = new Stack<String>();
		System.out.println(myHighSchoolFriends);
		myHighSchoolFriends.add("Bayram");
		myHighSchoolFriends.add("Doğukan");
		System.out.println(myHighSchoolFriends);

//		add(int index, E element)
		myHighSchoolFriends.add(2, "Utku");
		System.out.println(myHighSchoolFriends);

//		addAll(Collection<? extends E> c)
		List<String> anotherHighSchoolFriends = List.of("Özcan", "Sermet");
		myHighSchoolFriends.addAll(anotherHighSchoolFriends);
		System.out.println(myHighSchoolFriends);

//		addAll(int index, Collection<? extends E> c)
		List<String> anotherHighSchoolFriendsTwo = List.of("Kubilay");
		myHighSchoolFriends.addAll(1, anotherHighSchoolFriendsTwo);
		System.out.println(myHighSchoolFriends);

//		addFirst
		myHighSchoolFriends.addFirst("Mami");
		System.out.println(myHighSchoolFriends);

		// addLast
		myHighSchoolFriends.addLast("Tahir");
		System.out.println(myHighSchoolFriends);

//		capacity()
		int capacityOfVector = myHighSchoolFriends.capacity();
		System.out.println(capacityOfVector);

//		clear()
		Stack<Integer> licensePlateCode = new Stack<Integer>();
		licensePlateCode.add(34);
		licensePlateCode.add(36);
		licensePlateCode.add(77);
		licensePlateCode.add(6);
		System.out.println(licensePlateCode);
		licensePlateCode.clear();
		System.out.println(licensePlateCode);

//		clone()
		Stack<String> cloneOfHighSchoolFriend = (Stack<String>) myHighSchoolFriends.clone();
		cloneOfHighSchoolFriend.add("Engin");
		System.out.println(cloneOfHighSchoolFriend);

//		contains(Object o)
		boolean contains = myHighSchoolFriends.contains("Sermet");
		System.out.println(contains);

//		containsAll(Collection<?> c)
		List<String> listOfHighSchoolFriends = List.of("Kubilay", "Mehmet");
		boolean containsAll = myHighSchoolFriends.containsAll(listOfHighSchoolFriends);
		System.out.println(containsAll);

//		elementAt(int index)
		Stack<String> fruits = new Stack<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		String elementAtOne = fruits.elementAt(0);
		System.out.println(elementAtOne);

//		elements()
		Enumeration<String> elements = fruits.elements();
		while (elements.hasMoreElements()) {
			String fruit = elements.nextElement();
			System.out.println(fruit);
		}

//		equals(Object o)
		Stack<String> stack1 = new Stack<>();
		Stack<String> stack2 = new Stack<>();

		stack1.add("Apple");
		stack1.add("Banana");

		stack2.add("Apple");
		stack2.add("Banana");

		boolean areEqual = stack1.equals(stack2);
		System.out.println(areEqual);

//		firstElement()
		String firstElement = myHighSchoolFriends.firstElement();
		System.out.println(firstElement);

//		forEach(Consumer<? super E> action)
		List<String> germanRockBands = Arrays.asList("Rammstein", "Scorpions", "Madsen");
		germanRockBands.forEach(rocker -> System.out.println(rocker.contains("a")));

//		get(int index)
		String thirdElementOfVector = myHighSchoolFriends.get(2);
		System.out.println(thirdElementOfVector);

//		hashCode()
		int hashCode = myHighSchoolFriends.hashCode();
		System.out.println(hashCode);

//		indexOf(Object o)
		System.out.println(myHighSchoolFriends.indexOf("Kubilay"));

//		indexOf(Object o, int index)
		System.out.println("My Highschool Friends: " + myHighSchoolFriends);
		int indexOfKubilay = myHighSchoolFriends.indexOf("Kubilay", 3);
		System.out.println("Index of Kubilay: " + indexOfKubilay);

//		insertElementAt(E obj, int index)
		System.out.println("Before insertion: " + myHighSchoolFriends);
		myHighSchoolFriends.insertElementAt("Mehmet Ali", 1);
		System.out.println("After insertion: " + myHighSchoolFriends);

//		isEmpty()
		boolean empty = myHighSchoolFriends.isEmpty();
		System.out.println(empty);

//		iterator()
		Iterator<String> iterator = myHighSchoolFriends.iterator();
		while (iterator.hasNext()) {
			String myFriend = iterator.next();
			System.out.println(myFriend);
		}

//		lastElement()
		String lastElement = myHighSchoolFriends.lastElement();
		System.out.println(lastElement);

//		lastIndexOf(Object o)
		int lastIndexOf = myHighSchoolFriends.lastIndexOf("Bayram");
		System.out.println("Index of Bayram: " + lastIndexOf);

//		lastIndexOf(Object o, int index)
		int lastIndexOfKubilay = myHighSchoolFriends.lastIndexOf("Kubilay", 4);
		System.out.println("Last Index Of Kubi: " + lastIndexOfKubilay);

//		remove(int index)
		System.out.println(myHighSchoolFriends);
		String removeSecondElement = myHighSchoolFriends.remove(1);
		System.out.println(removeSecondElement);
		System.out.println(myHighSchoolFriends);

		// removeFirst
		myHighSchoolFriends.removeFirst();
		System.out.println(myHighSchoolFriends);

		// removeLast
		myHighSchoolFriends.removeLast();
		System.out.println(myHighSchoolFriends);

//		remove(Object o)
		myHighSchoolFriends.remove("Sermet");
		System.out.println(myHighSchoolFriends);

//		removeAll(Collection<?> c)
		List<String> removingFriends = List.of("Doğukan", "Özcan");
		myHighSchoolFriends.removeAll(removingFriends);
		System.out.println(myHighSchoolFriends);

//		removeAllElements()
		myHighSchoolFriends.removeAllElements();
		System.out.println("The Last Time I Saw My High School Friends: " + myHighSchoolFriends);

//		set(int index, E element)
		Stack<String> dinosaurus = new Stack<String>();
		dinosaurus.add("Spinosaurus");
		dinosaurus.add("Brontozor");
		dinosaurus.add("Diplodocus");
		dinosaurus.add("Velociraptor");
		dinosaurus.add("Carnotaurus");
		dinosaurus.add("Argentinosaurus");
		System.out.println(dinosaurus);
		dinosaurus.set(0, "Allosaurus");
		System.out.println(dinosaurus);

//		setElementAt(E obj, int index)
		dinosaurus.setElementAt("Titanozor", 3);
		System.out.println(dinosaurus);

//		size()
		int size2 = dinosaurus.size();
		System.out.println(size2);

//		sort(Comparator<? super E> c)
		dinosaurus.sort(Comparator.naturalOrder());
		System.out.println(dinosaurus);

//		setSize(int newSize)
		System.out.println("Original vector: " + dinosaurus);
		dinosaurus.setSize(4);
		System.out.println("Vector after setting size to 4: " + dinosaurus);

//		subList(int fromIndex, int toIndex)
		System.out.println(dinosaurus.subList(2, 4));

//		toArray()
		Object[] array = dinosaurus.toArray();
		System.out.println(array);

//		toString()
		Stack<Integer> anotherNumbers = new Stack<>();
		anotherNumbers.add(10);
		anotherNumbers.add(20);
		anotherNumbers.add(30);
		anotherNumbers.add(40);
		String listString = anotherNumbers.toString();
		System.out.println(listString);

//		listIterator()
		ListIterator<String> listIterator = dinosaurus.listIterator();

		while (listIterator.hasNext()) {
			String nextDino = listIterator.next();
			System.out.println(nextDino);
		}

		while (listIterator.hasPrevious()) {
			String previousDino = listIterator.previous();
			System.out.println(previousDino);
		}

//		listIterator(int index)
		ListIterator<String> listIteratorTwo = dinosaurus.listIterator(2);

		while (listIteratorTwo.hasNext()) {
			String next = listIteratorTwo.next();
			System.out.println(next);
		}

		while (listIteratorTwo.hasPrevious()) {
			String previous = listIteratorTwo.previous();
			System.out.println(previous);
		}

//		replaceAll(UnaryOperator<E> operator)
		UnaryOperator<Integer> multiplyByTwo = x -> x * 2;
		anotherNumbers.replaceAll(multiplyByTwo);
		System.out.println(anotherNumbers);

//		retainAll(Collection<?> c)
		List<Integer> retainList = Arrays.asList(20, 21, 22);
		anotherNumbers.retainAll(retainList);
		System.out.println(anotherNumbers);

//		removeElement(Object obj)
		Stack<String> randomCountry = new Stack<String>();
		randomCountry.add("Italy");
		randomCountry.add("Hong Kong");
		randomCountry.add("Liberia");
		randomCountry.add("Antigua and Barbuda");
		randomCountry.add("Ecuador");
		randomCountry.add("England");
		randomCountry.add("Denmark");
		System.out.println(randomCountry);
		randomCountry.removeElement("Denmark");
		System.out.println(randomCountry);

//		removeElementAt(int index)
		randomCountry.removeElementAt(3);
		System.out.println(randomCountry);

//		removeIf(Predicate<? super E> filter)
		boolean removeIfContainsO = randomCountry.removeIf(c -> c.contains("o"));
		System.out.println(removeIfContainsO);
		System.out.println(randomCountry);

	}

}
