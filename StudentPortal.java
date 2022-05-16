import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class StudentPortal extends JFrame {

	JFrame frame;	
	
	private JPanel contentPane;
	private JTextField namesField;
	private JTextField gradesField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentPortal frame = new StudentPortal();
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
	public StudentPortal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 437);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 235, 215));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titles = new JLabel("STUDENT INFORMATIONS");
		titles.setForeground(new Color(0, 0, 0));
		titles.setFont(new Font("Arial", Font.BOLD, 20));
		titles.setBounds(97, 35, 390, 26);
		contentPane.add(titles);
		
		JLabel namesLabel = new JLabel("Student Names");
		namesLabel.setFont(new Font("Arial", Font.BOLD, 14));
		namesLabel.setBounds(114, 85, 373, 26);
		contentPane.add(namesLabel);
		
		namesField = new JTextField();
		namesField.setBounds(114, 122, 373, 32);
		contentPane.add(namesField);
		namesField.setColumns(10);
		
		JLabel gradesLabel = new JLabel("Student Grade");
		gradesLabel.setFont(new Font("Arial", Font.BOLD, 14));
		gradesLabel.setBounds(114, 174, 373, 26);
		contentPane.add(gradesLabel);
		
		gradesField = new JTextField();
		gradesField.setBounds(114, 211, 373, 36);
		contentPane.add(gradesField);
		gradesField.setColumns(10);
		
		JButton infoButton = new JButton("SUBMIT");
		infoButton.setBorder(null);
		infoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == infoButton) {
                    String names=namesField.getText();
                    Integer grades= Integer.parseInt(gradesField.getText());
                    
                    
                    if (grades>=20||grades>=18) {
 	                   
	                    try {
	                    	Connection myConn= DriverManager.getConnection("jdbc:mysql://localhost:3306/programming_java","root","");
	                    	Statement myStmt= myConn.createStatement();
	                        String query = "insert into informations(stu_names,stu_grades,stu_degree,Id,roll_number) values ( ?, ?, ?,?,?)";
	                        int year = Calendar.getInstance().get(Calendar.YEAR);
	                        String roll_number = String.valueOf(year) + "/" + Log_In.user_id;
	                        PreparedStatement preparedStatement = myConn.prepareStatement(query);
	                        preparedStatement.setString(1, namesField.getText());
	                        preparedStatement.setString(2, gradesField.getText());
	                        preparedStatement.setString(3, "Computer Science");
	                        preparedStatement.setInt(4, Integer.parseInt(Log_In.user_id));
	                        preparedStatement.setString(5, roll_number);	                        
	                        int rows = preparedStatement.executeUpdate();
	                        
	                        if (rows > 0) {
	                            JOptionPane.showMessageDialog(null,"Information Submited, click Ok ");
	                            
	                            new Student_Slot().setVisible(true);	                                   
	                        }
	                        else {
	                        	JOptionPane.showMessageDialog(null, "Not registered!!");
	                        }
                        
                    }catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }			
				}
  
                    else if (grades>=17||grades>=15) {
  	                   
	                    try {
	                    	Connection myConn= DriverManager.getConnection("jdbc:mysql://localhost:3306/programming_java","root","");
	                    	Statement myStmt= myConn.createStatement();
	                        String query = "insert into informations(stu_names,stu_grades,stu_degree,Id,roll_number) values ( ?, ?, ?,?,?)";
	                        int year = Calendar.getInstance().get(Calendar.YEAR);
	                        String roll_number = String.valueOf(year) + "/" + Log_In.user_id;
	                        PreparedStatement preparedStatement = myConn.prepareStatement(query);
	                        preparedStatement.setString(1, namesField.getText());
	                        preparedStatement.setString(2, gradesField.getText());
	                        preparedStatement.setString(3, "Global Challenge");
	                        preparedStatement.setInt(4, Integer.parseInt(Log_In.user_id));
	                        preparedStatement.setString(5, roll_number);
	                        
	                   

	                        int rows = preparedStatement.executeUpdate();
	                        
	                        if (rows > 0) {
	                            JOptionPane.showMessageDialog(null,"Register is successfull, click Ok ");
	                            
	                            new Student_Slot().setVisible(true);	                                   
	                        }
	                        else {
	                        	JOptionPane.showMessageDialog(null, "Not registered!!");
	                        }
                        
                    }catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }			
				}
 
                    else if (grades>=14||grades>=12) {
   	                   
	                    try {
	                    	Connection myConn= DriverManager.getConnection("jdbc:mysql://localhost:3306/programming_java","root","");
	                    	Statement myStmt= myConn.createStatement();
	                        String query = "insert into informations(stu_names,stu_grades,stu_degree,Id,roll_number) values ( ?, ?, ?,?,?)";
	                        int year = Calendar.getInstance().get(Calendar.YEAR);
	                        String roll_number = String.valueOf(year) + "/" + Log_In.user_id;
	                        PreparedStatement preparedStatement = myConn.prepareStatement(query);
	                        preparedStatement.setString(1, namesField.getText());
	                        preparedStatement.setString(2, gradesField.getText());
	                        preparedStatement.setString(3, "Business courses");	                       
	                        preparedStatement.setInt(4, Integer.parseInt(Log_In.user_id));
	                        preparedStatement.setString(5, roll_number);
	                       
	                        int rows = preparedStatement.executeUpdate();
	                        
	                        if (rows > 0) {
	                            JOptionPane.showMessageDialog(null,"Information Submited, click Ok to to go your Portal");
	                            
	                            new Student_Slot().setVisible(true);	                                   
	                        }
	                        else {
	                        	JOptionPane.showMessageDialog(null, "Not registered!!");
	                        }
                        
                    }catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }	
	                   	                    
				}
				
				}
			}
		});
		infoButton.setBackground(new Color(255, 140, 0));
		infoButton.setForeground(Color.WHITE);
		infoButton.setFont(new Font("Arial", Font.BOLD, 15));
		infoButton.setBounds(114, 280, 373, 36);
		contentPane.add(infoButton);
	}
}
