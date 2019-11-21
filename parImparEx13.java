import java.util.Scanner;
public class parImparEx13 {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int a[], b[], tam=3, i;
		
		a = new int [tam];
		b = new int [tam];
		
		for (i=0; i<tam; i++) {
			System.out.println("Digite o "+(i+1)+"° valor de A");
			a[i]= ler.nextInt();
		}
		for (i=0; i<tam; i++) {
			if (a[i]%2==0) {
				b[i]=1;
			}else if (a[i]%2!=0) {
				b[i]=0;
			}
		}
		for (i=0; i<tam; i++) {
			System.out.println(b[i]);
		}
	}
}
