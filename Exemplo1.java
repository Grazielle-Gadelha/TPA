import java.util.Scanner;
public class Exemplo1 {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
		int v [][] = new int [3][3];
		int j, i;
		
		for (i=0; i<3; i++) {
			for (j=0; j<3; j++) {
				System.out.println("Entre com ["+(i+1)+"] ["+(j+1)+"] :");
				v [i][j] = ler.nextInt();
			}
		}
		System.out.println ("Valores da Matriz :\n\n");
		for (i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.print(" ["+v[i][j]+"] ");
				if(j==2) {
					System.out.print("\n");
				}
			}
		}
	}
}
