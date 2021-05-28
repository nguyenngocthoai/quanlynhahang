package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Properties;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.iuh.quanlynhahang.daoimpls.HoaDonDAOImpl;
import com.iuh.quanlynhahang.daoimpls.KhachHangDAOImpl;
import com.iuh.quanlynhahang.daoimpls.NhanVienDAOImpl;
import com.iuh.quanlynhahang.entities.NhanVien;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
import java.awt.SystemColor;
import com.toedter.calendar.JDateChooser;

public class TimKiemHoaDonUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtKH;
	private JTextField textField;
	private JTextField textField_1;
	private Properties p;
	private UtilDateModel model1, model2;
	private JDatePanelImpl datePanel1, datePanel2;
	private JComboBox cboNV;
	private JButton btnTimKiem, btnTroVe;
	private NhanVienDAOImpl nhanVienDAOImpl;
	private JDateChooser dateFrom, dateTo;
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	public TimKiemHoaDonUI() {

		setTitle("Tìm Kiếm Hóa Đơn");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 414, 432);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTmKimHa = new JLabel("Tìm Kiếm Hóa Đơn");
		lblTmKimHa.setBounds(99, 11, 200, 39);
		lblTmKimHa.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		contentPane.add(lblTmKimHa);

		JLabel lblTnKhchHng = new JLabel("Tên Khách Hàng:");
		lblTnKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTnKhchHng.setBounds(10, 66, 124, 28);
		contentPane.add(lblTnKhchHng);

		JLabel lblTnNhnVin = new JLabel("Tên Nhân Viên:");
		lblTnNhnVin.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTnNhnVin.setBounds(10, 111, 100, 28);
		contentPane.add(lblTnNhnVin);

		JLabel lblnNgy = new JLabel("Đến Ngày:");
		lblnNgy.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblnNgy.setBounds(65, 249, 69, 31);
		contentPane.add(lblnNgy);

		JLabel lblTNgy = new JLabel("Từ Ngày:");
		lblTNgy.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTNgy.setBounds(65, 199, 69, 31);
		contentPane.add(lblTNgy);

		btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnTimKiem.setBounds(91, 339, 108, 28);
		contentPane.add(btnTimKiem);

		btnTroVe = new JButton("Trở Về");
		btnTroVe.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnTroVe.setBounds(236, 339, 89, 28);
		contentPane.add(btnTroVe);

		JLabel lblNgyLpHa = new JLabel("Ngày Lập Hóa Đơn:");
		lblNgyLpHa.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNgyLpHa.setBounds(10, 161, 134, 28);
		contentPane.add(lblNgyLpHa);

		txtKH = new JTextField();
		txtKH.setBounds(135, 69, 240, 28);
		contentPane.add(txtKH);
		txtKH.setColumns(10);
		cboNV = new JComboBox();
		cboNV.setBounds(135, 113, 237, 28);
		contentPane.add(cboNV);

		ButtonGroup group = new ButtonGroup();

		p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		model1 = new UtilDateModel();
		datePanel1 = new JDatePanelImpl(model1);

		model2 = new UtilDateModel();
		datePanel2 = new JDatePanelImpl(model2);

		btnTimKiem.addActionListener(this);
		btnTroVe.addActionListener(this);

		nhanVienDAOImpl = new NhanVienDAOImpl();
		List<com.iuh.quanlynhahang.entities.NhanVien> list = nhanVienDAOImpl.getAllNV();
		cboNV.addItem("---------------------------------------------------");

		dateFrom = new JDateChooser();
		dateFrom.getCalendarButton().setFont(new Font("Times New Roman", Font.PLAIN, 16));
		dateFrom.setBounds(154, 200, 171, 31);
		dateFrom.setDate(Date.valueOf(LocalDate.now()));
		contentPane.add(dateFrom);

		dateTo = new JDateChooser();
		dateTo.getCalendarButton().setFont(new Font("Times New Roman", Font.PLAIN, 16));
		dateTo.setBounds(153, 249, 171, 31);
		dateTo.setDate(Date.valueOf(LocalDate.now()));
		contentPane.add(dateTo);
		for (NhanVien Nhanvien : list) {
			String[] rowData = { Nhanvien.getMaNhanVien(), Nhanvien.getHoTenNhanVien(),
					Nhanvien.getNgaySinh().toString(), Nhanvien.getSoDienThoai(), Nhanvien.getEmail(),
					Nhanvien.getDiaChi() };
			cboNV.addItem(Nhanvien.getHoTenNhanVien());
		}
		model2.setValue(Date.valueOf(LocalDate.now()));
		model1.setValue(Date.valueOf(LocalDate.now()));
	}
	
	private KhachHangDAOImpl khDAO=new KhachHangDAOImpl();
	private NhanVienDAOImpl nvDAO=new NhanVienDAOImpl();
	private HoaDonDAOImpl hdDAO=new HoaDonDAOImpl();
	private HoaDonUI hdUI;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if (o.equals(btnTroVe)) {
			setVisible(false);
		} else if (o.equals(btnTimKiem)) {
			String tenKH = txtKH.getText();
			String tenNV = (String) cboNV.getSelectedItem();
			if (tenNV.equals("---------------------------------------------------"))
				tenNV = "";
			String ngayBD = "";
			String ngayEnd = "";
			ngayBD = dateFormat.format(dateFrom.getDate());
			ngayEnd = dateFormat.format(dateTo.getDate());

			 hdUI = new HoaDonUI(tenKH, tenNV, Date.valueOf(ngayBD).toLocalDate() ,Date.valueOf(ngayEnd).toLocalDate());
			 hdUI.setVisible(true);
			setVisible(false);

		}
	}
}
