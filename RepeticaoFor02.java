package familia58;

import java.util.Scanner;

public class RepeticaoFor02 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		int num = 10;
		int x;	
		int quantidaDePares = 0, quantidadeDeImpares = 0; 
		
		for(int i = 1; i <= 10; i++){
			System.out.println("Digite o " + i + "º número");
			num = ent.nextInt();
			if(num % 2 == 0){
				quantidaDePares++;
				System.out.println("Foram digitados " + quantidaDePares + " números pares \n");
			}			
		}	
	}
}
					
		
