package familia58;

public class ExercicioAnimal {

	public static void main(String[] args) {
		
		Cavalo cavalo = new Cavalo();
		Cachorro cachorro = new Cachorro();
		Preguica preguica = new Preguica();
		
		cavalo.isDeveCorrer();
		cachorro.isDeveCorrer();
		preguica.isDeveSubirEmArvore();
		cavalo.emitirSom();
		cachorro.emitirSom();
		preguica.emitirSom();
		
	}

}
