import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		int y = 32;
		double x = 10.35784;
		System.out.println(y);
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US); // Muda o formato para US
		System.out.printf("%.4f%n", x); // o "f" chama o formato do computador
		System.out.println("Bom dia!");
		System.out.println("RESULTADO = " + x + " METROS"); // Concatenando elementros dentro do print
		System.out.printf("RESULTADO = %.2f METROS%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); // %s para texto | $f para ponto flutuante | %d para números inteiros  
		
	}

}
