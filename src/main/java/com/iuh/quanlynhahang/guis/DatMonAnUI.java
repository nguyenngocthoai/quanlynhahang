package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.iuh.quanlynhahang.daoimpls.KhachHangDAOImpl;
import com.iuh.quanlynhahang.entities.KhachHang;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.SystemColor;

public class DatMonAnUI extends JFrame implements ActionListener,MouseListener{

	private JPanel contentPane;
	//private static String maKH="";
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					DatMonAnUI frame = new DatMonAnUI(maKH);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	private static KhachHangDAOImpl khachHangDAO = new KhachHangDAOImpl();
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private DefaultTableModel tableModel;
	private JTable tableGioHang;
	private JTable tableMonAn;
	private JPanel panel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtTenKH;
	private JButton btnDatMon ;
	
	public DatMonAnUI(String maKH) {
		System.out.println("DAT MON AN UI CHAY :" +maKH);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lbltBnTic = new JLabel("ĐẶT MÓN ĂN");
		lbltBnTic.setBounds(407, 15, 178, 30);
		lbltBnTic.setForeground(Color.RED);
		lbltBnTic.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		String[] header = "STT;Mã Món Ăn;Tên Món Ăn;Số Lượng;Giá/Món;Số Kg;Giá/Kg".split(";");
		tableModel = new DefaultTableModel(header, 0);
		scrollPane_1 = new JScrollPane(tableMonAn = new JTable(tableModel),
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(20, 88, 485, 277);
		tableMonAn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		scrollPane_1.setViewportView(tableMonAn);
		tableMonAn.setBackground(Color.WHITE);
		
		panel = new JPanel();
		panel.setBounds(606, 83, 454, 308);
		panel.setBorder(new TitledBorder(null, "Gi\u1ECF H\u00E0ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		String[] header2 = "STT;Tên Món Ăn;Số Lượng;".split(";");
		tableModel = new DefaultTableModel(header2, 0);
		scrollPane = new JScrollPane(tableGioHang = new JTable(tableModel),
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		tableGioHang.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		scrollPane.setViewportView(tableGioHang);
		tableGioHang.setBackground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 401, 485, 103);
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "T\u00ECm Ki\u1EBFm M\u00F3n \u0102n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblChnSnh = new JLabel("Loại Món Ăn");
		lblChnSnh.setBounds(10, 24, 93, 30);
		lblChnSnh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JComboBox cbxSanh = new JComboBox();
		cbxSanh.setBounds(113, 26, 195, 28);
		cbxSanh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JButton btnTmKim = new JButton("Tìm Kiếm");
		btnTmKim.setBounds(334, 24, 129, 30);
		btnTmKim.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JLabel lblGi = new JLabel("Giá");
		lblGi.setBounds(72, 64, 31, 30);
		lblGi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		textField = new JTextField();
		textField.setBounds(113, 64, 82, 28);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(226, 64, 82, 28);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("_");
		label.setBounds(205, 63, 12, 20);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JLabel lblVnd = new JLabel("VND");
		lblVnd.setBounds(334, 64, 50, 30);
		lblVnd.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JButton btnThemGioHang = new JButton("Thêm Món");
		btnThemGioHang.setBounds(515, 208, 85, 49);
		btnThemGioHang.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		JButton btnXoaGioHang = new JButton("Xóa");
		btnXoaGioHang.setBounds(515, 293, 85, 49);
		btnXoaGioHang.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(606, 401, 454, 103);
		panel_1_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Th\u00F4ng Tin Kh\u00E1ch H\u00E0ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblChnSnh_1 = new JLabel("Tên Khách Hàng");
		lblChnSnh_1.setBounds(10, 24, 113, 30);
		lblChnSnh_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		 btnDatMon = new JButton("Đặt Món");
		 btnDatMon.setBounds(133, 65, 135, 30);
		btnDatMon.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JButton btnHuy = new JButton("Hủy");
		btnHuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHuy.setBounds(278, 65, 98, 30);
		btnHuy.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		KhachHang kh= khachHangDAO.getKHByID(maKH);

		txtTenKH = new JTextField();
		txtTenKH.setBounds(133, 27, 247, 28);
		txtTenKH.setEditable(false);
		txtTenKH.setBackground(SystemColor.control);
		txtTenKH.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTenKH.setColumns(10);
		txtTenKH.setText(kh.getTenKhachHang());
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(14)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
					.addGap(17))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(25)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(43, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(null);
		contentPane.add(lbltBnTic);
		contentPane.add(scrollPane_1);
		contentPane.add(btnThemGioHang);
		contentPane.add(btnXoaGioHang);
		contentPane.add(panel);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.add(lblChnSnh);
		panel_1.add(cbxSanh);
		panel_1.add(btnTmKim);
		panel_1.add(lblGi);
		panel_1.add(textField);
		panel_1.add(label);
		panel_1.add(textField_1);
		panel_1.add(lblVnd);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		panel_1_1.add(lblChnSnh_1);
		panel_1_1.add(txtTenKH);
		panel_1_1.add(btnDatMon);
		panel_1_1.add(btnHuy);
		
		JButton btnThemKg = new JButton("Thêm Kg");
		btnThemKg.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnThemKg.setBounds(515, 123, 85, 49);
		contentPane.add(btnThemKg);
	
		btnDatMon.addActionListener(this);
	}
	

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj.equals(btnDatMon)) {
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
		
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
}
