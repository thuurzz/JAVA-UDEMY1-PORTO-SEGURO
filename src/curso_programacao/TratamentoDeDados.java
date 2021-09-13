package curso_programacao;

import java.util.Locale;

public class TratamentoDeDados {

	public static void main(String[] args) {
		String product1 = "Computador";
		String product2 = "Mesa de escritório";
		
		int age = 30;
		int code = 5165516;
		char gender = 'F';
		
		double price1 = 2100.50;
		double price2 = 650.50;
		double measure = 66.625650;
		
		System.out.println("Products:");
		System.out.printf("%s custa: %.2f BRL R$\n", product1, price1);
		System.out.printf("%s custa: %.2f BRL R$\n", product2, price2);
		System.out.println();
		
		System.out.printf("Record: %d de idade, código: %d, genêro: %s\n", age, code, gender);
		System.out.println();
		
		System.out.printf("Altura com 8 casas: %.8f\n", measure);
		System.out.printf("Altura com 2 casas: %.2f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Altura em formato americano: %.2f", measure);
		
	}

}
