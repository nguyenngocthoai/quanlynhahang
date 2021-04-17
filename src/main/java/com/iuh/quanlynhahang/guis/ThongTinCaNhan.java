package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.SpringLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ThongTinCaNhan extends JFrame implements ActionListener {

	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongTinCaNhan frame = new ThongTinCaNhan();
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
	private JLabel lblAvatar, lblThngTinC, lblDiaChi, lblNgaySinh;
	private JLabel lblTen;
	private JLabel lblChucVu;
	private JLabel lblSoDienThoai;
	private JLabel lblEmail;
	private JTextField txtTen;
	private JTextField txtSDT;
	private JButton btnLamMoi;
	private JButton btnCapNhat;
	private JLabel lblGioiTinh;
	private JTextField txtDiaChi;
	private JTextField textField_1;
	private UtilDateModel model;
	private JDatePanelImpl datePanelImpl;
	private JTextField txtEmail;
	private JRadioButton rdbNam, rdbNu;

	public ThongTinCaNhan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		lblThngTinC = new JLabel("Thông Tin Cá Nhân");
		lblThngTinC.setForeground(Color.RED);
		lblThngTinC.setFont(new Font("Times New Roman", Font.BOLD, 25));

		lblAvatar = new JLabel("hình");
		lblAvatar.setIcon(new ImageIcon("C:\\Users\\LOC\\Downloads\\avt1.jpg"));

		lblTen = new JLabel("Họ và Tên :");
		lblTen.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblChucVu = new JLabel("Chức Vụ :");
		lblChucVu.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblSoDienThoai = new JLabel("Số Điện Thoại ");
		lblSoDienThoai.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		txtTen = new JTextField();
		txtTen.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTen.setColumns(10);

		txtSDT = new JTextField();
		txtSDT.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtSDT.setColumns(10);

		lblGioiTinh = new JLabel("Giới Tính :");
		lblGioiTinh.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		rdbNam = new JRadioButton("Nam");
		rdbNam.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		rdbNu = new JRadioButton("Nữ");
		rdbNu.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblDiaChi = new JLabel("Địa Chỉ :");
		lblDiaChi.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		txtDiaChi = new JTextField();
		txtDiaChi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtDiaChi.setColumns(10);

		lblNgaySinh = new JLabel("Ngày Sinh");
		lblNgaySinh.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		model = new UtilDateModel();
		datePanelImpl = new JDatePanelImpl(model);

		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtEmail.setColumns(10);
		
		txtChucVu = new JTextField();
		txtChucVu.setEditable(false);
		txtChucVu.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtChucVu.setColumns(10);
		
		txtNgaySinh = new JTextField();
		txtNgaySinh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtNgaySinh.setColumns(10);
		
				btnLamMoi = new JButton("Làm Mới");
				btnLamMoi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
				btnCapNhat = new JButton("Cập Nhật");
				btnCapNhat.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnCapNhat.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JButton btnThayAvatar = new JButton("Thay Avatar");
		btnThayAvatar.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(43)
							.addComponent(btnThayAvatar, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
							.addGap(46)
							.addComponent(lblDiaChi, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(28)
									.addComponent(btnCapNhat, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
									.addGap(39)
									.addComponent(btnLamMoi, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
									.addGap(429))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(txtDiaChi, GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(9)
							.addComponent(lblAvatar, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTen, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblChucVu, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblGioiTinh, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(152)
									.addComponent(lblThngTinC))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(txtTen, GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
									.addGap(70)
									.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
									.addGap(15))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(txtChucVu, GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
									.addGap(62)
									.addComponent(lblSoDienThoai))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(rdbNam, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
									.addGap(36)
									.addComponent(rdbNu, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
									.addGap(178)
									.addComponent(lblNgaySinh, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)))
							.addGap(26)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtEmail, GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
								.addComponent(txtSDT, GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
								.addComponent(txtNgaySinh, GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))))
					.addGap(37))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAvatar, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(74)
							.addComponent(lblTen, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(lblChucVu, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(22)
							.addComponent(lblGioiTinh, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblThngTinC, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addGap(39)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtTen, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(3)
									.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
							.addGap(20)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtChucVu, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(5)
									.addComponent(lblSoDienThoai, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
							.addGap(13)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(14)
									.addComponent(rdbNam, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(14)
									.addComponent(rdbNu, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNgaySinh, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(73)
							.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(22)
							.addComponent(txtSDT, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(txtNgaySinh, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDiaChi, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnThayAvatar)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(txtDiaChi, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
					.addGap(64)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCapNhat)
						.addComponent(btnLamMoi))
					.addGap(147))
		);
		contentPane.setLayout(gl_contentPane);
	}

	private DoiMatKhau doiMK = new DoiMatKhau();
	private JTabbedPane tabbedPane;
	private SpringLayout springLayout;
	private JTextField txtChucVu;
	private SpringLayout springLayout_1;
	private JTextField txtNgaySinh;

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj.equals(btnCapNhat)) {
		}

	}
}
