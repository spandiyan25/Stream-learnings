package com.methodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IListImpl {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(25);list.add(12);list.add(15);list.add(237);list.add(6);list.add(9);list.add(1);list.add(55);
		System.out.println("before" + " "+ list);
		
		IList iList = Collections::sort;
		iList.printList(list);
		System.out.println("After" + " "+ list);

	}

}
