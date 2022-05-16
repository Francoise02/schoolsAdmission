import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;

public class Student_Slot extends JFrame {

	JFrame frame;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_Slot frame = new Student_Slot();
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
	public Student_Slot() {
		setTitle("STUDENTS PORTAL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 492);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(250, 240, 230));
		tabbedPane.setBounds(10, 11, 698, 442);
		contentPane.add(tabbedPane);
		
		JPanel admissionPanel = new JPanel();
		admissionPanel.setBackground(new Color(250, 240, 230));
		tabbedPane.addTab("Student Admission", null, admissionPanel, null);
		admissionPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hello!! Check the tab to see where you are assigned");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 27));
		lblNewLabel.setBounds(10, 82, 673, 187);
		admissionPanel.add(lblNewLabel);
		
		degrees cs = new degrees("Computer Science");
		degrees gc = new degrees("Global Challenge");
        degrees bs = new degrees("Business courses");
		
		JPanel gcPanel = new JPanel();
		gcPanel.setBackground(new Color(245, 255, 250));
		tabbedPane.addTab("Global Challenges", gc.InfoPanel);
		gcPanel.setLayout(null);
		
		table = new JTable();
		table.setBounds(46, 26, 579, 346);
		gcPanel.add(table);

		
		JPanel csPanel = new JPanel();
		csPanel.setBackground(new Color(240, 255, 255));
		tabbedPane.addTab("Computer Science",cs.InfoPanel);
		csPanel.setLayout(null);
		
		JPanel bsnssPanel = new JPanel();
		bsnssPanel.setBackground(new Color(230, 230, 250));
		tabbedPane.addTab("Business Courses", bs.InfoPanel);
		bsnssPanel.setLayout(null);
		
				
	}
}
