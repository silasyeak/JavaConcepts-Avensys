package isolate3;

import java.util.LinkedList;

//public class LinkedListTutorial {
//		public static void main(String[] args)  {
//			
//			LinkedList ll = new LinkedList();// doubly linked list
//			ll.add(100);
//			ll.add('A');
//			ll.add("Siddu");
//			ll.add(34.7);
//			ll.add(34.7); // duplicates are allowed
//			ll.add(100000);
//			System.out.println(ll); // insertion order preserved
//			
//			ll.add(0, "Sabrina");
//			System.out.println(ll);
//			
//			LinkedList ll2 = new LinkedList();
//			ll2.add("Emmanuel");
//			ll2.add(350);
//			
//			ll.addAll(ll2);
//			System.out.println(ll);
//			
//			ll.addAll(0, ll2);
//			System.out.println(ll);
//			
//			ll.addFirst("Silas");
//			System.out.println(ll);
//			
//			ll.addLast("Rish");
//			System.out.println(ll);
//		}
//	}

public class LinkedListTutorial {
	public static void main(String[] args)  {

		LinkedList ll = new LinkedList();// doubly linked list
		ll.add(100);
		ll.add('A');
		ll.add("Siddu");
		ll.add(34.7);
		ll.add("Siddu");
		ll.add(34.7); // duplicates are allowed
		ll.add(100000);
		System.out.println(ll); // insertion order preserved

		ll.removeFirstOccurrence("Siddu");
		System.out.println(ll);

		ll.removeLastOccurrence(34.7);
		System.out.println(ll);
		//ll.remove("Siddu");
		System.out.println(ll);

		LinkedList ll2 = new LinkedList();
		ll2.add("Emmanuel");
		ll2.add(350);

		ll.addAll(ll2);
		System.out.println(ll);

		ll.removeAll(ll2);
		System.out.println(ll);

		ll.remove(0);
		System.out.println(ll);

		ll.removeFirst();
		System.out.println(ll);

		ll.removeLast();
		System.out.println(ll);

		ll.clear();
		System.out.println(ll);


	}
}