package collectioninterface;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TransferQueue;

public class MainClass {

	public static void main(String[] args) {

		// Collection Interface
		Collection<String> firstCollection = new ArrayList<String>();
		Collection<String> secondCollection = new ArrayBlockingQueue<String>(5);
		Collection<String> thirdCollection = new ArrayDeque<String>();
		Collection<String> collectionFour = new ArrayList<>();
		Collection<String> collectionFive = new ConcurrentLinkedDeque<>();
		Collection<String> collectionSix = new ConcurrentSkipListSet<>();
		Collection<String> collectionSeven = new CopyOnWriteArrayList<>();
		Collection<String> collectionEight = new DelayQueue();
		Collection<String> collectionNine = new HashSet();
		Collection<String> collection10 = new LinkedBlockingDeque<>();
		Collection<String> collection11 = new LinkedBlockingQueue<>();
		Collection<String> collection12 = new LinkedHashSet<>();
		Collection<String> collection13 = new LinkedList<>();
		Collection<String> collection14 = new LinkedTransferQueue<>();
		Collection<String> collection15 = new PriorityBlockingQueue<>();
		Collection<String> collection16 = new PriorityQueue<>();
		Collection<String> collection19 = new Stack<>();
		Collection<String> collection20 = new SynchronousQueue<>();
		Collection<String> collection21 = new TreeSet<>();

		// BlockingDeque Interface
		BlockingDeque<String> collection1 = new LinkedBlockingDeque<String>();

		// BlockingQueue Interface
		BlockingQueue<String> collection2 = new ArrayBlockingQueue<String>(6);
		BlockingQueue<String> collection3 = new DelayQueue();
		BlockingQueue<String> collection4 = new LinkedBlockingDeque<>();
		BlockingQueue<String> collection5 = new LinkedBlockingQueue<>();
		BlockingQueue<String> collection6 = new LinkedTransferQueue<>();
		BlockingQueue<String> collection7 = new PriorityBlockingQueue<>();
		BlockingQueue<String> collection8 = new SynchronousQueue<>();

		// Deque Interface
		Deque<String> collection22 = new ArrayDeque<>();
		Deque<String> collection23 = new ConcurrentLinkedDeque<>();
		Deque<String> collection24 = new LinkedBlockingDeque<>();
		Deque<String> collection25 = new LinkedList<>();

		// List Interface
		List<String> collection26 = new ArrayList<>();
		List<String> collection28 = new CopyOnWriteArrayList<>();
		List<String> collection29 = new LinkedList<>();
		List<String> collection30 = new Stack<>();
		List<String> collection31 = new Vector<>();

		// NavigableSet Interface
		NavigableSet<String> collection32 = new ConcurrentSkipListSet<>();
		NavigableSet<String> collection33 = new TreeSet<>();

		// Queue Interface
		Queue<String> collection34 = new ArrayBlockingQueue<>(4);
		Queue<String> collection35 = new ArrayDeque<>();
		Queue<String> collection36 = new ConcurrentLinkedDeque<>();
		Queue<String> collection37 = new ConcurrentLinkedQueue<>();
		Queue<String> collection38 = new DelayQueue();
		Queue<String> collection39 = new LinkedBlockingDeque<>();
		Queue<String> collection40 = new LinkedBlockingQueue<>();
		Queue<String> collection41 = new LinkedList<>();
		Queue<String> collection42 = new LinkedTransferQueue<>();
		Queue<String> collection43 = new PriorityBlockingQueue<>();
		Queue<String> collection44 = new PriorityQueue<>();
		Queue<String> collection45 = new SynchronousQueue<>();

		// Set Interface
		Set<String> collection46 = new ConcurrentSkipListSet<>();
		Set<String> collection47 = new CopyOnWriteArraySet<>();
		Set<String> collection48 = new HashSet<>();
		Set<String> collection49 = new LinkedHashSet<>();
		Set<String> collection50 = new TreeSet<>();

		// SortedSet Interface
		SortedSet<String> collection51 = new ConcurrentSkipListSet<>();
		SortedSet<String> collection52 = new TreeSet<>();

		// TransferQueue Interface
		TransferQueue<String> collection53 = new LinkedTransferQueue<>();
	}

}
