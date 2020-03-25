package src;

public class Calculos {

	private Lista _lista;
	double suma_datos, media, deviation;

	public Calculos(Lista l1) {
		_lista = l1;
	}

	public double CalcularMedia() {
		for (int i = 0; i < _lista.getTamano(); i++) {
			media += _lista.getValor(i);
		}
		media = media / _lista.getTamano();
		return media;
	}

	public double CalcularDesviacion(double _media) {
		for (int i = 0; i < _lista.getTamano(); i++) {
			deviation += Math.pow(_lista.getValor(i) - _media, 2);
		}
		deviation = Math.sqrt(deviation / (_lista.getTamano() - 1));
		return deviation;

	}

}
