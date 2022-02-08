package jokempo;
import java.util.Scanner;
import java.util.Random;
public class main {

	public static void Main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1-papel; 2- pedra; 3- tesoura;
		// U(1) C(2)= -1,vencedor usuario;
		// U (1)C(3)= -2,vencedor computador;
		// U (2)C(1)= 1, vencedor computador;
		// U(2)C(3)= -1,vencedor usuario;
		// U(3)C(1)= 2,vencedor usuario;
		// U(3)C(2)= 1,vencedor computador;
		
	    Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		int numeroUsuario;
		int escolhaComputador;
		
		numeroUsuario = teclado.nextInt();
		escolhaComputador = gerador.nextInt(3)+1; //gera um numero entre 1 e 3.
		
		System.out.println("jokenpo.");
		System.out.println("");
		System.out.println("1.pedra");
		System.out.println("2.papel");
		System.out.println("3.tesoura");
		System.out.println("digite a opção desejada.");
		teclado.close();
		
		switch(escolhaComputador) {
		case 1:
		System.out.printf("computador escolheu papel.");
		break;
		case 2:
			System.out.printf("computador escolheu pedra.");
			break;
		case 3:
			System.out.printf("computador escolheu tesoura.");
			break;
		}
		
		if(numeroUsuario == escolhaComputador){
			System.out.printf("Empate.");
		}else if((numeroUsuario - escolhaComputador)== -1 ||
		(numeroUsuario - escolhaComputador) == 2){
			System.out.printf("Usuario vencedor.");
		}else {
			System.out.printf("computador vencedor.");
		}
	}

}