package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.iuh.quanlynhahang.daoimpls.KhachHangDAOImpl;
import com.iuh.quanlynhahang.entities.KhachHang;

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
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.SystemColor;

public class TimKiemKhachHangUI extends JFrame implements ActionListener {

<<<<<<< Updated upstream
	private JPanel contentPane;
	private JTextField txtKH;
=======
	public JPanel contentPane;
	private JTextField txtTenKH;
>>>>>>> Stashed changes
	private Properties p;
	private UtilDateModel model1, model2;
	private JDatePanelImpl datePanel1, datePanel2;
	private JButton btnTimKiem, btnTroVe;
	private JRadioButton radNu,radNam;
	

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
<<<<<<< Updated upstream
		label.setBounds(10, 77, 124, 23);
		contentPane.add(label);

		txtKH = new JTextField();
		txtKH.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtKH.setColumns(10);
		txtKH.setBounds(144, 80, 240, 28);
		contentPane.add(txtKH);
=======
		label.setBounds(10, 76, 124, 28);
		contentPane.add(label);

		txtTenKH = new JTextField();
		txtTenKH.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtTenKH.setColumns(10);
		txtTenKH.setBounds(144, 77, 240, 28);
		contentPane.add(txtTenKH);
>>>>>>> Stashed changes

		JLabel lblTmKimKhch = new JLabel("Tìm Kiếm Khách Hàng");
		lblTmKimKhch.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblTmKimKhch.setBounds(110, 11, 260, 39);
		contentPane.add(lblTmKimKhch);

<<<<<<< Updated upstream
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
=======
		JLabel lblSinThoi = new JLabel("Số Điện Thoại:");
		lblSinThoi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSinThoi.setBounds(10, 134, 124, 28);
		contentPane.add(lblSinThoi);

		JLabel lblCmndCccd = new JLabel("Địa Chỉ:");
		lblCmndCccd.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCmndCccd.setBounds(10, 192, 124, 28);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
		datePicker1 = new JDatePickerImpl(datePanel1);
		datePicker1.getJFormattedTextField().setFont(new Font("Times New Roman", Font.PLAIN, 13));
		datePicker1.setBounds(154, 250, 171, 28);
		contentPane.add(datePicker1);
=======
>>>>>>> Stashed changes
		model1.setValue(Date.valueOf(LocalDate.now()));

		model2 = new UtilDateModel();
		model2.setDate(year, m, day);
		model2.setSelected(true);
		
		datePanel2 = new JDatePanelImpl(model2);
<<<<<<< Updated upstream
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

=======
		
		txtSDT = new JTextField();
		txtSDT.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtSDT.setColumns(10);
		txtSDT.setBounds(144, 135, 240, 28);
		contentPane.add(txtSDT);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtDiaChi.setColumns(10);
		txtDiaChi.setBounds(144, 193, 240, 28);
		contentPane.add(txtDiaChi);
		
		JLabel lblGiiTnh = new JLabel("Giới Tính:");
		lblGiiTnh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblGiiTnh.setBounds(10, 254, 124, 28);
		contentPane.add(lblGiiTnh);
		
		 radNam = new JRadioButton("Nam");
		radNam.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		radNam.setBounds(144, 254, 103, 28);
		contentPane.add(radNam);
		
		 radNu = new JRadioButton("Nữ");
		radNu.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		radNu.setBounds(267, 254, 103, 28);
		contentPane.add(radNu);
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(radNam);
		buttonGroup.add(radNu);
		
>>>>>>> Stashed changes
		ButtonGroup group = new ButtonGroup();

		btnTimKiem.addActionListener(this);
		btnTroVe.addActionListener(this);
	}

<<<<<<< Updated upstream
	private KhachHangUI khUI=new KhachHangUI();
	private JTextField textField;
	private JTextField textField_1;
=======
	private KhachHangUI khUI;
	private JTextField txtSDT;
	private JTextField txtDiaChi;
	private KhachHangDAOImpl khdao=new KhachHangDAOImpl();
	public static List<KhachHang> listKH=new ArrayList<KhachHang>();
	public static int kt=0;
	public void TimKiemKH() {
		String tenKh=txtTenKH.getText().trim();
		String diaChi=txtDiaChi.getText().trim();
		String sdt=txtSDT.getText().trim();
		String gioiTinh = "";
		if (radNam.isSelected()) {
			gioiTinh = "Nam";
		} else if (radNu.isSelected()) {
			gioiTinh = "Nữ";
		}
//		listKH=khdao.searchKH(tenKh, sdt, diaChi, gioiTinh);
//		khUI.khachHangs=listKH;
		
		//tableModel.addRow(new Object[] { i + 1, m.getMaMon(), m.getTenMon()});
		khUI=new KhachHangUI(tenKh, sdt, diaChi, gioiTinh);
		khUI.setVisible(true);
	}
	
>>>>>>> Stashed changes
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj.equals(btnTimKiem)) {
			setVisible(false);
			TimKiemKH();
			kt=1;
			
		}
		
	}
}
