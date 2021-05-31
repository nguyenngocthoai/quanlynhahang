package com.iuh.quanlynhahang.guis;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.iuh.quanlynhahang.daoimpls.ChiTietHoaDonDAOImpl;
import com.iuh.quanlynhahang.daoimpls.HoaDonDAOImpl;
import com.iuh.quanlynhahang.daoimpls.PhieuDatBanDAOImpl;
import com.iuh.quanlynhahang.entities.ChiTietHoaDon;
import com.iuh.quanlynhahang.entities.HoaDon;
import com.iuh.quanlynhahang.entities.PhieuDatBan;
import com.quanlynhahang.baocao.BaoCao;
import com.quanlynhahang.dto.DoanhThu;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;

public class ThongKeDoanhThu extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	private static String muaVe = "Mua Về";
	private static String suDungNgay = "Sử Dụng Ngay";
	public static BigDecimal tongTien = BigDecimal.valueOf(0d);

	public static List<DoanhThu> listDT = new ArrayList<DoanhThu>();
	public static String ngayBD;
	public static String ngayEnd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongKeDoanhThu frame = new ThongKeDoanhThu();
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
	private JLabel lblTNgy, lblThngKDoanh, lblnNgy;
	private JPanel panel;
	private JButton btnThongKe;

	private JTable tableThongKeDoanhThu;
	private DefaultTableModel tableModel;
	private JScrollPane scrollPane;
	private JLabel lblTongTien;
	private JButton btnBaoCao;
	private JTextField txtTongTien;
	public static String tienTong;
	JTextFieldDateEditor editor;
	private JDateChooser dateFrom, dateTo;
	private static NumberFormat df = new DecimalFormat("#,###.00 VNĐ");
	private static HoaDonDAOImpl hdDAO = new HoaDonDAOImpl();
	private static PhieuDatBanDAOImpl phieuDAO = new PhieuDatBanDAOImpl();
	private static ChiTietHoaDonDAOImpl cthdDAO = new ChiTietHoaDonDAOImpl();
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	public ThongKeDoanhThu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		lblThngKDoanh = new JLabel("THỐNG KÊ DOANH THU");
		lblThngKDoanh.setForeground(Color.RED);
		lblThngKDoanh.setFont(new Font("Times New Roman", Font.BOLD, 25));

		lblTNgy = new JLabel("Từ Ngày");
		lblTNgy.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblnNgy = new JLabel("Đến Ngày");
		lblnNgy.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		dateFrom = new JDateChooser();
		dateFrom.getCalendarButton().setEnabled(true);
		dateFrom.getCalendarButton().setFont(new Font("Times New Roman", Font.PLAIN, 16));
		dateFrom.getCalendarButton().setFont(new Font("Times New Roman", Font.PLAIN, 16));
		dateFrom.setLocale(Locale.forLanguageTag("vi-VN"));
		dateFrom.setDateFormatString("yyyy-MM-dd");
		dateFrom.setDate(Date.valueOf(LocalDate.now()));
		editor = (JTextFieldDateEditor) dateFrom.getDateEditor();
		editor.setEditable(false);

		dateTo = new JDateChooser();
		dateTo.getCalendarButton().setEnabled(true);
		dateTo.getCalendarButton().setFont(new Font("Times New Roman", Font.PLAIN, 16));
		dateTo.setLocale(Locale.forLanguageTag("vi-VN"));
		dateTo.setDateFormatString("yyyy-MM-dd");
		dateTo.setDate(Date.valueOf(LocalDate.now()));
		editor = (JTextFieldDateEditor) dateTo.getDateEditor();
		editor.setEditable(false);

		btnThongKe = new JButton("Thống Kê");
		btnThongKe.setIcon(new ImageIcon("images\\calculator.png"));
		btnThongKe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThongKe.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		panel = new JPanel();

		String[] header = "STT; Mã Hóa Đơn; Ngày In Hóa Đơn; Thành Tiền".split(";");
		tableModel = new DefaultTableModel(header, 0);
		scrollPane = new JScrollPane(tableThongKeDoanhThu = new JTable(tableModel),
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		tableThongKeDoanhThu.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblTongTien = new JLabel("Doanh Thu");
		lblTongTien.setForeground(Color.RED);
		lblTongTien.setFont(new Font("Times New Roman", Font.BOLD, 20));

		txtTongTien = new JTextField();
		txtTongTien.setForeground(Color.RED);
		txtTongTien.setEditable(false);
		txtTongTien.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtTongTien.setColumns(10);

		btnBaoCao = new JButton("Báo Cáo");
		btnBaoCao.setIcon(new ImageIcon("images\\report.png"));
		btnBaoCao.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(10)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE).addGap(10))
				.addGroup(gl_panel.createSequentialGroup().addGap(20)
						.addComponent(lblTongTien, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(txtTongTien, GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
						.addGap(502)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE).addGap(21)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTongTien, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtTongTien, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addGap(23)));
		panel.setLayout(gl_panel);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(5)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(68).addComponent(dateFrom,
										GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
								.addComponent(lblTNgy, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
						.addGap(23).addComponent(lblnNgy, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(dateTo, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE).addGap(36)
						.addComponent(btnThongKe, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
						.addGap(21).addComponent(btnBaoCao, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addGap(248))
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(395)
						.addComponent(lblThngKDoanh, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(338, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addComponent(lblThngKDoanh, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE).addGap(19)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(6)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(dateFrom, GroupLayout.PREFERRED_SIZE, 31,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTNgy, GroupLayout.PREFERRED_SIZE, 31,
												GroupLayout.PREFERRED_SIZE)))
						.addComponent(btnBaoCao, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(6)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(dateTo, GroupLayout.PREFERRED_SIZE, 31,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblnNgy, GroupLayout.PREFERRED_SIZE, 31,
												GroupLayout.PREFERRED_SIZE)))
						.addComponent(btnThongKe, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
				.addGap(23).addComponent(panel, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);

		tableThongKeDoanhThu.setRowHeight(30);

		btnThongKe.addActionListener(this);
		btnBaoCao.addActionListener(this);
		loadTable();
		tableThongKeDoanhThu.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int c = 0; c < tableThongKeDoanhThu.getColumnCount(); c++) {
			Class<?> col_class = tableThongKeDoanhThu.getColumnClass(c);
			tableThongKeDoanhThu.setDefaultEditor(col_class, null);
		}

	}

	public void updateTable() {
		java.util.Date from = dateFrom.getDate();
		java.util.Date to = dateTo.getDate();// localdate kia
		if (from.after(to)) {
			JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày hợp lệ!", "Thông báo", JOptionPane.ERROR_MESSAGE,
					new ImageIcon("images\\warning.png"));
		} else {
			tongTien = BigDecimal.valueOf(0);
			try {

				// tableModel.getDataVector().removeAllElements();
				int rowCount = tableThongKeDoanhThu.getRowCount();
				for (int i = rowCount; i > 0; i--) {
					tableModel.removeRow(i - 1);
				}
				try {
					int i = 0;
					String ngayBD = "";
					String ngayEnd = "";
					ngayBD = dateFormat.format(dateFrom.getDate());
					ngayEnd = dateFormat.format(dateTo.getDate());
					System.out.println(ngayBD);

					List<HoaDon> listHD = hdDAO.getHoaDonByDate(ngayBD, ngayEnd);
					List<PhieuDatBan> listPDB = phieuDAO.getAllPhieuDatBan();
					List<ChiTietHoaDon> listCTHD = cthdDAO.getAllCTHD();

					for (HoaDon hd : listHD) {
						i++;
						try {
							for (ChiTietHoaDon cthd : listCTHD) {
								for (PhieuDatBan pdb : listPDB) {
									if (hd.getMaHoaDon() == cthd.getHoaDon().getMaHoaDon()
											&& cthd.getBanTiec().getMaBanTiec() == pdb.getMaBanTiec()) {
										BigDecimal t = BigDecimal.valueOf(0.3d);
										BigDecimal t1 = pdb.getTienCoc();
										BigDecimal t2;
										if (pdb.getTrangThai().equals(suDungNgay)) {
											t2 = t1.divide(t);
											tableModel.addRow(new Object[] { i, hd.getMaHoaDon(),
													hd.getNgayXuatHoaDon(), df.format(t2) });

										} else if (pdb.getTrangThai().equals(muaVe)) {
											t2 = t1.divide(t);
											tableModel.addRow(new Object[] { i, hd.getMaHoaDon(),
													hd.getNgayXuatHoaDon(), df.format(t2) });

										} else {
											t2 = (t1.divide(t)).subtract(t1);
											tableModel.addRow(new Object[] { i, hd.getMaHoaDon(),
													hd.getNgayXuatHoaDon(), df.format(pdb.getTienCoc()) });
										}
										tongTien = tongTien.add(t2);

									}
								}
							}

						} catch (Exception e) {
							tableModel.addRow(new Object[] { i, hd.getMaHoaDon(), hd.getNgayXuatHoaDon() });
						}

					}

				} catch (Exception e) {
					e.printStackTrace();
				}
				txtTongTien.setText(df.format(tongTien));
				tienTong = txtTongTien.getText();
				tableThongKeDoanhThu.setModel(tableModel);

			} catch (Exception e) {
			}

		}
	}

//	public void loadTable() {
//		try {
//
//			// tableModel.getDataVector().removeAllElements();
//			int rowCount = tableThongKeDoanhThu.getRowCount();
//			for (int i = rowCount; i > 0; i--) {
//				tableModel.removeRow(i - 1);
//			}
//			try {
//				int i = 0;
//				List<HoaDon> listHD = hdDAO.getAllHoaDon();
//				List<PhieuDatBan> listPDB = phieuDAO.getAllPhieuDatBan();
//				List<ChiTietHoaDon> listCTHD = cthdDAO.getAllCTHD();
//
//				for (HoaDon hd : listHD) {
//					i++;
//					try {
//						for (ChiTietHoaDon cthd : listCTHD) {
//							for (PhieuDatBan pdb : listPDB) {
//								if (hd.getMaHoaDon() == cthd.getHoaDon().getMaHoaDon()
//										&& cthd.getBanTiec().getMaBanTiec() == pdb.getMaBanTiec()) {
//									BigDecimal t = BigDecimal.valueOf(0.3d);
//									BigDecimal t1 = pdb.getTienCoc();
//									BigDecimal t2;
//									if (pdb.getTrangThai().equals(suDungNgay)) {
//										t2 = t1.divide(t);
//										tableModel.addRow(new Object[] { i, hd.getMaHoaDon(), hd.getNgayXuatHoaDon(),
//												df.format(t2) });
//
//									} else if (pdb.getTrangThai().equals(muaVe)) {
//										t2 = t1.divide(t);
//										tableModel.addRow(new Object[] { i, hd.getMaHoaDon(), hd.getNgayXuatHoaDon(),
//												df.format(t2) });
//
//									} else {
//										t2 = (t1.divide(t)).subtract(t1);
//										tableModel.addRow(new Object[] { i, hd.getMaHoaDon(), hd.getNgayXuatHoaDon(),
//												df.format(pdb.getTienCoc()) });
//									}
//									tongTien = tongTien.add(t2);
//
//								}
//							}
//						}
//
//					} catch (Exception e) {
//						tableModel.addRow(new Object[] { i, hd.getMaHoaDon(), hd.getNgayXuatHoaDon() });
//					}
//
//				}
//
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			txtTongTien.setText(df.format(tongTien));
//			tableThongKeDoanhThu.setModel(tableModel);
//
//		} catch (Exception e) {
//		}
//	}
	// quên chưa bắt regex ngày bắt
	/**
	 * chổ nào
	 */
	public void loadTable() {
		try {

			// tableModel.getDataVector().removeAllElements();
			int rowCount = tableThongKeDoanhThu.getRowCount();
			for (int i = rowCount; i > 0; i--) {
				tableModel.removeRow(i - 1);
			}
			try {
				ngayBD = dateFormat.format(dateFrom.getDate());
				ngayEnd = dateFormat.format(dateTo.getDate());
				int i = 0;
				List<HoaDon> listHD = hdDAO.getAllHoaDon();
				List<PhieuDatBan> listPDB = phieuDAO.getAllPhieuDatBan();
				List<ChiTietHoaDon> listCTHD = cthdDAO.getAllCTHD();

				for (HoaDon hd : listHD) {
					i++;
					try {
						for (ChiTietHoaDon cthd : listCTHD) {
							for (PhieuDatBan pdb : listPDB) {
								if (hd.getMaHoaDon() == cthd.getHoaDon().getMaHoaDon()
										&& cthd.getBanTiec().getMaBanTiec() == pdb.getMaBanTiec()) {
									BigDecimal t = BigDecimal.valueOf(0.3d);
									BigDecimal t1 = pdb.getTienCoc();
									BigDecimal t2;
									if (pdb.getTrangThai().equals(suDungNgay)) {
										t2 = t1.divide(t);
										tableModel.addRow(new Object[] { i, hd.getMaHoaDon(), hd.getNgayXuatHoaDon(),
												df.format(t2) });
										DoanhThu dt = new DoanhThu(hd.getMaHoaDon(), hd.getNgayXuatHoaDon() + "",
												df.format(t2));
										listDT.add(dt);

									} else if (pdb.getTrangThai().equals(muaVe)) {
										t2 = t1.divide(t);
										tableModel.addRow(new Object[] { i, hd.getMaHoaDon(), hd.getNgayXuatHoaDon(),
												df.format(t2) });
										DoanhThu dt = new DoanhThu(hd.getMaHoaDon(), hd.getNgayXuatHoaDon() + "",
												df.format(t2));
										listDT.add(dt);

									} else {
										t2 = (t1.divide(t)).subtract(t1);
										tableModel.addRow(new Object[] { i, hd.getMaHoaDon(), hd.getNgayXuatHoaDon(),
												df.format(pdb.getTienCoc()) });
										DoanhThu dt = new DoanhThu(hd.getMaHoaDon(), hd.getNgayXuatHoaDon() + "",
												df.format(t2));
										listDT.add(dt);
									}
									tongTien = tongTien.add(t2);

								}
							}
						}

					} catch (Exception e) {
						tableModel.addRow(new Object[] { i, hd.getMaHoaDon(), hd.getNgayXuatHoaDon() });
					}

				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			txtTongTien.setText(df.format(tongTien));
			tableThongKeDoanhThu.setModel(tableModel);

		} catch (Exception e) {
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o.equals(btnThongKe)) {
			updateTable();
		} else if (o.equals(btnBaoCao)) {
			try {
				if (tableThongKeDoanhThu.getRowCount() <= 0) {
					int options = JOptionPane.showConfirmDialog(this,
							"Không có dữ liệu nào hết. Bạn có chắc muốn tiếp tục?", "Thông báo",
							JOptionPane.YES_NO_OPTION);
					if (options == JOptionPane.YES_OPTION) {
						BaoCao bc = new BaoCao();
						bc.BaoCaoDoanhThu();
					}
				} else {
					BaoCao bc = new BaoCao();
					bc.BaoCaoDoanhThu();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
}
