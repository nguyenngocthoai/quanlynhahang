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
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import javax.swing.ButtonGroup;
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
import com.iuh.quanlynhahang.daoimpls.MonDAOImpl;
import com.iuh.quanlynhahang.daoimpls.PhieuDatBanDAOImpl;
import com.iuh.quanlynhahang.entities.ChiTietHoaDon;
import com.iuh.quanlynhahang.entities.HoaDon;
import com.iuh.quanlynhahang.entities.PhieuDatBan;
import com.quanlynhahang.baocao.BaoCao;
import com.quanlynhahang.dto.DoanhThu;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class ThongKeDoanhThuUI extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	private static String muaVe = "Mua Về";
	private static String suDungNgay = "Sử Dụng Ngay";
//	private BigDecimal tongTien = BigDecimal.valueOf(0d);
	public static BigDecimal tongTien = BigDecimal.valueOf(0d);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongKeDoanhThuUI frame = new ThongKeDoanhThuUI();
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
	private JLabel lblTNgy, lblThngKDoanh;
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
	private JRadioButton radNgay;
	private JComboBox cbxNgay, cbxThang, cbxNam;
	private ButtonGroup buttonGroup;
	private static NumberFormat df = new DecimalFormat("#,###.00 VNĐ");
	private static HoaDonDAOImpl hdDAO = new HoaDonDAOImpl();
	private static PhieuDatBanDAOImpl phieuDAO = new PhieuDatBanDAOImpl();
	private static ChiTietHoaDonDAOImpl cthdDAO = new ChiTietHoaDonDAOImpl();
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	public ThongKeDoanhThuUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		lblThngKDoanh = new JLabel("THỐNG KÊ DOANH THU");
		lblThngKDoanh.setBounds(400, 5, 325, 51);
		lblThngKDoanh.setForeground(Color.RED);
		lblThngKDoanh.setFont(new Font("Times New Roman", Font.BOLD, 25));

		lblTNgy = new JLabel("Thống Kê Theo ");
		lblTNgy.setBounds(22, 81, 110, 31);
		lblTNgy.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		btnThongKe = new JButton("Thống Kê");
		btnThongKe.setBounds(22, 396, 135, 37);
		btnThongKe.setIcon(new ImageIcon("images\\calculator.png"));
		btnThongKe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThongKe.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		panel = new JPanel();
		panel.setBounds(327, 81, 738, 428);

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
		btnBaoCao.setBounds(175, 396, 110, 37);
		btnBaoCao.setIcon(new ImageIcon("images\\report.png"));
		btnBaoCao.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(10)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE).addGap(10))
				.addGroup(gl_panel.createSequentialGroup().addGap(20)
						.addComponent(lblTongTien, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(txtTongTien, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(176, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE).addGap(21)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTongTien, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtTongTien, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addGap(23)));
		panel.setLayout(gl_panel);
		contentPane.setLayout(null);
		contentPane.add(lblTNgy);
		contentPane.add(btnThongKe);
		contentPane.add(btnBaoCao);
		contentPane.add(panel);
		contentPane.add(lblThngKDoanh);

		radNgay = new JRadioButton("Ngày");
		radNgay.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		radNgay.setBounds(138, 81, 73, 31);
		contentPane.add(radNgay);

		radThang = new JRadioButton("Tháng");
		radThang.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		radThang.setBounds(248, 81, 73, 31);
		contentPane.add(radThang);

		radNam = new JRadioButton("Năm");
		radNam.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		radNam.setBounds(138, 135, 73, 31);
		contentPane.add(radNam);
		
		buttonGroup=new ButtonGroup();
		buttonGroup.add(radNgay);
		buttonGroup.add(radThang);
		buttonGroup.add(radNam);

		JLabel lblNgy = new JLabel("Ngày");
		lblNgy.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNgy.setBounds(22, 180, 69, 28);
		contentPane.add(lblNgy);

		cbxNgay = new JComboBox();
		cbxNgay.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		cbxNgay.setBounds(138, 180, 127, 28);
		cbxNgay.setEnabled(false);
		contentPane.add(cbxNgay);

		JLabel lblThng = new JLabel("Tháng");
		lblThng.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblThng.setBounds(22, 246, 69, 28);
		contentPane.add(lblThng);

		JLabel lblMnn_1_1 = new JLabel("Năm");
		lblMnn_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMnn_1_1.setBounds(22, 312, 69, 28);
		contentPane.add(lblMnn_1_1);

		cbxThang = new JComboBox();
		cbxThang.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		cbxThang.setBounds(138, 246, 127, 28);
		cbxThang.setEnabled(false);
		contentPane.add(cbxThang);

		cbxNam = new JComboBox();
		cbxNam.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		cbxNam.setBounds(138, 312, 127, 28);
		cbxNam.setEnabled(false);
		contentPane.add(cbxNam);

		JLabel lblThngKTheo_1 = new JLabel("Thống kê doanh thu");
		lblThngKTheo_1.setForeground(Color.RED);
		lblThngKTheo_1.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblThngKTheo_1.setBounds(10, 475, 307, 29);
		contentPane.add(lblThngKTheo_1);

		tableThongKeDoanhThu.setRowHeight(30);

		btnThongKe.addActionListener(this);
		btnBaoCao.addActionListener(this);
		
		loadTable();
		loadCombobox();
		tableThongKeDoanhThu.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int c = 0; c < tableThongKeDoanhThu.getColumnCount(); c++) {
			Class<?> col_class = tableThongKeDoanhThu.getColumnClass(c);
			tableThongKeDoanhThu.setDefaultEditor(col_class, null);
		}
		
		radNgay.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cbxNgay.setEnabled(true);
				cbxNam.setEnabled(true);
				cbxThang.setEnabled(true);

			}
		});
		radThang.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cbxNgay.setEnabled(false);
				cbxNam.setEnabled(true);
				cbxThang.setEnabled(true);

			}
		});
		radNam.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cbxNgay.setEnabled(false);
				cbxNam.setEnabled(false);
				cbxNam.setEnabled(true);
			}
		});

	}

	public static List<DoanhThu> listDT = new ArrayList<DoanhThu>();
	public static String ngayBD;
	public static String ngayEnd;
	private JRadioButton radThang;
	private JRadioButton radNam;

	private void EnableCBX() {
		
		if(radNgay.isSelected()) {
			cbxNgay.setEnabled(true);
			cbxThang.setEnabled(true);
			cbxNam.setEnabled(true);
		}else if(radThang.isSelected()) {
			cbxThang.setEnabled(true);
			cbxNam.setEnabled(true);
		}else if(radNam.isSelected()){
			cbxNam.setEnabled(true);
		}
	}
	
	public void updateTable() {
		tongTien = BigDecimal.valueOf(0);
		EnableCBX();
		try {
			int rowCount = tableThongKeDoanhThu.getRowCount();
			for (int i = rowCount; i > 0; i--) {
				tableModel.removeRow(i - 1);
			}
			try {
				int i = 0;

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
										// System.out.println(listDT.get(i).getNgayInHD());
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
			tienTong = txtTongTien.getText();
			System.out.println(tienTong);
			tableThongKeDoanhThu.setModel(tableModel);

		} catch (Exception e) {
		}
	}

	public void loadTable() {
		try {

			// tableModel.getDataVector().removeAllElements();
			int rowCount = tableThongKeDoanhThu.getRowCount();
			for (int i = rowCount; i > 0; i--) {
				tableModel.removeRow(i - 1);
			}
			try {
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

									} else if (pdb.getTrangThai().equals(muaVe)) {
										t2 = t1.divide(t);
										tableModel.addRow(new Object[] { i, hd.getMaHoaDon(), hd.getNgayXuatHoaDon(),
												df.format(t2) });

									} else {
										t2 = (t1.divide(t)).subtract(t1);
										tableModel.addRow(new Object[] { i, hd.getMaHoaDon(), hd.getNgayXuatHoaDon(),
												df.format(pdb.getTienCoc()) });
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

	private MonDAOImpl monDAO = new MonDAOImpl();

	private void loadCombobox() {
		// lấy tất cả năm trong hóa đơn
		List<Integer> list = monDAO.getAllNamsInHoaDon();
		Set<Integer> set = new HashSet<Integer>();
		set.addAll(list);
		for (Integer i : set) {
			cbxNam.addItem(i + "");
		}

		// lấy combobox tháng
		for (int i = 1; i <= 12; i++) {
			cbxThang.addItem("Tháng " + i);
		}
		// lấy cbx ngày
		for (int i = 1; i <=31; i++) {
			cbxNgay.addItem("Ngày "+i);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o.equals(btnThongKe)) {
			updateTable();
		} else if (o.equals(btnBaoCao)) {
			if (tableThongKeDoanhThu.getRowCount() <= 0) {
				int options = JOptionPane.showConfirmDialog(this,
						"Không có dữ liệu nào hết. Bạn có chắc muốn tiếp tục?", "Thông báo", JOptionPane.YES_NO_OPTION);
				if (options == JOptionPane.YES_OPTION) {
					BaoCao bc = new BaoCao();
					bc.BaoCaoDoanhThu();
				}
			} else {
				BaoCao bc = new BaoCao();
				bc.BaoCaoDoanhThu();
			}

		}

	}
}
