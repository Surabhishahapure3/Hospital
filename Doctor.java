package pro;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Doctor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JPasswordField p1;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doctor frame = new Doctor();
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
	public Doctor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 888, 762);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(444, 10, 1, 1);
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("HOSPITAL MANAGEMENT SYSTEM");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(245, 25, 383, 27);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 0, 874, 111);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("HOSPITAL MANAGEMENT SYSTEM");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(223, 26, 383, 27);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("MANAGE DOCTORS");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(277, 63, 383, 27);
		panel_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h1 = new Home();
				h1.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(753, 63, 97, 27);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("DOCTOR INFORMATION");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(311, 121, 273, 38);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("ID");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_1.setBounds(23, 184, 58, 38);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("NAME");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_2.setBounds(23, 239, 273, 38);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("PASSWORD");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_3.setBounds(521, 184, 125, 38);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("EXPERIENCE");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_4.setBounds(521, 239, 136, 38);
		contentPane.add(lblNewLabel_2_4);
		
		t1 = new JTextField();
		t1.setBounds(151, 197, 177, 26);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(151, 252, 177, 26);
		contentPane.add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(660, 249, 177, 26);
		contentPane.add(t3);
		
		p1 = new JPasswordField();
		p1.setBounds(656, 194, 177, 26);
		contentPane.add(p1);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tbmodel = (DefaultTableModel) table_1.getModel();
				String data[] = {t1.getText(),new String(p1.getPassword()),t2.getText(),t3.getText()};
				tbmodel.addRow(data);
				JOptionPane.showMessageDialog(null, "Data inserted");
				t1.setText("");
				p1.setText("");
				t2.setText("");
				t3.setText("");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(151, 319, 104, 38);
		contentPane.add(btnNewButton);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tbmodel = (DefaultTableModel) table_1.getModel();
				if(table_1.getSelectedRowCount()==1)
				{
					String id = t1.getText();
					String pass = new String(p1.getPassword());
					String name = t2.getText();
					String exp = t3.getText();
					
					tbmodel.setValueAt(id, table_1.getSelectedRow(), 0);
					tbmodel.setValueAt(pass, table_1.getSelectedRow(), 1);
					tbmodel.setValueAt(name, table_1.getSelectedRow(), 2);
					tbmodel.setValueAt(exp, table_1.getSelectedRow(), 3);
					
					JOptionPane.showMessageDialog(null, "Data updated successfully...!");
					
				}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUpdate.setBounds(290, 319, 104, 38);
		contentPane.add(btnUpdate);
		
		JButton btnNewButton_1_1 = new JButton("DELETE");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tbmodel = (DefaultTableModel) table_1.getModel();
				if(table_1.getSelectedRowCount()==1)
				{
					tbmodel.removeRow(table_1.getSelectedRow());
					JOptionPane.showMessageDialog(null, "data deleted successfully....!");
				}
				else
				{
					if(table_1.getRowCount()==0)
					{
						JOptionPane.showMessageDialog(null, "Table is empty....!");
					}
				}
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1.setBounds(436, 319, 104, 38);
		contentPane.add(btnNewButton_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(0, 386, 874, 43);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2_5 = new JLabel("DOCTORS LISTS");
		lblNewLabel_2_5.setBounds(336, 10, 202, 21);
		lblNewLabel_2_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_2.add(lblNewLabel_2_5);
		
		table = new JTable();
		table.setBounds(45, 535, 116, 0);
		contentPane.add(table);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 439, 854, 276);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"DOCTOR ID", "DOCTOR NAME", "PASSWORD", "EXPERIENCE"
			}
		));
	}
}
