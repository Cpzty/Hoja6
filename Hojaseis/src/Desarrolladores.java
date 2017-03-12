/**
 * Desarrolladores.java 
 * Universidad del Valle de Guatemala 
 * Algoritmos y Estructura de Datos Seccion 10 
 * Hoja de Trabajo 06
 * Maria Fernanda Estrada y Cristian Perez
 * @since 11 Marzo 2017
 */

import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;



public class Desarrolladores {
	public static void main(String[] args) {
		
		// Variables
		Set<String> MySetJAVA;
		Set<String> MySetANDROID;
		Set<String> MySetIOS;
		Scanner s = new Scanner(System.in);
		FactoryDesarrollo<String> FactoryDesarrolladores = new FactoryDesarrollo<String>();
		boolean correr1 = true;
		boolean correr2 = true;
		
		// Solicita que implementacion quiere el usuario
		System.out.println("Bienvendio al programa de Desarrolladores");
		System.out.println("Presione 1 para usar HashSet");
		System.out.println("Presione 2 para usar TreeSet");
		System.out.println("Presione 3 para usar LinkedHashSet");
		int opcion = s.nextInt();
		
		// Se crean los tres conjuntos de la misma implementacion
		MySetJAVA = FactoryDesarrolladores.Setcall(opcion);
		MySetANDROID = FactoryDesarrolladores.Setcall(opcion);
		MySetIOS = FactoryDesarrolladores.Setcall(opcion);
		
		// Ingresar nombres hasta que ya no quiera
		while (correr1) {
			System.out.println("Ingrese el nombre del Desarrollador o escriba FIN para finalizar el programa")
			String nombre = s.nextLine();
			
			if (nombre.equals("FIN") || nombre.equals("fin") || nombre.equals("Fin")) {
				correr1 = false;
			}
			
			// Ingresar a que conjunto pertenece el desarrollador
			else {
				System.out.println("Presione 1 si es para Java, 2 si es para Andorid o 3 si es para iOS (presione 0 para seguir agregando mas desarrolladores)");
				int numeroDesarrollo = s.nextInt();
				
				// Sigue agregando a los conjuntos, aunque no se puede duplicar un desarrollador en el mismo
				while (correr2) {
					switch (numeroDesarrollo) {
					case 0:
						correr2 = false;
					case 1:
						MySetJAVA.add(nombre);
						correr2 = true;
					case 2:
						MySetANDROID.add(nombre);
						correr2 = true;
					case 3:
						MySetIOS.add(nombre);
						correr2 = true;
					default:
						return null;
					}
				}
				correr1 = true;
			}			
		}
		
		///aqui sacar cosas
		System.out.println(MySetJAVA);
		System.out.println(MySetANDROID);
		System.out.println(MySetIOS);
		
		
	}

}