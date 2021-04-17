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
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class KhachHang extends JFrame {

	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					KhachHang frame = new KhachHang();
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
	private JTable tableKhachHang;
	private DefaultTableModel tableModel;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblThngTinKhch;
	private JLabel lblMKhchHng;
	private JLabel lblTnKhchHng;
	private JLabel lblMKhchHng_2;
	private JLabel lblMKhchHng_3;
	private JLabel lblMKhchHng_4;
	private JLabel lblMKhchHng_1;
	private JLabel lblMKhchHng_6;
	private JTextField txtTenKH;
	private JTextField txtDiaChi;
	private JTextField txtNgaySinh;
	private JTextField txtSDT;
	private JTextField txtEmail;
	private JTextField txtTimSDT;
	private JTextField txtMaKH;
	private JTextField txtTrangThai;
	public KhachHang() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		setSize(1100, 567);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		JLabel lblKhchHng = new JLabel("KHÁCH HÀNG");
		lblKhchHng.setForeground(Color.RED);
		lblKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		
		
		String[] header = "Mã Khách Hàng;Địa Chỉ;Giới Tính;Ngày Sinh;Số Điện Thoại;Tình Trạng".split(";");
		tableModel = new DefaultTableModel(header, 0);
		 scrollPane = new JScrollPane(tableKhachHang = new JTable(tableModel), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "T\u00ECm Ki\u1EBFm Kh\u00E1ch H\u00E0ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnTim = new JButton("Tìm");
		btnTim.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JLabel lblNhpSin = new JLabel("Nhập Số Điện Thoại");
		lblNhpSin.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		txtTimSDT = new JTextField();
		txtTimSDT.setColumns(10);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		
		lblThngTinKhch = new JLabel("Thông Tin Khách Hàng");
		lblThngTinKhch.setForeground(new Color(0, 0, 0));
		lblThngTinKhch.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		lblMKhchHng = new JLabel("Mã Khách Hàng");
		lblMKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblTnKhchHng = new JLabel("Tên Khách Hàng");
		lblTnKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblMKhchHng_2 = new JLabel("Địa Chỉ");
		lblMKhchHng_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblMKhchHng_3 = new JLabel("Giới Tính");
		lblMKhchHng_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblMKhchHng_4 = new JLabel("Ngày Sinh");
		lblMKhchHng_4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblMKhchHng_1 = new JLabel("Số Điện Thoại");
		lblMKhchHng_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblMKhchHng_6 = new JLabel("Email");
		lblMKhchHng_6.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		txtTenKH = new JTextField();
		txtTenKH.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTenKH.setColumns(10);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtDiaChi.setColumns(10);
		
		txtNgaySinh = new JTextField();
		txtNgaySinh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtNgaySinh.setColumns(10);
		
		txtSDT = new JTextField();
		txtSDT.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtSDT.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtEmail.setColumns(10);
		
		JRadioButton rdbNam = new JRadioButton("Nam");
		rdbNam.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JRadioButton rdbNu = new JRadioButton("Nữ");
		rdbNu.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Thao T\u00E1c", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnLamMoi = new JButton("Làm Mới");
		btnLamMoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLamMoi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JButton btnThem = new JButton("Thêm");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThem.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JButton btnCapNhat = new JButton("Cập Nhật");
		btnCapNhat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCapNhat.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(20)
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(360)
					.addComponent(lblKhchHng, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(494, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblKhchHng)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(19)
					.addComponent(btnLamMoi, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
					.addGap(27)
					.addComponent(btnThem, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
					.addGap(41)
					.addComponent(btnCapNhat, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCapNhat)
						.addComponent(btnThem)
						.addComponent(btnLamMoi))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(18)
					.addComponent(lblNhpSin)
					.addGap(27)
					.addComponent(txtTimSDT, GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
					.addGap(49)
					.addComponent(btnTim, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
					.addGap(117))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNhpSin, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTimSDT, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnTim))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		txtMaKH = new JTextField();
		txtMaKH.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtMaKH.setColumns(10);
		
		JLabel lblTrngThi = new JLabel("Trạng Thái");
		lblTrngThi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		txtTrangThai = new JTextField();
		txtTrangThai.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTrangThai.setColumns(10);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblMKhchHng_3, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(rdbNam, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(rdbNu, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
					.addGap(137))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(114, Short.MAX_VALUE)
					.addComponent(lblThngTinKhch, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
					.addGap(91))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addContainerGap()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblMKhchHng_6, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTrngThi)
										.addComponent(lblMKhchHng_1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addContainerGap()
									.addComponent(lblTnKhchHng, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(9)
									.addComponent(lblMKhchHng_2, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(9)
									.addComponent(lblMKhchHng_4, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(txtDiaChi, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
										.addComponent(txtTenKH, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)))
								.addComponent(txtEmail, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
								.addComponent(txtSDT, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
								.addComponent(txtTrangThai, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
								.addComponent(txtNgaySinh, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblMKhchHng, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(txtMaKH, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)))
					.addGap(10))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(9)
					.addComponent(lblThngTinKhch)
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMKhchHng, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtMaKH, GroupLayout.PREFERRED_SIZE, 24, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTnKhchHng, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTenKH, GroupLayout.PREFERRED_SIZE, 24, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMKhchHng_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtDiaChi, GroupLayout.PREFERRED_SIZE, 24, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMKhchHng_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbNu, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbNam, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMKhchHng_4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNgaySinh, GroupLayout.PREFERRED_SIZE, 24, Short.MAX_VALUE))
							.addGap(18)
							.addComponent(lblMKhchHng_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblMKhchHng_6, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblTrngThi)
							.addGap(6))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(42)
							.addComponent(txtSDT, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(txtTrangThai, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(44))
		);
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);
	}
}
