package team;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class sms extends JFrame {

	private JPanel contentPane;

	

	public sms() {
		setBackground(Color.black);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.black);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("You have booked sucessfully");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 16));
		lblNewLabel.setBounds(123, 71, 215, 74);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Thank you");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(172, 134, 99, 66);
		contentPane.add(lblNewLabel_1);
		
	
	}

}
