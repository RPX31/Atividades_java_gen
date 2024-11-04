package aulahoje;

import java.util.HashMap;
public class Hoje {
	
	public static void main(String[] args) {
		HashMap<Integer, String> produtos = new HashMap<Integer, String> ();
		
		produtos.put(70, "carro" );
		produtos.put(20, "moto");
		
		
		
		for(Integer key : produtos.keySet()) {
			System.out.println("chave"+ key + "valor:"  +  produtos.get(key));
			
		}
		for(String value : produtos.values()) {
			System.out.println("valor:"+ value);
		}
	
	}

}
