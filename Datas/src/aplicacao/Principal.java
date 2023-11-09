package aplicacao;

import modelo.Pessoa;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Maria");
		pessoa.setDataNascimento(5, 9, 2023);
		
		System.out.println(pessoa.getNome() +"\n"+ pessoa.getDataNascimento());
		
		
//		LocalDateTime dataHora = LocalDateTime.now();
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy - hh:mm");
//		System.out.println(dataHora.format(formatter));
//		System.out.println(dataHora);
		
		
//		LocalTime tempo = LocalTime.now();
//		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
//		
//		System.out.println(tempo.format(formatter));
//		System.out.println(tempo);

		
		//System.out.println(LocalTime.now();); imprime a hora exata
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Informe uma data no seguinte formato: " + "ex. 01/12/2020");
//		String dataEntrada = scan.next();
//		
//		LocalDate data = LocalDate.parse(dataEntrada, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//		System.out.println(data);
		
		
		
//		LocalDate data = LocalDate.parse("2023-09-05");
//		System.out.println(data);
//		System.out.println("dia do mes: " + data.getDayOfMonth());
		

//		Scanner scan = new Scanner(System.in);
//		System.out.println("data de aniversario");
//		System.out.println("dia");
//		int dia = scan.nextInt();
//		System.out.println("mes");
//		int mes = scan.nextInt();
//		System.out.println("dia");
//		int ano = scan.nextInt();
//		
//		LocalDate data = LocalDate.of(ano, mes, dia);
//		System.out.println(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		

//		Data dataNascimento = new Data();
		
//		dataNascimento.setDia(10);
//		dataNascimento.setMes(9);
//		dataNascimento.setAno(2000);
//		//pega a data do dia atual
//		//LocalDate data = LocalDate.now();
//		
//		//setar uma nota data
//		LocalDate data = LocalDate.of(2023, 11, 20);
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//		String dataFormatada = data.format(formatter);
//		// OU
//		//String dataFormatada = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//		//adicionando dias
//		LocalDate novaData = data.plusDays(45);
//		
//		//reduzindo dias
//		LocalDate dataAntiga = data.minusMonths(5);
//		
//		System.out.println(dataFormatada);
//		System.out.println(data);
//		System.out.println(novaData);
//		System.out.println(dataAntiga);
		
	}

}
