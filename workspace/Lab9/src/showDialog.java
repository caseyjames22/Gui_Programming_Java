import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class showDialog extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					showDialog frame = new showDialog();
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
	public showDialog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JButton btnShowMessage = new JButton("Show Message");
		btnShowMessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Please enter a number for the hours worked");
			}
		});
		panel.add(btnShowMessage);
		
		JButton btnShowConfirm = new JButton("Show Confirm");
		btnShowConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				int selectedOption = JOptionPane.showConfirmDialog(
						contentPane, 
						"Exit without saving?", 
						"Warning: File Not Saved",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.WARNING_MESSAGE);
				
				if (selectedOption == JOptionPane.YES_OPTION) 
				{
					dispose();
				}
			}
		});
		panel.add(btnShowConfirm);
		
		final JLabel lbllastName = new JLabel("Good Morning: <lastName>");
		
		JButton btnShowInput = new JButton("Show Input");
		btnShowInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String lastName = (String)JOptionPane.showInputDialog(
						"Enter Last Name"
						);
			if ((lastName != null) && (lastName.length() > 0)) {
				System.out.println("Last Name: " + lastName);				
				lbllastName.setText("Good Morning " + lastName + "!");
				    return;
				}
			else{
				System.out.println("No name was entered");
			}}
		});
		panel.add(btnShowInput);
		
		JButton btnShowOption = new JButton("Show Option");
		btnShowOption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = {"UPS","Second-Day Air","FEDEX"};
				int n = JOptionPane.showOptionDialog(
						contentPane,
						"Choose one of the following",
						"Mailing Choice",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, options, options[0]);
			}
		});
		
	
		panel.add(lbllastName);
		panel.add(btnShowOption);
		
		JButton btnShowGeneralDialog = new JButton("Show General Dialog");
		btnShowGeneralDialog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = (String)JOptionPane.showInputDialog(
						"Enter Name"
						);
			if ((name != null) && (name.length() > 0)) {
				System.out.println("Name: " + name);
				return; 
			}else
				System.out.println("No name was entered");
			}
		});
		panel.add(btnShowGeneralDialog);
	}

}
