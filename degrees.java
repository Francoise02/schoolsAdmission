import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;


public class degrees {

JPanel InfoPanel = new JPanel();

    
    public degrees(String courses) {
        JTable students = new JTable();
        students.setSize(400,400);
        students.setLocation(0,0);
        
        InfoPanel.setBounds(0,0,450,450);
        
        
        JScrollPane scrollbar = new JScrollPane(students,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        InfoPanel.add(scrollbar);
        
        try { 
        	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/programming_java","root","");
             Statement stmt=    con.createStatement();
             String sql="Select * from informations where stu_degree='"+ courses+"'";
            ResultSet rs = stmt.executeQuery(sql);
            String[] columns = {"Roll number","Names","Grade"};
            DefaultTableModel model = (DefaultTableModel)students.getModel();
            model.setColumnIdentifiers(columns);
            
            String rollNum;
            String names;
            String grade;        
            
            while (rs.next()){
                rollNum = rs.getString("roll_number");
                names = rs.getString("stu_names");
                grade = rs.getString("stu_grades");
//                degree = rs.getString("Grades");
                
                String[] record = {rollNum,names,grade};
                model.addRow(record);
            }
            
            con.close();
        } catch(Exception e1){System.out.print(e1); 
            
        }
        InfoPanel.setVisible(true);
    }
	
}


