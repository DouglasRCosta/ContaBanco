package com.banco.terminal;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public ContaTerminal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		int numeroConta = 0;
		String agenciaConta;
		String nomeCliente;
		float saldoCliente = 333.54f;
		boolean validacaoLoop = true;
		System.out.println("Seja, bem vindo");
		while (validacaoLoop) {
			try {
				System.out.println("Por favor, digite o número da Conta:");
				numeroConta = scanner.nextInt();
				validacaoLoop = false;
			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida! Por favor, digite um número.");
				continue;
			}
		}

		System.out.println("Por favor, digite o número da Agência !");
		agenciaConta = scanner.next();
		System.out.println("Por favor, digite o seu Nome !");
		nomeCliente = scanner.next();
		System.out.println(String.format(
				"Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
				nomeCliente, agenciaConta, numeroConta, saldoCliente));

	}

}
