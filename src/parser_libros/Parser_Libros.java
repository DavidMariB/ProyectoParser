package parser_libros;

public class Parser_Libros {

	public static void main(String[] args) {
		Parser p = new Parser();
		p.parseFicheroXml("personas.xml");
		p.parseDocument();
		p.print();
	}

}
