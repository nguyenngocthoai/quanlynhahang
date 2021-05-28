package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.iuh.quanlynhahang.daoimpls.ChiTietHoaDonDAOImpl;
import com.iuh.quanlynhahang.daoimpls.HoaDonDAOImpl;
import com.iuh.quanlynhahang.daoimpls.KhachHangDAOImpl;
import com.iuh.quanlynhahang.daoimpls.PhieuDatBanDAOImpl;
import com.iuh.quanlynhahang.entities.ChiTietHoaDon;
import com.iuh.quanlynhahang.entities.HoaDon;
import com.iuh.quanlynhahang.entities.KhachHang;
import com.iuh.quanlynhahang.entities.PhieuDatBan;
import com.toedter.calendar.JDateChooser;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import javax.swing.JLabel;
import java.awt.Font;
import java.time.LocalDate;
import java.time.Month;

import java.util.List;
import java.util.Locale;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SpringLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;

public class ThongKeDoanhThu extends JFrame implements ActionListener {

	public JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
	private SpringLayout sl_dateTo;
	private UtilDateModel model, model1;
	private static NumberFormat df = new DecimalFormat("#,###.00 VNĐ");
	private static HoaDonDAOImpl hdDAO= new HoaDonDAOImpl();
	private static PhieuDatBanDAOImpl phieuDAO= new PhieuDatBanDAOImpl();
	private static ChiTietHoaDonDAOImpl cthdDAO= new ChiTietHoaDonDAOImpl();
	private JDateChooser dateFrom,dateTo;
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	public ThongKeDoanhThu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		lblThngKDoanh = new JLabel("Thống Kê Doanh Thu");
		lblThngKDoanh.setBounds(400, 5, 265, 51);
		lblThngKDoanh.setForeground(Color.RED);
		lblThngKDoanh.setFont(new Font("Times New Roman", Font.BOLD, 25));

		lblTNgy = new JLabel("Từ Ngày");
		lblTNgy.setBounds(155, 81, 77, 31);
		lblTNgy.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		LocalDate date = LocalDate.now();
		int year = date.getYear();
		Month month = date.getMonth();
		int m = month.getValue();
		int day = date.getDayOfMonth();

		model = new UtilDateModel();
		model1 = new UtilDateModel();
		model.setDate(year, m, day);
		model.setSelected(true);
		model1.setDate(year, m, day);
		model1.setSelected(true);

		lblnNgy = new JLabel("Đến Ngày");
		lblnNgy.setBounds(441, 81, 86, 31);
		lblnNgy.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		dateTo = new JDateChooser();
		dateTo.setBounds(537, 81, 171, 31);
		dateTo.getCalendarButton().setFont(new Font("Times New Roman", Font.PLAIN, 16));
		dateTo.setLocale(Locale.forLanguageTag("vi-VN"));
		dateTo.setDateFormatString("yyyy-MM-dd");
		dateTo.setDate(java.sql.Date.valueOf(LocalDate.now()));
		contentPane.add(dateTo);
		
		dateFrom = new JDateChooser();
		dateFrom.getCalendarButton().setFont(new Font("Times New Roman", Font.PLAIN, 16));
		dateFrom.setBounds(241, 82, 171, 31);
		dateFrom.setLocale(Locale.forLanguageTag("vi-VN"));
		dateFrom.setDateFormatString("yyyy-MM-dd");
		dateFrom.setDate(java.sql.Date.valueOf(LocalDate.now()));
		contentPane.add(dateFrom);

		btnThongKe = new JButton("Thống Kê");
		btnThongKe.setBounds(748, 81, 101, 31);
		btnThongKe.setIcon(new ImageIcon("images\\calculator.png"));
		btnThongKe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThongKe.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		panel = new JPanel();
		panel.setBounds(5, 135, 1060, 374);

