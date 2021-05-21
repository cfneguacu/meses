package meses;

import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {
		
		String num[] = new String[] {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
		
		Scanner entrada = new Scanner(System.in);
		
		int escolha;
		
		do{
			
	    System.out.print(" Digite o mes -->");
			
		escolha = entrada.nextInt();
		
		if(escolha < 1 || escolha > 12) {
			
			System.out.print("mes inexistente tente novamente");
		}
			
		}while(escolha < 1 || escolha > 12);
		
		System.out.print("Mes Escolhido--> "+num[escolha-1]);
		// TODO Auto-generated method stub

	}

}
