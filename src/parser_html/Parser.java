package parser_html;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Parser {
	
	ArrayList<Articulo> articulo;

	public Parser() {
		this.articulo =  new ArrayList<Articulo>();
	}
	
	public void parseWebsite(String website) throws IOException {
		//Nos hacemos un Document el cual recoge la web que le hemos pasado desde el main
		Document doc = Jsoup.connect(website).get();
		//Recogemos cada producto que hay en la web
		Elements el = doc.getElementsByClass("col-xs-6 col-sm-4 col-md-4 col-lg-4");
		//Recorremos cada producto
		for (Element p : el) {
			this.articulo.add(getItems(p));
		}
	}
	
	public Articulo getItems(Element p) throws IOException{		
		String nombre = "";
		String precio = "";
		String oferta = "";
		String porcentaje = "";
		String url = "";
		int ratingValue = 0;
		String disponibilidad = "";
		
		//Cogemos el nombre, precio actual, su oferta, el descuento y la disponibilidad
		Elements nombreArticulo = p.getElementsByClass("tarjeta-articulo__nombre");
		Elements precioActual = p.getElementsByClass("tarjeta-articulo__precio-actual");
		Elements precioOferta = p.getElementsByClass("tarjeta-articulo__pvp");
		Elements descuentoOferta = p.getElementsByClass("tarjeta-articulo__descuento");
		Elements disponibilidadArticulo = p.getElementsByClass("tarjeta-articulo__disponibilidad");

		nombre = nombreArticulo.get(0).text();
		precio = precioActual.get(0).text();
		disponibilidad = disponibilidadArticulo.get(0).text();
		url = p.getElementsByClass("GTM-productClick enlace-superpuesto").get(0).attr("href");
		
		if(precioOferta.size() > 0) {
			oferta = precioOferta.get(0).text();
			porcentaje = descuentoOferta.get(0).text();
		}
		
		//Nos creamos un producto. Se crean x productos según los que detecte el JSOUP
		Articulo articulo = new Articulo(nombre,precio,oferta,porcentaje,url,disponibilidad);
		
		return articulo;
	}

	public void print(){
		Iterator it = this.articulo.iterator();
		while(it.hasNext()) {
			Articulo a = (Articulo) it.next();	
			a.print();
		}
	}

}
