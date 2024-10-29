package Atividades_Aula2;

import java.util.Scanner;

public class Atividade_4 {
	
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);

        
        System.out.print("Informe a primeira característica: ");
        String caracteristica1 = leia.nextLine();
        
        System.out.print("Informe a segunda característica: ");
        String caracteristica2 = leia.nextLine();
        
        System.out.print("Informe a terceira característica: ");
        String caracteristica3 = leia.nextLine();

        
        String animal = "";

        if (caracteristica1.equalsIgnoreCase("vertebrado")) {
            if (caracteristica2.equalsIgnoreCase("mamífero")) {
                if (caracteristica3.equalsIgnoreCase("onívoro")) {
                    animal = "Homem";
                } else if (caracteristica3.equalsIgnoreCase("herbívoro")) {
                    animal = "Vaca";
                }
            } else if (caracteristica2.equalsIgnoreCase("ave")) {
                if (caracteristica3.equalsIgnoreCase("carnívoro")) {
                    animal = "Águia";
                } else if (caracteristica3.equalsIgnoreCase("onívoro")) {
                    animal = "Pomba";
                }
            }
        } else if (caracteristica1.equalsIgnoreCase("invertebrado")) {
            if (caracteristica2.equalsIgnoreCase("inseto")) {
                if (caracteristica3.equalsIgnoreCase("hematófago")) {
                    animal = "Pulga";
                } else if (caracteristica3.equalsIgnoreCase("herbívoro")) {
                    animal = "Lagarta";
                }
            } else if (caracteristica2.equalsIgnoreCase("anelídeo")) {
                if (caracteristica3.equalsIgnoreCase("hematófago")) {
                    animal = "Sanguessuga";
                } else if (caracteristica3.equalsIgnoreCase("onívoro")) {
                    animal = "Minhoca";
                }
            }
        }

        
        if (!animal.isEmpty()) {
            System.out.println("O animal é: " + animal);
        } else {
            System.out.println("Características não reconhecidas.");
        }

        leia.close();
	}

}
