package entities;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor, digite o nome da Agência !");
		String agencia = sc.nextLine();
	
	    System.out.println("Por favor, digite o número da Agência !");
	    int numero = sc.nextInt();
	    sc.nextLine();

		System.out.println("Por favor, digite o nome do Cliente !");
		String nomeCliente = sc.nextLine();
	
		System.out.println("Por favor, digite o valor de Deposito !");
		double saldo = sc.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f, já está disponível para saque.", nomeCliente, agencia, numero, saldo );
	
		sc.close();
	}
}
