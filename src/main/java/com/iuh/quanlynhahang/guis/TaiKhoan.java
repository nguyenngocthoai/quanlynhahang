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
		setBounds(100, 100, 1100, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTiKhon = new JLabel("Tài Khoản");
		lblTiKhon.setBounds(500, 5, 85, 24);
		lblTiKhon.setForeground(Color.RED);
		lblTiKhon.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add(lblTiKhon);
		
		 lblDanhSchKhch = new JLabel("Danh Sách Tài Khoản :");
		lblDanhSchKhch.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblDanhSchKhch.setBounds(10, 61, 206, 24);
		contentPane.add(lblDanhSchKhch);
		
		String[] header = "Mã Tài Khoản; Tên Tài Khoản;Mật Khẩu; Tên Người Dùng".split(";");
		tableModel = new DefaultTableModel(header, 0);
		scrollPane = new JScrollPane(table = new JTable(tableModel), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		contentPane.add(scrollPane);
		scrollPane.setBounds(10, 95, 637, 391);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "T\u00ECm Ki\u1EBFm T\u00E0i Kho\u1EA3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 496, 637, 117);
		contentPane.add(panel);
		
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
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_1.setBounds(657, 61, 419, 425);
		contentPane.add(panel_1);
		
		lblThngTinTi = new JLabel("Thông Tin Tài Khoản");
		lblThngTinTi.setForeground(Color.BLACK);
		lblThngTinTi.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblThngTinTi.setBounds(120, 10, 221, 24);
		panel_1.add(lblThngTinTi);
		
		lblMTiKhon = new JLabel("Mã Tài Khoản : 1");
		lblMTiKhon.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMTiKhon.setBounds(10, 67, 138, 24);
		panel_1.add(lblMTiKhon);
		
		lblTnTiKhon = new JLabel("Tên Tài Khoản :");
		lblTnTiKhon.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTnTiKhon.setBounds(10, 117, 120, 24);
		panel_1.add(lblTnTiKhon);
		
		lblMKhchHng = new JLabel("Tên Người Dùng :");
		lblMKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMKhchHng.setBounds(10, 167, 120, 24);
		panel_1.add(lblMKhchHng);
		
		lblMKhchHng_2 = new JLabel("Mật Khẩu :");
		lblMKhchHng_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMKhchHng_2.setBounds(10, 217, 138, 24);
		panel_1.add(lblMKhchHng_2);
		
		lblMKhchHng_3 = new JLabel("Tình Trạng :");
		lblMKhchHng_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMKhchHng_3.setBounds(271, 67, 138, 24);
		panel_1.add(lblMKhchHng_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(140, 119, 238, 24);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(140, 169, 238, 24);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(140, 220, 238, 24);
		panel_1.add(textField_3);
		
		lblMKhchHng_1 = new JLabel("Nhập Lại Mật Khẩu :");
		lblMKhchHng_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMKhchHng_1.setBounds(10, 267, 138, 24);
		panel_1.add(lblMKhchHng_1);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		textField_4.setBounds(140, 267, 238, 24);
		panel_1.add(textField_4);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Thao T\u00E1c", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(657, 496, 419, 117);
		contentPane.add(panel_2);
		
		btnXoaRong = new JButton("Xóa Rỗng");
		btnXoaRong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnXoaRong.setBounds(10, 31, 104, 29);
		panel_2.add(btnXoaRong);
		
		btnThem = new JButton("Thêm");
		btnThem.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnThem.setBounds(157, 31, 104, 29);
		panel_2.add(btnThem);
		
		btnXaTiKhon = new JButton("Xóa Tài Khoản");
		btnXaTiKhon.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnXaTiKhon.setBounds(149, 78, 129, 29);
		panel_2.add(btnXaTiKhon);
		
		btnCapNhat = new JButton("Cập Nhật");
		btnCapNhat.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnCapNhat.setBounds(296, 31, 104, 29);
		panel_2.add(btnCapNhat);
	}

}
