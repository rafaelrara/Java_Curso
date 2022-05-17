import java.util.Scanner;

import entity.Logic;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o seu nome: ");
		String nome = sc.next();
		
		System.out.print("Digite a sua idade: ");
		int idade = sc.nextInt();
		
		Logic carteira = new Logic(idade,nome);
		
		System.out.printf("Olá " + carteira.nome + ", " + carteira.carteira(idade));
		
		sc.close();

	}

}