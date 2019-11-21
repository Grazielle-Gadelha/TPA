import java.util.Scanner;
public class Exercicio1 {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		int a[], b[],tam=20, i, posicao=0;
		a=new int [tam];
		b=new int [tam];
		
		for (i=0; i<tam; i++) {
			System.out.println("Digite o "+(i+1)+"° numero");
			a[i]=ler.nextInt();
			if (a[i]%2==0) {
				b[posicao]=a[i];
				posicao++;
			}
					
		}
		
		for (i=0; i<tam; i++) {
			if (a[i]%2!=0) {
				b[posicao]=a[i];
				posicao++;
			}
		}
		
		for (i=0; i<tam; i++) {
			System.out.println(b[i]);
		}
	}

}
