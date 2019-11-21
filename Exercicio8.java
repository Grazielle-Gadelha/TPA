import java.util.Scanner;
public class Exercicio8 {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int a[], b[], TAM=5, i, j, soma=1;
		
		a= new int [TAM];
		b= new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o valor:");
			a[i]=ler.nextInt();
		}
		for (i=0; i<TAM;i++) {
			for (j=0; j<a[i]; j++) {
				soma= soma+a[j];
				b[i]=soma;
			}
			
		}
		for (i=0; i<TAM; i++) {
			System.out.println(b[i]);
		}
	}
}
