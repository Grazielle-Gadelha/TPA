import java.util.Scanner;
public class palindromosEx12 {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
		int a[], i, tam=5, j=5;
		
		a = new int [tam];
		
		for (i=0; i<tam; i++) {
			System.out.println("Digite o primeiro "+(i+1)+"° valor");
			a[i]= ler.nextInt();
		}
		for (i=0; i<tam; i++) {
			while (i!=j) {
			if (a[i]==a[j]) {
				
			}else {
				System.out.println("O vetor não é palíndromo");
			}
		}i++; j--;
	}
	
}}
