package formadepagamento;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in); 
		
		int Avista;
		int Prazo;
		int Parcelado;
		int Produto;
		
		System.out.println("valor do produto");
		Produto = teclado.nextInt();
		System.out.println("qual é a forma de pagamento ?");
		System.out.println("1 Avista");
		System.out.println("2 A Prazo");
		System.out.println("3 Parcelado");
		Avista = teclado.nextInt();
		Prazo = teclado.nextInt();
		Parcelado = teclado.nextInt();
		
		Avista = Produto - 0.2;
		Prazo = Produto +  0.05;
		Parcelado = Produto/Parcelado  ;
				
		switch (Produto) {
		case 1:
			System.out.printf("O valor do desconto a  Avista é :",Produto - Avista);
			break;
		case 2:
			System.out.printf("O valor do Produto  a Prazo é:",Produto + Prazo);
			break;
		case 3:
			System.out.printf("O valor do Produto Parcelado é", Produto + Parcelado);
			break;
		teclado.close();
		}
	}

}
