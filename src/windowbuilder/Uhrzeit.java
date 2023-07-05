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

public class Uhrzeit extends JFrame {

	private JPanel contentPane;
	private JTextField tfHours;
	private JTextField tfMinuits;
	private JLabel lblTime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uhrzeit frame = new Uhrzeit();
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
	public Uhrzeit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHours = new JLabel("Stunden");
		lblHours.setBounds(30, 32, 46, 14);
		contentPane.add(lblHours);
		
		JLabel lblMinuits = new JLabel("Minuten");
		lblMinuits.setBounds(187, 32, 46, 14);
		contentPane.add(lblMinuits);
		
		tfHours = new JTextField();
		tfHours.setBounds(10, 57, 105, 20);
		contentPane.add(tfHours);
		tfHours.setColumns(10);
		
		tfMinuits = new JTextField();
		tfMinuits.setBounds(167, 57, 105, 20);
		contentPane.add(tfMinuits);
		tfMinuits.setColumns(10);
		
		lblTime = new JLabel();
		lblTime.setBounds(30, 88, 155, 14);
		contentPane.add(lblTime);
		
		JButton btnSet = new JButton("Übernehmen");
		btnSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTime();
			}
		});
		btnSet.setBounds(300, 56, 89, 23);
		contentPane.add(btnSet);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(335, 227, 89, 23);
		contentPane.add(btnExit);
	}
	void setTime() {
		try {
			int hours, minuits;
			hours=Integer.parseInt(tfHours.getText());
			minuits=Integer.parseInt(tfMinuits.getText());
			if (hours<0||hours>23) throw new TimeException("Stunden");
			if (minuits<0||minuits>60) throw new TimeException("Minuten");
			
			lblTime.setText("Ihre Uhrzeit ist :  "+hours+":"+minuits+" Uhr.");
		}
		catch (TimeException e) {
			lblTime.setText("Die eingabe bei Feld "+e.getMessage()+" ist falsch");
		}
		catch (NumberFormatException e) {
			lblTime.setText("Ungültige Uhrzeit!");
		}
	}
}
