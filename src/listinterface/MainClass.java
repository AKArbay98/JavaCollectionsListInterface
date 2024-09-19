package listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		// constructor
		List<String> skinsCharacters = new ArrayList<>();

		// add
		System.out.println(skinsCharacters);
		skinsCharacters.add("Effie Stonem");
		skinsCharacters.add("Cassie Ainsworth");
		skinsCharacters.add("James Cook");
		skinsCharacters.add("Sid Jenkins");
		skinsCharacters.add("Tony Stonem");
		skinsCharacters.add("Freddie McClair");
		skinsCharacters.add("Maxxie Oliver");
		skinsCharacters.add("Michelle Richardson");
		System.out.println(skinsCharacters);

		// add
		skinsCharacters.add(8, "Anwar Kharral");
		System.out.println(skinsCharacters);

		// addFirst
		skinsCharacters.addFirst("Chris Miles");
		System.out.println(skinsCharacters);

		// addLast
		skinsCharacters.addLast("Katie Fitch");
		System.out.println(skinsCharacters);

		// addAll
		List<String> moreSkinsCharacters = new ArrayList<>();
		moreSkinsCharacters.add("Pandora Moon");
		moreSkinsCharacters.add("Posh Kenneth");
		skinsCharacters.addAll(moreSkinsCharacters);
		System.out.println(skinsCharacters);

		// addAll
		List<String> anotherSkinsCharacters = new ArrayList<>();
		anotherSkinsCharacters.add("JJ Jones");
		anotherSkinsCharacters.add("Naomi Campbell");
		skinsCharacters.addAll(0, anotherSkinsCharacters);
		System.out.println(skinsCharacters);

		// isEmpty
		boolean isEmpty = skinsCharacters.isEmpty();
		System.out.println(isEmpty);

		// size
		int size = skinsCharacters.size();
		System.out.println(size);

		// get
		String secondCharacterFromSkins = skinsCharacters.get(2);
		System.out.println(secondCharacterFromSkins);

		// getFirst
		String firstCharacterFromSkins = skinsCharacters.getFirst();
		System.out.println(firstCharacterFromSkins);

		// getLast
		String lastCharacterFromSkins = skinsCharacters.getLast();
		System.out.println(lastCharacterFromSkins);

		// hashCode
		int hashCode = skinsCharacters.hashCode();
		System.out.println(hashCode);

		// toArray
		Object[] array = skinsCharacters.toArray();
		System.out.println(array);

		// toString
		String string = skinsCharacters.toString();
		System.out.println(string);

		// set
		skinsCharacters.set(0, "Jonah Jeremiah Jones");
		System.out.println(skinsCharacters);

		// forEach
		skinsCharacters.forEach(character -> System.out.println(character));

		// stream
		Stream<String> filter = skinsCharacters.stream().filter(c -> c.contains("Jon"));
		System.out.println(filter);
		System.out.println(skinsCharacters);

		// contains
		boolean isContainsEffy = skinsCharacters.contains("Effy");
		System.out.println(isContainsEffy);

		// containsAll
		boolean isContainsAll = skinsCharacters.containsAll(moreSkinsCharacters);
		System.out.println(isContainsAll);

		// indexOf
		int indexOfCook = skinsCharacters.indexOf("James Cook");
		System.out.println(indexOfCook);

		// iterator
		Iterator<String> iterator = skinsCharacters.iterator();
		while (iterator.hasNext()) {
			String character = iterator.next();
			System.out.println(character);
		}

		// lastIndexOf
		int lastIndex = skinsCharacters.lastIndexOf("Tony Stonem");
		System.out.println("Last index of Tony Stonem: " + lastIndex);

		// listIterator
		ListIterator<String> listIterator = skinsCharacters.listIterator(skinsCharacters.size());
		while (listIterator.hasPrevious()) {
			String character = listIterator.previous();
			System.out.println(character);
		}

		// replaceAll
		skinsCharacters.replaceAll(character -> character.equals("Effie Stonem") ? "Effie" : character);
		System.out.println(skinsCharacters);

		// reversed
		List<String> reversedCharacters = skinsCharacters.reversed();
		System.out.println(reversedCharacters);

		// sort
		System.out.println("Original list: " + skinsCharacters);
		Collections.sort(skinsCharacters);
		System.out.println("Sorted list: " + skinsCharacters);

		// subList
		List<String> subList = skinsCharacters.subList(3, 7);
		System.out.println(subList);

		// removeFirst
		String removeFirst = skinsCharacters.removeFirst();
		System.out.println(removeFirst);
		System.out.println(skinsCharacters);

		// removeLast
		String removeLast = skinsCharacters.removeLast();
		System.out.println(removeLast);
		System.out.println(skinsCharacters);

		// remove
		String remove = skinsCharacters.remove(4);
		System.out.println(remove);
		System.out.println(skinsCharacters);

		// removeAll
		boolean isRemoveAllAnotherSkinsCharacters = skinsCharacters.removeAll(anotherSkinsCharacters);
		System.out.println(isRemoveAllAnotherSkinsCharacters);
		System.out.println(skinsCharacters);

		// removeIf
		boolean removeIf = skinsCharacters.removeIf(c -> c.contains("d"));
		System.out.println(removeIf);
		System.out.println(skinsCharacters);

		// clear
		skinsCharacters.clear();
		System.out.println(skinsCharacters);

	}

}
