import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int datos = 0;
		double valor, media;
		String data;
		Nodo nd;
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.print("Cuantos datos desea ingresar: ");
		data = myObj.nextLine();

		if (isNumeric(data) == true) {

			datos = Integer.parseInt(data);
			Lista l1 = new Lista(datos);

			for (int i = 0; i < datos; i++) {

				System.out.print("Ingrese el valor " + i + ":  ");
				data = myObj.nextLine();

				if (isNumeric(data) == true) {

					valor = Double.parseDouble(data);
					nd = new Nodo(i, valor);
					l1.Agregar(nd);

				} else {

					System.out.print("error: " + data + " no es un numero real.");

				}

			}

			Calculos c1 = new Calculos(l1);
			media = c1.CalcularMedia();
			System.out.println("la media es:  " + media);
			System.out.println("la desviacion estandar es:  " + c1.CalcularDesviacion(media));

		} else {

			System.out.println(" error " + data + " no es un numero real ");
		}

		myObj.close();

	}

	private static boolean isNumeric(String cadena) {
		try {
			Double.parseDouble(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

}
