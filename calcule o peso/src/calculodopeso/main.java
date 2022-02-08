package calculodopeso;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner teclado = new Scanner(System.in);
		forcacentripeta for1 = new forcacentripeta();
		forcapeso for2 = new forcapeso();
		movimentoretilinio mr1 = new movimentoretilinio();
		velocidademedia vm1 = new velocidademedia();
	
		System.out.println("digite a massa :");
		for1.massa = teclado.nextLine();
		System.out.println("digite o peso:");
		for1.pesso = teclado.nextLine();
		System.out.println("digite o raio:");
		for1.raio = teclado.nextLine();
		
		System.out.println("digite a massa:");
		for2.massa = teclado.nextLine();
		System.out.println("digite o peso:");
		for2.pesso = teclado.nextLine();
		System.out.println("digite o velocidade:");
		
		mr1.velocidade = teclado.nextLine();
		System.out.println("digite o tempo:");
		mr1.tempo = teclado.nextLine();
		
		System.out.println("digite a velocidade inicial:");
		vm1.velocidadeinicial = teclado.nextLine();
		System.out.println("digite a velocidade final:");
		vm1.velicidadefinal = teclado.nextLine();
		teclado.close();
		
		System.out.printf("calculoDoPeso");
	}

}
