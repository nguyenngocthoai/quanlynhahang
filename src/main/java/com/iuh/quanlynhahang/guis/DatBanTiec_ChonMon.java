package com.iuh.quanlynhahang.guis;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.DefaultCellEditor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

import org.apache.commons.lang3.RandomStringUtils;

import com.iuh.quanlynhahang.daoimpls.LoaiMonDAOImpl;
import com.iuh.quanlynhahang.daoimpls.MonDAOImpl;
import com.iuh.quanlynhahang.daoimpls.PhieuDatBanDAOImpl;
import com.iuh.quanlynhahang.entities.Ban;
import com.iuh.quanlynhahang.entities.KhachHang;
import com.iuh.quanlynhahang.entities.LoaiMon;
import com.iuh.quanlynhahang.entities.Mon;
import com.iuh.quanlynhahang.entities.PhieuDatBan;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

public class DatBanTiec_ChonMon extends JFrame implements ActionListener, MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTree tree;
	private JButton btnTroVe;
	private JButton btnDat;
	private DefaultTableModel model;
	private JButton btnSL;
//	private JComboBox comboBox;
	private JButton btnDVT;
	private JButton btnXoaMon;

	private static List<String> tenMons = new ArrayList<String>();
	private static MonDAOImpl monDAO = new MonDAOImpl();
	private static LoaiMonDAOImpl loaiMonDAO = new LoaiMonDAOImpl();
	private JTextField txtTongTien;
	private JLabel lblTinCc;
	private JTextField txtTienCoc;
	private static NumberFormat df = new DecimalFormat("#,###.00 VNĐ");
	double tienCoc;
	private static PhieuDatBanDAOImpl phieuDatBanDAO = new PhieuDatBanDAOImpl();
	private DatBanTiec_ChonBan datBanTiec_ChonBan = new DatBanTiec_ChonBan();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatBanTiec_ChonMon frame = new DatBanTiec_ChonMon();
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
	@SuppressWarnings("unchecked")
	public DatBanTiec_ChonMon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblChnMn = new JLabel("CHỌN MÓN");
		lblChnMn.setForeground(Color.RED);
		lblChnMn.setFont(new Font("Times New Roman", Font.BOLD, 25));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Danh s\u00E1ch m\u00F3n \u0111\u00E3 ch\u1ECDn", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE).addGap(18)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup().addGap(470)
								.addComponent(lblChnMn, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
								.addGap(409)))));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblChnMn).addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
						.addGap(10)));

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		btnTroVe = new JButton("Trở Về");
		btnTroVe.setIcon(new ImageIcon("images\\back.png"));
		btnTroVe.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		btnDat = new JButton("Đặt");
		btnDat.setIcon(new ImageIcon("images\\accept.png"));
		btnDat.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		btnSL = new JButton("Cập nhật số lượng");
		btnSL.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		btnDVT = new JButton("Cập nhật đơn vị tính");
		btnDVT.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		btnXoaMon = new JButton("Xóa món");
		btnXoaMon.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		JLabel lblTngTin = new JLabel("Tổng Tiền");
		lblTngTin.setForeground(Color.RED);
		lblTngTin.setBackground(Color.RED);
		lblTngTin.setFont(new Font("Times New Roman", Font.BOLD, 16));

		txtTongTien = new JTextField();
		txtTongTien.setEditable(false);
		txtTongTien.setForeground(Color.RED);
		txtTongTien.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtTongTien.setColumns(10);

		lblTinCc = new JLabel("Tiền Cọc");
		lblTinCc.setForeground(Color.RED);
		lblTinCc.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblTinCc.setBackground(Color.RED);

		txtTienCoc = new JTextField();
		txtTienCoc.setEditable(false);
		txtTienCoc.setForeground(Color.RED);
		txtTienCoc.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtTienCoc.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
								.addComponent(btnXoaMon, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnSL).addGap(18)
								.addComponent(btnDVT).addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblTinCc, GroupLayout.PREFERRED_SIZE, 76,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTngTin, GroupLayout.PREFERRED_SIZE, 76,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(txtTongTien)
										.addComponent(txtTienCoc, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
								.addGap(51)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(btnTroVe, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(btnDat, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))))
				.addGap(12)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(btnDVT).addComponent(btnSL)
						.addComponent(btnXoaMon))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup().addGap(46)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtTienCoc, GroupLayout.PREFERRED_SIZE, 32,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTinCc, GroupLayout.PREFERRED_SIZE, 30,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup().addGap(40).addComponent(btnTroVe,
								GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTngTin, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtTongTien, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnDat, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
				.addContainerGap()));

		table = new JTable();
		model = new DefaultTableModel(new Object[][] {},
				new String[] { "Mã Món", "Tên Món", "Số Lượng", "Đơn Vị Tính", "Giá Tiền" });
		table.setModel(model);
		table.setRowHeight(25);

