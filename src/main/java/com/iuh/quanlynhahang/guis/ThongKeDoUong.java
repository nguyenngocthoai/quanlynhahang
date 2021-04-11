package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import javax.swing.JLabel;
import java.awt.Font;
import java.time.LocalDate;
import java.time.Month;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

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
	private JPanel panel_1;
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel tableModel;
	private JDatePanelImpl datePanelImpl,datePanelImpl2;
	private JDatePickerImpl datePickerImpl,datePickerImpl2;
	private JLabel lblnNgy;
	private JButton btnThongKe,btnBaoCao;
	private JLabel lblTongKet;
	private JLabel lblKLDoUong;
	
	public ThongKeDoUong(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblThngK = new JLabel("Thống Kê Đồ Uống");
		lblThngK.setForeground(Color.RED);
		lblThngK.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		
		lblDoUong = new JLabel(title);
		lblDoUong.setForeground(Color.RED);
		lblDoUong.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		
		panel_1 = new JPanel();
		
		String[] header = "STT; Tên Đồ Uống; Số lượng".split(";");
		tableModel = new DefaultTableModel(header, 0);
		scrollPane = new JScrollPane(table = new JTable(tableModel), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		lblTongKet = new JLabel("Đồ Uống ");
		lblTongKet.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		lblKLDoUong = new JLabel(title);
		lblKLDoUong.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		JLabel lblTNgy = new JLabel("Từ Ngày : ");
		lblTNgy.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		LocalDate date=LocalDate.now();
		int year=date.getYear();
		Month month= date.getMonth();
		int m=month.getValue();
		int day=date.getDayOfMonth();
		UtilDateModel model=new UtilDateModel();
		model.setDate(year, m, day);
		model.setSelected(true);
		
		datePanelImpl=new JDatePanelImpl(model);
		datePickerImpl=new JDatePickerImpl(datePanelImpl);
		
		lblnNgy = new JLabel("Đến Ngày : ");
		lblnNgy.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		datePanelImpl2=new JDatePanelImpl(model);
		datePickerImpl2=new JDatePickerImpl(datePanelImpl);
		
		btnThongKe = new JButton("Thống Kê");
		btnThongKe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		btnBaoCao = new JButton("Báo Cáo");
		btnBaoCao.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(388)
					.addComponent(lblThngK, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
					.addComponent(lblDoUong, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
					.addGap(388))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(289)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(63)
							.addComponent(datePickerImpl, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
						.addComponent(lblTNgy, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addComponent(lblnNgy, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(datePickerImpl2, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(btnThongKe, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
					.addGap(12)
					.addComponent(btnBaoCao, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
					.addGap(113))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1086, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblThngK, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDoUong, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(datePickerImpl, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTNgy, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(lblnNgy, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(datePickerImpl2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnThongKe, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBaoCao, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTongKet, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(53)
							.addComponent(lblKLDoUong, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))))
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1086, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTongKet, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblKLDoUong, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
		);
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);
	}
}
