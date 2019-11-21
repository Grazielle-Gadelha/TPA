import java.util.Scanner;
public class aposentadoria {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		aposentadoria();
	}
	//funcao
	
	public static void aposentadoria() {
		Scanner ler = new Scanner (System.in);
		String nome = new String ();
		
		System.out.println("Digite sua idade");
		int idade = ler.nextInt();
		
		System.out.println("Digite seu nome");
		nome = ler.next();
		
		int idF= idade-55;
		if(idF<0) {
			idF=idF*-1;
		}
		System.out.println("Olá, "+nome+". Faltam "+idF+" anos para que você possa se aposentar");
	}
}
