import java.util.Scanner;
public class Exercicio13 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int a[], b[], tam=5, i;
		
		a = new int [tam];
		b = new int [tam];
		
		for (i=0; i<tam; i++) {
			System.out.println("Entre com o valor");
			a[i]= ler.nextInt();
		}
		for (i=0; i<tam; i++) {
			if (a[i]%2==0) {
				b[i]=1;
			}else {
				b[i]=0;
			}
		}
		for (i=0; i<tam; i++) {
			System.out.println(b[i]);
		}
	}
}
