
import java.sql.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Log_In extends JFrame {
 
	JFrame frame;
	
	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;
	static String user_id = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Log_In frame = new Log_In();
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
	public Log_In() {
		setBackground(new Color(0, 139, 139));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 416);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 235, 215));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Sign-In Form");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(138, 44, 329, 61);
		contentPane.add(lblNewLabel_1);
		
		JLabel usernameLabel = new JLabel("UserName");
		usernameLabel.setFont(new Font("Arial", Font.BOLD, 14));
		usernameLabel.setBounds(120, 116, 347, 14);
		contentPane.add(usernameLabel);
		
		usernameField = new JTextField();
		usernameField.setBounds(120, 141, 347, 32);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("Arial", Font.BOLD, 14));
		passwordLabel.setBounds(120, 198, 347, 22);
		contentPane.add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(120, 224, 347, 32);
		contentPane.add(passwordField);
		
		JButton loginButton = new JButton("Sign-In");
		loginButton.setForeground(Color.WHITE);
		loginButton.setBackground(new Color(255, 140, 0));
		loginButton.setBorder(null);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
//					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection myConn= DriverManager.getConnection("jdbc:mysql://localhost:3306/programming_java","root","");					
					Statement myStmt= myConn.createStatement();
					String sql="select * from login where User_name='"+usernameField.getText()+"' and Password='"+passwordField.getText().toString()+"'";
					ResultSet rs=myStmt.executeQuery(sql);
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Login Successfully, Click OK to go to student portal form");
						user_id =String.valueOf(rs.getInt("Id"));
					    new StudentPortal().setVisible(true);
					}    
					else
						JOptionPane.showMessageDialog(null, "Incorrect Username and Password");
					
					myConn.close();
				}catch(Exception e1) {System.out.print(e1);}
				
			}
		});
		loginButton.setFont(new Font("Arial", Font.BOLD, 16));
		loginButton.setBounds(120, 278, 347, 32);
		contentPane.add(loginButton);
		setLocationRelativeTo(null);
		
		
	}
}
