package windowbuilder;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class NewIFrame extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewIFrame frame = new NewIFrame();
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
	public NewIFrame() {
		setBounds(100, 100, 450, 300);

	}

}
