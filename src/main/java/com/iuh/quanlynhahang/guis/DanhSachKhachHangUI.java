package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.iuh.quanlynhahang.daoimpls.KhachHangDAOImpl;
import com.iuh.quanlynhahang.entities.KhachHang;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Component;
import javax.swing.ScrollPaneConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.SystemColor;

public class DanhSachKhachHangUI extends JFrame implements ActionListener,MouseListener {

	public JPanel contentPane;
	private JTable table;
	private DefaultTableModel tableModel;
	private List<KhachHangUI> dskh;
	private JTextField txtsdt;
	private JButton btntimKiem, btnthem;
	public JButton btnDatBanTiec;
	public JButton btnDatMon;
	private JLabel lblsdt;
	private JButton btnTroVe;
	private String maNV;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DanhSachKhachHangUI frame = new DanhSachKhachHangUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public DanhSachKhachHangUI() {
		setTitle("Giao Diện Khách Hàng");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1100, 575);
		setLocationRelativeTo(null);
		setResizable(false);
		//setVisible(true);
		setEnabled(true);
		taoGiaoDien();
	}

	public void taoGiaoDien() {
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		String[] header = "STT;Mã Khách Hàng; Tên Khách Hàng; Số Điện Thoại ; Giới Tính".split(";");
		tableModel = new DefaultTableModel(header, 0);
		JScrollPane scrollPane = new JScrollPane(table = new JTable(tableModel), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		contentPane.add(scrollPane);
		scrollPane.setBounds(12, 68, 1074, 367);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.control);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Thanh T\u00ECm Ki\u1EBFm ",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel.setBounds(12, 445, 491, 83);
		contentPane.add(panel);
		panel.setLayout(null);

		lblsdt = new JLabel("Số Điện Thoại:");
		lblsdt.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblsdt.setBounds(10, 33, 95, 25);
		panel.add(lblsdt);

		txtsdt = new JTextField();
		txtsdt.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtsdt.setBounds(115, 31, 196, 28);
		panel.add(txtsdt);
		txtsdt.setColumns(10);
		txtsdt.setBackground(Color.WHITE);

		btntimKiem = new JButton("Tìm kiếm");
		btntimKiem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btntimKiem.setBounds(337, 24, 129, 39);
		panel.add(btntimKiem);
		btntimKiem.setBackground(Color.WHITE);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "C\u00E1c Thao T\u00E1c",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_1.setBackground(SystemColor.control);
		panel_1.setBounds(513, 445, 573, 83);
		contentPane.add(panel_1);

		btnthem = new JButton("Thêm Khách Hàng ");
		btnthem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnthem.setBounds(46, 22, 155, 39);
		panel_1.add(btnthem);
		btnthem.setBackground(Color.WHITE);

		btnDatBanTiec = new JButton("Đặt Bàn Tiệc");
		btnDatBanTiec.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDatBanTiec.setBounds(247, 22, 135, 39);
		panel_1.add(btnDatBanTiec);
		btnDatBanTiec.setBackground(Color.GREEN);

		btnTroVe = new JButton("Trở Về");
		btnTroVe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTroVe.setBackground(Color.WHITE);
		btnTroVe.setBounds(427, 22, 129, 39);
		panel_1.add(btnTroVe);
		
		btnDatMon = new JButton("Đặt Món");
		btnDatMon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDatMon.setBackground(Color.WHITE);
		btnDatMon.setBounds(255, 22, 118, 39);
		panel_1.add(btnDatMon);

		JLabel lblDanhSchKhch = new JLabel("Danh Sách Khách Hàng");
		lblDanhSchKhch.setForeground(Color.BLUE);
		lblDanhSchKhch.setFont(new Font("Arial", Font.BOLD, 30));
		lblDanhSchKhch.setBounds(345, 11, 392, 52);
		contentPane.add(lblDanhSchKhch);
		btntimKiem.addActionListener(this);
		btnDatBanTiec.addActionListener(this);
		btnthem.addActionListener(this);
		btnTroVe.addActionListener(this);
		btnDatMon.addActionListener(this);
		
		updateTable();
		table.addMouseListener(this);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	}
	
	private static String maKH="";
	private KhachHangDAOImpl khachHangDAO=new KhachHangDAOImpl();
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj.equals(btnDatBanTiec)) {
			System.out.println("MA KH : "+maKH);
			DatBanTiec datBan=new DatBanTiec(maKH);
			datBan.setVisible(true);
			clickDatBan=1;
			//setEnabled(false);
			//datBanTiec.setVisible(true);
		}else if(obj.equals(btnDatMon)) {
			DatMonAnUI datMonUI=new DatMonAnUI(maKH);
			datMonUI.setVisible(true);
		}else if(obj.equals(btnTroVe)) {
			setVisible(false);
		}
		
	} 
	
	public void updateTable() {
		tableModel.getDataVector().removeAllElements();
		try {
			List<KhachHang> khachHangs = khachHangDAO.getAllKH();
			int i = 0;
			for (KhachHang kh : khachHangs) {
				i++;
				tableModel.addRow(new Object[] { i, kh.getMaKhachHang(), kh.getTenKhachHang(), kh.getSoDienThoai(),
						kh.getGioiTinh(), kh.getDiaChi() });
			}
			table.setModel(tableModel);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int clickDatBan=0;


	@Override
	public void mouseClicked(MouseEvent e) {
		int row = table.getSelectedRow();
		 maKH = tableModel.getValueAt(row, 1).toString();
		System.out.println("MA KH : "+maKH);
		try {
			KhachHang kh = khachHangDAO.getKHByID(maKH);
			
		
			
		} catch (Exception e2) {
			System.out.println("error mouse clicked");
			e2.printStackTrace();
		}
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
