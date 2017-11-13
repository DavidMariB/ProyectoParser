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
		
	//Obtener Acciones XML
	public static void cargarAcciones() {
		Parser pa = new Parser();
		pa.parseXML("fichero1.xml");
		pa.parseDocument();
		
		//Añadimos al array que conservamos las nuevas Acciones cargados
		ArrayList <Acciones> acsTEMP = pa.getAcciones();
			for (int i=0; i<acsTEMP.size(); i++) {
				accs.add(acsTEMP.get(i));
			}
	}
	
	//Mostrar por pantalla
	public static void mostrar() {
		if (accs != null) {
			System.out.println("Acciones: " + accs.size());
			
			//Imprimimos Acciones
			System.out.println(limpiar(20));
			for (int i=0; i<accs.size(); i++) {
				System.out.println("Acción Nº " + (i+1));
				System.out.println(limpiar(20));
				System.out.println(accs.get(i).imprimir());
				System.out.println(limpiar(20));
			}
		} else {
			System.out.println(limpiar(25));
			System.out.println("No se encuentran acciones actualmente");
		}
	}
	
	//Genera Linea (Diseño)
	public static String limpiar(int lines) {
		String lineas = "";
		for (int i=0; i<=lines; i++) {
			lineas += "-";
		}
		return lineas;
	}
	
}