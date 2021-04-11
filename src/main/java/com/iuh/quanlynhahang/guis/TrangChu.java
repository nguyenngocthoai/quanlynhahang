package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
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
import javax.swing.JTabbedPane;

public class TrangChu extends JFrame implements ActionListener,MenuListener{

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
	private JMenu mnTaiKhoan, mnQuanLy, mnThongKe, mnHoaDon, mnBaoCao, mnThongKeDoUong,
			mnThongKeKhachHang;
	private JMenuItem mniThongTinTaiKhoan, mniDangXuat, mniQuanLyKhachHang, mniQuanLyNhanVien, mniQuanLyTaiKhoan,
			mniQuanLyBan, mniQuanLySanh, mniQuanLyMonAn;
	private JMenuItem mniDoUongBanChay, mniDenNhieuNhat, mniSoBillCaoNhat, mniThongKeDoanhThu, mnBaoCaoDoUong,
			mniDoUongBanChay_1, mniDoUongBanIt_1, mniBaoCaoDoanhThu, mniBaoCaoKhachHang, mniDenNhieuNhat_1,
			mniSoBillCaoNhat_1,mniDoUongBanIt;
	private JMenu mnDatBanTiec;
	private JTabbedPane tabbedPane;

	public TrangChu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 1100, 650);
		setSize(1100, 650);
		setLocationRelativeTo(null);

		menuBar = new JMenuBar();

		mnTaiKhoan = new JMenu("Tài Khoản");
		menuBar.add(mnTaiKhoan);

		mniThongTinTaiKhoan = new JMenuItem("Thông Tin Tài Khoản");
		mnTaiKhoan.add(mniThongTinTaiKhoan);

		mniDangXuat = new JMenuItem("Đăng Xuất");
		mnTaiKhoan.add(mniDangXuat);

		mnQuanLy = new JMenu("Danh Mục");
		menuBar.add(mnQuanLy);

		mniQuanLyKhachHang = new JMenuItem("Quản Lý Khách Hàng");
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
		

		mnHoaDon = new JMenu("Hóa Đơn");
		menuBar.add(mnHoaDon);
		
		mnDatBanTiec = new JMenu("Đặt Bàn Tiệc");
		mnDatBanTiec.addActionListener(this);
		mnDatBanTiec.addMenuListener(this);
		menuBar.add(mnDatBanTiec);
				
		mnThongKe = new JMenu("Thống Kê");
		menuBar.add(mnThongKe);
						
		mnThongKeDoUong = new JMenu("Thống Kê Đồ Uống");
		mnThongKe.add(mnThongKeDoUong);
								
		mniDoUongBanChay = new JMenuItem("Bán Chạy Nhất");
		mnThongKeDoUong.add(mniDoUongBanChay);
										
		 mniDoUongBanIt = new JMenuItem("Bán Ít Nhất");
		mnThongKeDoUong.add(mniDoUongBanIt);
												
		JMenu mnThongKeKhachHang_1 = new JMenu("Thống Kê Khách Hàng");
		mnThongKe.add(mnThongKeKhachHang_1);
														
		mniDenNhieuNhat = new JMenuItem("Đến Nhiều Nhất");
		mnThongKeKhachHang_1.add(mniDenNhieuNhat);
																
		mniSoBillCaoNhat = new JMenuItem("Có Số Bill Cao Nhất");
		mnThongKeKhachHang_1.add(mniSoBillCaoNhat);
																		
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
																		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
					.addComponent(menuBar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(tabbedPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1086, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(60)
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE))
				.addComponent(menuBar, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
		);
		getContentPane().setLayout(groupLayout);
		
		mniQuanLyNhanVien.addActionListener(this);
		mniQuanLyKhachHang.addActionListener(this);
		mniThongTinTaiKhoan.addActionListener(this);
		mniQuanLyTaiKhoan.addActionListener(this);
		mniDoUongBanChay.addActionListener(this);
		mniDoUongBanIt.addActionListener(this);
		mniQuanLyBan.addActionListener(this);
		mniQuanLySanh.addActionListener(this);
		mnHoaDon.addMenuListener(this);
		mniThongKeDoanhThu.addActionListener(this);
	}

	private NhanVien nvUI=new NhanVien();
	private ThongTinCaNhan ttUI=new ThongTinCaNhan();
	private TaiKhoan tkUI=new TaiKhoan();
	private KhachHang khUI=new KhachHang();
	private GDQuanLyBan ban=new GDQuanLyBan();
	private Sanh sanh=new Sanh();
	private ThongKeDoanhThu tkDoanhThu=new ThongKeDoanhThu();
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o.equals(mnDatBanTiec)) {
			System.out.println("Click menu DAT BAN");
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Đặt Bàn Tiệc", null, tabbedPane.add(datBanTiec.contentPane), "HIHi");
			
		}else if(o.equals(mniQuanLyNhanVien)) {
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Nhân Viên", null, tabbedPane.add(nvUI.contentPane), "HIHi");
			
		}else if(o.equals(mniThongTinTaiKhoan)) {
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Thông Tin Cá Nhân", null, tabbedPane.add(ttUI.contentPane), "HIHi");
			
		}else if(o.equals(mniQuanLyTaiKhoan)) {
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Tài Khoản", null, tabbedPane.add(tkUI.contentPane), "HIHi");
			
		}else if(o.equals(mniQuanLyKhachHang)) {
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Khách Hàng", null, tabbedPane.add(khUI.contentPane), "HIHi");
			
		}else if(o.equals(mniDoUongBanChay)) {
			String title ="Bán Chạy Nhất";
			ThongKeDoUong tkDoUong=new ThongKeDoUong(title);
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Thống Kê Đồ Uống", null, tabbedPane.add(tkDoUong.contentPane), "HIHi");
		}else if(o.equals(mniDoUongBanIt)) {
			String title ="Bán Ít Nhất";
			ThongKeDoUong tkDoUong=new ThongKeDoUong(title);
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Thống Kê Đồ Uống", null, tabbedPane.add(tkDoUong.contentPane), "HIHi");
		}else if(o.equals(mniQuanLyBan)) {
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Bàn", null, tabbedPane.add(ban.contentPane), "HIHi");
		}else if(o.equals(mniQuanLySanh)) {
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Bàn", null, tabbedPane.add(sanh.contentPane), "HIHi");
		}else if(o.equals(mniThongKeDoanhThu)) {
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Thống Kê Doanh Thu", null, tabbedPane.add(tkDoanhThu.contentPane), "HIHi");
		}
	}
	
	private DatBanTiec datBanTiec=new DatBanTiec();
	private HoaDon hoaDon=new HoaDon();
	@Override
	public void menuSelected(MenuEvent e) {
		
		Object o=e.getSource();
		
		if(o.equals(mnDatBanTiec)) {
			System.out.println("Click menu DAT BAN");
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Đặt Bàn Tiệc", null, tabbedPane.add(datBanTiec.contentPane), "HIHi");
		}else if(o.equals(mnThongKe)){
			
		}else if(o.equals(mnHoaDon)) {
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Hóa Đơn", null, tabbedPane.add(hoaDon.contentPane), "HIHi");
		}
		
		
	}

	@Override
	public void menuDeselected(MenuEvent e) {
		
		
	}

	@Override
	public void menuCanceled(MenuEvent e) {
		// TODO Auto-generated method stub
		
	}
}
