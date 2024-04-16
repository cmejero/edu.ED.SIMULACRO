package servicios;

import java.util.Scanner;

public class menuImplementacion implements menuInterfaz{

	public int menuYSeleccion(Scanner sc) {
		int opcionUsuario;
		System.out.println("##########################");
		System.out.println("0. Cerrar Aplicacion ");
		System.out.println("1. Introducir pasajero");
		System.out.println("2. Acceder puerto");
		System.out.println("##########################");
		
		opcionUsuario = sc.nextInt();
		return opcionUsuario;
	}
}
