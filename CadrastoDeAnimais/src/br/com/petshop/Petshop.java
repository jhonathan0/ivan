package br.com.petshop;

import java.util.ArrayList;
import java.util.Scanner;

public class Petshop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Animal> animais = new ArrayList<>();
		int opcao;
		
		do {
			System.out.println("\n=== MENU ===");
			System.out.println("1 - Cadrastrar Cachorro");
			System.out.println("2 - Cadrastar Gato");
			System.out.println("3 - Exibir Animais");
			System.out.println("4 - Sair");
			System.out.println("Escolha uma opção");
			opcao = scaner.nextLine();
			
			switch(opcao) {
			
			case 1:
			System.out.println("Nome do Cachrro");
			String nomeCachorro = scanner .nextLine();
			System.out.println("Idade do Cachorro");
			int idadeCachorro = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Raça do Cachorro");
			String raca = scanner.nextLine();
			animais.add(new Cachorro(nomeCachorro, idadeCachorro, raca));
			System.out.println("Cachorro cadrasto com sucesso");
			break;
			
			case 2:
				System.out.println("Nome do Gato");
				String nomeGato = scanner .nextLine();
				System.out.println("Idade do Gato");
				int idadeGato = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Raça do Gato");
				String corPelo = scanner.nextLine();
				animais.add(new Gato(nomeGAto, idadeGato, raca));
				System.out.println("Gato cadrasto com sucesso");
				break;
				
			
			}
		}
		

	}

}
