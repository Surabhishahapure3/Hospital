package pro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Patient extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t1;
	private JTextField t3;
	private JTextField t4;
	private JTable table;
	private JTable table_1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Patient frame = new Patient();
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
	public Patient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 968, 759);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(-178, 0, 1132, 725);
		contentPane.add(contentPane_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(444, 10, 1, 1);
		contentPane_1.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("HOSPITAL MANAGEMENT SYSTEM");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(245, 25, 383, 27);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.BLACK);
		panel_1_1.setBounds(175, 0, 957, 111);
		contentPane_1.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("HOSPITAL MANAGEMENT SYSTEM");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(223, 26, 383, 27);
		panel_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("MANAGE DOCTORS");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(277, 63, 383, 27);
		panel_1_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h1 = new Home();
				h1.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(753, 63, 97, 27);
		panel_1_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("DOCTOR INFORMATION");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(518, 121, 273, 38);
		contentPane_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("ID");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_1.setBounds(23, 184, 58, 38);
		contentPane_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("PATIENT ILLINESS");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_2.setBounds(205, 249, 177, 38);
		contentPane_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("FATHER NAME");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_3.setBounds(688, 184, 177, 38);
		contentPane_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("DOCTOR NAME");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_4.setBounds(688, 249, 144, 38);
		contentPane_1.add(lblNewLabel_2_4);
		
		t1 = new JTextField();
		t1.setColumns(10);
		t1.setBounds(392, 194, 177, 26);
		contentPane_1.add(t1);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(392, 259, 177, 26);
		contentPane_1.add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(886, 259, 177, 26);
		contentPane_1.add(t4);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tbmodel = (DefaultTableModel) table_1.getModel();
				String data[] = {t1.getText(),t2.getText(),t3.getText(),t4.getText()};
				tbmodel.addRow(data);
				JOptionPane.showMessageDialog(null, "Data inserted");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(314, 319, 104, 38);
		contentPane_1.add(btnNewButton);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tbmodel = (DefaultTableModel) table_1.getModel();
				if(table_1.getSelectedRowCount()==1)
				{
					String name = t1.getText();
					String fname = t2.getText();
					String pilliness = t3.getText();
					String dname = t4.getText();
					
					tbmodel.setValueAt(name, table_1.getSelectedRow(), 0);
					tbmodel.setValueAt(fname, table_1.getSelectedRow(), 1);
					tbmodel.setValueAt(pilliness, table_1.getSelectedRow(), 2);
					tbmodel.setValueAt(dname, table_1.getSelectedRow(), 3);
					
					JOptionPane.showMessageDialog(null, "Data updated successfully...!");
					
				}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUpdate.setBounds(484, 319, 104, 38);
		contentPane_1.add(btnUpdate);
		
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
		btnNewButton_1_1.setBounds(652, 319, 104, 38);
		contentPane_1.add(btnNewButton_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(175, 386, 957, 43);
		contentPane_1.add(panel_2);
		
		JLabel lblNewLabel_2_5 = new JLabel("DOCTORS LISTS");
		lblNewLabel_2_5.setForeground(Color.WHITE);
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_5.setBounds(403, 10, 202, 21);
		panel_2.add(lblNewLabel_2_5);
		
		table = new JTable();
		table.setBounds(45, 535, 116, 0);
		contentPane_1.add(table);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("NAME");
		lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_3_1.setBounds(205, 184, 125, 38);
		contentPane_1.add(lblNewLabel_2_3_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(185, 439, 937, 276);
		contentPane_1.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"PATIENT NAME", "FATHER NAME", "PATIENT ILLINESS", "DOCTOR NAME"
			}
		));
		
		t2 = new JTextField();
		t2.setBounds(886, 190, 177, 26);
		contentPane_1.add(t2);
		t2.setColumns(10);
	}
}
