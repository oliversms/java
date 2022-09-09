package familia58;

import java.util.Scanner;

public class Idade {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		String nome;
		System.out.println("Qual seu nome:");
		nome = leia.next();
		int idade;
		System.out.println("Qual a sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14) {
		System.out.println("Você é da categ oria infaltil");
		
		}else if(idade>=15 && idade<=17) {
		System.out.println("Você é da categoria Juvenil");

		}if(idade>=18 && idade<=25){
		System.out.println("Você é da categoria Adulto");
		
     	
	}


}
	
}