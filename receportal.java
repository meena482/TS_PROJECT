import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class receportal extends JFrame {

	private JPanel SET;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					receportal frame = new receportal();
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
	public receportal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		SET = new JPanel();
		SET.setBackground(new Color(255, 255, 255));
		SET.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(SET);
		SET.setLayout(null);
		
		JLabel lblReceptionistPortal = new JLabel("RECEPTIONIST PORTAL");
		lblReceptionistPortal.setForeground(new Color(0, 0, 139));
		lblReceptionistPortal.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblReceptionistPortal.setBounds(120, 11, 187, 14);
		SET.add(lblReceptionistPortal);
		
		JButton btnSetAppointment = new JButton("SET APPOINTMENT");
		btnSetAppointment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appointment a =new appointment();
				a.setVisible(true);
				dispose();
			}
		});
		btnSetAppointment.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnSetAppointment.setBounds(10, 85, 170, 23);
		SET.add(btnSetAppointment);
		
		JButton btnPatientDetails = new JButton("PATIENT DETAILS");
		btnPatientDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingJtable a=new SwingJtable();
				a.setVisible(true);
				dispose();
			}
		});
		btnPatientDetails.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnPatientDetails.setBounds(10, 142, 170, 23);
		SET.add(btnPatientDetails);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Meena\\Pictures\\Camera Roll\\images (4).jpg"));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(205, 54, 378, 166);
		SET.add(lblNewLabel);
	}
}
