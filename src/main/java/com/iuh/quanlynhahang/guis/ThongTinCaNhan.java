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
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ThongTinCaNhan extends JFrame {

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
	private JLabel lblNewLabel,lblThngTinC;
	private JLabel lblTnNgiDng;
	private JLabel lblChcV;
	private JLabel lblGiiTnh;
	private JLabel lblEmail;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblEmail_1;
	private JPanel panel;
	private JButton btnXoaRong;
	private JButton btnCapNhat;
	private JLabel lblMtKhu;
	private JTextField textField_4;
	private JLabel lblNhpLiMt;
	private JTextField textField_5;
	private JButton btniMtKhu;
	public ThongTinCaNhan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblThngTinC = new JLabel("Thông Tin Cá Nhân");
		lblThngTinC.setBounds(488, 5, 159, 24);
		lblThngTinC.setForeground(Color.RED);
		lblThngTinC.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add(lblThngTinC);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\LOC\\Downloads\\avt1.jpg"));
		lblNewLabel.setBounds(10, 70, 182, 226);
		contentPane.add(lblNewLabel);
		
		lblTnNgiDng = new JLabel("Tên Người Dùng : ");
		lblTnNgiDng.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTnNgiDng.setBounds(202, 97, 125, 24);
		contentPane.add(lblTnNgiDng);
		
		lblChcV = new JLabel("Chức Vụ :");
		lblChcV.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblChcV.setBounds(202, 147, 125, 24);
		contentPane.add(lblChcV);
		
		lblGiiTnh = new JLabel("Số Điện Thoại : ");
		lblGiiTnh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblGiiTnh.setBounds(202, 197, 125, 24);
		contentPane.add(lblGiiTnh);
		
		lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblEmail.setBounds(202, 247, 125, 24);
		contentPane.add(lblEmail);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(355, 99, 238, 24);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(355, 149, 238, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(355, 199, 238, 24);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(355, 249, 238, 24);
		contentPane.add(textField_3);
		
		lblEmail_1 = new JLabel("Cập Nhật Hình Ảnh :");
		lblEmail_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblEmail_1.setBounds(10, 321, 159, 24);
		contentPane.add(lblEmail_1);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Thao T\u00E1c", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(635, 204, 441, 88);
		contentPane.add(panel);
		
		btnXoaRong = new JButton("Xóa Rỗng");
		btnXoaRong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnXoaRong.setBounds(10, 31, 104, 29);
		panel.add(btnXoaRong);
		
		btnCapNhat = new JButton("Cập Nhật");
		btnCapNhat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCapNhat.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnCapNhat.setBounds(327, 31, 104, 29);
		panel.add(btnCapNhat);
		
		btniMtKhu = new JButton("Đổi Mật Khẩu");
		btniMtKhu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btniMtKhu.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btniMtKhu.setBounds(157, 31, 122, 29);
		panel.add(btniMtKhu);
		
		lblMtKhu = new JLabel("Mật Khẩu :");
		lblMtKhu.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMtKhu.setBounds(635, 97, 125, 24);
		contentPane.add(lblMtKhu);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(770, 99, 238, 24);
		contentPane.add(textField_4);
		
		lblNhpLiMt = new JLabel("Nhập Lại Mật Khẩu : ");
		lblNhpLiMt.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNhpLiMt.setBounds(635, 154, 144, 24);
		contentPane.add(lblNhpLiMt);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(770, 151, 238, 24);
		contentPane.add(textField_5);
	}

}
