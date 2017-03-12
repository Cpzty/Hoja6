import java.io.IOException;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

import java.util.Scanner;
import java.util.Set;

public class Desarrolladores {

	public static <E> void main(String[] args) throws IOException {
		Set<String> MySet;
		Scanner s = new Scanner(System.in);
		FactoryDesarrollo<String> FactoryDesarrolladores = new FactoryDesarrollo<String>();
		
		
		
		System.out.println("Bienvendio al programa de Desarrolladores");
		
		//Java
		System.out.println("Presione 1 para usar HashSet");
		
		//Android
		System.out.println("Presione 2 para usar TreeSet");
		
		//IOS
		System.out.println("Presione 3 para usar LinkedHashSet");
		int opcion = s.nextInt();
		
		
		MySet =FactoryDesarrolladores.Setcall(opcion);
		
		//Lo siguiente solo era para probarlo 
		
		MySet.add("Kappa");
		
		System.out.println(MySet.isEmpty());
	}

}