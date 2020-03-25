package src;

public class Lista {
	private int Tamano;
	private Nodo nd;
	double[] arreglo;

	public Lista(int Tamano) {
		this.Tamano = Tamano;
		arreglo = new double[Tamano];
	}

	public int getTamano() {
		return Tamano;
	}

	public double getValor(int i) {
		return arreglo[i];
	}

	public void setValor(int i, double valor) {
		arreglo[i] = valor;
	}

	public void Agregar(Nodo nd) {
		arreglo[nd.getIndex()] = nd.getValor();
	}

}
