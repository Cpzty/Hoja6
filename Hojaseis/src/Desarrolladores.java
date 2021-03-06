
/**
 * Desarrolladores.java 
 * Universidad del Valle de Guatemala 
 * Algoritmos y Estructura de Datos Seccion 10 
 * Hoja de Trabajo 06
 * Maria Fernanda Estrada y Cristian Perez
 * @since 11 Marzo 2017
 */

import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class Desarrolladores {

	public static <E> void main(String[] args) throws IOException {
		Set<String> MySetAndroid;
		Set<String> MySetJava;
		Set<String> MySetIOS;
		boolean loop;
		boolean keep;
		Scanner s = new Scanner(System.in);
		FactoryDesarrollo<String> FactoryDesarrolladores = new FactoryDesarrollo<String>();

		System.out.println("Bienvendio al programa de Desarrolladores");

		// Java
		System.out.println("Presione 1 para usar HashSet");

		// Android
		System.out.println("Presione 2 para usar TreeSet");

		// IOS
		System.out.println("Presione 3 para usar LinkedHashSet");
		int opcion = s.nextInt();

		MySetAndroid = FactoryDesarrolladores.Setcall(opcion);
		MySetJava = FactoryDesarrolladores.Setcall(opcion);
		MySetIOS = FactoryDesarrolladores.Setcall(opcion);

		loop = true;
		while (loop == true) {
			keep = true;
			if (keep == true) {
				System.out.println("Presione 1 para agregar un nombre");
				System.out.println("Presione 2 para buscar un nombre ");
				System.out.println("Presione 3 para terminar");
				opcion = s.nextInt();

				if (opcion == 1) {
					System.out.println("Presione 1 para agregar a Android");
					System.out.println("Presione 2 para agregar a Java");
					System.out.println("Presione 3 para agregar a IOS");
					int opcion2 = s.nextInt();

					if (opcion2 == 1) {
						System.out.println("Android seleccionado!");
						System.out.println("Ingresa el nombre que desees");
						String opcion3 = s.next();
						MySetAndroid.add(opcion3);
						System.out.println(MySetAndroid);
						opcion2 = 0;
					}
					if (opcion2 == 2) {
						System.out.println("Java seleccionado!");
						System.out.println("Ingresa el nombre que desees");
						String opcion3 = s.next();
						MySetJava.add(opcion3);
						System.out.println(MySetJava);
						opcion2 = 0;
					}

					if (opcion2 == 3) {
						System.out.println("IOS seleccionado!");
						System.out.println("Ingresa el nombre que desees");
						String opcion3 = s.next();
						MySetIOS.add(opcion3);
						System.out.println(MySetIOS);
						opcion2 = 0;
					}

				}
				if (opcion == 2) {
					System.out.println("Presione 1 para buscar en Android");
					System.out.println("Presione 2 para buscar en Java");
					System.out.println("Presione 3 para buscar en IOS");
					int opcion2 = s.nextInt();

					if (opcion2 == 1) {
						System.out.println("Android seleccionado!");
						System.out.println("Ingresa el nombre que desees buscar");
						String opcion3 = s.next();
						if (MySetAndroid.contains(opcion3) == false) {
							System.out.println(opcion3 + " no se encuentra en esta lista");
						} else {
							System.out.println(opcion3 + " Esta en esta lista");
							System.out.println("");
						}
						opcion2 = 0;
					}
					if (opcion2 == 2) {
						System.out.println("Java seleccionado!");
						System.out.println("Ingresa el nombre que desees buscar");
						String opcion3 = s.next();
						if (MySetJava.contains(opcion3) == false) {
							System.out.println(opcion3 + " no se encuentra en esta lista");
						} else {
							System.out.println(opcion3 + " Esta en esta lista");
							System.out.println("");
						}
						opcion2 = 0;
					}
					if (opcion2 == 3) {
						System.out.println("IOS seleccionado!");
						System.out.println("Ingresa el nombre que desees buscar");
						String opcion3 = s.next();
						if (MySetIOS.contains(opcion3) == false) {
							System.out.println(opcion3 + " no se encuentra en esta lista");
						} else {
							System.out.println(opcion3 + " Esta en esta lista");
							System.out.println("");
						}
						opcion2 = 0;
					}
				}
				if (opcion == 3) {

					loop = false;

				}
			}

		}

		// INCISO 5: Indicar si el conjunto de Java es un subconjunto de Android
		if (MySetAndroid.containsAll(MySetJava) == true && MySetAndroid.size() != 0 && MySetJava.size() != 0
				&& MySetAndroid.size() > MySetJava.size()) {
			System.out.println(MySetAndroid.containsAll(MySetJava));
			System.out.println("Java si es un subconjunto de Android");
		} else {
			System.out.println("Java no es subconjunto de Android o alguno de los sets estan vacios");
		}

		// INCISO 6: Mostrar el conjunto que contenga el mayor numero de
		// elementos
		// INCISO 7: El de mayor numero se ordena alfabeticamente
		if (MySetAndroid.size() > MySetIOS.size() && MySetAndroid.size() > MySetJava.size()) {
			System.out.print("El conjunto mas grande es Android: ");
			System.out.println(MySetAndroid);
			System.out.print("Conjunto ordenado: ");
			List<String> enLista = new ArrayList<String>(MySetAndroid);
			List<String> sortedNames = enLista.stream().sorted().collect(Collectors.toList());
			System.out.println(sortedNames);
		} else {
			if (MySetIOS.size() > MySetAndroid.size() && MySetIOS.size() > MySetJava.size()) {
				System.out.print("El conjunto mas grande es iOS: ");
				System.out.println(MySetIOS);
				System.out.print("Conjunto ordenado: ");
				List<String> enLista = new ArrayList<String>(MySetIOS);
				List<String> sortedNames = enLista.stream().sorted().collect(Collectors.toList());
				System.out.println(sortedNames);
			} else {
				if (MySetJava.size() > MySetIOS.size() && MySetJava.size() > MySetAndroid.size()) {
					System.out.print("El conjunto mas grande es Java: ");
					System.out.println(MySetJava);
					System.out.print("Conjunto ordenado: ");
					List<String> enLista = new ArrayList<String>(MySetJava);
					List<String> sortedNames = enLista.stream().sorted().collect(Collectors.toList());
					System.out.println(sortedNames);
				} else {
					System.out.println("Los conjuntos tienen el mismo tamano");
				}
			}
		}

		// Variables para no modificar el valor de MySetAndroid, MySetIOS,
		// MySetJava
		List<String> listaAndroid = new ArrayList<String>(MySetAndroid);
		List<String> listaIOS = new ArrayList<String>(MySetIOS);
		List<String> listaJava = new ArrayList<String>(MySetJava);

		// INCISO 1: Experiencia en los 3
		List<String> MyIntersectionSet1 = listaAndroid;
		MyIntersectionSet1.retainAll(listaIOS);
		MyIntersectionSet1.retainAll(listaJava);
		System.out.print("Experiencia en los tres conjuntos: ");
		System.out.println(MyIntersectionSet1);

		// Agregar los mismos valores para que no afecte inciso 1
		listaAndroid = new ArrayList<String>(MySetAndroid);
		listaIOS = new ArrayList<String>(MySetIOS);
		listaJava = new ArrayList<String>(MySetJava);

		// INCISO 2: Experiencia en Java pero no en Android
		List<String> MyIntersectionSet2 = listaJava;
		MyIntersectionSet2.removeAll(listaAndroid);
		System.out.print("Experiencia en Java pero no en Android: ");
		System.out.println(MyIntersectionSet2);

		// Agregar los mismos valores para que no afecte inciso 2
		listaAndroid = new ArrayList<String>(MySetAndroid);
		listaIOS = new ArrayList<String>(MySetIOS);
		listaJava = new ArrayList<String>(MySetJava);

		// INCISO 3: Experiencia en Android y IOS pero no en Java
		List<String> MyIntersectionSet3dot1 = listaAndroid;
		List<String> MyIntersectionSet3dot2 = listaIOS;
		MyIntersectionSet3dot1.removeAll(listaJava);
		MyIntersectionSet3dot2.removeAll(listaJava);
		MyIntersectionSet3dot1.retainAll(listaIOS);
		System.out.print("Experiencia en Android y iOS pero no en Java: ");
		System.out.println(MyIntersectionSet3dot1);

		// Agregar los mismos valores para que no afecte inciso 3
		listaAndroid = new ArrayList<String>(MySetAndroid);
		listaIOS = new ArrayList<String>(MySetIOS);
		listaJava = new ArrayList<String>(MySetJava);

		// INCISO 4: Experiencia en Android o iOS pero no en Java
		List<String> MyIntersectionSet4dot1 = listaAndroid;
		List<String> MyIntersectionSet4dot2 = listaIOS;
		MyIntersectionSet4dot1.removeAll(listaJava);
		MyIntersectionSet4dot2.removeAll(listaJava);
		MyIntersectionSet4dot1.addAll(listaIOS);
		System.out.print("Experiencia en Android o iOS pero no en Java: ");
		System.out.println(MyIntersectionSet4dot1);

		// Mostrar los valores unicamente
		System.out.print("Conjunto Android: ");
		System.out.println(MySetAndroid);
		System.out.print("Conjunto Java: ");
		System.out.println(MySetJava);
		System.out.print("Conjunto iOS: ");
		System.out.println(MySetIOS);

	}

}
