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
