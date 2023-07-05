package windowbuilder;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.DefaultListModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ContainerA2 extends JFrame {

	private JPanel contentPane;				
	private JTextField tfCountMesswerte;
	private JTextField tfMesswertEingabe;
	private JTextField tfMesswertChange;
	private JTextField tfMesswertValue;
	private JLabel lblCountMesswerte;
	private JButton btnCountMesswerte;
	private JLabel lblMesswertChange;
	private JLabel lblMesswertEingabe;
	private JButton btnMesswertEingabe;
	private JLabel lblMesswertValue;
	private JButton btnMesswertChange;
	private JButton btnMesswertValue;
	private JButton btnMesswertEvaluate;
	private JLabel lblMesswertMax;
	private JLabel lblMesswertMin;
	private JLabel lblMesswertAverage;
	DefaultListModel<Double> doubleList;
	//private JList<double[]> list;
	//int arraySize; deprecated
	double messwertValues[];
	double messwertMin=Double.MAX_VALUE, messwertMax=Double.MIN_VALUE, messwertSumm;
	int counter=0;
	int tempMesswert;
	private JList<Double> list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContainerA2 frame = new ContainerA2();
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
	public ContainerA2() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCountMesswerte = new JLabel("Wieviele Messwerte sollen eingegeben werden?");
		lblCountMesswerte.setBounds(10, 10, 341, 13);
		contentPane.add(lblCountMesswerte);
		
		tfCountMesswerte = new JTextField();
		tfCountMesswerte.setBounds(336, 7, 96, 19);
		contentPane.add(tfCountMesswerte);
		tfCountMesswerte.setColumns(10);
		
		btnCountMesswerte = new JButton("OK");
		btnCountMesswerte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				messwertValues = new double[Integer.parseInt(tfCountMesswerte.getText())];
				switchCountMesswerte();
				switchMesswertEingabe();
				}
				catch (NumberFormatException r) {
					tfCountMesswerte.setText("Error");
				}
			}
		});
		btnCountMesswerte.setBounds(441, 6, 85, 21);
		contentPane.add(btnCountMesswerte);
		
		lblMesswertEingabe = new JLabel("Messwert");
		lblMesswertEingabe.setVisible(false);
		lblMesswertEingabe.setBounds(10, 52, 45, 13);
		contentPane.add(lblMesswertEingabe);
		
		tfMesswertEingabe = new JTextField();
		tfMesswertEingabe.setVisible(false);
		tfMesswertEingabe.setColumns(10);
		tfMesswertEingabe.setBounds(10, 75, 96, 19);
		contentPane.add(tfMesswertEingabe);
		
		btnMesswertEingabe = new JButton("OK");
		btnMesswertEingabe.setVisible(false);
		btnMesswertEingabe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					messwertValues[counter]=Integer.parseInt(tfMesswertEingabe.getText());
					counter++;
					//list.add(messwertValues);
					if (counter==messwertValues.length) {
						switchMesswertEingabe();
						switchMesswertChange();
						switchMesswertValue();
						doubleList = new DefaultListModel<Double>();
						for (double d : messwertValues) doubleList.addElement(d);
						list.setModel(doubleList);
					}
				}
				catch (NumberFormatException r) {
					
				}
			}
		});
		btnMesswertEingabe.setBounds(116, 74, 85, 21);
		contentPane.add(btnMesswertEingabe);
		
		lblMesswertChange = new JLabel("Messwert: Nr.");
		lblMesswertChange.setVisible(false);
		lblMesswertChange.setBounds(10, 104, 85, 13);
		contentPane.add(lblMesswertChange);
		
		tfMesswertChange = new JTextField();
		tfMesswertChange.setVisible(false);
		tfMesswertChange.setColumns(10);
		tfMesswertChange.setBounds(10, 127, 96, 19);
		contentPane.add(tfMesswertChange);
		
		btnMesswertChange = new JButton("Bearbeiten");
		btnMesswertChange.setVisible(false);
		btnMesswertChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					tempMesswert=Integer.parseInt(tfMesswertChange.getText())-1;
					tfMesswertValue.setText(""+messwertValues[tempMesswert]);
					lblMesswertValue.setText("Wert: Nr."+(tempMesswert+1));

				}
				catch (NumberFormatException r) {
					//pingpongdingdong
				}
				catch (ArrayIndexOutOfBoundsException r) {
					//blengblong
				}

			}
		});
		btnMesswertChange.setBounds(116, 126, 85, 21);
		contentPane.add(btnMesswertChange);
		
		lblMesswertValue = new JLabel("Wert");
		lblMesswertValue.setVisible(false);
		lblMesswertValue.setBounds(10, 177, 85, 13);
		contentPane.add(lblMesswertValue);
		
		tfMesswertValue = new JTextField();
		tfMesswertValue.setVisible(false);
		tfMesswertValue.setColumns(10);
		tfMesswertValue.setBounds(10, 200, 96, 19);
		contentPane.add(tfMesswertValue);
		
		btnMesswertValue = new JButton("Speichern");
		btnMesswertValue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doubleList.set(tempMesswert, Double.parseDouble(tfMesswertValue.getText()));
				messwertValues[tempMesswert]=Double.parseDouble(tfMesswertValue.getText());
			}
		});
		btnMesswertValue.setVisible(false);

		btnMesswertValue.setBounds(116, 199, 85, 21);
		contentPane.add(btnMesswertValue);
		
		btnMesswertEvaluate = new JButton("Messreihe auswerten");
		btnMesswertEvaluate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for (double i: messwertValues) {
					messwertSumm+=i;
					if (i>messwertMax) messwertMax=i;
					if (i<messwertMin) messwertMin=i;
				}
				lblMesswertMin.setText("Messwert Minimum : "+messwertMin);
				lblMesswertMax.setText("Messwert Maximum : "+messwertMax);
				lblMesswertAverage.setText("Mittelwert : "+(messwertSumm/messwertValues.length));
				messwertMin=Double.MAX_VALUE;
				messwertMax=Double.MIN_NORMAL;
				messwertSumm=0;
				//lblMesswertMin.setText();
			}
		});
		btnMesswertEvaluate.setVisible(false);
		btnMesswertEvaluate.setBounds(10, 236, 191, 21);
		contentPane.add(btnMesswertEvaluate);
		
		lblMesswertMax = new JLabel("Messwert Maximum");
		lblMesswertMax.setBounds(10, 278, 146, 13);
		contentPane.add(lblMesswertMax);
		
		lblMesswertMin = new JLabel("Messwert Minimum");
		lblMesswertMin.setBounds(10, 301, 146, 13);
		contentPane.add(lblMesswertMin);
		
		lblMesswertAverage = new JLabel("Mittelwert");
		lblMesswertAverage.setBounds(10, 324, 146, 13);
		contentPane.add(lblMesswertAverage);
		
		

		list = new JList<Double>();
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tempMesswert=list.getSelectedIndex();
				tfMesswertChange.setText(""+messwertValues[list.getSelectedIndex()]);
			}
		});
		list.setBounds(265, 77, 191, 223);
		contentPane.add(list);
		


		
		
	}
	void switchCountMesswerte() {
		switchVisible(tfCountMesswerte);
		switchVisible(lblCountMesswerte);
		switchVisible(btnCountMesswerte);
	}
	void switchMesswertEingabe() {
		switchVisible(tfMesswertEingabe);
		switchVisible(lblMesswertEingabe);
		switchVisible(btnMesswertEingabe);
	}
	void switchMesswertChange() {
		switchVisible(tfMesswertChange);
		switchVisible(lblMesswertChange);
		switchVisible(btnMesswertChange);
	}
	void switchMesswertValue() {
		switchVisible(tfMesswertValue);
		switchVisible(lblMesswertValue);
		switchVisible(btnMesswertValue);
		switchVisible(btnMesswertEvaluate);
	}
	 void switchVisible(JButton e) {
		e.setVisible(!e.isVisible());
	}
	void switchVisible(JLabel e) {
		e.setVisible(!e.isVisible());
	}
	void switchVisible(JTextField e) {
		e.setVisible(!e.isVisible());
	}
}
