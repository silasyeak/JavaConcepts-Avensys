package isolate3;

import java.util.ArrayList;

//creation of ArrayList
//class ArrayListTutorial
//{
//	public static void main(String[] args)  {
//		
//		ArrayList al = new ArrayList(); // Dynamic Array
//		al.add("Siddu");
//		al.add(100);
//		al.add(3.4);
//		al.add('c');
//		System.out.println(al);// it follows insertion order
//		
//		al.add(0, "Singapore");
//		System.out.println(al);
//		System.out.println("----------------");
//		
//		ArrayList al2 = new ArrayList();
//		al2.add("James");
//		al2.add(100);
//		System.out.println(al2);
//		
//		al.addAll(al2);
//		System.out.println(al);
//		System.out.println("----------------");
//		ArrayList al3 = new ArrayList();
//		al3.add("Sabrina");
//		al3.add(89.100);
//		System.out.println(al3);
//		al.addAll(1, al3);
//		System.out.println(al);
//	}
//
//}

//class ArrayListTutorial
//{
//	public static void main(String[] args)  {
//		
//		ArrayList al = new ArrayList(); // Dynamic Array
//		al.add("Siddu");
//		al.add(100);
//		al.add(3.4);
//		al.add('c');
//		System.out.println(al);// it follows insertion order
//		
//		al.remove("Siddu");
//		System.out.println(al);
//		
//		al.remove(0);
//		System.out.println(al);
//		
//		ArrayList al2 = new ArrayList();
//		al2.add("Silas");
//		al2.add(45.56);
//		
//		al.addAll(al2);
//		System.out.println("al, adding all of al2:	  " + al);
//		
//		al.removeAll(al2);
//		System.out.println("al, removing all of al 2: " + al);
//		
//		al.clear();
//		System.out.println(al);
//	}
//
//}



//class ArrayListTutorial
//{
//	public static void main(String[] args)  {
//		
//		ArrayList al = new ArrayList(20); // Dynamic Array // capacity
//		System.out.println(al.isEmpty());
//		System.out.println(al.size());// 0
//		al.ensureCapacity(5);
//		al.add("Siddu");
//		al.add(1000);
//		al.add(3.4);
//		al.add('c');
//		al.add(34);
//		al.add('E');
//		al.add('E');
//		al.add('E');
//		al.add('E'); // duplicates are allowed
//		System.out.println(al.size()); // 9
//		System.out.println(al);// it follows insertion order
//		
//		ArrayList al2 = new ArrayList();
//		al2.add("Siddu");
//		al2.add(1000);
//		
//		al.retainAll(al2);
//		System.out.println(al);
//		System.out.println(al.isEmpty());
//	}
//
//}



import java.util.ArrayDeque;
//Array Deque
class ArrayListTutorial
{
	public static void main(String[] args)  {
		
		ArrayDeque ad = new ArrayDeque();// Dynamic Array
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.addFirst(100);
		ad.addLast(200);
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
		System.out.println(ad);
	}
}











