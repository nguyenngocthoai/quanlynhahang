package com.iuh.quanlynhahang.guis;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import org.apache.commons.lang3.RandomStringUtils;

import com.iuh.quanlynhahang.daoimpls.BanDAOImpl;
import com.iuh.quanlynhahang.daoimpls.ChiTietPhieuDatDAOImpl;
import com.iuh.quanlynhahang.daoimpls.LoaiMonDAOImpl;
import com.iuh.quanlynhahang.daoimpls.MonDAOImpl;
import com.iuh.quanlynhahang.daoimpls.PhieuDatBanDAOImpl;
import com.iuh.quanlynhahang.entities.Ban;
import com.iuh.quanlynhahang.entities.ChiTietPhieuDat;
import com.iuh.quanlynhahang.entities.KhachHang;
import com.iuh.quanlynhahang.entities.LoaiMon;
import com.iuh.quanlynhahang.entities.Mon;
import com.iuh.quanlynhahang.entities.PhieuDatBan;

public class DatBanTiec_ChonMon extends JFrame implements ActionListener, MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTree tree;
	private JButton btnTroVe;
	private JButton btnDat;
	private DefaultTableModel model;
	private JButton btnSL;
	private JButton btnDVT;
	private JButton btnXoaMon;

	private static List<String> tenMons = new ArrayList<String>();
