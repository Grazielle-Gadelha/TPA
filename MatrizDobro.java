import java.util.Scanner;
public class MatrizDobro {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int v[][], j, i, dobro=2;
		
		v = new int [4][4];
		
		for (i=0; i<4; i++) {
			for (j=0; j<4; j++) {
				v[i][j]=dobro;
				dobro = dobro*2;
			}
		}
		for (i=0; i<4; i++) {
			for (j=0; j<4; j++) {
				System.out.print(" ["+v[i][j]+"] ");
				if(j==2) {
					System.out.print("\n");
			}
		}
	}
}}
