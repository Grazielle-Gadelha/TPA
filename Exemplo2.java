import java.util.Random;
public class Exemplo2 {
	public static void main (String args[]) {
		int v[][] = new int [3][3];
		int i,j;
		Random x = new Random ();
		for (i=0; i<3; i++) {
			for(j=0;j<3;j++) {
				v[i][j] = x.nextInt()%10;
			}
		}
		for(i=0; i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print("[ "+v[i] [j]+" ]");
				if(j==2) {
					System.out.print("\n");
				}
			}
		}
	}

}

