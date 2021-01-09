package javaPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(45);
        al.add(50);
        al.add(45);
        al.add(null);
        Iterator itr=al.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
	}

}
