import java.util.Scanner;
public class Exercicio14 {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int a[], b[], c[], tam=5, i;
		
		a = new int [tam];
		b = new int [tam];
		c = new int [tam];
		
		for (i=0; i<tam; i++) {
			System.out.println("Entre com o valor de A");
			a[i]= ler.nextInt();
		}
		for (i=0; i<tam; i++) {
			System.out.println("Entre com o valor B");
			b[i]= ler.nextInt();
		}
		for (i=0; i<tam; i++) {
			if (a[i]>b[i]) {
				c[i]=1;
			}else if (a[i]==b[i]) {
				c[i]=0;
			}else {
				c[i]=-1;
			}
		}
		for (i=0; i<tam; i++) {
			System.out.println(c[i]);
		}
	}
}
