/**
 * FactoryDesarrollo.java 
 * Universidad del Valle de Guatemala 
 * Algoritmos y Estructura de Datos Seccion 10 
 * Hoja de Trabajo 06
 * Maria Fernanda Estrada y Cristian Perez
 * @since 11 Marzo 2017
 */

import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;



public class FactoryDesarrollo {

	// El metodo Setcall regresa una implementacion de la interfaz Set segun la opcion que ingreso el usuario
	public Set<E> Setcall(int opcion) {
		
		switch(opcion) {
		
		case 1:
			// La implementacion es HashSet
			return new HashSet<E>();
		
		case 2:
			// La implementacion es TreeSet
			return new TreeSet<E>();
		
		case 3:
			// La implementacion es LinkedHashSet
			return new LinkedHashSet<E>();
		
		default:
			return null;
	}
}
