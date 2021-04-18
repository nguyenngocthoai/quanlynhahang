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
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TaiKhoan extends JFrame {

	public JPanel contentPane;
	private JScrollPane scrollPane;
	private DefaultTableModel tableModel;
	private JTable tableTaiKhoan;
	private JPanel panel;
	private JButton btnTim;
	private JLabel lblNhpTnNgi;
	private JTextField txtTimTK;
	private JPanel panel_1;
	private JLabel lblThngTinTi;
	private JLabel lblMTiKhon;
	private JLabel lblTnTiKhon;
	private JLabel lblLoaiTk;
	private JLabel lblMKhchHng_2;
	private JTextField txtTenTK;
	private JTextField txtMK;
	private JButton btnLamMoi;
	private JButton btnThem;
	private JButton btnXoa;
	private JButton btnCapNhat;
	private JLabel lblMKhchHng_1;
	private JTextField txtXNMK;
	private JTextField txtMaTK;
	private JLabel lblTrngThi;
	private JTextField txtTrangThai;
	private JComboBox cbxLoaiTK;
	public TaiKhoan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblTiKhon = new JLabel("Tài Khoản");
		lblTiKhon.setForeground(Color.RED);
		lblTiKhon.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		String[] header = "Mã Tài Khoản; Tên Tài Khoản;Mật Khẩu; Tên Người Dùng".split(";");
		tableModel = new DefaultTableModel(header, 0);
		scrollPane = new JScrollPane(tableTaiKhoan = new JTable(tableModel), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "T\u00ECm Ki\u1EBFm T\u00E0i Kho\u1EA3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		btnTim = new JButton("Tìm");
		btnTim.setIcon(new ImageIcon("images\\search.png"));
		btnTim.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblNhpTnNgi = new JLabel("Nhập Tên Tài Khoản");
		lblNhpTnNgi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		txtTimTK = new JTextField();
		txtTimTK.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTimTK.setColumns(10);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		
		lblThngTinTi = new JLabel("Thông Tin Tài Khoản");
		lblThngTinTi.setForeground(Color.BLACK);
		lblThngTinTi.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		lblMTiKhon = new JLabel("Mã Tài Khoản");
		lblMTiKhon.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblTnTiKhon = new JLabel("Tên Tài Khoản");
		lblTnTiKhon.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblLoaiTk = new JLabel("Loại Tài Khoản");
		lblLoaiTk.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblMKhchHng_2 = new JLabel("Mật Khẩu");
		lblMKhchHng_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		txtTenTK = new JTextField();
		txtTenTK.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTenTK.setColumns(10);
		
		txtMK = new JTextField();
		txtMK.setColumns(10);
		
		lblMKhchHng_1 = new JLabel("Xác Nhận Mật Khẩu");
		lblMKhchHng_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		txtXNMK = new JTextField();
		txtXNMK.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtXNMK.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(495)
							.addComponent(lblTiKhon, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE))
							.addGap(6)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblTiKhon)
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNhpTnNgi, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(txtTimTK, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
					.addGap(23)
					.addComponent(btnTim, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
					.addGap(42))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(17)
					.addComponent(lblNhpTnNgi, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(19)
					.addComponent(txtTimTK, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(15)
					.addComponent(btnTim))
		);
		panel.setLayout(gl_panel);
		
		txtMaTK = new JTextField();
		txtMaTK.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtMaTK.setColumns(10);
		
		lblTrngThi = new JLabel("Trạng Thái");
		lblTrngThi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		txtTrangThai = new JTextField();
		txtTrangThai.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTrangThai.setColumns(10);
		
		cbxLoaiTK = new JComboBox();
		cbxLoaiTK.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		btnThem = new JButton("Thêm");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThem.setIcon(new ImageIcon("images\\add.png"));
		btnThem.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		btnCapNhat = new JButton("Cập Nhật");
		btnCapNhat.setIcon(new ImageIcon("images\\edit.png"));
		btnCapNhat.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		btnXoa = new JButton("Xóa");
		btnXoa.setIcon(new ImageIcon("images\\delete.png"));
		btnXoa.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		btnLamMoi = new JButton("Làm Mới");
		btnLamMoi.setIcon(new ImageIcon("images\\refresh.png"));
		btnLamMoi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(119)
					.addComponent(lblThngTinTi, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLoaiTk, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMKhchHng_1)
						.addComponent(lblMKhchHng_2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMTiKhon, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTnTiKhon, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTrngThi, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(txtMK, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
								.addComponent(txtXNMK, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
								.addComponent(txtMaTK, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
								.addComponent(txtTenTK, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addComponent(btnXoa, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
											.addGap(28)
											.addComponent(btnLamMoi, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
											.addComponent(btnThem, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
											.addGap(24)
											.addComponent(btnCapNhat, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
									.addGap(17))
								.addComponent(txtTrangThai, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
							.addGap(28))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(cbxLoaiTK, 0, 248, Short.MAX_VALUE)
							.addGap(30))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(9)
					.addComponent(lblThngTinTi)
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
							.addGap(104)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE, false)
								.addComponent(lblLoaiTk, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(cbxLoaiTK, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(24)
							.addComponent(lblMKhchHng_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(23)
							.addComponent(lblMKhchHng_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE, false)
								.addComponent(txtMaTK, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMTiKhon, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE, false)
								.addComponent(txtTenTK, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTnTiKhon, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
							.addGap(77)
							.addComponent(txtMK, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(23)
							.addComponent(txtXNMK, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(txtTrangThai, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnCapNhat)
								.addComponent(btnThem))
							.addGap(18)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE, false)
								.addComponent(btnXoa)
								.addComponent(btnLamMoi)))
						.addComponent(lblTrngThi, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(16))
		);
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);
	}

}
