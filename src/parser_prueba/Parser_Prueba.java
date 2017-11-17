package parser_prueba;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Parser_Prueba {
	
	//Variables
	static ArrayList <Acciones> accs = new ArrayList<Acciones>();
	
	public static void main(String[] args) {
		cargarAcciones();
		
		mostrar();
		System.out.println("Programa finalizado correctamente!");
	}
		
	//Obtenemos las acciones desde el fichero XML
	public static void cargarAcciones() {
		Parser pa = new Parser();
		pa.parseXML("fichero1.xml");
		pa.parseDocument();
		
		//Añadimos al array las acciones obtenidas del fichero XML
		ArrayList <Acciones> acciones = pa.getAcciones();
			for (int i=0; i<acciones.size(); i++) {
				accs.add(acciones.get(i));
			}
	}
	
	//Mostramos por pantalla las acciones encontradas
	public static void mostrar() {
		if (accs != null) {
			System.out.println("Acciones: " + accs.size());
			
			//Mostramos las acciones
			for (int i=0; i<accs.size(); i++) {
				System.out.println("Accion Nº: " + (i+1));
				System.out.println(accs.get(i).imprimir());
			}
		} else {
			System.out.println("No se encuentran acciones");
		}
	}
	

	
}