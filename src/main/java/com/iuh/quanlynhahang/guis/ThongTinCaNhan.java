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
	private JLabel lblNewLabel, lblThngTinC, lblDiaChi, lblNgaySinh;
	private JLabel lblTen;
	private JLabel lblChucVu;
	private JLabel lblSoDienThoai;
	private JLabel lblEmail;
	private JTextField tfHoTen;
	private JTextField tfSoDienThoai;
	private JLabel lblEmail_1;
	private JPanel panel;
	private JButton btnXoaRong;
	private JButton btnCapNhat;
	private JButton btnDoiMK;
	private JLabel lblGioiTinh;
	private JTextField textField;
	private JTextField textField_1;
	private UtilDateModel model;
	private JDatePanelImpl datePanelImpl;
	private JDatePickerImpl datePickerImpl;
	private JTextField tfEmail;
	private JComboBox cbxChucVu;
	private JRadioButton rdbNam, rdbNu;

	public ThongTinCaNhan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		lblThngTinC = new JLabel("Thông Tin Cá Nhân");
		lblThngTinC.setForeground(Color.RED);
		lblThngTinC.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\LOC\\Downloads\\avt1.jpg"));

		lblTen = new JLabel("Họ và Tên :");
		lblTen.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblChucVu = new JLabel("Chức Vụ :");
		lblChucVu.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblSoDienThoai = new JLabel("Số Điện Thoại : ");
		lblSoDienThoai.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		tfHoTen = new JTextField();
		tfHoTen.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tfHoTen.setColumns(10);

		tfSoDienThoai = new JTextField();
		tfSoDienThoai.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tfSoDienThoai.setColumns(10);

		lblEmail_1 = new JLabel("Cập Nhật Hình Ảnh :");
		lblEmail_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Thao T\u00E1c",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));

		btnXoaRong = new JButton("Xóa Rỗng");
		btnXoaRong.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		btnCapNhat = new JButton("Cập Nhật");
		btnCapNhat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCapNhat.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		btnDoiMK = new JButton("Đổi Mật Khẩu");
		btnDoiMK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDoiMK.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		btnThoat = new JButton("Thoát");
		btnThoat.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblGioiTinh = new JLabel("Giới Tính :");
		lblGioiTinh.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		cbxChucVu = new JComboBox();
		cbxChucVu.setFont(new Font("Times New Roman", Font.PLAIN, 13));

		rdbNam = new JRadioButton("Nam");
		rdbNam.setFont(new Font("Times New Roman", Font.PLAIN, 13));

		rdbNu = new JRadioButton("Nữ");
		rdbNu.setFont(new Font("Times New Roman", Font.PLAIN, 13));

		lblDiaChi = new JLabel("Địa Chỉ :");
		lblDiaChi.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField.setColumns(10);

		lblNgaySinh = new JLabel("Ngày Sinh : ");
		lblNgaySinh.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		model = new UtilDateModel();
		datePanelImpl = new JDatePanelImpl(model);
		datePickerImpl = new JDatePickerImpl(datePanelImpl);
		
		datePickerImpl.getJFormattedTextField().setFont(new Font("Times New Roman", Font.PLAIN, 13));

		tfEmail = new JTextField();
		tfEmail.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tfEmail.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(483)
					.addComponent(lblThngTinC, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(434))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblTen, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblChucVu, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGioiTinh, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDiaChi, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(tfHoTen, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
							.addGap(145)
							.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tfEmail, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(cbxChucVu, 0, 238, Short.MAX_VALUE)
							.addGap(145)
							.addComponent(lblSoDienThoai, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(tfSoDienThoai, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbNam, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addGap(36)
							.addComponent(rdbNu, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addGap(229)
							.addComponent(lblNgaySinh, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(datePickerImpl, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE))
					.addGap(53))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(lblEmail_1, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
					.addGap(90)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
					.addGap(205))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblThngTinC, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(41)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(27)
							.addComponent(lblTen, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(lblChucVu, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(lblGioiTinh, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(lblDiaChi, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(21)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(5)
											.addComponent(tfHoTen, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
										.addComponent(tfEmail, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(26)
									.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
							.addGap(24)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(cbxChucVu, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(2)
									.addComponent(lblSoDienThoai, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(1)
									.addComponent(tfSoDienThoai, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
							.addGap(20)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(9)
									.addComponent(rdbNam, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(9)
									.addComponent(rdbNu, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(6)
									.addComponent(lblNgaySinh, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
								.addComponent(datePickerImpl, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addGap(25)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblEmail_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
					.addGap(101))
		);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(btnXoaRong, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
					.addGap(43)
					.addComponent(btnDoiMK, GroupLayout.PREFERRED_SIZE, 122, Short.MAX_VALUE)
					.addGap(48)
					.addComponent(btnCapNhat, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
					.addGap(46)
					.addComponent(btnThoat, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
					.addGap(31))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(16)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnXoaRong)
						.addComponent(btnDoiMK)
						.addComponent(btnCapNhat)
						.addComponent(btnThoat)))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);

		btnDoiMK.addActionListener(this);
		btnThoat.addActionListener(this);
	}

	private DoiMatKhau doiMK = new DoiMatKhau();
	private JButton btnThoat;
	private JTabbedPane tabbedPane;
	private SpringLayout springLayout;

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj.equals(btnDoiMK)) {
			doiMK.setVisible(true);
		} else if (obj.equals(btnThoat)) {
			setVisible(false);
		}

	}

}
