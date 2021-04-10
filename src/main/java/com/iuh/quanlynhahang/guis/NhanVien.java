package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Component;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NhanVien extends JFrame {

	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					NhanVien frame = new NhanVien();
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
	private JLabel lblKhchHng;
	private JLabel lblDanhSchKhch;
	private DefaultTableModel tableModel;
	private JTable table;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JButton btnTimKiem;
	private JLabel lblNhpSin;
	private JTextField textField;
	private JPanel panel_1;
	private JLabel lblThngTinKhch;
	private JLabel lblMNhnVin;
	private JLabel lblTnNhnVin;
	private JLabel lblMKhchHng_1;
	private JLabel lblMKhchHng_2;
	private JLabel lblMKhchHng_3;
	private JLabel lblMKhchHng_4;
	private JLabel lblMKhchHng_5;
	private JLabel lblMKhchHng_6;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JRadioButton rdbNam;
	private JRadioButton rdbNu;
	private JRadioButton rdbKhac;
	private JPanel panel_2;
	private JButton btnXoaRong;
	private JButton btnThem;
	private JButton btnXoa;
	private JButton btnCapNhat_1;
	public NhanVien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblKhchHng = new JLabel("Nhân Viên");
		lblKhchHng.setBounds(513, 5, 98, 24);
		lblKhchHng.setForeground(Color.RED);
		lblKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add(lblKhchHng);
		
		lblDanhSchKhch = new JLabel("Danh Sách Nhân Viên :");
		lblDanhSchKhch.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblDanhSchKhch.setBounds(10, 61, 206, 24);
		contentPane.add(lblDanhSchKhch);
		
		String[] header = "Mã Nhân Viên; Tên Nhân Viên;Địa Chỉ;Giới Tính;Ngày Sinh;Số Điện Thoại;Tình Trạng".split(";");
		tableModel = new DefaultTableModel(header, 0);
		scrollPane = new JScrollPane(table = new JTable(tableModel), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		contentPane.add(scrollPane);
		scrollPane.setBounds(10, 95, 637, 391);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "T\u00ECm Ki\u1EBFm Nh\u00E2n Vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 496, 637, 117);
		contentPane.add(panel);
		
		btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnTimKiem.setBounds(523, 43, 104, 29);
		panel.add(btnTimKiem);
		
		lblNhpSin = new JLabel("Nhập Số Điện Thoại :");
		lblNhpSin.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNhpSin.setBounds(10, 45, 138, 24);
		panel.add(lblNhpSin);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(160, 47, 238, 24);
		panel.add(textField);
		
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_1.setBounds(657, 61, 419, 425);
		contentPane.add(panel_1);
		
		lblThngTinKhch = new JLabel("Thông Tin Nhân Viên");
		lblThngTinKhch.setForeground(Color.BLACK);
		lblThngTinKhch.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblThngTinKhch.setBounds(120, 10, 221, 24);
		panel_1.add(lblThngTinKhch);
		
		lblMNhnVin = new JLabel("Mã Nhân Viên : 1");
		lblMNhnVin.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMNhnVin.setBounds(10, 67, 138, 24);
		panel_1.add(lblMNhnVin);
		
		lblTnNhnVin = new JLabel("Tên Nhân Viên :");
		lblTnNhnVin.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTnNhnVin.setBounds(10, 117, 120, 24);
		panel_1.add(lblTnNhnVin);
		
		lblMKhchHng_1 = new JLabel("Địa Chỉ :");
		lblMKhchHng_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMKhchHng_1.setBounds(10, 167, 120, 24);
		panel_1.add(lblMKhchHng_1);
		
		lblMKhchHng_2 = new JLabel("Giới Tính :");
		lblMKhchHng_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMKhchHng_2.setBounds(10, 217, 138, 24);
		panel_1.add(lblMKhchHng_2);
		
		lblMKhchHng_3 = new JLabel("Ngày Sinh :");
		lblMKhchHng_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMKhchHng_3.setBounds(10, 267, 138, 24);
		panel_1.add(lblMKhchHng_3);
		
		lblMKhchHng_4 = new JLabel("Tình Trạng :");
		lblMKhchHng_4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMKhchHng_4.setBounds(271, 67, 138, 24);
		panel_1.add(lblMKhchHng_4);
		
		lblMKhchHng_5 = new JLabel("Số Điện Thoại :");
		lblMKhchHng_5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMKhchHng_5.setBounds(10, 317, 138, 24);
		panel_1.add(lblMKhchHng_5);
		
		lblMKhchHng_6 = new JLabel("Email :");
		lblMKhchHng_6.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMKhchHng_6.setBounds(10, 367, 138, 24);
		panel_1.add(lblMKhchHng_6);
		
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
		textField_3.setBounds(140, 269, 238, 24);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(140, 319, 238, 24);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(140, 369, 238, 24);
		panel_1.add(textField_5);
		
		rdbNam = new JRadioButton("Nam");
		rdbNam.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rdbNam.setBounds(140, 220, 65, 21);
		panel_1.add(rdbNam);
		
		rdbNu = new JRadioButton("Nữ");
		rdbNu.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rdbNu.setBounds(220, 220, 65, 21);
		panel_1.add(rdbNu);
		
		rdbKhac = new JRadioButton("Khác");
		rdbKhac.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rdbKhac.setBounds(297, 220, 65, 21);
		panel_1.add(rdbKhac);
		
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
		
		btnXoa = new JButton("Xóa Nhân Viên");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXoa.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnXoa.setBounds(149, 78, 129, 29);
		panel_2.add(btnXoa);
		
		btnCapNhat_1 = new JButton("Cập Nhật");
		btnCapNhat_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnCapNhat_1.setBounds(296, 31, 104, 29);
		panel_2.add(btnCapNhat_1);
	}
}
