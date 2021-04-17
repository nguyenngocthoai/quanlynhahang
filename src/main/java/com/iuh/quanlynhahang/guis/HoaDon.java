package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Month;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;

public class HoaDon extends JFrame {

	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HoaDon frame = new HoaDon();
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
	private JTable table;
	private DefaultTableModel tableModel;
	private JScrollPane scrollPane;
	private JLabel lblDanhSchKhch;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblThongTinHoaDon;
	private JLabel lblMKhchHng;
	private JLabel lblTnKhchHng;
	private JLabel lblMKhchHng_2;
	private JLabel lblMKhchHng_4;
	private JLabel lblMKhchHng_5;
	private JTextField textField;
	private JTextField textField_1;
	private JDatePanelImpl datePanelImpl,datePanelImpl2;
	private JDatePickerImpl datePickerImpl,datePickerImpl2;
	public HoaDon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 1100, 650);
		setSize(1100, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		JLabel lblKhchHng = new JLabel("Hóa Đơn");
		lblKhchHng.setForeground(Color.RED);
		lblKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		
		
		String[] header = "Mã Hóa Đơn; Tên Khách Hàng; Nhân Viết Xuất Hóa Đơn;Ngày Xuất Hóa Đơn;".split(";");
		tableModel = new DefaultTableModel(header, 0);
		 scrollPane = new JScrollPane(table = new JTable(tableModel), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		lblDanhSchKhch = new JLabel("Danh Sách Hóa Đơn :");
		lblDanhSchKhch.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "T\u00ECm Ki\u1EBFm Kh\u00E1ch H\u00E0ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JLabel lblNhpSin = new JLabel("Chọn Ngày Xuất Hóa Đơn:");
		lblNhpSin.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		LocalDate date=LocalDate.now();
		int year=date.getYear();
		Month month= date.getMonth();
		int m=month.getValue();
		int day=date.getDayOfMonth();
		UtilDateModel model=new UtilDateModel();
		model.setDate(year, m, day);
		model.setSelected(true);
		
		datePanelImpl=new JDatePanelImpl(model);
		
		datePanelImpl2=new JDatePanelImpl(model);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		
		lblThongTinHoaDon = new JLabel("Thông Tin Hóa Đơn");
		lblThongTinHoaDon.setForeground(new Color(0, 0, 0));
		lblThongTinHoaDon.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		lblMKhchHng = new JLabel("Mã Hóa Đơn : 1");
		lblMKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblTnKhchHng = new JLabel("Tên Khách Hàng :");
		lblTnKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblMKhchHng_2 = new JLabel("Tên Nhân Viên :");
		lblMKhchHng_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblMKhchHng_4 = new JLabel("Ngày Xuất Hóa Đơn :");
		lblMKhchHng_4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblMKhchHng_5 = new JLabel("Tình Trạng :");
		lblMKhchHng_5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Thao T\u00E1c", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnXoaRong = new JButton("Xóa Rỗng");
		btnXoaRong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXoaRong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JButton btnThem = new JButton("Thêm");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThem.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JButton btnCapNhat = new JButton("Cập Nhật");
		btnCapNhat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCapNhat.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnXoaRong, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
					.addGap(38)
					.addComponent(btnThem, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
					.addGap(39)
					.addComponent(btnCapNhat, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_2.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnXoaRong)
						.addComponent(btnThem)
						.addComponent(btnCapNhat))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		datePickerImpl=new JDatePickerImpl(datePanelImpl);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNhpSin)
					.addGap(10)
					.addComponent(datePickerImpl, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
					.addGap(159)
					.addComponent(btnTimKiem, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(15)
					.addComponent(lblNhpSin, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(15)
					.addComponent(datePickerImpl, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(btnTimKiem))
		);
		panel.setLayout(gl_panel);
		datePickerImpl2=new JDatePickerImpl(datePanelImpl2);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(501)
					.addComponent(lblKhchHng, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(lblDanhSchKhch, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(2)))
					.addGap(8)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE))
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(5))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblKhchHng)
					.addGap(32)
					.addComponent(lblDanhSchKhch)
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(57)))
					.addGap(10))
		);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(119)
					.addComponent(lblThongTinHoaDon, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(9)
					.addComponent(lblMKhchHng, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
					.addGap(123)
					.addComponent(lblMKhchHng_5, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(9)
					.addComponent(lblTnKhchHng, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
					.addGap(21))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(9)
					.addComponent(lblMKhchHng_2, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
					.addGap(21))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addComponent(lblMKhchHng_4, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(datePickerImpl2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(64))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(9)
					.addComponent(lblThongTinHoaDon)
					.addGap(33)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMKhchHng, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMKhchHng_5, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTnKhchHng, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(24)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMKhchHng_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(27)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMKhchHng_4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(datePickerImpl2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
		);
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);
	}
}
