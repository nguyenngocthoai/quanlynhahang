package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TaiKhoan extends JFrame {

	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TaiKhoan frame = new TaiKhoan();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	private JLabel lblDanhSchKhch;
	private JScrollPane scrollPane;
	private DefaultTableModel tableModel;
	private JTable table;
	private JPanel panel;
	private JButton btnTimKiem;
	private JLabel lblNhpTnNgi;
	private JTextField textField;
	private JPanel panel_1;
	private JLabel lblThngTinTi;
	private JLabel lblMTiKhon;
	private JLabel lblTnTiKhon;
	private JLabel lblMKhchHng;
	private JLabel lblMKhchHng_2;
	private JLabel lblMKhchHng_3;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPanel panel_2;
	private JButton btnXoaRong;
	private JButton btnThem;
	private JButton btnXaTiKhon;
	private JButton btnCapNhat;
	private JLabel lblMKhchHng_1;
	private JTextField textField_4;
	public TaiKhoan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblTiKhon = new JLabel("Tài Khoản");
		lblTiKhon.setForeground(Color.RED);
		lblTiKhon.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		 lblDanhSchKhch = new JLabel("Danh Sách Tài Khoản :");
		lblDanhSchKhch.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		String[] header = "Mã Tài Khoản; Tên Tài Khoản;Mật Khẩu; Tên Người Dùng".split(";");
		tableModel = new DefaultTableModel(header, 0);
		scrollPane = new JScrollPane(table = new JTable(tableModel), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "T\u00ECm Ki\u1EBFm T\u00E0i Kho\u1EA3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnTimKiem.setBounds(523, 43, 104, 29);
		panel.add(btnTimKiem);
		
		lblNhpTnNgi = new JLabel("Nhập Tên Tài Khoản :");
		lblNhpTnNgi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNhpTnNgi.setBounds(10, 45, 157, 24);
		panel.add(lblNhpTnNgi);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(177, 47, 238, 24);
		panel.add(textField);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		
		lblThngTinTi = new JLabel("Thông Tin Tài Khoản");
		lblThngTinTi.setForeground(Color.BLACK);
		lblThngTinTi.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		lblMTiKhon = new JLabel("Mã Tài Khoản : 1");
		lblMTiKhon.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblTnTiKhon = new JLabel("Tên Tài Khoản :");
		lblTnTiKhon.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblMKhchHng = new JLabel("Tên Người Dùng :");
		lblMKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblMKhchHng_2 = new JLabel("Mật Khẩu :");
		lblMKhchHng_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblMKhchHng_3 = new JLabel("Tình Trạng :");
		lblMKhchHng_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		lblMKhchHng_1 = new JLabel("Nhập Lại Mật Khẩu :");
		lblMKhchHng_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Thao T\u00E1c", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		btnXoaRong = new JButton("Xóa Rỗng");
		btnXoaRong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		btnThem = new JButton("Thêm");
		btnThem.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		btnXaTiKhon = new JButton("Xóa Tài Khoản");
		btnXaTiKhon.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		btnCapNhat = new JButton("Cập Nhật");
		btnCapNhat.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(495)
					.addComponent(lblTiKhon, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
					.addGap(496))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblDanhSchKhch, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
							.addGap(10))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
							.addGap(5))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblTiKhon)
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblDanhSchKhch, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 303, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 105, Short.MAX_VALUE)
							.addGap(34))))
		);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(119)
					.addComponent(lblThngTinTi, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(9)
					.addComponent(lblMTiKhon, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
					.addGap(123)
					.addComponent(lblMKhchHng_3, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(9)
					.addComponent(lblTnTiKhon, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
					.addGap(45))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(9)
					.addComponent(lblMKhchHng, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
					.addGap(45))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(9)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(130)
							.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
						.addComponent(lblMKhchHng_2, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
					.addGap(45))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(139)
					.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
					.addGap(45))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(9)
					.addComponent(lblMKhchHng_1)
					.addContainerGap(280, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(9)
					.addComponent(lblThngTinTi)
					.addGap(33)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMTiKhon, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMKhchHng_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTnTiKhon, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(24)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMKhchHng, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(24)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblMKhchHng_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(23)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMKhchHng_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(23))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(5)
					.addComponent(btnXoaRong, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
					.addGap(43)
					.addComponent(btnThem, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
					.addGap(35)
					.addComponent(btnCapNhat, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
					.addGap(14))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(144)
					.addComponent(btnXaTiKhon, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(136))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(16)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnXoaRong)
						.addComponent(btnThem)
						.addComponent(btnCapNhat))
					.addGap(18)
					.addComponent(btnXaTiKhon))
		);
		panel_2.setLayout(gl_panel_2);
		contentPane.setLayout(gl_contentPane);
	}

}
