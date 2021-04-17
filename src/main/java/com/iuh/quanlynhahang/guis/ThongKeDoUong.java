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
import javax.swing.SpringLayout;

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
	private JTable tableThongKeDoUong;
	private DefaultTableModel tableModel;
	private JDatePanelImpl datePanelImpl,datePanelImpl2;
	private JDatePickerImpl dateFrom,dateTo;
	private JLabel lblnNgy;
	private JButton btnThongKe,btnBaoCao;
	
	public ThongKeDoUong(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblThngK = new JLabel("Thống Kê Đồ Uống");
		lblThngK.setForeground(Color.RED);
		lblThngK.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		lblDoUong = new JLabel(title);
		lblDoUong.setForeground(Color.RED);
		lblDoUong.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		panel_1 = new JPanel();
		
		String[] header = "STT; Tên Đồ Uống; Số lượng".split(";");
		tableModel = new DefaultTableModel(header, 0);
		scrollPane = new JScrollPane(tableThongKeDoUong = new JTable(tableModel), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		tableThongKeDoUong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JLabel lblTNgy = new JLabel("Từ Ngày");
		lblTNgy.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		LocalDate date=LocalDate.now();
		int year=date.getYear();
		Month month= date.getMonth();
		int m=month.getValue();
		int day=date.getDayOfMonth();
		UtilDateModel model=new UtilDateModel();
		model.setDate(year, m, day);
		model.setSelected(true);
		
		datePanelImpl=new JDatePanelImpl(model);
		dateFrom=new JDatePickerImpl(datePanelImpl);
		dateFrom.getJFormattedTextField().setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblnNgy = new JLabel("Đến Ngày");
		lblnNgy.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		datePanelImpl2=new JDatePanelImpl(model);
		dateTo=new JDatePickerImpl(datePanelImpl);
		SpringLayout springLayout = (SpringLayout) dateTo.getLayout();
		springLayout.putConstraint(SpringLayout.SOUTH, dateTo.getJFormattedTextField(), 0, SpringLayout.SOUTH, dateTo);
		dateTo.getJFormattedTextField().setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		btnThongKe = new JButton("Thống Kê");
		btnThongKe.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		btnBaoCao = new JButton("Báo Cáo");
		btnBaoCao.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1041, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
					.addGap(11))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(352)
							.addComponent(lblThngK)
							.addComponent(lblDoUong))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(174)
							.addComponent(lblTNgy, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(dateFrom, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
							.addGap(27)
							.addComponent(lblnNgy, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(dateTo, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
							.addGap(42)
							.addComponent(btnThongKe, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
							.addGap(26)
							.addComponent(btnBaoCao, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
							.addGap(88))
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(7))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblThngK, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDoUong, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(lblTNgy, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(dateFrom, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(lblnNgy, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnThongKe, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBaoCao, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(dateTo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(34)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(0))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