//		comboBox = new JComboBox<>();
//		comboBox.addItem("Đĩa");
//		comboBox.addItem("Kg");
//		comboBox.addItem("Ly");
//		comboBox.addItem("Chai");
//		comboBox.addItem("Thùng");
//		comboBox.addItem("Nồi");
//		comboBox.addItem("Lon");
//		comboBox.addItem("Kg");
//		comboBox.addItem("Kg");
//		TableColumn comboCol4 = table.getColumnModel().getColumn(5);
//		comboCol4.setCellEditor(new DefaultCellEditor(comboBox));

//		table.setModel(new DefaultTableModel(new Object[][] {},
//				new String[] { "STT", "Mã Món", "Tên Món", "Số Lượng", "Giá Tiền" }));
		table.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		scrollPane_1.setViewportView(table);
		panel.setLayout(gl_panel);

		table.addMouseListener(this);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int c = 0; c < table.getColumnCount(); c++) {
			Class<?> col_class = table.getColumnClass(c);
			table.setDefaultEditor(col_class, null); // remove editor
		}

//		List<LoaiMon> loaiMons = loaiMonDAO.getAllLoaiMon();
//		List<Mon> mons = monDAO.getAllMon();
		tree = new JTree();
//		TreeModel model = null;
//		DefaultMutableTreeNode mon=new DefaultMutableTreeNode();
//		for (LoaiMon lm : loaiMons) {
//			model = (new DefaultTreeModel(new DefaultMutableTreeNode(lm.getTenLoaiMon()) {
//				{
//					for (Mon m : mons) {
//						if (m.getLoaiMon().getTenLoaiMon().equalsIgnoreCase(lm.getTenLoaiMon())) {
//							add(new DefaultMutableTreeNode(m.getTenMon()));
//						}
//					}
//					add(model);
//				}
//			}));
//			tree.setModel(model);
//		}

		try {
			tree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Danh Sách Món") {
				{
					List<LoaiMon> loaiMons = loaiMonDAO.getAllLoaiMon();
					List<Mon> mons = monDAO.getAllMon();
					DefaultMutableTreeNode mon;
					for (LoaiMon lm : loaiMons) {
						mon = new DefaultMutableTreeNode(lm.getTenLoaiMon());
						for (Mon m : mons) {
							if (m.getLoaiMon().getTenLoaiMon().equalsIgnoreCase(lm.getTenLoaiMon())) {
								mon.add(new DefaultMutableTreeNode(m.getTenMon()));
							}
						}
						add(mon);
					}
				}
			}));
		} catch (Exception e) {
			e.printStackTrace();
		}

		tree.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		scrollPane.setViewportView(tree);

		contentPane.setLayout(gl_contentPane);

		btnTroVe.addActionListener(this);
		btnDat.addActionListener(this);
		btnSL.addActionListener(this);
		btnDVT.addActionListener(this);
		btnXoaMon.addActionListener(this);

//		List<String> tenMons = new ArrayList<String>();
		List<LoaiMon> checkLoaiMons = loaiMonDAO.getAllLoaiMon();

