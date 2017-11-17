package parser_html;

public class Articulo {
	
	String nombre,precio,oferta,porcentaje,url,disponibilidad;
	
	public Articulo(String nombre,String precio, String oferta,String descuento,String url,String disponibilidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.oferta = oferta;
		this.porcentaje = descuento;
		this.url = url;
		this.disponibilidad = disponibilidad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getOferta() {
		return oferta;
	}

	public void setOferta(String oferta) {
		this.oferta = oferta;
	}
	

	public void print() {
		StringBuffer sb = new StringBuffer();
		sb.append("Nombre: "+this.nombre+"\n");
		sb.append("Precio descuento: "+this.precio+"\n");
		if(!oferta.equalsIgnoreCase("")) {
			sb.append("Precio original: "+this.oferta+"\n");
			sb.append("Descuento: "+this.porcentaje+"\n");
		}  
		sb.append("URL: https://www.pccomponentes.com"+this.url+"\n");
		sb.append("Disponibilidad: "+this.disponibilidad+"\n");
		sb.append("\n");
		System.out.println(sb);
	}

}
