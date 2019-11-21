import java.util.*;
public class exercicio4 {
	public static void main (String[] args) {
		Scanner ler =new Scanner (System.in); 
		int tb[][] = new int[4][4];
		int tbB[][] = new int [4][4];
		int usuariov[][] = new int [4][4]; 
		int i,j,k=0, valor=0,l=0,cp=0, cr=0;
		
		while(k<2) {
			for(j=0;j<8;j++) {
				for(i=0;i<8;i++) {
					valor = new Random().nextInt(75) + 1;
					tb[j][i]= valor;
				}
			}
			for(j=0;j<8;j++) {
				for(i=0;i<8;i++) {
					tbB[j][i]=tb[j][i];
				}
			}
	
			for(j=0;j<8;j++) {
				for(int m=0;m<5;m++) {	
					for(i=0;i<5;i++) {
						if(tbB[j][m]==tb[j][i]) {
							tb[j][i]=valor = new Random().nextInt(100) + 1;
						}
					}
				}
			}
			for(j=0;j<2;j++) {
				for(i=0;i<2;i++) {
					System.out.println("Digite o número desejado:");
					usuariov[j][i] = ler.nextInt();
					cr++;
					
					if(tb[j][i]==usuariov[j][i]) {
						System.out.println("Acertou! Muito bom! ");
						cp++;
					}
					if(cp==16){
						i=3;
						j=3;
					}
					else { 
						System.out.println("Você errou!");
					}
				}
				j=0;
				i=0;
			}
			
			
			System.out.println("Bingo! Foram um total de "+cr+" rodadas");
			System.out.println("Os números eram:");

			for(j=0;j<8;j++) {
				for(i=0;i<8;i++) {
					System.out.print(tb[j][i]+" ");
					if(i==7) {
						System.out.print("\n");
					}
				}
			}
				System.out.println("Deseja jogar novamente?\n 1-Sim 0-Não");
				l=ler.nextInt();
			
				if(l==1) {
					k=0;
				}
				else {
					System.exit(0);
				}
		
		}
		}
	}