//		for (Mon mon : mons) {
//		tree.getModel().
		tree.addTreeSelectionListener(new TreeSelectionListener() {

			public void valueChanged(TreeSelectionEvent e) {
				DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
				Object nodeInfo = node.getUserObject();
				boolean check = true;
				try {
					/**
					 * check ko add loai mon
					 */
					for (LoaiMon loaiMon : checkLoaiMons) {
						if (nodeInfo.toString().equalsIgnoreCase(loaiMon.getTenLoaiMon())) {
							check = false;
						}
					}
				} catch (Exception e2) {
				}

				if (check == true) {
					if (tenMons.contains(nodeInfo.toString())) {
						JOptionPane.showMessageDialog(null, "Món đã được chọn. Vui lòng cập nhật số lượng!",
								"Thông báo", JOptionPane.ERROR_MESSAGE, new ImageIcon("images\\warning.png"));
					} else {
						if (!nodeInfo.toString().equalsIgnoreCase("Danh Sách Món")) {

							Mon mon = monDAO.getMonByTen(nodeInfo.toString());

							ImageIcon icon = new ImageIcon("images\\yes.png");
							String sl = JOptionPane.showInputDialog("Nhập số lượng:");

							try {
								if (!sl.isEmpty() && sl.matches("^([1-9](0)*)*$")) {

									List<String> dvts = new ArrayList<String>();
									dvts = mon.getDonViTinh();
									String[] options = new String[dvts.size()];
									dvts.toArray(options);
									String dvt = (String) JOptionPane.showInputDialog(null, "Chọn đơn vị tính:",
											"Thông báo", JOptionPane.OK_OPTION, icon, options, "");

									if (!dvt.isEmpty()) {
										BigDecimal gt;
										gt = mon.getGiaTien();
										BigDecimal sol = null;
										sol = BigDecimal.valueOf(Integer.parseInt(sl));

										try {
											if (dvt.equalsIgnoreCase("kg")) {
												gt = gt.multiply(new BigDecimal(2));
											} else {
//												sol = BigDecimal.valueOf(Integer.parseInt(sl));
											}
										} catch (Exception e2) {

										}
										model.addRow(new Object[] { mon.getMaMon(), mon.getTenMon(), sl, dvt,
												gt.multiply(sol) });
										table.setModel(model);
										tenMons.add(nodeInfo.toString());
										tinhTongTien();
//										dvts.clear();

									}
								} else {
									JOptionPane.showMessageDialog(null, "Số lượng không hợp lệ!", "Thông báo",
											JOptionPane.ERROR_MESSAGE, new ImageIcon("images\\warning.png"));
								}
							} catch (Exception e2) {
							}
						}

					}
				}
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj.equals(btnTroVe)) {
			DatBanTiec_ChonBan datBanTiec_ChonBan = new DatBanTiec_ChonBan();
			TrangChu.tabbedPane.remove(TrangChu.tabbedPane.getSelectedComponent());
			TrangChu.tabbedPane.addTab("Chọn Bàn", null, TrangChu.tabbedPane.add(datBanTiec_ChonBan.getContentPane()),
					"Chọn Bàn");
			DatBanTiec_ChonBan.banDaChon.clear();
			tenMons.clear();
			model = (DefaultTableModel) table.getModel();
			model.getDataVector().removeAllElements();

			System.out.println("Chon Mon TV:" + DatBanTiec_ChonBan.banDaChon.size());
			System.out.println("Chon Mon TV:" + KhachHangUI.khachHang.getTenKhachHang());

		} else if (obj.equals(btnDat)) {
			// to do something
			System.out.println("Chon Mon Dat:" + DatBanTiec_ChonBan.banDaChon.size());
			System.out.println("Chon Mon Dat:" + KhachHangUI.khachHang.getTenKhachHang());

			int options = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn đặt!", "Thông báo",
					JOptionPane.YES_NO_OPTION);
			if (options == JOptionPane.YES_OPTION) {

//				String gioSuDung = DatBanTiec_ChonBan.cbxGio.getSelectedItem().toString() + "h"
//						+ DatBanTiec_ChonBan.cbxPhut.getSelectedItem().toString();

				List<Mon> mons = convertStringtoMon();
//				List<Ban> bans = new ArrayList<Ban>();

				Set<Mon> setMons = mons.stream().collect(Collectors.toSet());
				Set<Ban> setBans = DatBanTiec_ChonBan.banDaChon.stream().collect(Collectors.toSet());
				System.out.println(setBans.size());
				System.out.println(setMons.size());

//				int thanhToan = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn thanh toán!", "Thông báo",
//						JOptionPane.YES_NO_OPTION);

				String gioSuDung = null;
				if (datBanTiec_ChonBan.rdbSuDungNgay.isSelected()) {
					gioSuDung = LocalDateTime.now().getHour() + "h" + LocalDateTime.now().getMinute() + "";
				} else if (datBanTiec_ChonBan.rdbDatTruoc.isSelected()) {
					gioSuDung = DatBanTiec_ChonBan.cbxGio.getSelectedItem().toString() + "h"
							+ DatBanTiec_ChonBan.cbxPhut.getSelectedItem().toString();
				}

				LocalDate ngaySuDung = null;
				Date nsd = DatBanTiec_ChonBan.dateNgaySuDung.getDate();
				if (datBanTiec_ChonBan.rdbSuDungNgay.isSelected()) {
					ngaySuDung = LocalDate.now();
				} else if (datBanTiec_ChonBan.rdbDatTruoc.isSelected()) {
					ngaySuDung = nsd.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
				}
				int soLuong = DatBanTiec_ChonBan.soLuongNguoiNextScreen;
//				try {
//					soLuong = Integer.parseInt(datBanTiec_ChonBan.txtSoLuong.getText());
//					
//				} catch (Exception e2) {
//					// TODO: handle exception
//					e2.printStackTrace();
//				}

//				public PhieuDatBan(String maBanTiec, KhachHang khachHang, Set<Ban> bans, Set<Mon> monAns, LocalDate ngayDatMon,
//						LocalDate ngaySuDung, String gioSuDung, String trangThaiThanhToan, int soLuongNguoi, int soLuongMon,
//						BigDecimal tienCoc)
//				

				System.out.println("ma:" + randomMaBTNotExisted());
				System.out.println(KhachHangUI.khachHang.getTenKhachHang());
				for (Ban x : setBans)
					System.out.println(x.getMaBan());

				for (Mon x : setMons)
					System.out.println(x.getTenMon());

				BigDecimal tienCocSave = new BigDecimal(tienCoc);

				System.out.println("ngay dat:" + LocalDate.now());
				System.out.println("ngay sd:" + ngaySuDung);
				System.out.println("so luong nguoi:" + soLuong);
				System.out.println(tienCocSave);
				System.out.println();
				System.out.println();
				KhachHang khachHang = new KhachHang();
				khachHang.setMaKhachHang(KhachHangUI.khachHang.getMaKhachHang());
				khachHang.setTenKhachHang(KhachHangUI.khachHang.getTenKhachHang());
				khachHang.setDiaChi(KhachHangUI.khachHang.getDiaChi());
				khachHang.setGioiTinh(KhachHangUI.khachHang.getGioiTinh());
				khachHang.setSoDienThoai(KhachHangUI.khachHang.getSoDienThoai());

				String trangThai = "";
				if (datBanTiec_ChonBan.rdbDatTruoc.isSelected()) {
					trangThai = "Đặt Trước";
				} else if (datBanTiec_ChonBan.rdbSuDungNgay.isSelected()) {
					trangThai = "Sử Dụng Ngay";
				}

				try {
					PhieuDatBan phieuDatBan = new PhieuDatBan(randomMaBTNotExisted(), khachHang, setBans, setMons,
							LocalDate.now(), ngaySuDung, gioSuDung, "Chưa Thanh Toán", soLuong, 1, tienCocSave,
							trangThai);

					phieuDatBanDAO.createPhieuDatBan(phieuDatBan);
					JOptionPane.showMessageDialog(null, "Đặt thành công!", "Thông báo", JOptionPane.ERROR_MESSAGE,
							new ImageIcon("images\\yes.png"));

//					DatBanTiec_ChonBan datBanTiec_ChonBan = new DatBanTiec_ChonBan();
//					TrangChu.tabbedPane.remove(TrangChu.tabbedPane.getSelectedComponent());
//					TrangChu.tabbedPane.addTab("Chọn Bàn", null, TrangChu.tabbedPane.add(datBanTiec_ChonBan.getContentPane()),
//							"Chọn Bàn");

					for (Ban b : setBans)
						b.settrangThaiDatBan("Đã Đặt");

					DatBanTiec_ChonBan.banDaChon.clear();
					tenMons.clear();
					model = (DefaultTableModel) table.getModel();
					model.getDataVector().removeAllElements();
					datBanTiec_ChonBan.txtSoLuong.setText("");
					datBanTiec_ChonBan.updateBan();

				} catch (Exception e2) {
					e2.printStackTrace();
				}

			}

		} else if (obj.equals(btnXoaMon)) {
			int row = table.getSelectedRow();
			if (row != -1) {
				String tenMon = (String) table.getValueAt(row, 1);
				System.out.println("tên món: " + tenMon);
				tenMons.remove(tenMon);
				model.removeRow(row);
				System.out.println("removed:");
				tenMons.forEach(x -> System.out.println(x));
			} else {
				JOptionPane.showMessageDialog(null, "Vui lòng chọn món để xóa!", "Thông báo", JOptionPane.ERROR_MESSAGE,
						new ImageIcon("images\\warning.png"));
			}

		} else if (obj.equals(btnSL)) {
			int row = table.getSelectedRow();
			if (row != -1) {
				String soLuong = (String) table.getValueAt(row, 2);
				System.out.println("Số lượng: " + soLuong);
				String m = JOptionPane.showInputDialog("Nhập số lượng:", soLuong);
				if (!m.isEmpty() && m.matches("^([1-9](0)*)*$")) {
					System.out.println(m);
					table.setValueAt(m, row, 2);
					/**
					 * update gia tien
					 */
					String tm = (String) table.getValueAt(row, 1);
					Mon mon = monDAO.getMonByTen(tm);
					BigDecimal gt = mon.getGiaTien();
					try {
						String dvt = (String) table.getValueAt(row, 3);
						if (dvt.equalsIgnoreCase("kg")) {
							gt = gt.multiply(new BigDecimal(2));
						}
					} catch (Exception e2) {

					}
					BigDecimal sol = BigDecimal.valueOf(Integer.parseInt(m));
					table.setValueAt(gt.multiply(sol), row, 4);
					tinhTongTien();
				}

			} else {
				JOptionPane.showMessageDialog(null, "Vui lòng chọn món để cập nhật!", "Thông báo",
						JOptionPane.ERROR_MESSAGE, new ImageIcon("images\\warning.png"));
			}

		} else if (obj.equals(btnDVT)) {
			int row = table.getSelectedRow();
			if (row != -1) {
				String tm = (String) table.getValueAt(row, 1);
				Mon m = monDAO.getMonByTen(tm);

				List<String> list = new ArrayList<String>();
				list = m.getDonViTinh();
				String[] options = new String[list.size()];
				list.toArray(options);
				ImageIcon icon = new ImageIcon("images\\yes.png");

				String dvt = (String) JOptionPane.showInputDialog(null, "Chọn đơn vị tính:", "Thông báo",
						JOptionPane.OK_OPTION, icon, options, "");
				table.setValueAt(dvt, row, 3);
				tinhTongTien();
			} else {
				JOptionPane.showMessageDialog(null, "Vui lòng chọn món để cập nhật!", "Thông báo",
						JOptionPane.ERROR_MESSAGE, new ImageIcon("images\\warning.png"));
			}
		}
	}

	private void loadDataForMon() {
		List<LoaiMon> loaiMons = loaiMonDAO.getAllLoaiMon();
		List<Mon> mons = monDAO.getAllMon();
		DefaultMutableTreeNode mon;
		for (LoaiMon lm : loaiMons) {
			mon = new DefaultMutableTreeNode(lm.getTenLoaiMon());
			for (Mon m : mons) {
				if (m.getLoaiMon().getTenLoaiMon().equalsIgnoreCase(lm.getTenLoaiMon())) {
					mon.add(new DefaultMutableTreeNode(m.getTenMon()));
				}
			}
		}
	}

	private List<Mon> convertStringtoMon() {
		List<Mon> mons = new ArrayList<Mon>();
		try {
			for (String str : tenMons) {
				if (!str.equalsIgnoreCase("Danh Sách Món")) {
					Mon mon = monDAO.getMonByTen(str);
					mons.add(mon);
				}
			}
		} catch (Exception e) {
		}
		return mons;

	}

	public void updateTable() {
		model = (DefaultTableModel) table.getModel();
		model.getDataVector().removeAllElements();

		try {
			List<Mon> mons = convertStringtoMon();
//			int i = 0;
			for (Mon mon : mons) {
//				i++;
//				List<String> dvts = mon.getDonViTinh();
//				for (String str : dvts) {
//					System.out.println("wwwwwwwww  " + str);
//					comboBox.addItem(str);
//				}
				model.addRow(new Object[] { mon.getMaMon(), mon.getTenMon(), "1", "", mon.getGiaTien() });
//				TableColumn comboCol4 = table.getColumnModel().getColumn(4);
//				comboCol4.setCellEditor(new DefaultCellEditor(comboBox));

			}
			model.fireTableDataChanged();
			table.setModel(model);
//			table.getSelectionModel().clearSelection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void updateMonInTable(String tenMon) {
		try {
			if (!tenMon.equalsIgnoreCase("Danh Sách Món")) {
//				JOptionPane.showMessageDialog(null,
//						"Món đã được chọn. Vui lòng chỉnh sửa số lượng ở cột số lượng trong bảng!", "Thông báo",
//						JOptionPane.ERROR_MESSAGE, new ImageIcon("images\\warning.png"));
				Mon mon = monDAO.getMonByTen(tenMon);
				List<String> dvts = mon.getDonViTinh();
				String[] options = new String[dvts.size()];
				ImageIcon icon = new ImageIcon("images\\yes.png");
				String n = (String) JOptionPane.showInputDialog(null, "Chọn đơn vị tính:", "Thông báo",
						JOptionPane.OK_OPTION, icon, options, options[0]);
				System.out.println(n);

//				JComboBox comboBox = new JComboBox<>();
				model.addRow(new Object[] { mon.getMaMon(), mon.getTenMon(), "1", n, mon.getGiaTien() });

//				List<String> dvts = mon.getDonViTinh();
//				for (String str : dvts) {
//					System.out.println("wwwwwwwww  " + str);
//					cbxDVT.addItem(str);
//					comboBox.addItem(str);
//				}
//				TableColumn comboCol4 = table.getColumnModel().getColumn(4);
//				comboCol4.setCellEditor(new DefaultCellEditor(comboBox));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private void tinhTongTien() {
		int rowCount = table.getRowCount();
		double amount = 0;
		double convert;
		for (int i = 0; i < rowCount; i++) {
			String record = table.getValueAt(i, 4).toString();
			convert = Double.parseDouble(record);
			amount = amount + convert;
		}
		txtTongTien.setText(df.format(amount));
		tienCoc = amount * 0.3;
		txtTienCoc.setText(df.format(tienCoc));
	}

	private void reloadJtree() {
		List<LoaiMon> loaiMons = loaiMonDAO.getAllLoaiMon();
		List<Mon> mons = monDAO.getAllMon();
		DefaultMutableTreeNode mon;
		for (LoaiMon lm : loaiMons) {
			mon = new DefaultMutableTreeNode(lm.getTenLoaiMon());
			for (Mon m : mons) {
				if (m.getLoaiMon().getTenLoaiMon().equalsIgnoreCase(lm.getTenLoaiMon())) {
					mon.add(new DefaultMutableTreeNode(m.getTenMon()));
				}
			}
//			add(mon);
		}
	}

	@SuppressWarnings("static-access")
	public String randomMaBTNotExisted() {
		String maPD;
		List<String> idPDs = new ArrayList<String>();
		List<PhieuDatBan> phieuDatBans = phieuDatBanDAO.getAllPhieuDatBan();
		for (PhieuDatBan pd : phieuDatBans) {
			idPDs.add(pd.getMaBanTiec());
		}

		do {
			RandomStringUtils randomStringUtils = new RandomStringUtils();
			maPD = randomStringUtils.randomNumeric(8);

		} while (idPDs.contains(maPD));
		return "PDB" + maPD;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
}
