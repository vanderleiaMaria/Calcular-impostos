
public class ICMS implements Imposto {

	@Override
	public double calculaImposto(double valor) {

		// 30%
		valor = valor * 0.3;
		return valor;
	}

}
