package familia58;

import java.util.Scanner;

public class While04 {

	public static void main(String[] args) {
		
		int idade, genero,fp,contPc=0,contMn=0,contHa=0,contNdc=0,contPn40=0,contPc18=0,pessoas=1;
		
		Scanner leia = new Scanner(System.in);
		
		while(pessoas<=2) {
			
			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt();
			while(idade<1 || idade>120) {
				
				System.out.println("\nEntre com a sua idade novamente: ");
				idade = leia.nextInt();
			}
			System.out.println("\nEntre com o genero:\n(1)Feminino\n(2)Masculino\n(3)Não declarado ");
			genero = leia.nextInt();
			while(genero<1 || genero>3) {
				
				System.out.println("\nEntre com o genero novamente:\n(1)Feminino\n(2)Masculino\n(3)Não declarado ");
				genero = leia.nextInt();
			}
			System.out.println("\nEntre com o seu fator psicológico:\n(1)Calma\n(2)Nervosa\n(3)Agressiva ");
			fp = leia.nextInt();
			while(fp<1 || fp>3) {
				
				System.out.println("\nEntre com o seu fator psicológico novamente:\n(1)Calma\n(2)Nervosa\n(3)Agressiva ");
				fp = leia.nextInt();
			}
			
			if(fp == 1) {
				contPc++;
			}
			
			if(genero == 1 && fp == 2) {
				contMn++;
			}
			
			if(genero == 2 && fp == 3) {
				contHa++;
			}
			
			if(genero == 3 && fp == 1) {
				contNdc++;
			}
			
			if(fp == 2 && idade > 40) {
				contPn40++;
			}
			
			if(fp == 1 && idade < 18) {
				contPc18++;
			}
			
			pessoas++;
		}
		System.out.println("\nNúmero de pessoas calmas: "+contPc);
		System.out.println("\nNúmero de mulheres nervosas: "+contMn);
		System.out.println("\nNúmero de homens agressivos: "+contHa);
		System.out.println("\nNúmero de pessoas não declaradas calmas: "+contNdc);
		System.out.println("\nNúmero de pessoas nervosas com mais de 40 anos: "+contPn40);
		System.out.println("\nNúmero de pessoas calmas com menos de 18 anos: "+contPc18);

	}
		}
			
			
	
		
	
	
	
