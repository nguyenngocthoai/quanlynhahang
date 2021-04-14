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

public class DoiMatKhau extends JFrame implements ActionListener{

	public JPanel contentPane;
	private JTextField tfMKHienTai;
	private JTextField tfMKMoi;
	private JTextField tfNhapLaiMK;
	private JButton btnXacNhan,btnThoat;
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
		setBounds(100, 100, 619, 399);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		
		JLabel lblDoiMatKhau = new JLabel("Đổi Mật Khẩu");
		lblDoiMatKhau.setBounds(256, 10, 122, 43);
		lblDoiMatKhau.setForeground(Color.BLUE);
		lblDoiMatKhau.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JLabel lblMKHienTai = new JLabel("Mật Khẩu Hiện Tại :");
		lblMKHienTai.setBounds(51, 99, 112, 27);
		lblMKHienTai.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		tfMKHienTai = new JTextField();
		tfMKHienTai.setBounds(173, 96, 342, 33);
		tfMKHienTai.setColumns(10);
		
		JLabel lblMKMoi = new JLabel("Mật Khẩu Mới :");
		lblMKMoi.setBounds(51, 162, 112, 27);
		lblMKMoi.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		JLabel lblNhapLaiMK = new JLabel("Nhập Lại Mật Khẩu :");
		lblNhapLaiMK.setBounds(51, 228, 112, 27);
		lblNhapLaiMK.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		tfMKMoi = new JTextField();
		tfMKMoi.setBounds(173, 159, 342, 33);
		tfMKMoi.setColumns(10);
		
		tfNhapLaiMK = new JTextField();
		tfNhapLaiMK.setBounds(173, 225, 342, 33);
		tfNhapLaiMK.setColumns(10);
		
		 btnXacNhan = new JButton("Xác Nhận");
		 btnXacNhan.setBounds(173, 292, 129, 43);
		btnXacNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXacNhan.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		 btnThoat = new JButton("Thoát");
		 btnThoat.setBounds(321, 292, 129, 43);
		btnThoat.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		contentPane.setLayout(null);
		contentPane.add(lblDoiMatKhau);
		contentPane.add(lblMKHienTai);
		contentPane.add(tfMKHienTai);
		contentPane.add(lblMKMoi);
		contentPane.add(lblNhapLaiMK);
		contentPane.add(tfMKMoi);
		contentPane.add(tfNhapLaiMK);
		contentPane.add(btnXacNhan);
		contentPane.add(btnThoat);
		
		btnThoat.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj= e.getSource();
		if(obj.equals(btnThoat)) {
			setVisible(false);
		}
		
	}
}
