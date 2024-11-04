package aulahoje;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class fila {
	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<Integer>();
		
		for (int i = 0 ; i <=10; i++) {
			
			fila.add(i);
			
		}
	System.out.println("elemento da fila " + fila);
	System.out.println("elemento da fila " + fila.remove(2));
	System.out.println("elemento da fila " + fila);
	
	Iterator<Integer> iterator = fila.iterator();
	
    while (iterator.hasNext()) {
        System.out.println("Elemento atual: " + iterator.next());
	}
	}
	
	
}
