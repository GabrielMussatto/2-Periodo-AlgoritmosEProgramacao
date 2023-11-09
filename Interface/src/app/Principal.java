package app;

import modelo.InterRadio;
import modelo.Radio;

public class Principal {

	public static void main(String[] args) {
		//NÃO É INTERFACE VISUAL
		//É utilizada para definir o comportamento de uma classe
		//a classe implementada de uma interface deve disponibilizar 
			//(obrigatoriamente) todo metodo definido pela interface
		//Palavra chave: "implements"
		// nao tenho relacionamento de herança
		// todo metodo sem corpo na interface é um metodo abstrato, pois nao tem corpo
		// nao consigo instanciar uma interface
		// nao pode ser protected pois nao é uma herança, logo nao posso usar coisas de herança
		// todo metodo vai ser publico e abstrato por padrao, entao nao preciso colocar o public abstract
		
		// a interface pode conter apens metodos abstratos
		// os atributos da interface devem ser apenas static e final 
		// todas as variaveis sao do tipo final (mesmo nao escrevendo)
		// nao existe objeto da interface
		// uma classe pode implementar mais de uma interface
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		InterRadio inter = new Radio();
		inter.ligar();
		inter.desligar();
	
		exemplo(new Radio());
	
	}
	
	public static void exemplo(InterRadio i) {
		i.desligar();
	}

}
