import java.util.*;
public class MatrizAleatorio {
	public static void main (String args[]) {
		int v[][], j, i, maiorNm=0, menorNm=0, linhaM=0, colunaM=0, colunam=0, linham=0;
		
		v = new int [3][3];
		
		for (i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				v[i][j]= (int) (Math.random()*10);
			}
		}
		
		for (i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.print("[ "+v[i] [j]+" ]");
				if(j==2) {
					System.out.print("\n");
			}
		}	
	}
		for (i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				if (v[i][j]>maiorNm) {
					maiorNm=v[i][j];
					linhaM = i;
					colunaM = j;		
				}else if (v[i][j]<maiorNm) {
					menorNm= v[i][j];
					linham=i;
					colunam=j;
				}
			}
		}
		System.out.println("Maior valor:"+maiorNm+". Localizado na linha:"+(linhaM+1)+","
				+ " coluna"+(colunaM+1));
		System.out.println("Menor valor:"+menorNm+". Localizado na linha:"+(linham+1)+","
				+ " coluna"+(colunam+1));
}}
