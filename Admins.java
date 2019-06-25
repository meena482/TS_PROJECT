import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;

public class Admins extends JFrame {
	protected static final Admins Success = null;
	static Admins frame;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Admins();
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
	public Admins() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 356);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAdminLoginForm = new JLabel("Admin Login");
		lblAdminLoginForm.setBounds(218, 11, 113, 22);
		lblAdminLoginForm.setForeground(new Color(65, 105, 225));
		lblAdminLoginForm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblEnterName = new JLabel("Enter Name:");
		lblEnterName.setBounds(130, 81, 88, 18);
		lblEnterName.setForeground(new Color(128, 0, 0));
		lblEnterName.setFont(new Font("Verdana", Font.PLAIN, 14));
		
		JLabel lblEnterPassword = new JLabel("Enter Password:");
		lblEnterPassword.setBounds(130, 120, 116, 18);
		lblEnterPassword.setForeground(new Color(128, 0, 0));
		lblEnterPassword.setFont(new Font("Verdana", Font.PLAIN, 14));
		
		textField = new JTextField();
		textField.setBounds(277, 79, 108, 20);
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(218, 198, 86, 37);
		btnLogin.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnLogin.addActionListener(new ActionListener() {
			private String admins;

			public void actionPerformed(ActionEvent e) {
			String name=textField.getText();
			String password=String.valueOf(passwordField.getPassword());
			if(name.equals("meena")&&password.equals("8263")){
				Java_Insert_Update_Delete_Display.main(new String[]{});
				setVisible(true);
				dispose();
			}else{
				JOptionPane.showMessageDialog(Admins.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
				
			}
			}
		});
		
		passwordField = new JPasswordField();
		passwordField.setBounds(277, 120, 108, 22);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 51, 108, 110);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Meena\\Pictures\\Camera Roll\\administrator-icon.png"));
		contentPane.add(lblNewLabel);
		contentPane.add(lblAdminLoginForm);
		contentPane.add(lblEnterName);
		contentPane.add(lblEnterPassword);
		contentPane.add(passwordField);
		contentPane.add(textField);
		contentPane.add(btnLogin);
	}
}
