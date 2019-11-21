import java.util.Scanner;
public class Exercicio10 {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		int a[], b[], c[], i, tam=3, posC=0, j=0, k=0;
		
		a = new int [tam];
		b = new int [tam];
		c = new int [tam];
		
		for (i=0; i<tam; i++) {
			System.out.println("Digite o " +(i+1)+ "° valor de A");
			a[i]=ler.nextInt();
		}
		for (i=0; i<tam; i++) {
			System.out.println("Digite o "+(i+1)+ "° valor de B");
			b[i]=ler.nextInt();
		}
		for (i=0; i<tam; i++) {
			for (j=0; j<tam; j++) {
				if (a[i]!=b[j]) {
					posC++;
				}
			}
			
			
		}
		for (i=0; i<posC; i++) {
			System.out.println(c[i]);
		}
	}
}
