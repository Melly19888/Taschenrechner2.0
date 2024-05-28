package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class GUI_Hauptanwendung extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField text1Zahl_txt;
	private JTextField txtZahlEingabe;
	private JTextField txtErgebnis;
	private JTextField txtGehrtMelanieBckner;
	private JTextField txtTaschenrechner;
	private JTextField txtKomaeingabeMitEinem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Hauptanwendung frame = new GUI_Hauptanwendung();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_Hauptanwendung() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 439);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Brechne = new JButton("-");
		Brechne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double zahl1 = 0.0;
				double zahl2 = 0.0;
				double erg = 0.0;

				 zahl1 = Double.parseDouble(textField.getText());
				 zahl2 = Double.parseDouble(textField_1.getText());
				   erg = zahl1 - zahl2;
				   
			 txtErgebnis.setText("Ergebnis: " + erg);
			}
		});
		Brechne.setFont(new Font("Arial", Font.BOLD, 17));
		Brechne.setForeground(new Color(0, 0, 160));
		Brechne.setBackground(new Color(255, 0, 255));
		Brechne.setBounds(301, 143, 58, 52);
		contentPane.add(Brechne);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(new Color(255, 0, 255));
		textField.setFont(new Font("Arial", Font.BOLD, 17));
		textField.setBounds(10, 219, 146, 44);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(new Color(255, 0, 255));
		textField_1.setFont(new Font("Arial", Font.BOLD, 17));
		textField_1.setColumns(10);
		textField_1.setBounds(10, 114, 146, 44);
		contentPane.add(textField_1);
		
		text1Zahl_txt = new JTextField();
		text1Zahl_txt.setEditable(false);
		text1Zahl_txt.setForeground(new Color(255, 0, 255));
		text1Zahl_txt.setHorizontalAlignment(SwingConstants.CENTER);
		text1Zahl_txt.setText("1. Zahl eingabe");
		text1Zahl_txt.setFont(new Font("Arial", Font.BOLD, 17));
		text1Zahl_txt.setBackground(new Color(204, 255, 255));
		text1Zahl_txt.setBounds(10, 79, 146, 24);
		contentPane.add(text1Zahl_txt);
		text1Zahl_txt.setColumns(10);
		
		txtZahlEingabe = new JTextField();
		txtZahlEingabe.setText("2. Zahl eingabe");
		txtZahlEingabe.setHorizontalAlignment(SwingConstants.CENTER);
		txtZahlEingabe.setForeground(Color.MAGENTA);
		txtZahlEingabe.setFont(new Font("Arial", Font.BOLD, 17));
		txtZahlEingabe.setEditable(false);
		txtZahlEingabe.setColumns(10);
		txtZahlEingabe.setBackground(new Color(204, 255, 255));
		txtZahlEingabe.setBounds(10, 184, 146, 24);
		contentPane.add(txtZahlEingabe);
		
		txtErgebnis = new JTextField();
		txtErgebnis.setHorizontalAlignment(SwingConstants.CENTER);
		txtErgebnis.setForeground(Color.MAGENTA);
		txtErgebnis.setFont(new Font("Arial", Font.BOLD, 17));
		txtErgebnis.setEditable(false);
		txtErgebnis.setColumns(10);
		txtErgebnis.setBackground(new Color(204, 255, 255));
		txtErgebnis.setBounds(10, 314, 421, 44);
		contentPane.add(txtErgebnis);
		
		JButton Brechne_addiere = new JButton("+");
		Brechne_addiere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double zahl1 = 0.0;
				double zahl2 = 0.0;
				double erg = 0.0;

				zahl1 = Double.parseDouble(textField.getText());
				zahl2 = Double.parseDouble(textField_1.getText());
				erg = zahl1 + zahl2;
			txtErgebnis.setText("Ergebnis: " + erg);

			}
		});
		Brechne_addiere.setForeground(new Color(0, 0, 160));
		Brechne_addiere.setFont(new Font("Arial", Font.BOLD, 17));
		Brechne_addiere.setBackground(Color.MAGENTA);
		Brechne_addiere.setBounds(301, 79, 58, 53);
		contentPane.add(Brechne_addiere);
		
		JButton Brechne_2 = new JButton("*");
		Brechne_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					double zahl1 = 0.0;
					double zahl2 = 0.0;
					double erg = 0.0;

					zahl1 = Double.parseDouble(textField.getText());
					zahl2 = Double.parseDouble(textField_1.getText());
					erg = zahl1 * zahl2;
				txtErgebnis.setText("Ergebnis: " + erg);
			}
		});
		Brechne_2.setForeground(new Color(0, 0, 160));
		Brechne_2.setFont(new Font("Arial", Font.BOLD, 17));
		Brechne_2.setBackground(Color.MAGENTA);
		Brechne_2.setBounds(301, 215, 58, 50);
		contentPane.add(Brechne_2);
		
		JButton Brechne_3 = new JButton("/");
		Brechne_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					double zahl1 = 0.0;
					double zahl2 = 0.0;
					double erg = 0.0;

					zahl1 = Double.parseDouble(textField.getText());
					zahl2 = Double.parseDouble(textField_1.getText());
					erg = zahl1 / zahl2;
				txtErgebnis.setText("Ergebnis: " + erg);
			}
		});
		Brechne_3.setForeground(new Color(0, 0, 160));
		Brechne_3.setFont(new Font("Arial", Font.BOLD, 17));
		Brechne_3.setBackground(Color.MAGENTA);
		Brechne_3.setBounds(373, 79, 58, 53);
		contentPane.add(Brechne_3);
		
		JButton btnX = new JButton("x²");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double zahl1 = 0.0;
				
				double erg = 0.0;

				zahl1 = Double.parseDouble(textField.getText());
				
				erg = zahl1 * zahl1;
			txtErgebnis.setText("Ergebnis: " + erg);
				
			}
		});
		btnX.setForeground(new Color(0, 0, 160));
		btnX.setFont(new Font("Arial", Font.BOLD, 17));
		btnX.setBackground(Color.MAGENTA);
		btnX.setBounds(373, 215, 58, 50);
		contentPane.add(btnX);
		
		JButton Brechne_4_1 = new JButton("√");
		Brechne_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
	
				double zahl1 = 0.0;
				
				double erg = 0.0;

				zahl1 = Double.parseDouble(textField.getText());
				
				erg = Math.sqrt(zahl1);;
			txtErgebnis.setText("Ergebnis: " + erg);
			}
		});
		
		Brechne_4_1.setForeground(new Color(0, 0, 160));
		Brechne_4_1.setFont(new Font("Arial", Font.BOLD, 17));
		Brechne_4_1.setBackground(Color.MAGENTA);
		Brechne_4_1.setBounds(373, 143, 58, 52);
		contentPane.add(Brechne_4_1);
		
		txtGehrtMelanieBckner = new JTextField();
		txtGehrtMelanieBckner.setDisabledTextColor(new Color(0, 0, 160));
		txtGehrtMelanieBckner.setOpaque(false);
		txtGehrtMelanieBckner.setRequestFocusEnabled(false);
		txtGehrtMelanieBckner.setSelectedTextColor(new Color(0, 0, 160));
		txtGehrtMelanieBckner.setText("gehört Melanie Bückner, selbst gebaut");
		txtGehrtMelanieBckner.setHorizontalAlignment(SwingConstants.CENTER);
		txtGehrtMelanieBckner.setForeground(new Color(255, 0, 255));
		txtGehrtMelanieBckner.setEditable(false);
		txtGehrtMelanieBckner.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtGehrtMelanieBckner.setBackground(new Color(0, 0, 160));
		txtGehrtMelanieBckner.setBounds(10, 369, 421, 20);
		contentPane.add(txtGehrtMelanieBckner);
		txtGehrtMelanieBckner.setColumns(10);
		
		txtTaschenrechner = new JTextField();
		txtTaschenrechner.setText("Taschenrechner");
		txtTaschenrechner.setHorizontalAlignment(SwingConstants.CENTER);
		txtTaschenrechner.setForeground(Color.MAGENTA);
		txtTaschenrechner.setFont(new Font("Arial Black", Font.BOLD, 18));
		txtTaschenrechner.setEditable(false);
		txtTaschenrechner.setColumns(10);
		txtTaschenrechner.setBackground(new Color(0, 0, 160));
		txtTaschenrechner.setBounds(10, 11, 421, 44);
		contentPane.add(txtTaschenrechner);
		
		txtKomaeingabeMitEinem = new JTextField();
		txtKomaeingabeMitEinem.setSelectedTextColor(new Color(0, 0, 160));
		txtKomaeingabeMitEinem.setText("Kommaeingabe mit einem Punkt");
		txtKomaeingabeMitEinem.setHorizontalAlignment(SwingConstants.CENTER);
		txtKomaeingabeMitEinem.setForeground(Color.MAGENTA);
		txtKomaeingabeMitEinem.setFont(new Font("Arial Black", Font.BOLD, 18));
		txtKomaeingabeMitEinem.setEditable(false);
		txtKomaeingabeMitEinem.setColumns(10);
		txtKomaeingabeMitEinem.setBackground(new Color(0, 0, 160));
		txtKomaeingabeMitEinem.setBounds(10, 274, 421, 32);
		contentPane.add(txtKomaeingabeMitEinem);
	}
}
