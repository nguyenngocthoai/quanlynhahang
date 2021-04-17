package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class DoiMatKhau extends JFrame implements ActionListener{

	public JPanel contentPane;
	private JTextField txtMKHienTai;
	private JTextField txtMKMoi;
	private JTextField txtXNMK;
	private JButton btnXacNhan,btnLamMoi;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoiMatKhau frame = new DoiMatKhau();
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
	public DoiMatKhau() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		
		JLabel lblDoiMatKhau = new JLabel("Đổi Mật Khẩu");
		lblDoiMatKhau.setForeground(Color.RED);
		lblDoiMatKhau.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		JLabel lblMKHienTai = new JLabel("Mật Khẩu Hiện Tại :");
		lblMKHienTai.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		txtMKHienTai = new JTextField();
		txtMKHienTai.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtMKHienTai.setColumns(10);
		
		JLabel lblMKMoi = new JLabel("Mật Khẩu Mới :");
		lblMKMoi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JLabel lblNhapLaiMK = new JLabel("Nhập Lại Mật Khẩu :");
		lblNhapLaiMK.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		txtMKMoi = new JTextField();
		txtMKMoi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtMKMoi.setColumns(10);
		
		txtXNMK = new JTextField();
		txtXNMK.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtXNMK.setColumns(10);
		
		 btnXacNhan = new JButton("Xác Nhận");
		btnXacNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXacNhan.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		 btnLamMoi = new JButton("Làm Mới");
		btnLamMoi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(285)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(122)
									.addComponent(btnXacNhan, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
									.addGap(19)
									.addComponent(btnLamMoi, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
									.addGap(129))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(lblMKMoi, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(lblMKHienTai, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addComponent(lblNhapLaiMK, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
									.addGap(42)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(txtMKMoi, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
										.addComponent(txtMKHienTai, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
										.addComponent(txtXNMK, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(444)
							.addComponent(lblDoiMatKhau, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)))
					.addGap(255))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addComponent(lblDoiMatKhau, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblMKHienTai, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(36)
							.addComponent(lblMKMoi, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtMKHienTai, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addGap(36)
							.addComponent(txtMKMoi, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addGap(39)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtXNMK, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNhapLaiMK, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))))
					.addGap(37)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnXacNhan, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLamMoi, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addGap(189))
		);
		contentPane.setLayout(gl_contentPane);
		
		btnLamMoi.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj= e.getSource();
		if(obj.equals(btnLamMoi)) {
			setVisible(false);
		}
		
	}
}
