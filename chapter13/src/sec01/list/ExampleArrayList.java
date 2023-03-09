package sec01.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleArrayList {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList<>();
		
		System.out.println(list1.size());
		list1.add(100);
		list1.add(new Integer(55));
		list1.add("ȫ�浿");
		list1.add(new Person());
		
//		System.out.println(list1.size());
//		
//		for (int i = 0; i < list1.size(); i++) {
//			System.out.println(list1.get(i));
//		}
		
		Iterator it = list1.iterator();
		while (it.hasNext()) {
			Object ob = it.next();
			System.out.println(ob);
		}
	}
}

class Person {
	
}