import java.util.Scanner;
public class Exercicio5 {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		int a[], i, tam=5, j;
		
		a = new int [tam];
		
		for (i=0; i<tam; i++) {
			System.out.println("Entre com os valores");
			a[i] = ler.nextInt();
		}
		for (i=0; i<tam; i++) {
			System.out.println("Elemento: "+a[i]+". Seus divisores são: ");
			for (j=1; j<=a[i]; j++) {
				if (a[i]%j==0) {
					System.out.println(j);
				}
			}
		}
	}

}
