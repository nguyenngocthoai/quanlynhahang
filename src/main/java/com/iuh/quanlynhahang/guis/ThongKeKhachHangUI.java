<<<<<<< HEAD
package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.iuh.quanlynhahang.daoimpls.HoaDonDAOImpl;
import com.iuh.quanlynhahang.daoimpls.KhachHangDAOImpl;
import com.iuh.quanlynhahang.entities.HoaDon;
import com.iuh.quanlynhahang.entities.KhachHang;

import javax.swing.JComboBox;
import javax.swing.JButton;

public class ThongKeKhachHangUI extends JFrame implements ActionListener {

	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongKeKhachHangUI frame = new ThongKeKhachHangUI();
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
	private JTable table;
	private DefaultTableModel tableModel;
	private JScrollPane jScrollPane;
	private JComboBox cbxThang, cbxNam;
	private JButton btnThongKe, btnBaoCao;
	private JLabel lblSoLuong;

	public ThongKeKhachHangUI() {
		setTitle("Thống Kê Khách Hàng");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblThngKMn = new JLabel("THỐNG KÊ KHÁCH HÀNG");
		lblThngKMn.setForeground(Color.RED);
		lblThngKMn.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblThngKMn.setBounds(415, 23, 312, 30);
		contentPane.add(lblThngKMn);

		cbxThang = new JComboBox();
		cbxThang.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		cbxThang.setBounds(312, 100, 188, 28);
		contentPane.add(cbxThang);

		cbxNam = new JComboBox();
		cbxNam.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		cbxNam.setBounds(569, 100, 188, 28);
		contentPane.add(cbxNam);

		JLabel lblNewLabel = new JLabel("Theo Tháng:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(207, 100, 95, 28);
		contentPane.add(lblNewLabel);

		JLabel lblNm = new JLabel("Năm:");
		lblNm.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNm.setBounds(509, 100, 51, 28);
		contentPane.add(lblNm);

		String[] header = "STT;Mã Hóa Đơn;Mã Khách Hàng; Tên Khách Hàng; Số Điện Thoại ; Ngày Đặt Món".split(";");
		tableModel = new DefaultTableModel(header, 0);
		JScrollPane scrollPane = new JScrollPane(table = new JTable(tableModel), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		contentPane.add(scrollPane);
		scrollPane.setBounds(10, 147, 1050, 294);

		btnThongKe = new JButton("Thống Kê");
		btnThongKe.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnThongKe.setBounds(806, 100, 95, 28);
		contentPane.add(btnThongKe);

		lblSoLuong = new JLabel("Số Lượng Khách Hàng Đặt Món :");
		lblSoLuong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSoLuong.setBounds(10, 463, 230, 28);
		contentPane.add(lblSoLuong);

		btnBaoCao = new JButton("Báo Cáo");
		btnBaoCao.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnBaoCao.setBounds(929, 100, 95, 28);
		contentPane.add(btnBaoCao);

		btnThongKe.addActionListener(this);
		btnBaoCao.addActionListener(this);
		loadCombobox();
		//table.addMouseListener(this);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int c = 0; c < table.getColumnCount(); c++) {
			Class<?> col_class = table.getColumnClass(c);
			table.setDefaultEditor(col_class, null); // remove editor
		}
		// updateTable();
	}

	private HoaDonDAOImpl hdDAO;
	private KhachHangDAOImpl khDAO;
	private static final String soluong = "Số Lượng Khách Hàng Đặt Món :";

	public void updateTable() {
		hdDAO = new HoaDonDAOImpl();
		khDAO = new KhachHangDAOImpl();
		int sl = 0;
		lblSoLuong.setText(soluong);
		// tableModel.getDataVector().removeAllElements();
		int rowCount = table.getRowCount();
		for (int i = rowCount; i > 0; i--) {
			tableModel.removeRow(i - 1);
		}
		try {

			int m = cbxThang.getSelectedIndex();

			System.out.println(m + 1);
			String y = cbxNam.getSelectedItem() + "";
			int year = Integer.parseInt(y);
			System.out.println(year);
			List<HoaDon> listHD = hdDAO.getAllHoaDon(m + 1, year);
			int i = 0;
			List<KhachHang> listKH = khDAO.getAllKH();
			for (HoaDon hd : listHD) {
				i++;
				try {

					tableModel.addRow(new Object[] { i, hd.getMaHoaDon(), hd.getKhachHang().getMaKhachHang(),
							hd.getKhachHang().getTenKhachHang(), hd.getKhachHang().getSoDienThoai(),
							hd.getNgayXuatHoaDon() });

				} catch (Exception e) {
					tableModel.addRow(
							new Object[] { i, hd.getMaHoaDon(), "Mua Về", "Mua Về", "Mua Về", hd.getNgayXuatHoaDon() });
				}

			}

			table.setModel(tableModel);
			sl = i;

			lblSoLuong.setText(soluong + sl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int namHoatDong = 2019;
	private Date date;

	public void loadCombobox() {
		for (int i = 1; i <= 12; i++) {
			cbxThang.addItem("Tháng " + i);
		}

		int year = LocalDate.now().getYear();
		for (int j = year; j >= namHoatDong; j--) {
			cbxNam.addItem(j);
		}
		System.out.println(year);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o.equals(btnThongKe)) {

			updateTable();
		}

	}

}
=======
package com.iuh.quanlynhahang.guis;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import com.iuh.quanlynhahang.daoimpls.HoaDonDAOImpl;
import com.iuh.quanlynhahang.daoimpls.KhachHangDAOImpl;
import com.iuh.quanlynhahang.daoimpls.MonDAOImpl;
import com.iuh.quanlynhahang.entities.KhachHang;
import javax.swing.ImageIcon;

public class ThongKeKhachHangUI extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	private JLabel lblTheoThng;
	private JLabel lblNm;
	private static MonDAOImpl monDAO = new MonDAOImpl();
	private static List<KhachHang> khachHangs = new ArrayList<KhachHang>();
	private static List<String> maKhachHangs = new ArrayList<String>();
	private static List<Long> soLanDats = new ArrayList<Long>();
	private static KhachHangDAOImpl khachHangDAO = new KhachHangDAOImpl();
	private static HoaDonDAOImpl hoaDonDAO = new HoaDonDAOImpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongKeKhachHangUI frame = new ThongKeKhachHangUI();
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
	private DefaultTableModel tableModel;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnThongKe;
	@SuppressWarnings("rawtypes")
	private JComboBox cbxThang, cbxNam;
	private JLabel lblThngKTheo;
	private JRadioButton rdbThang;
	private JRadioButton rdbNam;
	private JLabel lblThngKTheo_1;
	@SuppressWarnings("rawtypes")
	private JComboBox cboKH;
	private JButton btnBaoCao;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ThongKeKhachHangUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);

		JLabel lblThngKMn = new JLabel("THỐNG KÊ KHÁCH HÀNG");
		lblThngKMn.setForeground(Color.RED);
		lblThngKMn.setFont(new Font("Times New Roman", Font.BOLD, 25));

		String[] header = "STT;Mã Khách Hàng;Tên Khách Hàng;Số Lần Đặt;Số Điện Thoại;Giới Tính;Địa Chỉ;".split(";");
		tableModel = new DefaultTableModel(header, 0);
		scrollPane = new JScrollPane(table = new JTable(tableModel), ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		scrollPane.setViewportView(table);

		cbxThang = new JComboBox();
		cbxThang.setEnabled(false);
		cbxThang.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		cbxNam = new JComboBox();
		cbxNam.setEnabled(false);
		cbxNam.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		btnThongKe = new JButton("Thống Kê");
		btnThongKe.setIcon(new ImageIcon("images\\calculator.png"));
		btnThongKe.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblTheoThng = new JLabel("Tháng");
		lblTheoThng.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblNm = new JLabel("Năm");
		lblNm.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblThngKTheo = new JLabel("Thống kê theo");
		lblThngKTheo.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		rdbThang = new JRadioButton("Tháng");
		rdbThang.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		rdbNam = new JRadioButton("Năm");
		rdbNam.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblThngKTheo_1 = new JLabel("Thống kê theo top 10");
		lblThngKTheo_1.setForeground(Color.RED);
		lblThngKTheo_1.setFont(new Font("Times New Roman", Font.ITALIC, 15));

		JLabel lblKhchHng = new JLabel("Khách Hàng");
		lblKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		cboKH = new JComboBox();
		cboKH.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		btnBaoCao = new JButton("Báo Cáo");
		btnBaoCao.setIcon(new ImageIcon("images\\report.png"));
		btnBaoCao.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(
						23)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblNm, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addGap(220))
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblThngKTheo_1, GroupLayout.PREFERRED_SIZE, 178,
										GroupLayout.PREFERRED_SIZE)
								.addGap(100))
						.addGroup(gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
								.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblKhchHng, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblThngKTheo, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
								.addComponent(lblTheoThng, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
								.addGap(6)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(rdbThang, GroupLayout.PREFERRED_SIZE, 69,
														GroupLayout.PREFERRED_SIZE)
												.addGap(21)
												.addComponent(rdbNam, GroupLayout.PREFERRED_SIZE, 69,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
												.createParallelGroup(Alignment.TRAILING)
												.addComponent(cbxNam, Alignment.LEADING, 0, 145, Short.MAX_VALUE)
												.addComponent(cbxThang, Alignment.LEADING, 0, 145, Short.MAX_VALUE)
												.addComponent(cboKH, 0, 145, Short.MAX_VALUE)
												.addGroup(Alignment.LEADING,
														gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
																.addComponent(btnBaoCao, Alignment.LEADING,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(btnThongKe, Alignment.LEADING,
																		GroupLayout.DEFAULT_SIZE, 121,
																		Short.MAX_VALUE)))
												.addGap(14)))
								.addGap(18)))
				.addGap(18).addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE).addGap(30))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(410)
						.addComponent(lblThngKMn, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(324, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(20).addComponent(lblThngKMn).addGap(33)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
						.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblThngKTheo, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(4).addComponent(rdbThang,
										GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(4).addComponent(rdbNam,
										GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
						.addGap(36)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblKhchHng, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(cboKH, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGap(44)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(cbxThang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTheoThng, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGap(37)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNm, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(cbxNam, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(30).addComponent(btnThongKe, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnBaoCao, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
						.addComponent(lblThngKTheo_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addGap(22))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(4)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
								.addContainerGap()))));
		contentPane.setLayout(gl_contentPane);

		btnThongKe.addActionListener(this);
		cboKH.addActionListener(this);
		btnBaoCao.addActionListener(this);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbNam);
		buttonGroup.add(rdbThang);

		cboKH.addItem("Mua Nhiều Nhất");
		cboKH.addItem("Mua Ít Nhất");
		TableColumnModel columnModel = table.getColumnModel();
		table.setDefaultEditor(Object.class, null);
		table.setRowHeight(30);
		columnModel.getColumn(0).setPreferredWidth(50);// stt
		columnModel.getColumn(1).setPreferredWidth(100);// ma
		columnModel.getColumn(2).setPreferredWidth(200);// tec
		columnModel.getColumn(3).setPreferredWidth(70);
		columnModel.getColumn(4).setPreferredWidth(100);// sdt
		columnModel.getColumn(5).setPreferredWidth(70);// gt
		columnModel.getColumn(6).setPreferredWidth(250);// dc
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		loadComboboxNam();
		for (int i = 1; i <= 12; i++) {
			cbxThang.addItem(i + "");
		}

		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int c = 0; c < table.getColumnCount(); c++) {
			Class<?> col_class = table.getColumnClass(c);
			table.setDefaultEditor(col_class, null); // remove editor
		}
		rdbNam.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cbxNam.setEnabled(true);
				cbxThang.setEnabled(false);
			}
		});
		rdbThang.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cbxNam.setEnabled(true);
				cbxThang.setEnabled(true);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o.equals(btnThongKe)) {
			thongKeKhachHang();
			updateTable();
		} else if (o.equals(btnBaoCao)) {
			/**
			 * handle for btnBaoCao here
			 */
		}

	}

	private void thongKeKhachHang() {
		try {
			String loai = cboKH.getSelectedItem().toString().trim();
			String thang = cbxThang.getSelectedItem().toString().trim();
			String nam = cbxNam.getSelectedItem().toString().trim();
			if (rdbThang.isSelected()) {
				if (loai.equalsIgnoreCase("Mua Nhiều Nhất")) {
					maKhachHangs = hoaDonDAO.ThongKeKhachHangNhieuNhatTrongThang(Integer.parseInt(thang),
							Integer.parseInt(nam));
					khachHangs = convertStringtoKhachHang(maKhachHangs);
					soLanDats = hoaDonDAO.ThongKeSoLanDatKhachHangNhieuNhatTrongThang(Integer.parseInt(thang),
							Integer.parseInt(nam));
				} else if (loai.equalsIgnoreCase("Mua Ít Nhất")) {
					maKhachHangs = hoaDonDAO.ThongKeKhachHangItNhatTrongThang(Integer.parseInt(thang),
							Integer.parseInt(nam));
					khachHangs = convertStringtoKhachHang(maKhachHangs);
					soLanDats = hoaDonDAO.ThongKeSoLanDatKhachHangItNhatTrongThang(Integer.parseInt(thang),
							Integer.parseInt(nam));
				}
			} else if (rdbNam.isSelected()) {
				if (loai.equalsIgnoreCase("Mua Nhiều Nhất")) {
					maKhachHangs = hoaDonDAO.ThongKeKhachHangNhieuNhatTrongNam(Integer.parseInt(nam));
					khachHangs = convertStringtoKhachHang(maKhachHangs);
					soLanDats = hoaDonDAO.ThongKeSoLanDatKhachHangNhieuNhatTrongNam(Integer.parseInt(nam));
				} else if (loai.equalsIgnoreCase("Mua Ít Nhất")) {
					maKhachHangs = hoaDonDAO.ThongKeKhachHangItNhatTrongNam(Integer.parseInt(nam));
					khachHangs = convertStringtoKhachHang(maKhachHangs);
					soLanDats = hoaDonDAO.ThongKeSoLanDatKhachHangItNhatTrongNam(Integer.parseInt(nam));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private List<KhachHang> convertStringtoKhachHang(List<String> list) {
		List<KhachHang> khachHangs = new ArrayList<KhachHang>();
		try {
			for (String str : list) {
				KhachHang khachHang = khachHangDAO.getKHByID(str);
				khachHangs.add(khachHang);
			}
		} catch (Exception e) {
		}
		return khachHangs;
	}

	public void updateTable() {
		tableModel = (DefaultTableModel) table.getModel();
		tableModel.getDataVector().removeAllElements();
		try {
			int i = 0;
			for (KhachHang kh : khachHangs) {
				i++;
				tableModel.addRow(new Object[] { i, kh.getMaKhachHang(), kh.getTenKhachHang(),
						soLanDats.get(i - 1) + "", kh.getSoDienThoai(), kh.getGioiTinh(), kh.getDiaChi() });
			}
			table.setModel(tableModel);
			table.getSelectionModel().clearSelection();
			tableModel.fireTableDataChanged();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public void loadComboboxNam() {

		List<Integer> list = monDAO.getAllNamsInHoaDon();
		Set<Integer> set = new HashSet<Integer>();
		set.addAll(list);
		for (Integer i : set) {
			cbxNam.addItem(i + "");
		}

	}
}
>>>>>>> master
