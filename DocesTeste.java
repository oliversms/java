package familia58;

public class DocesTeste {

	public static void main(String[] args) {
		
		Doces Bolos = new Doces ("Chocolate","pasta americana, glacê,chantili,cobertura simples",20-40,50-80);
		Doces Docinhos= new Doces ("Brigadeiro,casadinho,moranguinho","tradicional,finos",10-20, 70-100);
		
		System.out.println("\n\nQual bolo: ");
		Bolos.imprimirDados();
		System.out.println("\n\nQual docinho: ");
		Docinhos.imprimirDados();
		System.out.println("\n\nQual você prefere? ");
	}
}
