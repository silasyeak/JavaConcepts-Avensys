package isolate3;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLinkedListPrac {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ArrayList al = new ArrayList();
		
		al.add("ice spice");
		al.add("but I don't");
		al.add("eat enough");
		al.add("without you");
		System.out.println("Array List: " + al);
		ll.add("xloqmna");
		ll.add("behave");
		ll.add(1234);
		ll.add("something extra");
		System.out.println("Linked List: " + ll);
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Popping from LL to AL:");
		al.add(ll.pop());
		System.out.println("popped off the first element"); 
		System.out.println(ll + " gave it to al \n-->" + al + " \nit shows up at the end of the ArrayList");
		System.out.println("---------------------------------------------------------------------------");
		
		System.out.println("showing the list from memory 0 to 2, works for both AL and LL:");
		System.out.println("al: "+ al);
		System.out.println("al: "+ al.subList(0, 2));
		System.out.println("ll: " + ll);
		System.out.println("ll: " + ll.subList(0, 2));
		
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("setting replacements");
		System.out.println("al: "+ al);
		al.set(1, "replacement");
		System.out.println("al: "+ al);
		System.out.println("ll: " + ll);
		ll.set(1, "replacement");
		System.out.println("ll: " + ll);
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("does al contain ice spice?:");
		System.out.println(al.contains("ice spice"));
		System.out.println("does ll contain replacement?:");
		System.out.println(ll.contains("replacement"));
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("index of element 'without you' in ArrayList: ");
		System.out.println(al.indexOf("without you"));
		System.out.println("if it isn't in the ArrayList, it will return -1");
		System.out.println(al.indexOf("will return -1"));
		System.out.println("index of 'replacement' in LinkedList");
		System.out.println(ll.indexOf("replacement"));
	}

}
 