import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		//calculando imposto encima do valor de R$10000
		System.out.println("Imposto: ICMS, IPI , COFINS no valor de R$ 10000.0\n");
		ICMS icms = new ICMS();
		double icmsResul = icms.calculaImposto(10000);
		System.out.println("ICMS R$ " + (icmsResul));

		IPI ipi = new IPI();
		double ipiResul = ipi.calculaImposto(10000);
		System.out.println("IPI R$ " + ipiResul);
		
		
		COFINS cofins = new COFINS();
		double cofinsResul = cofins.calculaImposto(10000);
		System.out.println("COFINS " + cofinsResul);

		double impostoFinal = icmsResul + ipiResul + cofinsResul;
		System.out.println("\nValor Final foi de R$ "+ (impostoFinal + 10000));


	}

}
