import java.util.Scanner;
public class Exercicio6 {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		int a[], tam=3, i, resul;
		a = new int [tam];
		
		for (i=0; i<tam; i++) {
			System.out.println("Digite o "+(i+1)+"° valor");
			a[i]=ler.nextInt();
			
			a[i]= (int) Math.pow(2,i);
		}
		for (i=0;i<tam; i++) {
			System.out.println(a[i]);
		}
			
	}

}
