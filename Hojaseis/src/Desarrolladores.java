/**
 * Desarrolladores.java 
 * Universidad del Valle de Guatemala 
 * Algoritmos y Estructura de Datos Seccion 10 
 * Hoja de Trabajo 06
 * Maria Fernanda Estrada y Cristian Perez
 * @since 11 Marzo 2017
 */


import java.util.Scanner;
import java.util.Set;

public class Desarrolladores {

	private static Scanner s;

	public static void main(String[] args) {
		Set<String> MySetAndroid;
		Set<String> MySetJava;
		Set<String> MySetIOS;
		boolean loop;
		boolean keep;
		s = new Scanner(System.in);
		FactoryDesarrollo<String> FactoryDesarrolladores = new FactoryDesarrollo<String>();
		
		
		
		System.out.println("Bienvendio al programa de Desarrolladores");
		
		//Java
		System.out.println("Presione 1 para usar HashSet");
		
		//Android
		System.out.println("Presione 2 para usar TreeSet");
		
		//IOS
		System.out.println("Presione 3 para usar LinkedHashSet");
		int opcion = s.nextInt();
		
		
		MySetAndroid =FactoryDesarrolladores.Setcall(opcion);
		MySetJava =FactoryDesarrolladores.Setcall(opcion);
		MySetIOS =FactoryDesarrolladores.Setcall(opcion);
		loop=true;
		while(loop==true){
			keep=true;
			if(keep==true){
			System.out.println("Presione 1 para agregar un nombre");
			System.out.println("Presione 2 para buscar un nombre ");
			System.out.println("Presione 3 para terminar");
			opcion=s.nextInt();
			
			if(opcion==1){
				System.out.println("Presione 1 para agregar a Android");
				System.out.println("Presione 2 para agregar a Java");
				System.out.println("Presione 3 para agregar a IOS");
				int opcion2=s.nextInt();
				
				if(opcion2==1){
					System.out.println("Android seleccionado!");
					System.out.println("Ingresa el nombre que desees");
					String opcion3=s.next();
					MySetAndroid.add(opcion3);
					opcion2=0;
				}
				if(opcion2==2){
					System.out.println("Java seleccionado!");
					System.out.println("Ingresa el nombre que desees");
					String opcion3=s.next();
					MySetJava.add(opcion3);
					opcion2=0;
				}
				
				if(opcion2==3){
					System.out.println("IOS seleccionado!");
					System.out.println("Ingresa el nombre que desees");
					String opcion3=s.next();
					MySetIOS.add(opcion3);
					opcion2=0;
				}
				
			}
			if(opcion==2){
				System.out.println("Presione 1 para buscar en Android");
				System.out.println("Presione 2 para buscar en Java");
				System.out.println("Presione 3 para buscar en IOS");
				int opcion2=s.nextInt();
				
				if(opcion2==1){
					System.out.println("Android seleccionado!");
					System.out.println("Ingresa el nombre que desees buscar");
					String opcion3=s.next();
					if(MySetAndroid.contains(opcion3)==false){
						System.out.println(opcion3+" no se encuentra en esta lista");
					}
					else{
						System.out.println(opcion3+" Esta en esta lista");
						System.out.println("");
					}
					opcion2=0;
				}
				if(opcion2==2){
					System.out.println("Java seleccionado!");
					System.out.println("Ingresa el nombre que desees buscar");
					String opcion3=s.next();
					if(MySetJava.contains(opcion3)==false){
						System.out.println(opcion3+" no se encuentra en esta lista");
					}
					else{
						System.out.println(opcion3+" Esta en esta lista");
						System.out.println("");
					}
					opcion2=0;
				}
				if(opcion2==3){
					System.out.println("IOS seleccionado!");
					System.out.println("Ingresa el nombre que desees buscar");
					String opcion3=s.next();
					if(MySetIOS.contains(opcion3)==false){
						System.out.println(opcion3+" no se encuentra en esta lista");
					}
					else{
						System.out.println(opcion3+" Esta en esta lista");
						System.out.println("");
					}
					opcion2=0;
				}
			}
			if(opcion==3){
				loop=false;
			}
		
			}
		}
	}

}
