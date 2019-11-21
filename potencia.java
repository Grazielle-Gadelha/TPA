import java.util.Scanner;
public class potencia {
	public static void main (String args[]) {
		potencia();
	}
	//funcao
	
	public static int potencia() {
		Scanner ler = new Scanner (System.in);
		System.out.println("Entre com expoente");
		int expo = ler.nextInt();
		System.out.println("Entre com a base");
		int base = ler.nextInt();
		int potencia = base;
		
		for (int i=1; i<expo; i++) {
			potencia = potencia*base;
		}
		System.out.println(potencia);
		return potencia;
		
	}
}
