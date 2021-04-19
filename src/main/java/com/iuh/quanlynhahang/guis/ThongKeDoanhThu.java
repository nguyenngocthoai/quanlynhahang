package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
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
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SpringLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;

public class ThongKeDoanhThu extends JFrame {

	public JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongKeDoanhThu frame = new ThongKeDoanhThu();
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
	private JLabel lblTNgy, lblThngKDoanh, lblnNgy;
	private JPanel panel;
	private JButton btnThongKe;
	private JDatePanelImpl datePanelImpl,datePanelImpl2;
	private JDatePickerImpl dateFrom, dateTo;
	private JTable tableThongKeDoanhThu;
	private DefaultTableModel tableModel;
	private JScrollPane scrollPane;
	private JLabel lblTongTien;
	private JButton btnBaoCao;
	private JTextField txtTongTien;
	private SpringLayout sl_dateFrom;
	private SpringLayout sl_dateTo;
	
	
	public ThongKeDoanhThu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		lblThngKDoanh = new JLabel("Thống Kê Doanh Thu");
		lblThngKDoanh.setForeground(Color.RED);
		lblThngKDoanh.setFont(new Font("Times New Roman", Font.BOLD, 25));

		lblTNgy = new JLabel("Từ Ngày");
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
//		springLayout.putConstraint(SpringLayout.WEST, datePickerImpl.getJFormattedTextField(), -173, SpringLayout.EAST, datePickerImpl);
//		springLayout.putConstraint(SpringLayout.EAST, datePickerImpl.getJFormattedTextField(), -28, SpringLayout.EAST, datePickerImpl);
		sl_dateFrom = (SpringLayout) dateFrom.getLayout();
		dateFrom.getJFormattedTextField().setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblnNgy = new JLabel("Đến Ngày");
		lblnNgy.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		datePanelImpl2=new JDatePanelImpl(model);
		dateTo=new JDatePickerImpl(datePanelImpl);
//		springLayout_1.putConstraint(SpringLayout.WEST, datePickerImpl2.getJFormattedTextField(), -171, SpringLayout.EAST, datePickerImpl2);
//		springLayout_1.putConstraint(SpringLayout.EAST, datePickerImpl2.getJFormattedTextField(), -28, SpringLayout.EAST, datePickerImpl2);
		sl_dateTo = (SpringLayout) dateTo.getLayout();
		dateTo.getJFormattedTextField().setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		btnThongKe = new JButton("Thống Kê");
		btnThongKe.setIcon(new ImageIcon("images\\calculator.png"));
		btnThongKe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThongKe.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		panel = new JPanel();
		
		String[] header = "STT; Mã Hóa Đơn; Ngày In Hóa Đơn; Thành Tiền".split(";");
		DefaultTableModel tableModel = new DefaultTableModel(header, 0);
		scrollPane = new JScrollPane(tableThongKeDoanhThu = new JTable(tableModel), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		lblTongTien = new JLabel("Tổng Tiền");
		lblTongTien.setForeground(Color.RED);
		lblTongTien.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		txtTongTien = new JTextField();
		txtTongTien.setForeground(Color.RED);
		txtTongTien.setEditable(false);
		txtTongTien.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtTongTien.setColumns(10);
		
		btnBaoCao = new JButton("Báo Cáo");
		btnBaoCao.setIcon(new ImageIcon("images\\report.png"));
		btnBaoCao.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(151)
					.addComponent(lblTNgy, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(dateFrom, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
					.addGap(16)
					.addComponent(lblnNgy, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(dateTo, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
					.addGap(40)
					.addComponent(btnThongKe, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
					.addGap(31)
					.addComponent(btnBaoCao, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
					.addGap(90))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(395)
					.addComponent(lblThngKDoanh, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(398, Short.MAX_VALUE))
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblThngKDoanh, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(lblTNgy, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(dateFrom, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnThongKe, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBaoCao, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(dateTo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblnNgy, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
					.addGap(16)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
					.addGap(0))
		);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addComponent(lblTongTien, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtTongTien, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
					.addGap(604))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
					.addGap(21)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTongTien, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTongTien, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(23))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
