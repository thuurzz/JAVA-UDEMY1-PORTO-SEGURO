package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// Troca a localização pra usar . não , no input
		Locale.setDefault(Locale.US);
		// Instancua o scanner
		Scanner sc = new Scanner(System.in);
		// Lê largura
		double largura = sc.nextDouble();
		// Lê comprimento
		double comprimento = sc.nextDouble();
		// Calcula área
		double area = largura * comprimento;
		// Lê o valor do metro quadrado do terreno
		double valorMetroQuadrado = sc.nextDouble();
		// Calcula valor do terreno
		double preco = area * valorMetroQuadrado;
		// Exibe informações
		System.out.printf("Área: %.2f\n", area);
		System.out.printf("Preço: %.2f", preco);
		sc.close();
	}

}
