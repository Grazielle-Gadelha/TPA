import java.util.Scanner;
public class Exercicio2 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int a[], i, j, tam=5;
		
		a=new int [tam];
		
		for (i=0; i<tam; i++) {
			System.out.println("Digite o "+(i+1)+"° valor");
			a[i]=ler.nextInt();
		}				
		
		for (i=0; i<tam; i++) {
			System.out.println("Tabuada do "+a[i]);
			for(j=1; j<=10; j++) {
				System.out.println(a[i]*j);
			}
		}
		
}}
