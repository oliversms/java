package familia58;

public class Animal {

	private String nome;
	private int idade;
	private boolean emiteSom;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Boolean getEmiteSom() {
		return emiteSom;
	}

	public void setEmiteSom(Boolean emiteSom) {
		this.emiteSom = emiteSom;
	}
	
	public void emitirSom() {
		System.out.println("\nAUauauauaua");
	}
	
}
