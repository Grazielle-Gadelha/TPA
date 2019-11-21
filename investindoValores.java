import java.util.Scanner;
public class investindoValores {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		double renda = 0;
		int meses = 0;
		System.out.printf("Insira o valor investido: "+" \n");
		renda = ler.nextDouble();
		System.out.printf("Insira a quantidade de meses: "+" \n");
		meses = ler.nextInt();
		for(int i = 1; i<=meses; i++) {
			System.out.println("No "+i+" mês(es) você tera uma renda de: "+calculo(renda,meses));
		}
	}
	public static double calculo (double vInvestido, int meses) {
		double total = vInvestido;
		for(int i=1; i<=meses; i++) {
			total +=vInvestido*0.01;
		}
		return total;
	}
}
