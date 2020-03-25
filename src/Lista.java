
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

	public double getarreglo(int i) {
		return arreglo[i];
	}

	public void Agregar(Nodo nd) {
		arreglo[nd.getIndex()] = nd.getValor();
	}

}
