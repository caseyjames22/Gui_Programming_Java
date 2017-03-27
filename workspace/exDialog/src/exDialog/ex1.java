package exDialog;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ex1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex1 frame = new ex1();
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
	public ex1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlLeft = new JPanel();
		contentPane.add(pnlLeft, BorderLayout.WEST);
		pnlLeft.setLayout(new BoxLayout(pnlLeft, BoxLayout.Y_AXIS));
		
		JButton btnGreetingDialog = new JButton("Greeting");
		btnGreetingDialog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"Good Job");
			}
		});
		pnlLeft.add(btnGreetingDialog);
		
		JButton btnInputError = new JButton("Input Error");
		btnInputError.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(
						null, 
						"Please enter numbers only", 
						"Input Error", 
						JOptionPane.ERROR_MESSAGE);
			}
		});
		pnlLeft.add(btnInputError);
		
		JButton btnInputError2 = new JButton("Input Error 2");
		btnInputError2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final ImageIcon icon = new ImageIcon("numbers.jpeg");
				JOptionPane.showMessageDialog(
				null, 
				"Please enter numbers only", 
				"Input Error", 
				JOptionPane.ERROR_MESSAGE,
				icon);
			}
		});
		pnlLeft.add(btnInputError2);
	}

}