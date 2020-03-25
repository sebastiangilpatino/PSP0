import org.junit.Test;

import junit.framework.TestCase;

public class TestCalculos extends TestCase {

	private Calculos calculos;
	private Lista l1;
	double[] arreglo2 = { 186, 699, 132, 272, 291, 331, 199, 1890, 788, 1601 };

	void inicializar() {

		l1 = new Lista(arreglo2.length);

		for (int i = 0; i < arreglo2.length; i++) {
			l1.arreglo[i] = arreglo2[i];
		}

		calculos = new Calculos(l1);
	}

	@Test
	public void testCalcularMedia() {
		inicializar();
		double resultadoObservado = calculos.CalcularMedia();
		double resultadoEsperado = 638.9d;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void testCalcularDesviacion() {
		inicializar();
		double resultadoObservado = calculos.CalcularDesviacion(calculos.CalcularMedia());
		double resultadoEsperado = 625.633d;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

}
