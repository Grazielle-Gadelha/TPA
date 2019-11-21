import java.util.Scanner;
public class tabuada {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		tabuada();
	}
	
	//função
	
	public static void tabuada() {
		Scanner ler = new Scanner (System.in);
		System.out.println("Entre com o valor");
		int n = ler.nextInt();
		
		for (int i=1; i<=10; i++) {
			int r = n*i;
			System.out.println(n+"x"+i+"="+r);
		}
	}
}
