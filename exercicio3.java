import java.util.Scanner;
public class exercicio3 {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int a[], tam=10, i;
		
		a = new int [tam];
		
		for (i=0; i<tam; i++) {
			System.out.println("Digite o "+(i+1)+"° numero");
			a[i]=ler.nextInt();
		}
		
		for (i=0; i<tam; i++) {
			if (a[i]%2!=0 && a[i]%3!=0) {
				System.out.println(a[i]+" é primo");
			}else {
				System.out.println(a[i]);
			}
		}
	}

}
