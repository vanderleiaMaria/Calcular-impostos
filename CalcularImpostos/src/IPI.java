
public class IPI implements Imposto {

	@Override
	public double calculaImposto(double valor) {
		// incide 5%
		if (valor < 25000) {
			valor = valor * 0.05;

			// incide 10%
		} else if (valor >= 25000) {
			// 10%
			valor = valor * 0.10;
		}

		return valor;

	}
}
