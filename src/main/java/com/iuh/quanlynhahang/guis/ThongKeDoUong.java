package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class ThongKeDoUong extends JFrame {

	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static String title;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongKeDoUong frame = new ThongKeDoUong(title);
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
	private JLabel lblThngK,lblDoUong;
	public ThongKeDoUong(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblThngK = new JLabel("Thống Kê Đồ Uống");
		lblThngK.setForeground(Color.RED);
		lblThngK.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblThngK.setBounds(388, 10, 155, 51);
		contentPane.add(lblThngK);
		
		lblDoUong = new JLabel(title);
		lblDoUong.setForeground(Color.RED);
		lblDoUong.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblDoUong.setBounds(543, 10, 155, 51);
		contentPane.add(lblDoUong);
	}

}
