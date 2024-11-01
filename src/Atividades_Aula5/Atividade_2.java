package Atividades_Aula5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Atividade_2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Set<Integer> numerosSet = new HashSet<>();
        List<Integer> numerosLista = new ArrayList<>();
        
        
        while (numerosLista.size() < 10) {
            System.out.print("Digite um número inteiro: ");
            int numero = leia.nextInt();
            
            
            numerosLista.add(numero);
            
            
            numerosSet.add(numero);
        }
        
       
        System.out.println("\nListar dados do Set (números únicos):");
        Iterator<Integer> iterator = numerosSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        
        
        leia.close();
    }
}

