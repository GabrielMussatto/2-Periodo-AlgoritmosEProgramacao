package app;

import java.util.Scanner;

import modelo.Cor;
import modelo.Telefone;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Telefone telefone = new Telefone();
		
		System.out.println("Informe o id: ");
		telefone.setId(scan.nextInt());
		
		System.out.println("Informe o nome: ");
		telefone.setNome(scan.next());
		
		System.out.println("Selecione uma das opções de cores: ");
		for (Cor cor : Cor.values()) {
			System.out.println(cor.getId() + " - " + cor.getDescricao());
		}
		
//		int corSelecionada = scan.nextInt();
//		
//		for (Cor cor : Cor.values()) {
//			if(cor.getId() == corSelecionada) {
//				telefone.setCor(cor);
//				
//			}
//		}
		
		telefone.setCor(Cor.valueOf(scan.nextInt()));
		
		
		//imprimindo dados do telefone
		System.out.println(telefone);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Telefone telefone = new Telefone();
//		
//		int a = Telefone.AZUL;
//		
//		Cor cor = Cor.BRANCA;
//		caixa alta é uma constante
//		
//		System.out.println(cor);
//		System.out.println(Cor.BRANCA);
//		
//		
//		System.out.println(cor.name());
//		System.out.println(cor.ordinal());
		
//		for (Cor c : Cor.values()) {
//			System.out.println(c);
//		}
//		
//		Cor cor = Cor.BRANCA;
//		
//		System.out.println(cor);
//		System.out.println(cor.getId());
//		System.out.println(cor.getDescricao());
//		System.out.println(cor.ordinal());
	}

}