//	List<Integer> soLuongMons = new ArrayList<Integer>();
//	List<String> donViTinhs = new ArrayList<String>();
	private static MonDAOImpl monDAO = new MonDAOImpl();
	private static LoaiMonDAOImpl loaiMonDAO = new LoaiMonDAOImpl();
	private JTextField txtTongTien;
	private JLabel lblTinCc;
	private JTextField txtTienCoc;
	private static NumberFormat df = new DecimalFormat("#,###.00 VNĐ");
	double tienCoc;
	private static PhieuDatBanDAOImpl phieuDatBanDAO = new PhieuDatBanDAOImpl();
	private static DatBanTiec_ChonBan datBanTiec_ChonBan = new DatBanTiec_ChonBan();
	private static BanDAOImpl banDAO = new BanDAOImpl();
	private static BanUI banUI = new BanUI();
	private static ChiTietPhieuDatDAOImpl chiTietPhieuDatDAO = new ChiTietPhieuDatDAOImpl();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					DatBanTiec_ChonMon frame = new DatBanTiec_ChonMon();
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
	@SuppressWarnings("serial")
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

		table.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		scrollPane_1.setViewportView(table);
		panel.setLayout(gl_panel);

		table.addMouseListener(this);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int c = 0; c < table.getColumnCount(); c++) {
			Class<?> col_class = table.getColumnClass(c);
			table.setDefaultEditor(col_class, null); // remove editor
		}

		tree = new JTree();

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

		List<LoaiMon> checkLoaiMons = loaiMonDAO.getAllLoaiMon();

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

							String sl = JOptionPane.showInputDialog("Nhập số lượng:");

							try {
								if (!sl.isEmpty() && sl.matches("^(([0-9]{1,})[.]([0-9]{1,}))*(([1-9])+0*)*$")) {
									BigDecimal gt;
									gt = mon.getGiaTien();
									BigDecimal sol = null;
									sol = BigDecimal.valueOf(Double.parseDouble(sl));

									model.addRow(new Object[] { mon.getMaMon(), mon.getTenMon(), sl, mon.getDonViTinh(),
											gt.multiply(sol) });
									table.setModel(model);
									tenMons.add(nodeInfo.toString());
									tinhTongTien();

//									}
								} else {
									JOptionPane.showMessageDialog(null, "Số lượng không hợp lệ!", "Thông báo",
											JOptionPane.ERROR_MESSAGE, new ImageIcon("images\\warning.png"));
									tree.clearSelection();
								}
							} catch (Exception e2) {
							}
						}

					}
				}
			}
		});

	}

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj.equals(btnTroVe)) {
			DatBanTiec_ChonBan datBanTiec_ChonBan = new DatBanTiec_ChonBan();
			TrangChuUI.tabbedPane.remove(TrangChuUI.tabbedPane.getSelectedComponent());
			TrangChuUI.tabbedPane.addTab("Chọn Bàn", null, TrangChuUI.tabbedPane.add(datBanTiec_ChonBan.getContentPane()),
					"Chọn Bàn");
			datBanTiec_ChonBan.banDaChon.clear();
			tenMons.clear();
			model = (DefaultTableModel) table.getModel();
			model.getDataVector().removeAllElements();
		} else if (obj.equals(btnDat)) {

			int options = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn đặt?", "Thông báo",
					JOptionPane.YES_NO_OPTION);
			if (options == JOptionPane.YES_OPTION) {

				Set<Ban> setBans = DatBanTiec_ChonBan.banDaChon.stream().collect(Collectors.toSet());

				BigDecimal tienCocSave = new BigDecimal(tienCoc);

				KhachHang khachHang = new KhachHang();
				khachHang.setMaKhachHang(DatBanTiecUI.khachHang.getMaKhachHang());
				khachHang.setTenKhachHang(DatBanTiecUI.khachHang.getTenKhachHang());
				khachHang.setDiaChi(DatBanTiecUI.khachHang.getDiaChi());
				khachHang.setGioiTinh(DatBanTiecUI.khachHang.getGioiTinh());
				khachHang.setSoDienThoai(DatBanTiecUI.khachHang.getSoDienThoai());

				try {
					PhieuDatBan phieuDatBan = new PhieuDatBan(randomMaBTNotExisted(), khachHang, setBans,
							LocalDate.now(), DatBanTiec_ChonBan.ngaySuDungNextScreen,
							DatBanTiec_ChonBan.gioSuDungNextScreen, "Chưa Thanh Toán",
							DatBanTiec_ChonBan.soLuongNguoiNextScreen, tienCocSave,
							DatBanTiec_ChonBan.trangThaiNextScreen);
					phieuDatBanDAO.createPhieuDatBan(phieuDatBan);

					int index = 0;
					List<Mon> mons = convertStringtoMon();
					List<Integer> soLuongMons = new ArrayList<Integer>();
					for (int i = 0; i < table.getRowCount(); i++) {
						soLuongMons.add(Integer.parseInt(table.getValueAt(i, 2).toString()));
					}
					for (Mon mon : mons) {
						ChiTietPhieuDat chiTietPhieuDat = new ChiTietPhieuDat(phieuDatBan, mon, soLuongMons.get(index),
								table.getValueAt(index, 3).toString());
						index++;
						chiTietPhieuDatDAO.createCTPD(chiTietPhieuDat);
					}

					JOptionPane.showMessageDialog(null, "Đặt thành công!", "Thông báo", JOptionPane.ERROR_MESSAGE,
							new ImageIcon("images\\yes.png"));

					for (Ban b : setBans) {
						b.settrangThaiDatBan("Đã Đặt");
						banDAO.updateBan(b);
					}

					DatBanTiec_ChonBan.banDaChon.clear();
					tenMons.clear();
					soLuongMons.clear();
					model = (DefaultTableModel) table.getModel();
					model.getDataVector().removeAllElements();

					datBanTiec_ChonBan.txtSoLuong.setText("");
					banUI.updateTable();
					datBanTiec_ChonBan.updateBan();
					datBanTiec_ChonBan.txtSoLuong.setText("");

					PhieuDatMonUI phieuDatMonUI = new PhieuDatMonUI();
					TrangChuUI.tabbedPane.remove(TrangChuUI.tabbedPane.getSelectedComponent());
					TrangChuUI.tabbedPane.addTab("Phiếu Đặt", null,
							TrangChuUI.tabbedPane.add(phieuDatMonUI.getContentPane()), "Phiếu Đặt");
					phieuDatMonUI.updateTable();

				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
//			}

		} else if (obj.equals(btnXoaMon)) {
			int row = table.getSelectedRow();
			if (row != -1) {
				String tenMon = (String) table.getValueAt(row, 1);
				tenMons.remove(tenMon);
				model.removeRow(row);
				tinhTongTien();
				model.fireTableDataChanged();
			} else {
				JOptionPane.showMessageDialog(null, "Vui lòng chọn món để xóa!", "Thông báo", JOptionPane.ERROR_MESSAGE,
						new ImageIcon("images\\warning.png"));
			}

		} else if (obj.equals(btnSL)) {
			int row = table.getSelectedRow();
			if (row != -1) {
				String soLuong = (String) table.getValueAt(row, 2);
				String m = JOptionPane.showInputDialog("Nhập số lượng:", soLuong);
				if (!m.isEmpty() && m.matches("^([1-9](0)*)*$")) {
					System.out.println(m);
					table.setValueAt(m, row, 2);
					/**
					 * update gia tien
					 */
					String dvt = (String) table.getValueAt(row, 3);
					String tm = (String) table.getValueAt(row, 1);
					Mon mon = monDAO.getMonByTen(tm);
					BigDecimal gt = mon.getGiaTien();
					try {
						if (dvt.equalsIgnoreCase("Kg")) {
							gt = gt.multiply(new BigDecimal(2)).multiply(new BigDecimal(Integer.parseInt(m)));
						} else {
							gt = gt.multiply(new BigDecimal(Integer.parseInt(m)));
						}
					} catch (Exception e2) {

					}
					table.setValueAt(gt, row, 4);
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
				String sl = (String) table.getValueAt(row, 2);
				String dvt = table.getValueAt(row, 3).toString();
//				ImageIcon icon = new ImageIcon("images\\yes.png");

				String dvtchange = JOptionPane.showInputDialog("Nhập đơn vị tính:", dvt);
				if (dvt.equalsIgnoreCase("Kg")) {
					BigDecimal giaTien = m.getGiaTien();
					if (dvtchange.equalsIgnoreCase("Kg")) {
						giaTien = giaTien.multiply(new BigDecimal(2)).multiply(new BigDecimal(Integer.parseInt(sl)));
					} else {
						giaTien = giaTien.multiply(new BigDecimal(Integer.parseInt(sl)));
					}
					table.setValueAt(giaTien, row, 4);
					table.setValueAt(dvtchange, row, 3);
					tinhTongTien();
				} else {
					table.clearSelection();
				}

			} else {
				JOptionPane.showMessageDialog(null, "Vui lòng chọn món để cập nhật!", "Thông báo",
						JOptionPane.ERROR_MESSAGE, new ImageIcon("images\\warning.png"));
			}
		}
	}

	@SuppressWarnings("unused")
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
			for (Mon mon : mons) {
				model.addRow(new Object[] { mon.getMaMon(), mon.getTenMon(), "1", "", mon.getGiaTien() });

			}
			model.fireTableDataChanged();
			table.setModel(model);
		} catch (Exception e) {
			e.printStackTrace();
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
		if (DatBanTiec_ChonBan.rdbDatTruoc.isSelected()) {
			txtTongTien.setText(df.format(amount));
			tienCoc = amount * 0.3;
			txtTienCoc.setText(df.format(tienCoc));
		} else {
			txtTongTien.setText(df.format(amount));
			tienCoc = amount * 0.3;
//			txtTienCoc.setText(df.format(tienCoc));
		}
//		txtTongTien.setText(df.format(amount));
//		tienCoc = amount * 0.3;
//		txtTienCoc.setText(df.format(tienCoc));
	}

	@SuppressWarnings("unused")
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
		}
	}

	@SuppressWarnings("static-access")
	public String randomMaBTNotExisted() {
		String maPD;
		List<String> idPDs = new ArrayList<String>();
		List<PhieuDatBan> phieuDatBans = phieuDatBanDAO.getAllPhieuDatBan();
		for (PhieuDatBan pd : phieuDatBans) {
			idPDs.add(pd.getMaPhieuDatBan());
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
