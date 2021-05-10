package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class MonAn extends JFrame {

	public JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MonAn frame = new MonAn();
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
	private DefaultTableModel tableModel;
	private JScrollPane scrollPane;
	private JTable tableKhachHang;
	private JTextField txtTenMonAn;
	private JTextField txtMaMonAn;
	private JTextField textField;
	private JTextField textField_1;
	
	public MonAn() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblMonAn = new JLabel("MÓN ĂN");
		lblMonAn.setBounds(407, 15, 118, 30);
		lblMonAn.setForeground(Color.RED);
		lblMonAn.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		String[] header = "STT;Mã Món Ăn;Tên Món Ăn;Giá;".split(";");
		tableModel = new DefaultTableModel(header, 0);
		scrollPane = new JScrollPane(tableKhachHang = new JTable(tableModel),
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(12, 68, 503, 314);
		tableKhachHang.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		scrollPane.setViewportView(tableKhachHang);
		tableKhachHang.setBackground(Color.WHITE);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 408, 573, 96);
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "T\u00ECm Ki\u1EBFm M\u00F3n \u0102n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblChnSnh = new JLabel("Loại Món Ăn");
		lblChnSnh.setBounds(10, 37, 93, 30);
		lblChnSnh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JComboBox cbxSanh = new JComboBox();
		cbxSanh.setBounds(106, 38, 195, 28);
		cbxSanh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JButton btnTimKiemMonAn = new JButton("Tìm Kiếm Món Ăn");
		btnTimKiemMonAn.setBounds(366, 37, 177, 30);
		btnTimKiemMonAn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JPanel panel = new JPanel();
		panel.setBounds(525, 68, 535, 314);
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		
		JLabel lblMBn = new JLabel("Mã Món Ăn");
		lblMBn.setBounds(19, 44, 126, 29);
		lblMBn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JLabel lblThngTinBn = new JLabel("Thông Tin Món Ăn");
		lblThngTinBn.setBounds(177, 9, 147, 27);
		lblThngTinBn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel lblBanSo = new JLabel("Tên Món Ăn");
		lblBanSo.setBounds(17, 99, 128, 29);
		lblBanSo.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		txtTenMonAn = new JTextField();
		txtTenMonAn.setBounds(155, 100, 194, 27);
		txtTenMonAn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTenMonAn.setEditable(false);
		txtTenMonAn.setColumns(10);
		
		JLabel lblLoiMnn = new JLabel("Loại Món Ăn");
		lblLoiMnn.setBounds(19, 154, 126, 29);
		lblLoiMnn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JComboBox cbxLoaiMonAn = new JComboBox();
		cbxLoaiMonAn.setBounds(155, 154, 116, 28);
		cbxLoaiMonAn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		txtMaMonAn = new JTextField();
		txtMaMonAn.setBounds(155, 45, 194, 27);
		txtMaMonAn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtMaMonAn.setEditable(false);
		txtMaMonAn.setColumns(10);
		
		JLabel lblGiTin = new JLabel("Giá Tiền / Món");
		lblGiTin.setBounds(19, 209, 126, 29);
		lblGiTin.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		textField = new JTextField();
		textField.setBounds(155, 210, 116, 27);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField.setEditable(false);
		textField.setColumns(10);
		
		JLabel lblSLng = new JLabel("Số Lượng");
		lblSLng.setBounds(19, 264, 87, 29);
		lblSLng.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		textField_1 = new JTextField();
		textField_1.setBounds(155, 265, 116, 27);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(595, 408, 465, 96);
		panel_2_1.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Ch\u1EE9c N\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JButton btnThemMonAn = new JButton("Thêm Món");
		btnThemMonAn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JButton btnCapNhat = new JButton("Cập Nhật");
		btnCapNhat.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JButton btnLamMoi = new JButton("Làm Mới");
		btnLamMoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLamMoi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JButton btnXoa = new JButton("Xóa Món");
		btnXoa.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		GroupLayout gl_panel_2_1 = new GroupLayout(panel_2_1);
		gl_panel_2_1.setHorizontalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addGap(5)
					.addComponent(btnThemMonAn, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(btnXoa, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
					.addGap(7)
					.addComponent(btnCapNhat, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
					.addGap(6)
					.addComponent(btnLamMoi, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
					.addGap(8))
		);
		gl_panel_2_1.setVerticalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnThemMonAn, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnXoa, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCapNhat, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLamMoi, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
		);
		panel_2_1.setLayout(gl_panel_2_1);
		panel_2.setLayout(null);
		panel_2.add(lblChnSnh);
		panel_2.add(cbxSanh);
		panel_2.add(btnTimKiemMonAn);
		contentPane.setLayout(null);
		contentPane.add(lblMonAn);
		contentPane.add(scrollPane);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.add(lblThngTinBn);
		panel.add(lblMBn);
		panel.add(txtMaMonAn);
		panel.add(lblBanSo);
		panel.add(txtTenMonAn);
		panel.add(lblLoiMnn);
		panel.add(cbxLoaiMonAn);
		panel.add(lblGiTin);
		panel.add(textField);
		panel.add(lblSLng);
		panel.add(textField_1);
		contentPane.add(panel_2);
		contentPane.add(panel_2_1);
	}
}