		String[] header = "STT; Mã Hóa Đơn; Ngày In Hóa Đơn; Thành Tiền".split(";");
		tableModel = new DefaultTableModel(header, 0);
		scrollPane = new JScrollPane(tableThongKeDoanhThu = new JTable(tableModel),
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		lblTongTien = new JLabel("Tổng Tiền");
		lblTongTien.setForeground(Color.RED);
		lblTongTien.setFont(new Font("Times New Roman", Font.BOLD, 20));

		txtTongTien = new JTextField();
		txtTongTien.setForeground(Color.RED);
		txtTongTien.setEditable(false);
		txtTongTien.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtTongTien.setColumns(10);

		btnBaoCao = new JButton("Báo Cáo");
		btnBaoCao.setBounds(880, 81, 95, 31);
		btnBaoCao.setIcon(new ImageIcon("images\\report.png"));
		btnBaoCao.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(10)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE).addGap(10))
				.addGroup(gl_panel.createSequentialGroup().addGap(20)
						.addComponent(lblTongTien, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(txtTongTien, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
						.addGap(604)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE).addGap(21)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTongTien, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtTongTien, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addGap(23)));
		panel.setLayout(gl_panel);
		contentPane.setLayout(null);
		contentPane.add(lblTNgy);
	
		contentPane.add(lblnNgy);
		
		contentPane.add(btnThongKe);
		contentPane.add(btnBaoCao);
		contentPane.add(lblThngKDoanh);
		contentPane.add(panel);
		

		btnThongKe.addActionListener(this);
		btnBaoCao.addActionListener(this);
		loadTable();
		tableThongKeDoanhThu.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int c = 0; c < tableThongKeDoanhThu.getColumnCount(); c++) {
			Class<?> col_class = tableThongKeDoanhThu.getColumnClass(c);
			tableThongKeDoanhThu.setDefaultEditor(col_class, null); // remove editor
		}
	}

	
	private static String muaVe="Mua Về";
	private static String suDungNgay="Sử Dụng Ngay";
	private static String datTruoc="Đặt Trước";
	private BigDecimal tongTien=BigDecimal.valueOf(0d);
	public void updateTable() {
		tongTien=BigDecimal.valueOf(0);
		try {

			// tableModel.getDataVector().removeAllElements();
			int rowCount = tableThongKeDoanhThu.getRowCount();
			for (int i = rowCount; i > 0; i--) {
				tableModel.removeRow(i - 1);
			}
			try {
				int i = 0;
				String ngayBD="";
				String ngayEnd="";
				 ngayBD=dateFormat.format(dateFrom.getDate());
				 ngayEnd=dateFormat.format(dateTo.getDate());
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
									BigDecimal t=BigDecimal.valueOf(0.3d);
									BigDecimal t1=pdb.getTienCoc();
									BigDecimal t2;
									if(pdb.getTrangThai().equals(suDungNgay)) {
										t2=t1.divide(t);
										tableModel.addRow(new Object[] { i, hd.getMaHoaDon(), hd.getNgayXuatHoaDon(),
												df.format(t2) });
										
									}else if(pdb.getTrangThai().equals(muaVe)) {
										t2=t1.divide(t);
										tableModel.addRow(new Object[] { i, hd.getMaHoaDon(), hd.getNgayXuatHoaDon(),
												df.format(t2) });
										
									}else {
										t2=(t1.divide(t)).subtract(t1);
										tableModel.addRow(new Object[] { i, hd.getMaHoaDon(), hd.getNgayXuatHoaDon(),
												df.format(pdb.getTienCoc()) });
									}
									tongTien=tongTien.add(t2);

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
									BigDecimal t=BigDecimal.valueOf(0.3d);
									BigDecimal t1=pdb.getTienCoc();
									BigDecimal t2;
									if(pdb.getTrangThai().equals(suDungNgay)) {
										t2=t1.divide(t);
										tableModel.addRow(new Object[] { i, hd.getMaHoaDon(), hd.getNgayXuatHoaDon(),
												df.format(t2) });
										
									}else if(pdb.getTrangThai().equals(muaVe)) {
										t2=t1.divide(t);
										tableModel.addRow(new Object[] { i, hd.getMaHoaDon(), hd.getNgayXuatHoaDon(),
												df.format(t2) });
										
									}else {
										t2=(t1.divide(t)).subtract(t1);
										tableModel.addRow(new Object[] { i, hd.getMaHoaDon(), hd.getNgayXuatHoaDon(),
												df.format(pdb.getTienCoc()) });
									}
									tongTien=tongTien.add(t2);

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
		}

	}
}
