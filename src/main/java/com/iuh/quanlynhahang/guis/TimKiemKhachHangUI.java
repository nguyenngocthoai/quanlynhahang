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

public class TimKiemKhachHangUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtKH;
	private JTextField txtSDT;
	private JTextField txtCMND;
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
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("Tên Khách Hàng:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(10, 77, 124, 23);
		contentPane.add(label);

		txtKH = new JTextField();
		txtKH.setColumns(10);
		txtKH.setBounds(144, 80, 240, 20);
		contentPane.add(txtKH);

		JLabel lblTmKimKhch = new JLabel("Tìm Kiếm Khách Hàng");
		lblTmKimKhch.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblTmKimKhch.setBounds(110, 11, 260, 39);
		contentPane.add(lblTmKimKhch);

		JLabel lblNgyngK = new JLabel("Ngày Đăng Ký:");
		lblNgyngK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNgyngK.setBounds(10, 213, 124, 23);
		contentPane.add(lblNgyngK);

		JLabel label_2 = new JLabel("Từ Ngày:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(65, 247, 69, 23);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("Đến Ngày:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(65, 290, 69, 23);
		contentPane.add(label_3);

		JLabel lblSinThoi = new JLabel("Số Điện Thoại:");
		lblSinThoi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSinThoi.setBounds(10, 122, 124, 23);
		contentPane.add(lblSinThoi);

		txtSDT = new JTextField();
		txtSDT.setColumns(10);
		txtSDT.setBounds(144, 125, 240, 20);
		contentPane.add(txtSDT);

		JLabel lblCmndCccd = new JLabel("CMND / CCCD :");
		lblCmndCccd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCmndCccd.setBounds(10, 168, 124, 23);
		contentPane.add(lblCmndCccd);

		txtCMND = new JTextField();
		txtCMND.setColumns(10);
		txtCMND.setBounds(144, 171, 240, 20);
		contentPane.add(txtCMND);

		btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTimKiem.setBounds(65, 361, 104, 23);
		contentPane.add(btnTimKiem);

		btnTroVe = new JButton("Trở Về");
		btnTroVe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTroVe.setBounds(236, 361, 89, 23);
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
		datePicker1.setBounds(154, 250, 171, 20);
		contentPane.add(datePicker1);
		model1.setValue(Date.valueOf(LocalDate.now()));

		model2 = new UtilDateModel();
		model2.setDate(year, m, day);
		model2.setSelected(true);
		
		datePanel2 = new JDatePanelImpl(model2);
		datePicker2 = new JDatePickerImpl(datePanel2);
		datePicker2.setBounds(154, 293, 171, 20);
		contentPane.add(datePicker2);
		model2.setValue(Date.valueOf(LocalDate.now()));

		ButtonGroup group = new ButtonGroup();

		btnTimKiem.addActionListener(this);
		btnTroVe.addActionListener(this);
	}

	private KhachHangUI khUI=new KhachHangUI();
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj.equals(btnTimKiem)) {
			setVisible(false);
			khUI.setVisible(true);
		}
		
	}

}
