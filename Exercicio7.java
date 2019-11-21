import java.util.Scanner;
public class Exercicio7 {
	public static void main(String args []) {
		Scanner ler = new Scanner (System.in);
		int a[], b[], i, tam=5, j, posB=0;
		
		a = new int [tam];
		b = new int [tam];
		
		for (i=0; i<tam; i++) {
			System.out.println("Entre com o valor:");
			a[i] = ler.nextInt();
		}
		for (i=0; i<tam; i++) {
			b[i]=a[i];
			for (j=1; j<a[i]; j++) {
				b[posB]=b[posB]*j;
			}
			posB++;
		}
		for (i=0; i<tam; i++) {
			System.out.println (b[i]);
		}
	}
}
