package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class TimKiemBanTiecUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimKiemBanTiecUI frame = new TimKiemBanTiecUI();
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
	public TimKiemBanTiecUI() {
		setTitle("Tìm Kiếm Bàn Tiệc");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 417, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTmKimBn = new JLabel("Tìm Kiếm Bàn Tiệc");
		lblTmKimBn.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblTmKimBn.setBounds(99, 10, 210, 39);
		contentPane.add(lblTmKimBn);
		
		JLabel lblSLngBn = new JLabel("Số Lượng Người :");
		lblSLngBn.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSLngBn.setBounds(10, 71, 111, 28);
		contentPane.add(lblSLngBn);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField.setBounds(131, 71, 223, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblChnSnh = new JLabel("Số Lượng Bàn Kề :");
		lblChnSnh.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblChnSnh.setBounds(10, 134, 111, 28);
		contentPane.add(lblChnSnh);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(131, 134, 223, 28);
		contentPane.add(textField_1);
		
		JLabel lblChnSnh_2 = new JLabel("Chọn Sảnh :");
		lblChnSnh_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblChnSnh_2.setBounds(10, 197, 111, 28);
		contentPane.add(lblChnSnh_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		comboBox.setBounds(131, 197, 223, 28);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Tìm Kiếm");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(131, 266, 85, 30);
		contentPane.add(btnNewButton);
		
		JButton btnHy = new JButton("Hủy");
		btnHy.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnHy.setBounds(235, 266, 85, 30);
		contentPane.add(btnHy);
	}
}
