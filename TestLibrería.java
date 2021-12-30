package Retoexterno3;

import java.util.ArrayList;

public class TestLibrería {

	public static void main(String[] args) {
		Librería lib= new Librería();
		ArrayList<Integer > list= new ArrayList<Integer >();
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(2);
		list.add(2);
		list.add(1);
		list.add(1);
		list.add(9);
	
		ArrayList<Integer > ll=lib.portafolio(list);

		
		ArrayList<Integer > list2= new ArrayList<Integer >();	
		list2.add(0);
		list2.add(2);
		list2.add(4);
		list2.add(7);
		
	lib.portafolio(list);
		
		ArrayList<Integer > l=	lib.agotadoPara(list2, list,5);
		System.out.println(l);


	ArrayList<Integer > list3= new ArrayList<Integer >();	
	
	list3.add(3);
	list3.add(5);
	list3.add(7);
	list3.add(10);
	list3.add(9);
	list3.add(8);
	list3.add(9);
	
	
	ArrayList<Integer > llI=lib.deInteres(list3, list);
	
	System.out.println (llI);
	
	System.out.println(list);
	System.out.println(list3);
	System.out.println("**");
	int a=lib.posiblesIntercambios(list3, list);
	System.out.println(a);


	
	
	
	
	
}
	
}