package com.conta;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		System.out.println("Banco Dinheiro Fácil!\n");
		System.out.print("Por favor, digite o número da agência: ");
		numero = scanner.nextInt();
		System.out.print("\nAgora digite a agência bancária: ");
		agencia = scanner.next();
		System.out.print("\nAgora digite o nome do cliente: ");
		nomeCliente = scanner.next();
		System.out.print("\nE por fim digite o saldo: ");
		saldo = scanner.nextDouble();
		scanner.close();
		System.out.println("Olá [" + nomeCliente + "], obrigado por criar uma conta em ");
		System.out.print("nosso banco, sua agência é [" + agencia + "], conta [" + numero + "]");
		System.out.print(" e seu saldo [" + saldo + "] já está disponível para saque.");


		
	}

}
