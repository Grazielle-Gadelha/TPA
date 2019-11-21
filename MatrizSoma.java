import java.util.Random;
public class MatrizSoma {
	public static void main (String args[]) {
		int v[][], i, j, soma=0;
		v = new int [3][4];
		
		for(i=0; i<3; i++) {
			soma=0;
			for (j=0; j<4; j++) {
				if(j==3) {
					v[i][j]=soma;
				}else {
				v[i][j]=(int) (Math.random()*10);
				soma = soma+v[i][j];
			}}
		}
		System.out.println("Valores da Matriz \n \n");
		
		for (i=0; i<3; i++) {
			for(j=0; j<4; j++) {
				System.out.print("["+v[i][j]+"]");
				if(j==3) {
					System.out.print("\n");
			}	}
		}
	}

}
