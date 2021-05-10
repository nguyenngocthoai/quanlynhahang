package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GiaoDienChiTietPhieuDat extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaPhieuDat;
	private JTextField txtTenKH;
	private JTextField txtNgayLapPhieu;
	private JTextField txtSoLuongBan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoDienChiTietPhieuDat frame = new GiaoDienChiTietPhieuDat();
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
	private JLabel lblTnKhchHng_1;
	private JTextField txtSoDienThoai;
	private JTextField txtTrangThai;
	
	public GiaoDienChiTietPhieuDat() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChiTitPhiu = new JLabel("Chi Tiết Phiếu Đặt");
		lblChiTitPhiu.setForeground(Color.RED);
		lblChiTitPhiu.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblChiTitPhiu.setBounds(345, 10, 290, 35);
		contentPane.add(lblChiTitPhiu);
		
		JLabel lblNewLabel = new JLabel("Mã Phiếu Đặt");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel.setBounds(29, 88, 95, 28);
		contentPane.add(lblNewLabel);
		
		txtMaPhieuDat = new JTextField();
		txtMaPhieuDat.setEnabled(false);
		txtMaPhieuDat.setBounds(134, 89, 146, 28);
		contentPane.add(txtMaPhieuDat);
		txtMaPhieuDat.setColumns(10);
		
		JLabel lblTnKhchHng = new JLabel("Số Bàn");
		lblTnKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTnKhchHng.setBounds(307, 88, 52, 28);
		contentPane.add(lblTnKhchHng);
		
		txtTenKH = new JTextField();
		txtTenKH.setEnabled(false);
		txtTenKH.setColumns(10);
		txtTenKH.setBounds(134, 143, 146, 28);
		contentPane.add(txtTenKH);
		
		JLabel lblNgyLpPhiu = new JLabel("Ngày Lập Phiếu");
		lblNgyLpPhiu.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNgyLpPhiu.setBounds(736, 88, 95, 28);
		contentPane.add(lblNgyLpPhiu);
		
		txtNgayLapPhieu = new JTextField();
		txtNgayLapPhieu.setEnabled(false);
		txtNgayLapPhieu.setColumns(10);
		txtNgayLapPhieu.setBounds(841, 89, 146, 28);
		contentPane.add(txtNgayLapPhieu);
		
		JLabel lblTnKhchHng_1_1 = new JLabel("Tên Khách Hàng");
		lblTnKhchHng_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTnKhchHng_1_1.setBounds(29, 142, 95, 28);
		contentPane.add(lblTnKhchHng_1_1);
		
		txtSoLuongBan = new JTextField();
		txtSoLuongBan.setEnabled(false);
		txtSoLuongBan.setColumns(10);
		txtSoLuongBan.setBounds(412, 89, 146, 28);
		contentPane.add(txtSoLuongBan);
		
		String[] header = "STT;Mã Món Ăn;Tên Món Ăn;Giá;Số Lượng;".split(";");
		tableModel = new DefaultTableModel(header, 0);
		scrollPane = new JScrollPane(tableKhachHang = new JTable(tableModel),
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		tableKhachHang.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		scrollPane.setViewportView(tableKhachHang);
		tableKhachHang.setBackground(Color.WHITE);
		scrollPane.setBounds(29, 235, 558, 269);
		
		contentPane.add(scrollPane);
		
		lblTnKhchHng_1 = new JLabel("Danh sách các món đã đặt :");
		lblTnKhchHng_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTnKhchHng_1.setBounds(29, 197, 171, 28);
		contentPane.add(lblTnKhchHng_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Ch\u1EE9c N\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(616, 283, 444, 133);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnThanhToan = new JButton("Thanh Toán");
		btnThanhToan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThanhToan.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnThanhToan.setBounds(43, 58, 111, 36);
		panel.add(btnThanhToan);
		
		JButton btnThemMon = new JButton("Thêm Món");
		btnThemMon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThemMon.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnThemMon.setBounds(176, 58, 111, 36);
		panel.add(btnThemMon);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThoat.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnThoat.setBounds(304, 58, 111, 36);
		panel.add(btnThoat);
		
		JLabel lblSLngNgi = new JLabel("Số Điện Thoại");
		lblSLngNgi.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSLngNgi.setBounds(307, 142, 95, 28);
		contentPane.add(lblSLngNgi);
		
		txtSoDienThoai = new JTextField();
		txtSoDienThoai.setEnabled(false);
		txtSoDienThoai.setColumns(10);
		txtSoDienThoai.setBounds(412, 142, 146, 28);
		contentPane.add(txtSoDienThoai);
		
		JLabel lblTrngThi = new JLabel("Trạng Thái");
		lblTrngThi.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTrngThi.setBounds(736, 142, 95, 28);
		contentPane.add(lblTrngThi);
		
		txtTrangThai = new JTextField();
		txtTrangThai.setEnabled(false);
		txtTrangThai.setColumns(10);
		txtTrangThai.setBounds(841, 143, 146, 28);
		contentPane.add(txtTrangThai);
		
	}
}
