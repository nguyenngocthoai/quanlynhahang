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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;

public class ChucVu extends JFrame implements ActionListener,MouseListener{

	public JPanel contentPane;
	private JTable table;
	private DefaultTableModel tableModel;
	private JPanel panel;
	private JLabel lblthongTinCV;
	private JLabel lblmaCV;
	private JLabel lbltenCV;
	private JButton btnthem;
	private JButton btncapNhat;
	private JButton btnxoaRong;
	private JButton btntroVe;
	private JTextField txtmaCV;
	private JTextField txttenCV;
	private JLabel lblChcV;
	
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		setLocationRelativeTo(null);
		//setVisible(true);
		taoGiaoDien();
	}
	public void taoGiaoDien() {
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		String[] header = "Mã Chức Vụ; Tên Chức Vụ".split(";");
		tableModel = new DefaultTableModel(header, 0);
		JScrollPane scrollPane = new JScrollPane(table = new JTable(tableModel), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		table.addMouseListener(this);

		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(SystemColor.control);

		lblthongTinCV = new JLabel("Thông Tin Chức Vụ");
		lblthongTinCV.setForeground(Color.BLACK);
		lblthongTinCV.setFont(new Font("Times New Roman", Font.BOLD, 20));

		lblmaCV = new JLabel("Mã Chức Vụ");
		lblmaCV.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lbltenCV = new JLabel("Tên Chức Vụ:");
		lbltenCV.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		txtmaCV = new JTextField();
		txtmaCV.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtmaCV.setColumns(10);

		txttenCV = new JTextField();
		txttenCV.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txttenCV.setColumns(10);
		
		lblChcV = new JLabel("CHỨC VỤ");
		lblChcV.setForeground(Color.RED);
		lblChcV.setFont(new Font("Times New Roman", Font.BOLD, 25));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
							.addGap(38)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lblChcV)
							.addGap(432))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblChcV)
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(scrollPane))
					.addGap(13))
		);
		
				btnthem = new JButton("Thêm");
				btnthem.setFont(new Font("Times New Roman", Font.PLAIN, 16));
				btnthem.setBackground(Color.WHITE);
				
						btnxoaRong = new JButton("Xóa Rỗng");
						btnxoaRong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
						btnxoaRong.setBackground(Color.WHITE);
						
								btncapNhat = new JButton("Cập Nhật");
								btncapNhat.setFont(new Font("Times New Roman", Font.PLAIN, 16));
								btncapNhat.setBackground(Color.WHITE);
								
										btntroVe = new JButton("Trở Về");
										btntroVe.setFont(new Font("Times New Roman", Font.PLAIN, 16));
										btntroVe.setBackground(Color.WHITE);
										GroupLayout gl_panel = new GroupLayout(panel);
										gl_panel.setHorizontalGroup(
											gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup()
													.addGap(148)
													.addComponent(lblthongTinCV, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_panel.createSequentialGroup()
													.addGap(31)
													.addComponent(lblmaCV, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
													.addGap(28)
													.addComponent(txtmaCV, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
													.addGap(90))
												.addGroup(gl_panel.createSequentialGroup()
													.addGap(31)
													.addComponent(lbltenCV, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
													.addGap(28)
													.addComponent(txttenCV, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
													.addGap(90))
												.addGroup(gl_panel.createSequentialGroup()
													.addGap(180)
													.addComponent(btnthem, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
													.addGap(42)
													.addComponent(btncapNhat, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
													.addGap(90))
												.addGroup(gl_panel.createSequentialGroup()
													.addGap(180)
													.addComponent(btntroVe, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
													.addGap(42)
													.addComponent(btnxoaRong, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
													.addGap(90))
										);
										gl_panel.setVerticalGroup(
											gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup()
													.addGap(10)
													.addComponent(lblthongTinCV, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
													.addGap(24)
													.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(lblmaCV, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
														.addGroup(gl_panel.createSequentialGroup()
															.addGap(2)
															.addComponent(txtmaCV, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
													.addGap(29)
													.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(lbltenCV, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
														.addGroup(gl_panel.createSequentialGroup()
															.addGap(2)
															.addComponent(txttenCV, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
													.addGap(79)
													.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(btnthem, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
														.addComponent(btncapNhat, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
													.addGap(54)
													.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(btntroVe, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
														.addComponent(btnxoaRong, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
										);
										panel.setLayout(gl_panel);
										btntroVe.addActionListener(this);
								btncapNhat.addActionListener(this);
						btnxoaRong.addActionListener(this);
				btnthem.addActionListener(this);
		contentPane.setLayout(gl_contentPane);
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
