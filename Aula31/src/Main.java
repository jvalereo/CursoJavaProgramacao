

public class Main {

	public static void main(String[] args) {
		// Curso Udemy - Aula31 fun��es matematica , tipos primitivos double
		//Jonas Valereo - T�cnico em Inform�tica 
		
		//declarando as variavies tipo double 
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C; 
		
		//declarando as raizes da equa��o
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		//imprimir saida de dados no console, concatena��o
		
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25  = " + C);
		
		//declarando as raizes da equa��o
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		//imprimir saida de dados no console, concatena��o
		
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + A);
		System.out.println("5 elevado ao quadrado = " + C);
		
		//declarando as raizes da equa��o
		
		A = Math.abs(y);
		B = Math.abs(z);
		
		//imprimir saida de dados no console, concatena��o
		
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " +  B);
		
		// saida da aplica��o na class system exit
		
		System.exit(0);
		
		//fim do programa
	}

}
