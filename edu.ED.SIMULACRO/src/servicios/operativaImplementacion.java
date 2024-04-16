package servicios;

import java.time.LocalDateTime;
import java.util.Scanner;

import controladores.inicio;
import dtos.pasajeroDto;

public class operativaImplementacion {

	public void agregarPasajero(Scanner sc) {

		System.out.println("introduzca el DNI del pasajero");
		String DNIPasajero = sc.next();
		System.out.println("¿viene en coche el pasajero?: s/n");
		char vieneEnCocheChar = sc.next().charAt(0);
		System.out.println("¿el coche va a embarcar?: s/n");
		char EmbarcarElCoche = sc.next().charAt(0);
		System.out.println("¿el coche tiene mercancia?: s/n");
		char tieneMercancia = sc.next().charAt(0);

		pasajeroDto nuevoPasajero = new pasajeroDto(DNIPasajero);

		if (vieneEnCocheChar == 's') {

			nuevoPasajero.setVieneEnCoche(true);
			;
		}
		if (vieneEnCocheChar == 's') {

			nuevoPasajero.setEmbarcaElCoche(true);

			inicio.listaPasajero.add(nuevoPasajero);
		}
		if (tieneMercancia == 's') {

			nuevoPasajero.setTieneMercancia(true);

		}
		inicio.listaPasajero.add(nuevoPasajero);
	}

	public void AccesoAPuertos(Scanner sc) {

		System.out.println("Introduzca el DNI del pasajero");
		String DNI = sc.next();

		for (pasajeroDto pasajeros : inicio.listaPasajero) {

			if (pasajeros.getDNI().equals(DNI)) {

				if (pasajeros.isVieneEnCoche() == true & pasajeros.isEmbarcaElCoche() == false) {

					System.out.println("Puedes acceder a puerto SO");

					pasajeros.setZonaDestino("SO");
					pasajeros.setPrecisionSO(LocalDateTime.now());

					if (pasajeros.isTieneMercancia() == true) {

						System.out.println("Puedes acceder a puerto OE");

						pasajeros.setZonaDestino("OE");
						pasajeros.setPrecisionOE(LocalDateTime.now());
					}
					
					else {
						System.out.println("No llevas mercancia, no puedes pasar");
					}

				} 
				
				
				
				
				else if (pasajeros.isEmbarcaElCoche() == true & pasajeros.isTieneMercancia() == true) {

					System.out.println("Puedes acceder a puerto SE");
					pasajeros.setZonaDestino("SE");
					pasajeros.setPrecisionSE(LocalDateTime.now());
					
					
					

				} else if (pasajeros.isTieneMercancia() == false) {

					System.out.println("Puedes acceder a puerto SN");
					pasajeros.setZonaDestino("SN");
					pasajeros.setPrecisionSN(LocalDateTime.now());
					pasajeros.setPrecionMinEmbarque(LocalDateTime.now());
					
					System.out.println("¿La mercancia es apta?: s/n");
					char esApta = sc.next().charAt(0);
					
					if(esApta == 's') {
						
						System.out.println("Su mercancia es apta");
						pasajeros.setEsApta(true);
						pasajeros.setZonaDestino("PIF");
						pasajeros.setPrecisionPIF(LocalDateTime.now());
						
						if(pasajeros.isEsApta() == true) {
							
							System.out.println("Puedes acceder a puerto EN");
							
							pasajeros.setZonaDestino("EN");
							pasajeros.setPrecisionEN(LocalDateTime.now());
						}
						
					}
				}
			}

		}

	}
}