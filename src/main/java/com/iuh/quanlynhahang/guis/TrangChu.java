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
import javax.swing.ImageIcon;

public class TrangChu extends JFrame implements ActionListener, MenuListener {

	private static TrangChu frame;
	private JMenuBar menuBar;
	private JMenu mnHeThong, mnDanhMuc, mnThongKebaoCao, mnTimKiem, mnThongKeDoUong, mnThongKeKhachHang;
	private JMenuItem mniThongTinCaNhan, mniDangXuat, mniKhachHang, mniNhanVien, mniBan, mniSanh, mniMonAn;
	private JMenuItem mniDoUongBanChay, mniDenNhieuNhat, mniSoBillCaoNhat, mniThongKeDoanhThu, mniDoUongBanIt;
	private JMenu mnXuLy;
	private JTabbedPane tabbedPane;
	private JMenuItem mniDoiMatKhau;
	private JMenuItem mniThoat;
	private JMenuItem mniChucVu;
	private JMenuItem mniTimKiemBanTiec;
	private JMenuItem mniTimKiemHoaDon;
	private JMenuItem mniTimKiemKhachHang;
	private JMenuItem mniDatBanTiec;

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

	public TrangChu() {
		setTitle("Quản Lý Nhà Hàng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 1100, 650);
		setSize(1100, 650);
		setLocationRelativeTo(null);

		menuBar = new JMenuBar();

		mnHeThong = new JMenu("Hệ Thống");
		mnHeThong.setIcon(new ImageIcon("images\\system.png"));
		mnHeThong.setFont(new Font("Times New Roman", Font.BOLD, 18));
		menuBar.add(mnHeThong);
		
		mniTaiKhoan = new JMenuItem("Tài Khoản");
		mniTaiKhoan.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnHeThong.add(mniTaiKhoan);

		mniThongTinCaNhan = new JMenuItem("Thông Tin Cá Nhân");
		mniThongTinCaNhan.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnHeThong.add(mniThongTinCaNhan);

		mniDoiMatKhau = new JMenuItem("Đổi Mật Khẩu");
		mniDoiMatKhau.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnHeThong.add(mniDoiMatKhau);

		mniDangXuat = new JMenuItem("Đăng Xuất");
		mniDangXuat.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnHeThong.add(mniDangXuat);

		mniThoat = new JMenuItem("Thoát");
		mniThoat.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnHeThong.add(mniThoat);

		mnDanhMuc = new JMenu("Danh Mục");
		mnDanhMuc.setIcon(new ImageIcon("images\\modules.gif"));
		mnDanhMuc.setFont(new Font("Times New Roman", Font.BOLD, 18));
		menuBar.add(mnDanhMuc);

		mniKhachHang = new JMenuItem("Khách Hàng");
		mniKhachHang.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnDanhMuc.add(mniKhachHang);

		mniNhanVien = new JMenuItem("Nhân Viên");
		mniNhanVien.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnDanhMuc.add(mniNhanVien);
		mniNhanVien.addActionListener(this);

		mniMonAn = new JMenuItem("Món Ăn");
		mniMonAn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnDanhMuc.add(mniMonAn);

		mniBan = new JMenuItem("Bàn");
		mniBan.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnDanhMuc.add(mniBan);

		mniSanh = new JMenuItem("Sảnh");
		mniSanh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnDanhMuc.add(mniSanh);

		mniChucVu = new JMenuItem("Chức Vụ");
		mniChucVu.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnDanhMuc.add(mniChucVu);
		
		mniLoaiMonAn = new JMenuItem("Loại Món Ăn");
		mniLoaiMonAn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnDanhMuc.add(mniLoaiMonAn);

		mnXuLy = new JMenu("Xử Lý");
		mnXuLy.setIcon(new ImageIcon("images\\order.gif"));
		mnXuLy.setFont(new Font("Times New Roman", Font.BOLD, 18));
		mnXuLy.addActionListener(this);
		mnXuLy.addMenuListener(this);
		menuBar.add(mnXuLy);

		mniDatBanTiec = new JMenuItem("Đặt Bàn Tiệc");
		mniDatBanTiec.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnXuLy.add(mniDatBanTiec);
		
		mniMuaVe = new JMenuItem("Mua Về");
		mniMuaVe.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnXuLy.add(mniMuaVe);
		
		mniPhieuDatBan = new JMenuItem("Phiếu Đặt Bàn");
		mniPhieuDatBan.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnXuLy.add(mniPhieuDatBan);

		mnTimKiem = new JMenu("Tìm Kiếm");
		mnTimKiem.setIcon(new ImageIcon("images\\search_menu.png"));
		mnTimKiem.setFont(new Font("Times New Roman", Font.BOLD, 18));
		menuBar.add(mnTimKiem);

		mniTimKiemBanTiec = new JMenuItem("Bàn Tiệc");
		mniTimKiemBanTiec.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnTimKiem.add(mniTimKiemBanTiec);

		mniTimKiemHoaDon = new JMenuItem("Hóa Đơn");
		mniTimKiemHoaDon.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnTimKiem.add(mniTimKiemHoaDon);

		mniTimKiemKhachHang = new JMenuItem("Khách Hàng");
		mniTimKiemKhachHang.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnTimKiem.add(mniTimKiemKhachHang);

		mnThongKebaoCao = new JMenu("Thống Kê / Báo Cáo");
		mnThongKebaoCao.setIcon(new ImageIcon("images\\st_rp.png"));
		mnThongKebaoCao.setFont(new Font("Times New Roman", Font.BOLD, 18));
		menuBar.add(mnThongKebaoCao);

		mnThongKeDoUong = new JMenu("Thống Kê Đồ Uống");
		mnThongKeDoUong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnThongKebaoCao.add(mnThongKeDoUong);

		mniDoUongBanChay = new JMenuItem("Bán Chạy Nhất");
		mniDoUongBanChay.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mnThongKeDoUong.add(mniDoUongBanChay);

		mniDoUongBanIt = new JMenuItem("Bán Ít Nhất");
		mniDoUongBanIt.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mnThongKeDoUong.add(mniDoUongBanIt);

		JMenu mnThongKeKhachHang_1 = new JMenu("Thống Kê Khách Hàng");
		mnThongKeKhachHang_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnThongKebaoCao.add(mnThongKeKhachHang_1);

		mniDenNhieuNhat = new JMenuItem("Đến Nhiều Nhất");
		mniDenNhieuNhat.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mnThongKeKhachHang_1.add(mniDenNhieuNhat);

		mniSoBillCaoNhat = new JMenuItem("Có Số Bill Cao Nhất");
		mniSoBillCaoNhat.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mnThongKeKhachHang_1.add(mniSoBillCaoNhat);

		mniThongKeDoanhThu = new JMenuItem("Thống Kê Doanh Thu");
		mniThongKeDoanhThu.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnThongKebaoCao.add(mniThongKeDoanhThu);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(menuBar, GroupLayout.DEFAULT_SIZE, 1084, Short.MAX_VALUE)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 1084, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(menuBar, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(60)
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

		mniNhanVien.addActionListener(this);
		mniKhachHang.addActionListener(this);
		mniThongTinCaNhan.addActionListener(this);
		mniDoUongBanChay.addActionListener(this);
		mniDoUongBanIt.addActionListener(this);
		mniBan.addActionListener(this);
		mniSanh.addActionListener(this);
		mnTimKiem.addMenuListener(this);
		mniThongKeDoanhThu.addActionListener(this);
		mniDoiMatKhau.addActionListener(this);
		mniDangXuat.addActionListener(this);
		mniThoat.addActionListener(this);
		mniDatBanTiec.addActionListener(this);
		mniTimKiemKhachHang.addActionListener(this);
		mniTimKiemBanTiec.addActionListener(this);
		mniTimKiemHoaDon.addActionListener(this);
		mniChucVu.addActionListener(this);
		mniPhieuDatBan.addActionListener(this);
		mniMonAn.addActionListener(this);
		mniMuaVe.addActionListener(this);
	}

	private NhanVien nvUI = new NhanVien();
	private ThongTinCaNhan ttUI = new ThongTinCaNhan();
	private TaiKhoan tkUI = new TaiKhoan();
	private KhachHangUI khUI = new KhachHangUI();
	private Ban ban = new Ban();
	private Sanh sanh = new Sanh();
	private ThongKeDoanhThu tkDoanhThu = new ThongKeDoanhThu();
	private DoiMatKhau doiMK = new DoiMatKhau();
	private DanhSachKhachHangUI dskhUI = new DanhSachKhachHangUI();
	private TimKiemKhachHangUI timKiemKHUI = new TimKiemKhachHangUI();
	private ChucVu cvUI = new ChucVu();
	
	private HoaDon hoaDon = new HoaDon();
	private MonAn monAnUI=new MonAn();
	private JMenuItem mniPhieuDatBan;
	private DanhSachPhieuDat dsPhieuDat=new DanhSachPhieuDat();
	private JMenuItem mniLoaiMonAn;
	private JMenuItem mniTaiKhoan;
	private JMenuItem mniMuaVe;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o.equals(mniNhanVien)) {
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Nhân Viên", null, tabbedPane.add(nvUI.contentPane), "Nhân Viên");

		} else if (o.equals(mniThongTinCaNhan)) {
			// tabbedPane.remove(tabbedPane);

			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Thông Tin Cá Nhân", null, tabbedPane.add(ttUI.contentPane), "Thông Tin Cá Nhân");

		} else if (o.equals(mniTaiKhoan)) {
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Tài Khoản", null, tabbedPane.add(tkUI.contentPane), "Tài Khoản");

		} else if (o.equals(mniKhachHang)) {
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Khách Hàng", null, tabbedPane.add(khUI.contentPane), "Khách Hàng");

		} else if (o.equals(mniDoUongBanChay)) {
			String title = "Bán Chạy Nhất";
			ThongKeDoUong tkDoUong = new ThongKeDoUong(title);
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Thống Kê Đồ Uống", null, tabbedPane.add(tkDoUong.contentPane), "Thống Kê Đồ Uống");
		} else if (o.equals(mniDoUongBanIt)) {
			String title = "Bán Ít Nhất";
			ThongKeDoUong tkDoUong = new ThongKeDoUong(title);
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Thống Kê Đồ Uống", null, tabbedPane.add(tkDoUong.contentPane), "Thống Kê Đồ Uống");
		} else if (o.equals(mniBan)) {
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Bàn", null, tabbedPane.add(ban.contentPane), "Bàn");
		} else if (o.equals(mniSanh)) {
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Sảnh", null, tabbedPane.add(sanh.contentPane), "Sảnh");
		} else if (o.equals(mniThongKeDoanhThu)) {
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Thống Kê Doanh Thu", null, tabbedPane.add(tkDoanhThu.contentPane), "Thống Kê Doanh Thu");
		} else if (o.equals(mniDoiMatKhau)) {
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Đổi mật khẩu", null, tabbedPane.add(doiMK.contentPane), "Đổi mật khẩu");
		} else if (o.equals(mniDangXuat)) {
			setVisible(false);
			DangNhap dn = new DangNhap();
			dn.setVisible(true);
		} else if (o.equals(mniThoat)) {
			setVisible(false);
		} else if (o.equals(mniDatBanTiec)) {
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Danh Sách Khách Hàng", null, tabbedPane.add(dskhUI.contentPane), "Danh Sách Khách Hàng");
		} else if (o.equals(mniTimKiemKhachHang)) {
			timKiemKHUI.setVisible(true);
		} else if (o.equals(mniChucVu)) {
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Chức vụ", null, tabbedPane.add(cvUI.contentPane), "Chức vụ");
		}else if(o.equals(mniMonAn)) {
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Món Ăn", null, tabbedPane.add(monAnUI.contentPane), "Món Ăn");
		}else if(o.equals(mniPhieuDatBan)) {
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			tabbedPane.addTab("Thanh Toán", null, tabbedPane.add(dsPhieuDat.contentPane), "Thanh Toán");
		}else if(o.equals(mniMuaVe)) {
			dskhUI.btnDatBanTiec.setVisible(false);
			dskhUI.btnDatMon.setVisible(true);
			dskhUI.updateTable();
			tabbedPane.remove(tabbedPane.getSelectedComponent());
			
			tabbedPane.addTab("Danh Sách Khách Hàng", null, tabbedPane.add(dskhUI.contentPane), "Danh Sách Khách Hàng");
		}
	}

	@Override
	public void menuSelected(MenuEvent e) {

		Object o = e.getSource();

	}

	@Override
	public void menuDeselected(MenuEvent e) {

	}

	@Override
	public void menuCanceled(MenuEvent e) {
		// TODO Auto-generated method stub

	}

}
