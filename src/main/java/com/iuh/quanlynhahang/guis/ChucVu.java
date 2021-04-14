package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Component;
import javax.swing.ScrollPaneConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ChucVu extends JFrame implements ActionListener,MouseListener{

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel tableModel;
	private JPanel panel;
	private JLabel lblthongTinCV;
	private JLabel lblmaCV;
	private JLabel lbltenCV;
	private JPanel panel_1;
	private JButton btnthem;
	private JButton btncapNhat;
	private JButton btnxoaRong;
	private JButton btntroVe;
	private JTextField txtmaCV;
	private JTextField txttenCV;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChucVu frame = new ChucVu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ChucVu() {
		setTitle("Giao Diện Quản Lý Chức Vụ");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 748, 353);
		setLocationRelativeTo(null);
		setResizable(false);
		//setVisible(true);
		taoGiaoDien();
	}
	public void taoGiaoDien() {
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		String[] header = "Mã Chức Vụ; Tên Chức Vụ".split(";");
		tableModel = new DefaultTableModel(header, 0);
		JScrollPane scrollPane = new JScrollPane(table = new JTable(tableModel), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		table.addMouseListener(this);
		scrollPane.setBounds(10, 10, 383, 300);
		contentPane.add(scrollPane);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(403, 10, 321, 299);
		contentPane.add(panel);
		panel.setLayout(null);

		lblthongTinCV = new JLabel("Thông Tin Chức Vụ");
		lblthongTinCV.setForeground(Color.BLUE);
		lblthongTinCV.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblthongTinCV.setBounds(61, 11, 232, 31);
		panel.add(lblthongTinCV);

		lblmaCV = new JLabel("Mã Chức Vụ:");
		lblmaCV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblmaCV.setBounds(10, 51, 121, 31);
		panel.add(lblmaCV);

		lbltenCV = new JLabel("Tên Chức Vụ:");
		lbltenCV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbltenCV.setBounds(10, 111, 121, 31);
		panel.add(lbltenCV);

		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "Thanh C\u00F4ng C\u1EE5", TitledBorder.LEADING, TitledBorder.TOP,

				null, Color.BLUE));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(7, 157, 303, 132);
		panel.add(panel_1);

		btnthem = new JButton("Thêm");
		btnthem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnthem.setBackground(Color.WHITE);
		btnthem.setBounds(24, 25, 99, 31);
		panel_1.add(btnthem);

		btncapNhat = new JButton("Cập Nhật");
		btncapNhat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btncapNhat.setBackground(Color.WHITE);
		btncapNhat.setBounds(24, 89, 99, 31);
		panel_1.add(btncapNhat);

		btnxoaRong = new JButton("Xóa Rỗng");
		btnxoaRong.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnxoaRong.setBackground(Color.WHITE);
		btnxoaRong.setBounds(179, 25, 99, 31);
		panel_1.add(btnxoaRong);

		btntroVe = new JButton("Trở Về");
		btntroVe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btntroVe.setBackground(Color.WHITE);
		btntroVe.setBounds(179, 89, 99, 31);
		panel_1.add(btntroVe);

		txtmaCV = new JTextField();
		txtmaCV.setEditable(false);
		txtmaCV.setColumns(10);
		txtmaCV.setBounds(130, 51, 151, 27);
		panel.add(txtmaCV);

		txttenCV = new JTextField();
		txttenCV.setColumns(10);
		txttenCV.setBounds(130, 111, 151, 27);
		panel.add(txttenCV);
		btnthem.addActionListener(this);
		btncapNhat.addActionListener(this);
		btnxoaRong.addActionListener(this);
		btntroVe.addActionListener(this);
		txtmaCV.setEditable(false);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj.equals(btntroVe)) {
			setVisible(false);
		}
		
	}


}
