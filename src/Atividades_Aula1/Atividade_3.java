package Atividades_Aula1;

public class Atividade_3 {

	public static void main(String[] args) {
		
		
		float salarioBruto = 2000.0f;
		float adicionalNoturno = 500.0f;
		float horasExtras = 100.0f;
		float descontos = 200.0f;
		
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos ;
		System.out.println( "o Salário liquído é de :" + salarioLiquido);

	}

}
