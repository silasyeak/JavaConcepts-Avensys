package isolate3;

import java.util.HashSet;

////Hash Set [Best at searching]
//class HashSetTutorial
//{
//	public static void main(String[] args)  {
//		HashSet hs = new HashSet(); // Hashing algorithm
//		hs.add(100);
//		hs.add(150);
//		hs.add(75);
//		hs.add(50);
//		System.out.println(hs); // insertion order will not be preserved
//	}
//}


import java.util.LinkedHashSet;

//Linked Hash Set [Best at searching]
class HashSetTutorial
{
	public static void main(String[] args)  {
		LinkedHashSet hs = new LinkedHashSet(); // Hashing algorithm
		hs.add(100);
		hs.add(150);
		hs.add(75);
		hs.add(50);
		System.out.println(hs); // insertion is preserved
	}
}