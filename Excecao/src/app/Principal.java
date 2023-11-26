package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {		
		//1 usar o scan.nextLine apenas para limpar o buffer
		//2 posso criar dois scanners, um somente para usar o nextLine e o outro para outras funçoes
		//3 usar nextLine em tudo, fazer o cast
		
		System.out.println("Informe a idade: ");
		Integer idade = Integer.getInteger(scan.nextLine());
//		scan.nextLine(); //O scanner tem um buffer, e o scan.nextLine lê o enter
		
		System.out.println("Informe o nome completo: ");
		String nome = scan.nextLine(); //ignora os espaços e procura o enter
		
		
		System.out.println();
		System.out.println("O nome é: " + nome);
		System.out.println("A idade é: " + idade);
		
		
//		System.out.println("Informe o dia mes e ano: ");
//		int dia = scan.nextInt();
//		int mes = scan.nextInt();
//		int ano = scan.nextInt();
//		System.out.println(dia + " " + mes + " " + ano);
		
	}
	public static void main1(String[] args) {
		System.out.println("Informe um valor inteiro: ");	
		try {
			Integer valor = scan.nextInt();
			return; //mandei encerrar, mas antes ele executa o finally, caso seja necessario retornar algo, fechar algo aberto etc
		}catch(InputMismatchException e) {
			System.out.println("O valor informado deve ser um inteiro");
		}finally {
			System.out.println("Fim.");
		}
		System.out.println("Fim2.");
		
	}
	public static void main2(String[] args) {
			
		Integer valor = obterValor("Informe um valor inteiro: ");
		if (valor == null) {
			System.out.println("Sua informação é invalida. Estamos encerrando o sistema. Obrigado");
			System.exit(9);
		}
		System.out.println("O valor informado foi: " + valor);
	}

	public static Integer obterValor(String mensagem){
		System.out.println(mensagem);
		
		int tentativas = 3;
		
		while(tentativas >= 1) {
			tentativas --;

			try {
				return scan.nextInt();
			} catch (InputMismatchException e) {
				//limpando a ultima informação
				scan.next();
				System.out.println("O valor informado deve ser um inteiro." 
			+ " \n Tente novamente" 
			+ " Você tem " + tentativas + " Tentativas. ");
			}
			
		}
		
		return null;
	}
}
