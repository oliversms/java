package familia58;

public class Cachorro extends Animal {

		private boolean deveCorrer;

		public boolean isDeveCorrer() {
			return deveCorrer;
		}

		public void setDeveCorrer(boolean deveCorrer) {
			this.deveCorrer = deveCorrer;
		}
		
		public void emitirSom() {
			System.out.println("\nAUAUAUAUAUAU");
		}
	
}
