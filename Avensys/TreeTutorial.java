package isolate3;

import java.util.PriorityQueue;
import java.util.TreeSet;

//public class TreeTutorial {
//
//	public static void main(String[] args) {
//		PriorityQueue pq = new PriorityQueue();
//		pq.add(100);
//		pq.add(50);
//		pq.add(150);
//	}
//}

//tree set
class TreeTutorial{
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(22);
		ts.add(35);
		ts.add(40);
		System.out.println(ts);
		
		System.out.println(ts.floor(25));
		System.out.println(ts.ceiling(25));
		
		System.out.println(ts.lower(25));
		System.out.println(ts.higher(25));
	}
}

//class TreeTutorial
//{
//	public static void main(String[] args)  {
//		
//		TreeSet ts = new TreeSet(); // Red - Black algorithm
//	
//		ts.add(10);
//		ts.add(20);
//		ts.add(30);
//		ts.add(40);
//		
//		System.out.println(ts.ceiling(45));
//		System.out.println(ts.floor(9));
//		System.out.println(ts.higher(40));
//		System.out.println(ts.lower(10));
//	}
//}