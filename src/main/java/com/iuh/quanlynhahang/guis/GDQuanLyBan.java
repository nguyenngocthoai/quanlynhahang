package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JButton;
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
import javax.swing.JComboBox;

public class GDQuanLyBan extends JFrame {

	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GDQuanLyBan frame = new GDQuanLyBan();
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
	private JLabel lblDanhSchKhch;
	private JScrollPane scrollPane;
	private DefaultTableModel tableModel;
	private JTable table;
	private JPanel panel;
	private JButton btnTimKiem;
	private JLabel lblNhpTnNgi;
	private JPanel panel_1;
	private JLabel lblThngTinTi;
	private JLabel lblMTiKhon;
	private JLabel lblTnTiKhon;
	private JLabel lblMKhchHng;
	private JLabel lblMKhchHng_3;
	private JTextField textField_2;
	private JPanel panel_2;
	private JButton btnXoaRong;
	private JButton btnThem;
	private JButton btnXaTiKhon;
	private JButton btnCapNhat;
	private JComboBox comboBox;
	private JTextField textField;
	public GDQuanLyBan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblTiKhon = new JLabel("Bàn");
		lblTiKhon.setForeground(Color.RED);
		lblTiKhon.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		 lblDanhSchKhch = new JLabel("Danh Sách Bàn :");
		lblDanhSchKhch.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		String[] header = "Mã Bàn; Tên Bàn ;Thuộc Sảnh".split(";");
		tableModel = new DefaultTableModel(header, 0);
		scrollPane = new JScrollPane(table = new JTable(tableModel), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "T\u00ECm Ki\u1EBFm T\u00E0i Kho\u1EA3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblNhpTnNgi = new JLabel("Nhập Tên Bàn :");
		lblNhpTnNgi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		
		lblThngTinTi = new JLabel("Thông Tin Bàn");
		lblThngTinTi.setForeground(Color.BLACK);
		lblThngTinTi.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		lblMTiKhon = new JLabel("Mã Bàn: 1");
		lblMTiKhon.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblTnTiKhon = new JLabel("Thuộc Sảnh : ");
		lblTnTiKhon.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblMKhchHng = new JLabel("Tên Bàn :");
		lblMKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblMKhchHng_3 = new JLabel("Tình Trạng :");
		lblMKhchHng_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Thao T\u00E1c", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		btnXoaRong = new JButton("Xóa Rỗng");
		btnXoaRong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		btnThem = new JButton("Thêm");
		btnThem.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		btnXaTiKhon = new JButton("Xóa Bàn");
		btnXaTiKhon.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		btnCapNhat = new JButton("Cập Nhật");
		btnCapNhat.setFont(new Font("Times New Roman", Font.PLAIN, 16));
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
		
		comboBox = new JComboBox();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(495)
					.addComponent(lblTiKhon, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(lblDanhSchKhch, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE))
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
							.addGap(1))
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
					.addGap(5))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblTiKhon)
					.addGap(32)
					.addComponent(lblDanhSchKhch, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
							.addGap(99))))
		);
		
		textField = new JTextField();
		textField.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNhpTnNgi, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
					.addGap(110)
					.addComponent(btnTimKiem, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
					.addGap(4))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(2)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNhpTnNgi, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
						.addComponent(btnTimKiem)))
		);
		panel.setLayout(gl_panel);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(152)
					.addComponent(lblThngTinTi, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(9)
					.addComponent(lblMTiKhon, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
					.addGap(123)
					.addComponent(lblMKhchHng_3, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(9)
					.addComponent(lblTnTiKhon, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(comboBox, 0, 160, Short.MAX_VALUE)
					.addGap(123))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(9)
					.addComponent(lblMKhchHng, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
					.addGap(123))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addComponent(lblThngTinTi)
					.addGap(32)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMTiKhon, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMKhchHng_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTnTiKhon, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
					.addGap(21)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMKhchHng, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))))
		);
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);
	}
}
