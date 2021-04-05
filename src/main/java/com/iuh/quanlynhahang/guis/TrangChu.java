package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class TrangChu extends JFrame implements ActionListener{

	private static TrangChu frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new TrangChu();
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
	private JMenuBar menuBar;
	private JMenu mnTaiKhoan, mnQuanLy, mnThongKe, mnTimKiem, mnBaoCao, mnThongKeDoUong,
			mnThongKeKhachHang;
	private JMenuItem mniThongTinTaiKhoan, mniDangXuat, mniQuanLyKhachHang, mniQuanLyNhanVien, mniQuanLyTaiKhoan,
			mniQuanLyBan, mniQuanLySanh, mniQuanLyMonAn;
	private JMenuItem mniTimKiemKhachHang, mniTimKiemNhanVien, mniTimKiemMonAn, mniTimKiemTaiKhoan, mniTimKiemBan,
			mniTimKiemHoaDon;
	private JMenuItem mniDoUongBanChay, mniDenNhieuNhat, mniSoBillCaoNhat, mniThongKeDoanhThu, mnBaoCaoDoUong,
			mniDoUongBanChay_1, mniDoUongBanIt_1, mniBaoCaoDoanhThu, mniBaoCaoKhachHang, mniDenNhieuNhat_1,
			mniSoBillCaoNhat_1;
	private JMenu mnDatBanTiec;
	private JMenuItem mniDatBan;

	public TrangChu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 1100, 650);
		setSize(1100, 650);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1162, 34);
		getContentPane().add(menuBar);

		mnTaiKhoan = new JMenu("Tài Khoản");
		menuBar.add(mnTaiKhoan);

		mniThongTinTaiKhoan = new JMenuItem("Thông Tin Tài Khoản");
		mnTaiKhoan.add(mniThongTinTaiKhoan);

		mniDangXuat = new JMenuItem("Đăng Xuất");
		mnTaiKhoan.add(mniDangXuat);

		mnQuanLy = new JMenu("Quản Lý");
		menuBar.add(mnQuanLy);

		mniQuanLyKhachHang = new JMenuItem("Quản Lý Tài Khoản");
		mnQuanLy.add(mniQuanLyKhachHang);

		mniQuanLyNhanVien = new JMenuItem("Quản Lý Nhân Viên");
		mnQuanLy.add(mniQuanLyNhanVien);
		mniQuanLyNhanVien.addActionListener(this);
		
		mniQuanLyBan = new JMenuItem("Quản Lý Bàn");
		mnQuanLy.add(mniQuanLyBan);

		mniQuanLySanh = new JMenuItem("Quản Lý Sảnh");
		mnQuanLy.add(mniQuanLySanh);

		mniQuanLyMonAn = new JMenuItem("Quản Lý Món Ăn");
		mnQuanLy.add(mniQuanLyMonAn);

		mniQuanLyTaiKhoan = new JMenuItem("Quản Lý Tài Khoản");
		mnQuanLy.add(mniQuanLyTaiKhoan);
		mniQuanLyTaiKhoan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TaiKhoan tk= new TaiKhoan();
				tk.setVisible(true);
			}
		});

		mnTimKiem = new JMenu("Tìm Kiếm");
		menuBar.add(mnTimKiem);

		mniTimKiemKhachHang = new JMenuItem("Tìm Kiếm Khách Hàng");
		mnTimKiem.add(mniTimKiemKhachHang);

		mniTimKiemNhanVien = new JMenuItem("Tìm Kiếm Nhân Viên");
		mnTimKiem.add(mniTimKiemNhanVien);

		mniTimKiemMonAn = new JMenuItem("Tìm Kiếm Món Ăn");
		mnTimKiem.add(mniTimKiemMonAn);

		mniTimKiemBan = new JMenuItem("Tìm Kiếm Bàn");
		mnTimKiem.add(mniTimKiemBan);

		mniTimKiemHoaDon = new JMenuItem("Tìm Kiếm Hóa Đơn");
		mnTimKiem.add(mniTimKiemHoaDon);

		mniTimKiemTaiKhoan = new JMenuItem("Tìm Kiếm Tài Khoản");
		mnTimKiem.add(mniTimKiemTaiKhoan);
		mniTimKiemTaiKhoan.addActionListener(this);

		mnThongKe = new JMenu("Thống Kê");
		menuBar.add(mnThongKe);

		mnThongKeDoUong = new JMenu("Thống Kê Đồ Uống");
		mnThongKe.add(mnThongKeDoUong);

		mniDoUongBanChay = new JMenuItem("Bán Chạy Nhất");
		mnThongKeDoUong.add(mniDoUongBanChay);

		JMenuItem mniDoUongBanIt = new JMenuItem("Bán Ít Nhất");
		mnThongKeDoUong.add(mniDoUongBanIt);

		JMenu mnThongKeKhachHang = new JMenu("Thống Kê Khách Hàng");
		mnThongKe.add(mnThongKeKhachHang);

		mniDenNhieuNhat = new JMenuItem("Đến Nhiều Nhất");
		mnThongKeKhachHang.add(mniDenNhieuNhat);

		mniSoBillCaoNhat = new JMenuItem("Có Số Bill Cao Nhất");
		mnThongKeKhachHang.add(mniSoBillCaoNhat);

		mniThongKeDoanhThu = new JMenuItem("Thống Kê Doanh Thu");
		mnThongKe.add(mniThongKeDoanhThu);

		mnBaoCao = new JMenu("Báo Cáo");
		menuBar.add(mnBaoCao);

		mnBaoCaoDoUong = new JMenu("Báo Cáo Đồ Uống");
		mnBaoCao.add(mnBaoCaoDoUong);

		mniDoUongBanChay_1 = new JMenuItem("Bán Chạy Nhất");
		mnBaoCaoDoUong.add(mniDoUongBanChay_1);

		mniDoUongBanIt_1 = new JMenuItem("Bán Ít Nhất");
		mnBaoCaoDoUong.add(mniDoUongBanIt_1);

		mniBaoCaoDoanhThu = new JMenuItem("Báo Cáo Doanh Thu");
		mnBaoCao.add(mniBaoCaoDoanhThu);

		mniBaoCaoKhachHang = new JMenu("Báo Cáo Khách Hàng");
		mnBaoCao.add(mniBaoCaoKhachHang);

		mniDenNhieuNhat_1 = new JMenuItem("Đến Nhiều Nhất");
		mniBaoCaoKhachHang.add(mniDenNhieuNhat_1);

		mniSoBillCaoNhat_1 = new JMenuItem("Có Số Bill Cao Nhất");
		mniBaoCaoKhachHang.add(mniSoBillCaoNhat_1);
		
		mnDatBanTiec = new JMenu("Đặt Bàn Tiệc");
		menuBar.add(mnDatBanTiec);
		
		mniDatBan = new JMenuItem("Đặt Bàn");
		mnDatBanTiec.add(mniDatBan);
		mniDatBan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				DatBanTiec frmdatBanTiec=new DatBanTiec();
				frmdatBanTiec.setVisible(true);
				
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o.equals(mnDatBanTiec)) {
			System.out.println("ADAD");
			DatBanTiec frmdatBanTiec=new DatBanTiec();
			frmdatBanTiec.setVisible(true);
		}else if(o.equals(mniTimKiemTaiKhoan)) {
			System.out.println("ADADA");
		}else if(o.equals(mniQuanLyNhanVien)) {
			NhanVien frmNV=new NhanVien();
			frmNV.setVisible(true);
			System.out.println("ADADA");
		}
		
	}
}
