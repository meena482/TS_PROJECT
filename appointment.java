import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class appointment extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					appointment frame = new appointment();
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
	public appointment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSetAppointment = new JLabel("SET APPOINTMENT");
		lblSetAppointment.setBounds(160, 11, 153, 14);
		contentPane.add(lblSetAppointment);
		
		JLabel lblDoctorDetails = new JLabel("DOCTOR NAME");
		lblDoctorDetails.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDoctorDetails.setForeground(Color.BLUE);
		lblDoctorDetails.setBounds(38, 57, 100, 14);
		contentPane.add(lblDoctorDetails);
		
		textField = new JTextField();
		textField.setBounds(137, 54, 176, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appoint1 a=new appoint1();
				a.setVisible(true);
				dispose();
			}
		});
		btnNext.setBounds(160, 187, 89, 23);
		contentPane.add(btnNext);
	}
}
