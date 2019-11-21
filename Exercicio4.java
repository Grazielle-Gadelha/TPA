import java.util.Scanner;
public class Exercicio4 {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		int a[], i, tam=10, j;
		
		a = new int [tam];
		
		
		for (i=0; i<tam; i++) {
			System.out.println("Entre com os valores");
			a[i] = ler.nextInt();
		}
		for (i=0; i<tam; i++) {
			System.out.println("Elemento: "+a[i]+". Numeros pares até ele: ");
			
			for (j=0; j<a[i]; j=j+2 ) {
				System.out.println (j);
			}
		}
	}

}
