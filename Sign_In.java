import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.sql.*;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Sign_In extends JFrame {

	JFrame frame;
	private JPanel sign_in;
	private JTextField usernameField;
	private JTextField emailField;
	private JPasswordField passwordField;
//	static String user_id = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sign_In frame = new Sign_In();
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
	public Sign_In() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 469);
		sign_in = new JPanel();
		sign_in.setBackground(new Color(250, 235, 215));
		sign_in.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(sign_in);
		sign_in.setLayout(null);
		
		JLabel titleLabel = new JLabel("Student Sign-Up ");
		titleLabel.setForeground(new Color(0, 0, 0));
		titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
		titleLabel.setBounds(133, 38, 338, 24);
		sign_in.add(titleLabel);
		
		JLabel usernameLabel = new JLabel("Student UserName");
		usernameLabel.setFont(new Font("Arial", Font.BOLD, 14));
		usernameLabel.setBounds(133, 93, 338, 24);
		sign_in.add(usernameLabel);
		
		usernameField = new JTextField();
		usernameField.setBounds(133, 128, 338, 30);
		sign_in.add(usernameField);
		usernameField.setColumns(10);
		
		JLabel emailLabel = new JLabel("Student Email");
		emailLabel.setFont(new Font("Arial", Font.BOLD, 14));
		emailLabel.setBounds(133, 184, 338, 14);
		sign_in.add(emailLabel);
		
		emailField = new JTextField();
		emailField.setBounds(133, 209, 338, 30);
		sign_in.add(emailField);
		emailField.setColumns(10);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("Arial", Font.BOLD, 14));
		passwordLabel.setBounds(133, 250, 338, 34);
		sign_in.add(passwordLabel);
		
		JButton signButton = new JButton("SIGN-IN");
		signButton.setBorder(null);
		signButton.setBackground(new Color(255, 140, 0));
		signButton.setForeground(Color.WHITE);
		signButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == signButton) {
//					String URL = "jdbc:mysql://localhost:3306/summative";
//					String username = "root";
//                    String password = "";
                    String usernames=usernameField.getText();
                    String emails= emailField.getText();
                    String pass= passwordField.getText();
                    
                    String tp = String.valueOf(passwordField.getPassword());
                    
                    try {
                    	Connection myConn= DriverManager.getConnection("jdbc:mysql://localhost:3306/programming_java","root","");
                    	Statement myStmt= myConn.createStatement();
                        String query = "insert into login( User_name, Email, Password) values (?, ?, ?)";
                        PreparedStatement preparedStatement = (PreparedStatement) myConn.prepareStatement(query);
                        preparedStatement.setString(1, usernameField.getText());
                        preparedStatement.setString(2, emailField.getText());
                        preparedStatement.setString (3, passwordField.getText());
//                        preparedStatement.setString   (3, tp.toString());
                        int rows = preparedStatement.executeUpdate();
                        
                        if (rows > 0) {
                            JOptionPane.showMessageDialog(null," Sign-up uccessfully!!");
                            
                            new Log_In().setVisible(true);
                                   // JOptionPane.INFORMATION_MESSAGE);
                            return;  
                        }
                        
                    }catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    				
				}
			}
		});
		signButton.setFont(new Font("Arial", Font.BOLD, 16));
		signButton.setBounds(133, 340, 338, 30);
		sign_in.add(signButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(133, 283, 338, 39);
		sign_in.add(passwordField);
	}
}
