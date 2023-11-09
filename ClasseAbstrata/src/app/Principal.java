package app;

import modelo.Pessoa;
import modelo.PessoaFisica;
import modelo.PessoaJuridica;

public class Principal {
	public static void main(String[] args) {
		// a classe abstrata nao pode ser instanciada, nao podendo usar o comando NEW nessa classe
		// Pessoa p = new Pessoa(); -- nao é possivel fazer assim
		// Veiculo v = new Carro();
		// para saber se o veiculo é um tipo de carro se usa o instanceof****
		// public abstract class Veiculo{
		// a classe abstrata é usada na herança
		
		// --- Metodos Abstratos ---
		// a assinatura do metodo é ate a definição dos parametros
		// nao possui corpo (apos a chave)
		// public abstract void acelerar();
		// se tiver um metodo abstrato a classe deve ser abstrata
		// a classe abstrata pode conter metodos com corpo (concretos) e abstratos
		// nao existe metodos abstratos privados em java(se for privado como vou sobreescrever)
		// pode ser com protected
		// nao existe atributos abstratos em java
		
		
		
		
		
		
		
		
		//Pessoa p = new Pessoa();
		//p.setNome("Leandra");
		
		//Pessoa p1 = new PessoaFisica();
		//imprimir(new PessoaFisica());
		//imprimir(new PessoaJuridica());
		
		PessoaFisica p = new PessoaFisica();
		p.setNome("Leandra");
		p.setCpf("1111111");
		p.imprimir();
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.setNome("Janio");
		pj.setCnpj("22222");
		pj.imprimir();
		
		imprimir(p);
	}
	
	public static void imprimir (Pessoa p) {
		//com o abstract na classe Pessoa eu nao preciso colocar o instanceof
		
		//if(p instanceof PessoaFisica) {   
			//((PessoaFisica)p).imprimir();
		//}
		
		//if (p instanceof PessoaJuridica) {
			//((PessoaJuridica)p).imprimir();
		//}
		
		p.imprimir();
	}

}
