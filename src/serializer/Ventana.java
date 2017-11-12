package serializer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class Ventana {

	private JFrame frmBiblioteca;
	private JTextField textFieldTitulo;
	private JTextField textFieldEditor;
	private JTextField textFieldPags;
	private JButton btnParsearObjetos, btnAnadir;
	private JTextField textFieldFichero;
	private JTextArea textAreaAutores;
	private JTextField textFieldAnyo;
	private JTextPane textPane ;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	public JTextPane getTextPane() {
		return textPane;
	}

	public void setTextPane(JTextPane textPane) {
		this.textPane = textPane;
	}

	public JTextArea getTextAreaAutores() {
		return textAreaAutores;
	}

	public void setTextAreaAutores(JTextArea textAreaAutores) {
		this.textAreaAutores = textAreaAutores;
	}

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Ventana window = new Ventana();
//					window.getFrame().setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().getContentPane().setBackground(Color.DARK_GRAY);
		getFrame().setBounds(100, 100, 524, 381);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setBounds(10, 14, 46, 14);
		getFrame().getContentPane().add(lblTitulo);
		
		JLabel lblAutores = new JLabel("Autor/es");
		lblAutores.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAutores.setForeground(Color.WHITE);
		lblAutores.setBounds(162, 14, 52, 14);
		getFrame().getContentPane().add(lblAutores);
		
		JLabel lblEditor = new JLabel("Editor");
		lblEditor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEditor.setForeground(Color.WHITE);
		lblEditor.setBounds(10, 39, 46, 14);
		getFrame().getContentPane().add(lblEditor);
		
		JLabel lblNPginas = new JLabel("N\u00BA Pags");
		lblNPginas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNPginas.setForeground(Color.WHITE);
		lblNPginas.setBounds(320, 14, 52, 14);
		getFrame().getContentPane().add(lblNPginas);
		
		textFieldTitulo = new JTextField();
		textFieldTitulo.setBounds(66, 11, 86, 20);
		textFieldTitulo.setBorder(null);
		getFrame().getContentPane().add(textFieldTitulo);
		textFieldTitulo.setColumns(10);
		
		textFieldEditor = new JTextField();
		textFieldEditor.setBounds(66, 36, 86, 20);
		textFieldEditor.setBorder(null);
		getFrame().getContentPane().add(textFieldEditor);
		textFieldEditor.setColumns(10);
		
		textFieldPags = new JTextField();
		textFieldPags.setBounds(382, 11, 86, 20);
		textFieldPags.setBorder(null);
		getFrame().getContentPane().add(textFieldPags);
		textFieldPags.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(224, 8, 86, 50);
		frmBiblioteca.getContentPane().add(scrollPane);
		
		textAreaAutores = new JTextArea();
		scrollPane.setColumnHeaderView(textAreaAutores);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(66, 72, 402, 193);
		frmBiblioteca.getContentPane().add(scrollPane_1);
		
		textPane = new JTextPane();
		scrollPane_1.setViewportView(textPane);
		textPane.setEditable(false);
		
		btnAnadir = new JButton("A\u00F1adir");
		scrollPane_1.setColumnHeaderView(btnAnadir);
		
		btnParsearObjetos = new JButton("Guardar");
		btnParsearObjetos.setBounds(334, 275, 97, 23);
		frmBiblioteca.getContentPane().add(btnParsearObjetos);
		
		JLabel lblFichero = new JLabel("Fichero Destino");
		lblFichero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFichero.setForeground(Color.WHITE);
		lblFichero.setBounds(76, 279, 97, 14);
		frmBiblioteca.getContentPane().add(lblFichero);
		
		textFieldFichero = new JTextField();
		textFieldFichero.setBorder(null);
		textFieldFichero.setBounds(183, 276, 97, 20);
		frmBiblioteca.getContentPane().add(textFieldFichero);
		textFieldFichero.setColumns(10);
		
		JLabel lblAnyo = new JLabel("A\u00F1o");
		lblAnyo.setForeground(Color.WHITE);
		lblAnyo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAnyo.setBounds(320, 39, 46, 14);
		frmBiblioteca.getContentPane().add(lblAnyo);
		
		textFieldAnyo = new JTextField();
		textFieldAnyo.setBounds(382, 36, 86, 20);
		frmBiblioteca.getContentPane().add(textFieldAnyo);
		textFieldAnyo.setColumns(10);
	}

	public JTextField getTextFieldAnyo() {
		return textFieldAnyo;
	}

	public void setTextFieldAnyo(JTextField textFieldAnyo) {
		this.textFieldAnyo = textFieldAnyo;
	}

	public JTextField getTextFieldFichero() {
		return textFieldFichero;
	}

	public void setTextFieldFichero(JTextField textFieldFichero) {
		this.textFieldFichero = textFieldFichero;
	}

	public JButton getBtnParsearObjetos() {
		return btnParsearObjetos;
	}

	public void setBtnParsearObjetos(JButton btnParsearObjetos) {
		this.btnParsearObjetos = btnParsearObjetos;
	}

	public JButton getBtnAnadir() {
		return btnAnadir;
	}

	public void setBtnAnadir(JButton btnAnadir) {
		this.btnAnadir = btnAnadir;
	}

	public JTextField getTextFieldTitulo() {
		return textFieldTitulo;
	}

	public void setTextFieldTitulo(JTextField textFieldTitulo) {
		this.textFieldTitulo = textFieldTitulo;
	}

	public JTextField getTextFieldEditor() {
		return textFieldEditor;
	}

	public void setTextFieldEditor(JTextField textFieldEditor) {
		this.textFieldEditor = textFieldEditor;
	}

	public JTextField getTextFieldPags() {
		return textFieldPags;
	}

	public void setTextFieldPags(JTextField textFieldPags) {
		this.textFieldPags = textFieldPags;
	}

	public JFrame getFrame() {
		return frmBiblioteca;
	}

	public void setFrame(JFrame frame) {
		this.frmBiblioteca = frame;
		frmBiblioteca.setTitle("Biblioteca");
	}
	public void showError(String m){
		JOptionPane.showMessageDialog(this.frmBiblioteca,
			    m,
			    "Error",
			    JOptionPane.ERROR_MESSAGE);
	}
	
	public void showMessage(String m) {
		JOptionPane.showMessageDialog(this.frmBiblioteca,
			    m,
			    "Error",
			    JOptionPane.PLAIN_MESSAGE);
	}
}
