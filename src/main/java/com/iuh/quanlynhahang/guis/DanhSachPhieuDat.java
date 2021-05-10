package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;



public class DanhSachPhieuDat extends JFrame implements ActionListener{

	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DanhSachPhieuDat frame = new DanhSachPhieuDat();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	private JTable table;
	private DefaultTableModel tablemodel;
	private JTextField textField;
	private JButton btnXemChiTiet,btnTimKiem,btnThoat;
	
	public DanhSachPhieuDat() {
		setTitle("Thanh Toán");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		String[] colNameHD = "Mã Phiếu Dặt;Tên Khách Hàng;Tên Nhân Viên;Ngày Lập Phiếu".split(";");
		tablemodel = new DefaultTableModel(colNameHD, 0);
		JScrollPane scrollPane = new JScrollPane(table = new JTable(tablemodel), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(10, 57, 1060, 369);
		contentPane.add(scrollPane);

		JLabel lblTrBnga = new JLabel("Danh Sách Phiếu Đặt");
		lblTrBnga.setForeground(Color.RED);
		lblTrBnga.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblTrBnga.setBounds(349, 11, 290, 35);
		contentPane.add(lblTrBnga);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "T\u00ECm Ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 436, 517, 77);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Số Điện Thoại");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 28, 95, 28);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(109, 29, 185, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		 btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnTimKiem.setBounds(350, 32, 133, 28);
		panel.add(btnTimKiem);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Ch\u1EE9c N\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(553, 436, 517, 77);
		contentPane.add(panel_1);
		
		JButton btnThanhToan = new JButton("Thanh Toán");
		btnThanhToan.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnThanhToan.setBounds(76, 32, 95, 28);
		panel_1.add(btnThanhToan);
		
		 btnXemChiTiet = new JButton("Xem Chi Tiết");
		btnXemChiTiet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXemChiTiet.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnXemChiTiet.setBounds(204, 32, 130, 28);
		panel_1.add(btnXemChiTiet);
		
		 btnThoat = new JButton("Thoát");
		btnThoat.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnThoat.setBounds(365, 32, 95, 28);
		panel_1.add(btnThoat);
		
		btnXemChiTiet.addActionListener(this);
	}
	
	private GiaoDienChiTietPhieuDat ctPhieuDat=new GiaoDienChiTietPhieuDat();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj.equals(btnXemChiTiet)) {
			ctPhieuDat.setVisible(true);
		}
		
	}
}
