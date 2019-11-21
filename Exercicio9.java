import java.util.Scanner;
public class Exercicio9 {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int a[], b[], c[], i, tam=10, posC=0;
		
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
			if (a[i]==b[i]) {
				c[posC]=a[i];
				posC++;
			}else {
				
			}
			
		}
		for (i=0; i<posC; i++) {
			System.out.println(c[i]);
		}
	}

}
