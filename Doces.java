package familia58;

public class Doces {

	private String tipoDeDoce;
	private String decoracao;
	private int tamanho;
	private int preço;
	
public Doces (String tipo, String decoracao, int tamanho, int preço) {
		
		this.tipoDeDoce = tipo;
		this.decoracao = decoracao;
		this.tamanho = tamanho;
		this.preço = preço;
   }

public String getModelo() {
	return tipoDeDoce;
}

public void setModelo(String decoracao) {
	this.decoracao = decoracao;
}
public void setArmazenamento(int tamanho) {
	this.tamanho = tamanho;
}

public int getPreço() {
	return preço;
}

public void setPreço(int preço) {
	this.preço = preço;
}

public void imprimirDados() {
	System.out.print(tipoDeDoce+"Decração "+decoracao+", Um tamanho "+tamanho+" custando R$"+preço+" atualmente.");

   }
}