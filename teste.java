package exercicios;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Escreva o primeiro número: ");
		int numero1 = in.nextInt();
		System.out.println("Escreva o segundo número: ");
		int numero2 = in.nextInt();
		System.out.println("Escreva o terceiro número: ");
		int numero3 = in.nextInt();
		System.out.println("Escreva o quarto número: ");
		int numero4 = in.nextInt();
		int soma = numero1 + numero2 + numero3 + numero4;
		System.out.println("A soma é: " + soma);
		in.close();
	}

}