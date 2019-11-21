import java.util.Scanner;
public class fatorial {
	public static void main (String args[]) {
		
		fatorar();
		
	}
	
	public static int fatorar() {
		
		Scanner ler = new Scanner (System.in);
		int n;
		System.out.println("Entre com o valor");
		n=ler.nextInt();
		
		for (int i=n-1; i>1; i--) {
		n=n*i;
		}
		
		int f = n;
		System.out.println(f);
		return f;
	}
}
