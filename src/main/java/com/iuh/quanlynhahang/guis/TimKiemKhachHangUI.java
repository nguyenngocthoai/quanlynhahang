package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Properties;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.SystemColor;

public class TimKiemKhachHangUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtKH;
	private Properties p;
	private UtilDateModel model1, model2;
	private JDatePanelImpl datePanel1, datePanel2;
	private JDatePickerImpl datePicker1, datePicker2;
	private JButton btnTimKiem, btnTroVe;

	public TimKiemKhachHangUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 417, 434);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("Tên Khách Hàng:");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label.setBounds(10, 77, 124, 23);
		contentPane.add(label);

		txtKH = new JTextField();
		txtKH.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtKH.setColumns(10);
		txtKH.setBounds(144, 80, 240, 28);
		contentPane.add(txtKH);

		JLabel lblTmKimKhch = new JLabel("Tìm Kiếm Khách Hàng");
		lblTmKimKhch.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblTmKimKhch.setBounds(110, 11, 260, 39);
		contentPane.add(lblTmKimKhch);

		JLabel lblNgyngK = new JLabel("Ngày Đăng Ký:");
		lblNgyngK.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNgyngK.setBounds(10, 213, 124, 28);
		contentPane.add(lblNgyngK);

		JLabel label_2 = new JLabel("Từ Ngày:");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label_2.setBounds(65, 250, 69, 28);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("Đến Ngày:");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label_3.setBounds(65, 293, 69, 28);
		contentPane.add(label_3);

		JLabel lblSinThoi = new JLabel("Số Điện Thoại:");
		lblSinThoi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSinThoi.setBounds(10, 122, 124, 23);
		contentPane.add(lblSinThoi);

		JLabel lblCmndCccd = new JLabel("CMND / CCCD :");
		lblCmndCccd.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCmndCccd.setBounds(10, 168, 124, 23);
		contentPane.add(lblCmndCccd);

		btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnTimKiem.setBounds(99, 361, 104, 30);
		contentPane.add(btnTimKiem);

		btnTroVe = new JButton("Hủy");
		btnTroVe.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnTroVe.setBounds(236, 361, 89, 30);
		contentPane.add(btnTroVe);

		LocalDate date=LocalDate.now();
		int year=date.getYear();
		Month month= date.getMonth();
		int m=month.getValue();
		int day=date.getDayOfMonth();
		
		model1 = new UtilDateModel();
		model1.setDate(year, m, day);
		model1.setSelected(true);
		
		datePanel1 = new JDatePanelImpl(model1);
		datePicker1 = new JDatePickerImpl(datePanel1);
		datePicker1.getJFormattedTextField().setFont(new Font("Times New Roman", Font.PLAIN, 13));
		datePicker1.setBounds(154, 250, 171, 28);
		contentPane.add(datePicker1);
		model1.setValue(Date.valueOf(LocalDate.now()));

		model2 = new UtilDateModel();
		model2.setDate(year, m, day);
		model2.setSelected(true);
		
		datePanel2 = new JDatePanelImpl(model2);
		datePicker2 = new JDatePickerImpl(datePanel2);
		datePicker2.setBounds(154, 293, 171, 28);
		contentPane.add(datePicker2);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBounds(144, 117, 240, 28);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(144, 163, 240, 28);
		contentPane.add(textField_1);
		model2.setValue(Date.valueOf(LocalDate.now()));

		ButtonGroup group = new ButtonGroup();

		btnTimKiem.addActionListener(this);
		btnTroVe.addActionListener(this);
	}

	private KhachHangUI khUI=new KhachHangUI();
	private JTextField textField;
	private JTextField textField_1;
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj.equals(btnTimKiem)) {
			setVisible(false);
			khUI.setVisible(true);
		}
		
	}

}
