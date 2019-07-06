import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setBackground(new Color(0, 0, 139));
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("DOCTOR APPOINTMENT SYSTEM");
		setBounds(100, 100, 620, 411);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomePage = new JLabel("WELCOME PAGE");	
		lblWelcomePage.setForeground(new Color(30, 144, 255));
		lblWelcomePage.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblWelcomePage.setBounds(215, 35, 170, 26);
		contentPane.add(lblWelcomePage);
		
		JButton btnAdminLogin = new JButton("ADMIN LOGIN");
		btnAdminLogin.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnAdminLogin.setForeground(new Color(139, 69, 19));
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admins a=new Admins();
				a.setVisible(true);
			dispose();
			}
		});
		btnAdminLogin.setBounds(67, 257, 140, 23);
		contentPane.add(btnAdminLogin);
		
		JButton btnReceptionistLogin = new JButton("RECEPTIONIST LOGIN");
		btnReceptionistLogin.setForeground(new Color(128, 0, 0));
		btnReceptionistLogin.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnReceptionistLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Recep a=new Recep();
				a.setVisible(true);
				dispose();
				
			}
		});
		btnReceptionistLogin.setBounds(365, 257, 189, 23);
		contentPane.add(btnReceptionistLogin);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		//lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Meena\\Pictures\\Camera Roll\\Admin-icon.png"));
		lblNewLabel_1.setBounds(67, 87, 150, 161);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Meena\\Pictures\\Camera Roll\\receptionist-icon.png"));
		lblNewLabel.setBounds(394, 87, 122, 147);
		contentPane.add(lblNewLabel);
	}
}
