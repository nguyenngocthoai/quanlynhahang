package com.iuh.quanlynhahang.guis;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ManHinhChinh extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
//	private JPanel panel;
//	private JPanel panel_1;
//	private JTabbedPane tabbedPane;
//	private JButton btnDatBanTiec;
//	private JButton btnNhanVien;
//	private JButton btnKhachHang;
//	private JButton btnTaiKhoan;
//	private JButton btnThongTinCaNhan;
//	private JButton btnDangXuat;
//	private JButton btnTrangChu;
//	private static DatBanTiec datBanTiec = new DatBanTiec();
//	private static TrangChu trangChu = new TrangChu();
//	private static NhanVien nhanVien = new NhanVien();
//	private static KhachHangUI khachHang = new KhachHangUI();
//	private static TaiKhoan taiKhoan = new TaiKhoan();
//	private static ThongTinCaNhan thongTinCaNhan = new ThongTinCaNhan();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManHinhChinh frame = new ManHinhChinh();
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
	public ManHinhChinh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
		setTitle("Phần mềm quản lý nhà hàng");

//		panel = new JPanel();
//		panel.setBorder(new TitledBorder(
//				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
//				"Danh m\u1EE5c", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.desktop));
//
//		panel_1 = new JPanel();
//		panel_1.setBorder(new TitledBorder(
//				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
//				"Ch\u1EE9c n\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.desktop));
//		GroupLayout gl_contentPane = new GroupLayout(contentPane);
//		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
//				.addGroup(gl_contentPane.createSequentialGroup()
//						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
//						.addPreferredGap(ComponentPlacement.RELATED)
//						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 1109, Short.MAX_VALUE)));
//		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
//				.createSequentialGroup()
//				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
//						.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//				.addGap(0)));
//
//		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
//		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
//		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING).addComponent(tabbedPane,
//				Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1097, Short.MAX_VALUE));
//		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING).addComponent(tabbedPane,
//				GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE));
//		panel_1.setLayout(gl_panel_1);
//
//		btnDatBanTiec = new JButton("Đặt Bàn Tiệc");
//		btnDatBanTiec.setBackground(SystemColor.activeCaption);
//		btnDatBanTiec.setFont(new Font("Times New Roman", Font.PLAIN, 18));
//
//		btnNhanVien = new JButton("Nhân Viên");
//		btnNhanVien.setBackground(SystemColor.activeCaption);
//		btnNhanVien.setFont(new Font("Times New Roman", Font.PLAIN, 18));
//
//		btnKhachHang = new JButton("Khách Hàng");
//		btnKhachHang.setBackground(SystemColor.activeCaption);
//		btnKhachHang.setFont(new Font("Times New Roman", Font.PLAIN, 18));
//
//		btnTaiKhoan = new JButton("Tài Khoản");
//		btnTaiKhoan.setBackground(SystemColor.activeCaption);
//		btnTaiKhoan.setFont(new Font("Times New Roman", Font.PLAIN, 18));
//
//		btnThongTinCaNhan = new JButton("Thông Tin Cá Nhân");
//		btnThongTinCaNhan.setFont(new Font("Times New Roman", Font.PLAIN, 18));
//		btnThongTinCaNhan.setBackground(SystemColor.activeCaption);
//
//		btnDangXuat = new JButton("Đăng xuất");
//		btnDangXuat.setForeground(Color.WHITE);
//		btnDangXuat.setFont(new Font("Times New Roman", Font.PLAIN, 18));
//		btnDangXuat.setBackground(Color.RED);
//
//		btnTrangChu = new JButton("Trang Chủ");
//		btnTrangChu.setFont(new Font("Times New Roman", Font.PLAIN, 18));
//		btnTrangChu.setBackground(SystemColor.activeCaption);
//		GroupLayout gl_panel = new GroupLayout(panel);
//		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
//				.addGroup(gl_panel.createSequentialGroup().addGap(45)
//						.addComponent(btnDangXuat, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE).addGap(57))
//				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
//						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
//								.addComponent(btnDatBanTiec, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
//								.addComponent(btnNhanVien, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
//								.addComponent(btnKhachHang, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
//								.addComponent(btnTaiKhoan, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
//								.addComponent(btnThongTinCaNhan, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
//						.addContainerGap())
//				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup().addContainerGap()
//						.addComponent(btnTrangChu, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE).addContainerGap()));
//		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, gl_panel
//				.createSequentialGroup().addGap(21)
//				.addComponent(btnTrangChu, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE).addGap(18)
//				.addComponent(btnDatBanTiec, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE).addGap(18)
//				.addComponent(btnNhanVien, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE).addGap(18)
//				.addComponent(btnKhachHang, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE).addGap(18)
//				.addComponent(btnTaiKhoan, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE).addGap(18)
//				.addComponent(btnThongTinCaNhan, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
//				.addPreferredGap(ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
//				.addComponent(btnDangXuat, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
//				.addContainerGap()));
//		panel.setLayout(gl_panel);
//		contentPane.setLayout(gl_contentPane);
//		setLocationRelativeTo(null);
//
//		btnDangXuat.addActionListener(this);
//		btnDatBanTiec.addActionListener(this);
//		btnKhachHang.addActionListener(this);
//		btnNhanVien.addActionListener(this);
//		btnTaiKhoan.addActionListener(this);
//		btnThongTinCaNhan.addActionListener(this);
//		btnTrangChu.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		Object obj = e.getSource();
//		if (obj.equals(btnDatBanTiec)) {
////			tabbedPane.
//			tabbedPane.remove(tabbedPane.getSelectedComponent());
//			tabbedPane.add(datBanTiec.contentPane);
//		} else if (obj.equals(btnTrangChu)) {
//			tabbedPane.remove(tabbedPane.getSelectedComponent());
//			tabbedPane.add(trangChu.getContentPane());
//		} else if (obj.equals(btnNhanVien)) {
//			tabbedPane.remove(tabbedPane.getSelectedComponent());
//			tabbedPane.add(nhanVien.contentPane);
//		} else if (obj.equals(btnKhachHang)) {
//			tabbedPane.remove(tabbedPane.getSelectedComponent());
//			tabbedPane.add(khachHang.contentPane);
//		} else if (obj.equals(btnThongTinCaNhan)) {
//			tabbedPane.remove(tabbedPane.getSelectedComponent());
//			tabbedPane.add(thongTinCaNhan.contentPane);
//		} else if (obj.equals(btnTaiKhoan)) {
//			tabbedPane.remove(tabbedPane.getSelectedComponent());
//			tabbedPane.add(taiKhoan.contentPane);
//		} else if (obj.equals(btnDangXuat)) {
//
//		}
//
	}
}
