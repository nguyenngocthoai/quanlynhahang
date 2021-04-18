package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

public class Sanh extends JFrame {
	
	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sanh frame = new Sanh();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private JScrollPane scrollPane;
	private DefaultTableModel tableModel;
	private JTable tableSanh;
	private JPanel panel;
	private JButton btnTimSanh;
	private JLabel lblNhpTnNgi;
	private JPanel panel_1;
	private JLabel lblThngTinTi;
	private JLabel lblMTiKhon;
	private JLabel lblMKhchHng;
	private JTextField txtTenSanh;
	private JButton btnLamMoi;
	private JButton btnThem;
	private JButton btnXoa;
	private JButton btnCapNhat;
	private JTextField txtTimSanh;
	private JTextField txtMaSanh;
	private JTextField txtTrangThai;
	public Sanh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblTiKhon = new JLabel("Sảnh");
		lblTiKhon.setForeground(Color.RED);
		lblTiKhon.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		String[] header = "Mã Sảnh; Tên Sảnh".split(";");
		tableModel = new DefaultTableModel(header, 0);
		scrollPane = new JScrollPane(tableSanh = new JTable(tableModel), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "T\u00ECm Ki\u1EBFm S\u1EA3nh", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		btnTimSanh = new JButton("Tìm Kiếm");
		btnTimSanh.setIcon(new ImageIcon("images\\search.png"));
		btnTimSanh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblNhpTnNgi = new JLabel("Nhập Tên Sảnh");
		lblNhpTnNgi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		
		lblThngTinTi = new JLabel("Thông Tin Sảnh");
		lblThngTinTi.setForeground(Color.BLACK);
		lblThngTinTi.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		lblMTiKhon = new JLabel("Mã Sảnh");
		lblMTiKhon.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblMKhchHng = new JLabel("Tên Sảnh");
		lblMKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		txtTenSanh = new JTextField();
		txtTenSanh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTenSanh.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(539)
							.addComponent(lblTiKhon, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
									.addGap(10)
									.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 531, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblTiKhon)
					.addGap(37)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(8))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
							.addContainerGap())))
		);
		
		txtTimSanh = new JTextField();
		txtTimSanh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTimSanh.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNhpTnNgi, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtTimSanh, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
					.addGap(34)
					.addComponent(btnTimSanh, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
					.addGap(39))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(21, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNhpTnNgi, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTimSanh, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnTimSanh))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		txtMaSanh = new JTextField();
		txtMaSanh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtMaSanh.setColumns(10);
		
		JLabel lblTrngThi = new JLabel("Trạng Thái");
		lblTrngThi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		txtTrangThai = new JTextField();
		txtTrangThai.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTrangThai.setColumns(10);
		
		btnThem = new JButton("Thêm");
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
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(152)
							.addComponent(lblThngTinTi, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addContainerGap()
									.addComponent(lblTrngThi, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(9)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblMKhchHng, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblMTiKhon, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))))
							.addGap(29)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(txtTenSanh, GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(1)
									.addComponent(txtMaSanh, GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(1)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_1.createSequentialGroup()
													.addComponent(btnThem, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
													.addGap(66))
												.addGroup(gl_panel_1.createSequentialGroup()
													.addComponent(btnXoa, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
													.addGap(65)))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_1.createSequentialGroup()
													.addGap(1)
													.addComponent(btnLamMoi, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
												.addComponent(btnCapNhat, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
										.addComponent(txtTrangThai, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))))))
					.addGap(80))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addComponent(lblThngTinTi)
					.addGap(32)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblMTiKhon, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(lblMKhchHng, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(27)
							.addComponent(lblTrngThi, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(txtMaSanh, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(txtTenSanh, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(27)
							.addComponent(txtTrangThai, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(73)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnThem)
							.addGap(18)
							.addComponent(btnXoa))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnCapNhat)
							.addGap(18)
							.addComponent(btnLamMoi)))
					.addGap(79))
		);
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);
	}
}
