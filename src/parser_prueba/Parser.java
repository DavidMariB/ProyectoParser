package parser_prueba;

import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Parser {
	
	private Document dom = null;
	private ArrayList<Acciones> acciones = null;
	
	public Parser() {
		acciones = new ArrayList<Acciones>();
	}
	
	public void parseXML(String fichero) {
		//Creamos fabrica
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		try {
			//Creamos DocumentBuilder
			DocumentBuilder db = dbf.newDocumentBuilder();
			dom = db.parse(fichero);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error en Factory");
		}
	}
	
	public void parseDocument() {
		//Obtenemos elemento Raiz
		Element docEl = dom.getDocumentElement();
		
		//Obtenemos NodeList
		NodeList nl = docEl.getElementsByTagName("accion");
		if (nl != null && nl.getLength() > 0) {
			for (int i=0; i<nl.getLength(); i++) {
				
				//Obtenemos elemento
				Element el = (Element) nl.item(i);
				
				//Obtenemos una Accion
				Acciones acNEW = getAccion(el);
				
				//A�adimos al array
				acciones.add(acNEW);
			}
		}
	}
	
	//Obtenemos datos del libro
	private Acciones getAccion(Element accionEle) {
		
		//Empezamos a obtener cada elemento
		String nombre = getNombre(accionEle, "nombre");
		ArrayList <Operacion> operaciones = getOperaciones(accionEle);

		//Generamos Accion que se ha encontrado
		Acciones actual = new Acciones(nombre, operaciones);
		
		return actual;
	}
	
	//Obtiene el nombre de la Acci�n
	private String getNombre(Element ele, String tagName) {
		String txtValue = null;
			txtValue = ele.getAttributes().getNamedItem("nombre").getNodeValue();
		return txtValue;
	}
	
	//Creamos un nuevo ArrayList de Operaciones para obtener estas mismas
	
	private ArrayList<Operacion> getOperaciones(Element ele){
		ArrayList <Operacion> operaciones = new ArrayList<Operacion>();
			
		NodeList nlA = ele.getElementsByTagName("operacion");
		
		for (int i=0; i<nlA.getLength(); i++) {
			Element el = (Element) nlA.item(i);
			
			String tipo = getTextValue(el, "tipo");
			String cantidad = getTextValue(el, "cantidad");
			String precio = getTextValue(el, "precio");
					
			operaciones.add(new Operacion(tipo, cantidad, precio));					
		}				

		return operaciones;
	}
	
		private String getTextValue(Element ele, String tagName) {
			String txtValue = null;
			NodeList nl = ele.getElementsByTagName(tagName);
			if (nl != null && nl.getLength() > 0) {
				Element el = (Element) nl.item(0);
				txtValue = el.getFirstChild().getNodeValue();
			}
			return txtValue;
		}
	
	public ArrayList<Acciones> getAcciones(){
		return this.acciones;
	}

}