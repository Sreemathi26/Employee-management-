package Employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class detail4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					detail4 frame = new detail4();
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
	public detail4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1490, 775);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel_3 = new JLabel("AWARDS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(353, 328, 161, 46);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("ACHIEVEMENTS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel.setBounds(586, 21, 420, 46);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(627, 153, 299, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("EMPLOYEE ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(372, 148, 219, 34);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userpage frame = new userpage();
				frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(353, 64, 134, 46);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-search (1).gif"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Suba@3107");
					
				   Statement st=con.createStatement();
					String sql="select * from achieve1 where emp_id=?";
					
					PreparedStatement pts=con.prepareStatement(sql);
					pts.setString(1,textField.getText());
					ResultSet rs= pts.executeQuery();
					
					
					while(rs.next()) {
					
					String fv=rs.getString("awards");
					String vv=rs.getString("certifications");
					String kv=rs.getString("credits");
					String fs=rs.getString("emp_of_month");
					
					String ks=rs.getString("emp_id");
					
					
					
					textField_1.setText(fv);
					textField_2.setText(vv);
					textField_3.setText(kv);
					textField_4.setText(fs);
					
					textField_5.setText(ks);
					
					
					
					
					}
			}
				catch(Exception ec) {
					JOptionPane.showMessageDialog(null,"it has not been registered");
					ec.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.setBounds(952, 153, 36, 34);
		contentPane.add(btnNewButton_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBounds(811, 328, 466, 46);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setBounds(811, 411, 466, 46);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setBounds(811, 495, 466, 46);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setBounds(811, 578, 466, 46);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_5.setBounds(811, 239, 466, 46);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		lblNewLabel_4 = new JLabel("CERTIFICATIONS");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_4.setBounds(353, 411, 226, 46);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_2 = new JLabel("CREDITS EARNED");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(353, 495, 226, 46);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_5 = new JLabel("EMPLOYEE OF THE MONTH");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_5.setBounds(352, 578, 352, 46);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("EMPLOYEE ID");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_6.setBounds(353, 239, 226, 46);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\fp18.jpg"));
		lblNewLabel_7.setBounds(0, 0, 1900, 1000);
		contentPane.add(lblNewLabel_7);
	}
}
