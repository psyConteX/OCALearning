package windowbuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FahrenheitCelsius extends JFrame {

	private JPanel contentPane;
	private JTextField tfCelsius;
	private JTextField tfFahrenheit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FahrenheitCelsius frame = new FahrenheitCelsius();
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
	public FahrenheitCelsius() {
		 setTitle("Umrechnung Fahrenheit Celsius");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setBounds(100, 100, 376, 162);
		 contentPane = new JPanel();
		 contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		 setContentPane(contentPane);
		 contentPane.setLayout(null);
		 
		 JLabel lblFahrenheit = new JLabel("Grad Fahrenheit");
		 lblFahrenheit.setBounds(10, 11, 157, 14);
		 contentPane.add(lblFahrenheit);
		 
		 tfFahrenheit = new JTextField();
		 tfFahrenheit.setBounds(10, 31, 200, 20);
		 contentPane.add(tfFahrenheit);
		 tfFahrenheit.setColumns(10);
		 
		 JLabel lblCelsius = new JLabel("Grad Celsius");
		 lblCelsius.setBounds(10, 62, 82, 14);
		 contentPane.add(lblCelsius);
		 
		 tfCelsius = new JTextField();
		 tfCelsius.setBounds(10, 82, 200, 20);
		 contentPane.add(tfCelsius);
		 tfCelsius.setColumns(10);
		 
		 JButton btnUmrechnen = new JButton("Umrechnen");
		 btnUmrechnen.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		umrechnen();
		 	}
		 });
		 btnUmrechnen.setBounds(240, 28, 89, 23);
		 contentPane.add(btnUmrechnen);
		 
		 JButton btnEnde = new JButton("Ende");
		 btnEnde.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		System.exit(0);
		 	}
		 });
		 btnEnde.setBounds(240, 81, 89, 23);
		 contentPane.add(btnEnde);
		}
	void umrechnen() {
		try {
		if (tfCelsius.getText().isBlank()) throw new NumberFormatException();
		double c = Double.parseDouble(tfCelsius.getText());
		double e = c+20;
		tfFahrenheit.setText(""+e);
		}
		catch (NumberFormatException e) {
		tfFahrenheit.setText("Du bist doof");	
		}
		finally {}
		}
	}


