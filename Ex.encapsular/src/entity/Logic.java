package entity;

public class Logic {
	
	public int idade;
	public String nome;
	
	public Logic() {
	}
	
	public Logic(int idade, String nome) {
		this.idade = idade;
		this.nome = nome;
	}

	public String carteira(int idade) {
		
		if (idade < 18) {
			return "Você não pode dirigir";
		}
		else {
			return "Parabéns você já pode dirigir!";
		}
		
	}

}
