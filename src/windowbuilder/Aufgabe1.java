package windowbuilder;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Aufgabe1 {
	JPanel contentPane;
	JLabel lblGraf;
	JLabel lblJC;
	JTextField tfGraf;
	JTextField tfJC;
	JButton swapCookie;
	boolean cookieStatus;
	
	Aufgabe1(
		JPanel contentPane,
		JLabel lblGraf,
		JLabel lblJC,
		JTextField tfGraf,
		JTextField tfJC,
		JButton swapCookie,
		boolean cookieStatus) {

		this.contentPane=contentPane;
		this.lblGraf=lblGraf;
		this.lblJC=lblJC;
		this.tfGraf=tfGraf;
		this.tfJC=tfJC;
		this.swapCookie=swapCookie;
		this.cookieStatus=cookieStatus;
	}
	
	
	void callAufgabe1() {
		Cookie herbert = new Cookie();
		
		lblGraf.setBounds(657, 11, 86, 23);
		contentPane.add(lblGraf);
		
		JButton CookieClicker = new JButton("Cookie");
		CookieClicker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cookieStatus) {
					Cookie.count();
					double fahrenheit = Double.parseDouble(tfGraf.getText());
					double celsius = (fahrenheit - 32) * 5 /9;
					tfJC.setText(String.format("%.2f", celsius));
					CookieClicker.setText("Cookie : "+Cookie.counter);
					tfGraf.requestFocus();
					tfGraf.selectAll();
				}
				else {
					Cookie.count();
					double zoll = Double.parseDouble(tfGraf.getText());
					double cm = zoll*2.54;
					tfJC.setText(String.format("%.2f", cm));
					CookieClicker.setText("Cookie : "+Cookie.counter);
					tfGraf.requestFocus();
					tfGraf.selectAll();
				}
			}
		});
		CookieClicker.setBackground(new Color(0, 128, 255));
		CookieClicker.setBounds(793, 35, 122, 23);
		contentPane.add(CookieClicker);

		
		tfGraf = new JTextField();
		
		tfGraf.addKeyListener(new KeyAdapter() { //anonyme override||sinnvoller ein objekt zu erstellen für immer wieder gleiche funktion?
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				//Function()
					CookieClicker.doClick();
				}
			}
												});
		
		tfGraf.setBounds(610, 35, 173, 25);
		contentPane.add(tfGraf);
		tfGraf.setColumns(10);
		
		
		lblJC.setBounds(925, 12, 147, 20);
		contentPane.add(lblJC);
		
		tfJC = new JTextField();
		tfJC.setBounds(925, 35, 147, 25);
		contentPane.add(tfJC);
		tfJC.setColumns(10);
		
		swapCookie = new JButton("SwapCookie");
		swapCookie.addActionListener(new ActionListener() { //swap zwischen zoll rechner und fahrenheit rechner
			public void actionPerformed(ActionEvent e) {
				changeCookieStatus();
			}
		});
		swapCookie.setBounds(406, 35, 181, 23);
		contentPane.add(swapCookie);
	}
	void destA1() {
	contentPane.removeAll();
	}
	
	
	void changeCookieStatus() {
		if (cookieStatus) {
			cookieStatus=false;
			lblJC.setText("cm");
			lblGraf.setText("Zoll");
		}
		else {
			cookieStatus=true;
			lblGraf.setText("Graf Fahrenheit");
			lblJC.setText("Julies Celsius");
		}
	}
}
