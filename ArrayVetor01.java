package familia58;

import java.util.Scanner;

public class ArrayVetor01 {

	public static void main(String[] args) {
		
		int[] a =  new int[6];
		int somaNumero=0,linha=0; 
		int x;
		
		a[0]=1;
		a[1]=0;
		a[2]=5;
		a[3]=-2;
		a[4]=-5;
		a[5]=7;
		
		somaNumero= a[0]+a[1]+a[5];
		
		System.out.println("\nSomatório das linhas [0],[1],[5]: "+somaNumero);
		
		a[4]=100;
				
		 for(x=0;x<6;x++) {
			 System.out.println("\nValor do Vetor A["+x+"] : "+a[x]);

		 }       		
	}
}
	
	

