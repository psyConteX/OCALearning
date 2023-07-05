package windowbuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContainerA1 extends JFrame {

	private JPanel contentPane;
	private JTextField tFarrayCount;
	private JTextField tfZahl;
	private String textBwrd="Ausgabe rückwärts : ";
	private String textFwrd="Ausgabe vorwärts : ";
	private JLabel lblAusgabefwrd;
	private JLabel lblAusgabebwrd;
	private boolean anzeigeArraycount = true;
	private boolean anzeigeZahlArray = false;
	private JLabel lblZahl;
	private int counter=0;
	private int arraySize;
	JButton btnEingabe;
	 int ZahlArray[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContainerA1 frame = new ContainerA1();
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
	public ContainerA1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblArrayCount = new JLabel("Wieviel Zahlen sollen eingegegeben werden?");
		lblArrayCount.setBounds(43, 31, 381, 23);
		contentPane.add(lblArrayCount);
		
		tFarrayCount = new JTextField();
		tFarrayCount.setBounds(440, 33, 96, 19);
		contentPane.add(tFarrayCount);
		tFarrayCount.setColumns(10);
		
		JButton btnArrayCount = new JButton("OK");
		
		btnArrayCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//text=textFwrd+", "+Integer.parseInt(tfZahl.getText());
					arraySize=Integer.parseInt(tFarrayCount.getText());
					ZahlArray=new int[arraySize];
					textFwrd="Ausgabe vorwärts : ";
					textBwrd="Ausgabe rückwärts : ";
					anzeigeArraycount = false;
					anzeigeZahlArray = true;
					btnArrayCount.setVisible(anzeigeArraycount);
					lblArrayCount.setVisible(anzeigeArraycount);
					tFarrayCount.setVisible(anzeigeArraycount);
					lblZahl.setVisible(anzeigeZahlArray);
					tfZahl.setVisible(anzeigeZahlArray);
					lblAusgabefwrd.setVisible(anzeigeZahlArray);
					lblAusgabebwrd.setVisible(anzeigeZahlArray);
					btnEingabe.setVisible(anzeigeZahlArray);
					tFarrayCount.setText("");
				}
				catch (NumberFormatException f) {
					tFarrayCount.setText("Falsch eingabe");
				}
			}
		});

		btnArrayCount.setBounds(546, 32, 85, 21);
		btnArrayCount.setVisible(anzeigeArraycount);
		contentPane.add(btnArrayCount);
		
		tfZahl = new JTextField();
		tfZahl.setBounds(43, 157, 96, 19);
		contentPane.add(tfZahl);
		tfZahl.setVisible(anzeigeZahlArray);
		tfZahl.setColumns(10);
		//tfZahl.setVisible(anzeigeArraycount);
		
		lblZahl = new JLabel("Zahl");
		lblZahl.setBounds(43, 134, 45, 13);
		contentPane.add(lblZahl);
		lblZahl.setVisible(anzeigeZahlArray);
		

		
		btnEingabe = new JButton("Zahl uebernehmen");
		btnEingabe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ZahlArray[counter] = Integer.parseInt(tfZahl.getText());
					counter++;
					if (counter==arraySize) {
						for (int i=0;i<=arraySize-1;i++) {
							textFwrd+=ZahlArray[i]+", ";
							textBwrd+=ZahlArray[counter---1]+", ";
						}
						textFwrd=textFwrd.substring(0, textFwrd.length()-2);
						textBwrd=textBwrd.substring(0, textBwrd.length()-2);
					lblAusgabefwrd.setText(textFwrd);
					lblAusgabebwrd.setText(textBwrd);
					anzeigeArraycount = true;
					anzeigeZahlArray = false;
					btnArrayCount.setVisible(anzeigeArraycount);
					lblArrayCount.setVisible(anzeigeArraycount);
					tFarrayCount.setVisible(anzeigeArraycount);
					lblZahl.setVisible(anzeigeZahlArray);
					tfZahl.setVisible(anzeigeZahlArray);
					btnEingabe.setVisible(anzeigeZahlArray);
					lblAusgabefwrd.setVisible(true);
					lblAusgabebwrd.setVisible(true);
					tfZahl.setText("");
					}
				}
				catch (NumberFormatException f) {
					tfZahl.setText("Falsch eingabe");
				}
			}
		});
		btnEingabe.setBounds(149, 156, 127, 21);
		contentPane.add(btnEingabe);
		btnEingabe.setVisible(anzeigeZahlArray);
		
		lblAusgabefwrd = new JLabel(textFwrd);
		lblAusgabefwrd.setBounds(43, 318, 493, 13);
		contentPane.add(lblAusgabefwrd);
		lblAusgabefwrd.setVisible(anzeigeZahlArray);
		
		
		
		lblAusgabebwrd = new JLabel(textBwrd);
		lblAusgabebwrd.setBounds(43, 341, 493, 13);
		contentPane.add(lblAusgabebwrd);
		lblAusgabebwrd.setVisible(anzeigeZahlArray);

	}
}
