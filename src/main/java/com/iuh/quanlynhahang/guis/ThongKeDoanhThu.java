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

public class ThongKeDoanhThu extends JFrame {

	private JPanel contentPane;
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
	private JDatePickerImpl datePickerImpl, datePickerImpl2;
	private JTable table;
	private DefaultTableModel tableModel;
	private JScrollPane scrollPane;
	private JLabel lblTongTien;
	private JButton btnBaoCao;
	
	
	public ThongKeDoanhThu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblThngKDoanh = new JLabel("Thống Kê Doanh Thu");
		lblThngKDoanh.setForeground(Color.RED);
		lblThngKDoanh.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblThngKDoanh.setBounds(479, 10, 175, 51);
		contentPane.add(lblThngKDoanh);

		lblTNgy = new JLabel("Từ Ngày : ");
		lblTNgy.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTNgy.setBounds(326, 82, 64, 25);
		contentPane.add(lblTNgy);

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
	
		datePickerImpl.setBounds(400, 82, 175, 31);
		contentPane.add(datePickerImpl);

		lblnNgy = new JLabel("Đến Ngày : ");
		lblnNgy.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblnNgy.setBounds(586, 82, 64, 25);
		contentPane.add(lblnNgy);

		datePanelImpl2=new JDatePanelImpl(model);
		datePickerImpl2=new JDatePickerImpl(datePanelImpl);
	
		datePickerImpl2.setBounds(647, 82, 175, 31);
		contentPane.add(datePickerImpl2);
		
		btnThongKe = new JButton("Thống Kê");
		btnThongKe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnThongKe.setBounds(844, 75, 85, 38);
		contentPane.add(btnThongKe);
		
		panel = new JPanel();
		panel.setBounds(0, 135, 1086, 403);
		contentPane.add(panel);
		
		String[] header = "STT; Mã Hóa Đơn; Ngày In Hóa Đơn; Thành Tiền".split(";");
		DefaultTableModel tableModel = new DefaultTableModel(header, 0);
		panel.setLayout(null);
		scrollPane = new JScrollPane(table = new JTable(tableModel), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(0, 0, 1086, 349);
		
		panel.add(scrollPane);
		
		lblTongTien = new JLabel("Tổng Tiền : ");
		lblTongTien.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTongTien.setBounds(10, 359, 64, 25);
		panel.add(lblTongTien);
		
		btnBaoCao = new JButton("Báo Cáo");
		btnBaoCao.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnBaoCao.setBounds(949, 75, 85, 38);
		contentPane.add(btnBaoCao);
	}
}
