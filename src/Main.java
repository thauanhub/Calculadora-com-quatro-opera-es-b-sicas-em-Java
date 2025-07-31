import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		long num1, num2, resultado = 0;
		int  escolha = 0;
		char operator = ' ';
		Scanner in = new Scanner(System.in);
		
		
		while(escolha != 5) {
			System.out.println("======= Calculadora em Java =======");
			System.out.println("======= Escolha a operação =======");
			System.out.println("1. Soma.");
			System.out.println("2. Subtração.");
			System.out.println("3. Multiplicação.");
			System.out.println("4. Divisão.");
			System.out.println("5. Sair.");
			
			escolha = in.nextInt();
			
			if(escolha < 1 || escolha > 5) {
				System.out.println("Digite um valor válido!");
				continue;
			}
			
			if(escolha == 5) {
				System.out.println("Obrigado por utilizar a calculadora em Java!");
				return;
			}
			
			System.out.println("Digite dois números: ");
			
			num1 = in.nextLong();
			num2 = in.nextLong();
			
			switch(escolha) {
				case 1:
					resultado = num1 + num2;
					operator = '+';
					break;
					
				case 2:
					resultado = num1 - num2;
					operator = '-';
					break;
					
				case 3:
					resultado = num1 * num2;
					operator = '*';
					break;
					
				case 4:
					resultado = num1/num2;
					operator = '/';
					break;
			}
			
			
			System.out.println(num1 + " " + operator + " " + num2 + " = " + resultado );
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
		}	
	}
}
