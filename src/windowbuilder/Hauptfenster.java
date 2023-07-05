package windowbuilder;

import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.JTabbedPane;

public class Hauptfenster extends JFrame {

	private JPanel contentPane;
	private JLabel lblGraf = new JLabel("Graf Fahrenheit");
	private JLabel lblJC = new JLabel("Julius Celsius");
	private JTextField tfGraf;
	private JTextField tfJC;
	private JButton swapCookie;
	private boolean cookieStatus=true;
	private boolean A1=false;
	private boolean A2=false;
	private boolean A3=false;
		

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {

					Hauptfenster frame = new Hauptfenster();
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
	public Hauptfenster() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1425, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
//// TOOK EVERYTHING OUT OF THIS INTO AUFGABE1
		Aufgabe1 af1 = new Aufgabe1(contentPane, lblGraf, lblJC, tfGraf, tfJC, swapCookie, cookieStatus);//not gud
		JInternalFrame A2internalFrame = new JInternalFrame("A2Frame");
		A2internalFrame.setBounds(109, 11, 1279, 484);
		contentPane.add(A2internalFrame);
		JInternalFrame A3internalFrame = new JInternalFrame("A3Frame");
		A3internalFrame.setBounds(108, 11, 1279, 484);
		contentPane.add(A3internalFrame);
		
		//A1internalFrame.setVisible(true); maybe later haha
		
		JButton Aufgabe1 = new JButton("A1"); // diff button
		Aufgabe1.setBounds(10, 11, 89, 23);
		contentPane.add(Aufgabe1);
		
		JButton a2Btn = new JButton("A2");
		a2Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A2=toggleAufgabe(A2,A2internalFrame,a2Btn);
			}
		});
		a2Btn.setBounds(10, 45, 89, 23);
		contentPane.add(a2Btn);
		
		JButton a3Btn = new JButton("A3");
		a3Btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				A3=toggleAufgabe(A3,A3internalFrame,a3Btn);
			}
		});
		a3Btn.setBounds(10, 79, 89, 23);
		contentPane.add(a3Btn);
		


	}
	public boolean toggleAufgabe(boolean aufgabeNr, JInternalFrame iFrameNr, JButton buttonVar) { //toggle return für bool
			if (aufgabeNr==false) { 
				iFrameNr.setVisible(true);
				iFrameNr.validate();
				//contentPane.add(iFrameNr);
				contentPane.repaint();
				return true;
			}
			else {
				iFrameNr.setVisible(false);
				//contentPane.remove(iFrameNr);
				iFrameNr.invalidate();
				contentPane.repaint();
				return false;
			}
	}
	public boolean hasDigit(String string) {
		for (char c : string.toCharArray()) {
		if (Character.isDigit(c)) {return true;}
		}
		return false;
		}
}
