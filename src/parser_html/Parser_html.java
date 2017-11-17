package parser_html;

import java.io.IOException;

public class Parser_html {
	
	public static void main(String[] args) {
		Parser parser = new Parser();
		try{
			parser.parseWebsite("https://www.pccomponentes.com/ofertas-especiales");
			parser.print();
		}catch (IOException e) {
			System.err.println("Error al recoger las ofertas");
		}
	}

}
