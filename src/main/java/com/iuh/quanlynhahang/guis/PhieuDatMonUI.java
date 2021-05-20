package com.iuh.quanlynhahang.guis;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import org.apache.commons.lang3.RandomStringUtils;

import com.iuh.quanlynhahang.daoimpls.KhachHangDAOImpl;
import com.iuh.quanlynhahang.daoimpls.PhieuDatBanDAOImpl;
import com.iuh.quanlynhahang.entities.KhachHang;
import com.iuh.quanlynhahang.entities.PhieuDatBan;

public class PhieuDatMonUI extends JFrame implements ActionListener, MouseListener {

	private static final long serialVersionUID = 1L;

	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhieuDatMonUI frame = new PhieuDatMonUI();
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
	private JTable tablePhieuDat;
	private DefaultTableModel tableModel;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblThngTinKhch;
	private JLabel lblMKhchHng;
	private JLabel lblTnKhchHng;
	private JLabel lblMKhchHng_2;
	private JLabel lblMKhchHng_3;
	private JLabel lblMKhchHng_1;
	private JTextField txtTenKH;
	private JTextField txtNgaySD;
	private JTextField txtSDT;
	private JTextField txtTimSDT;
	private JTextField txtMaPD;
	private JRadioButton rdbNam;
	private JRadioButton rdbNu;
	private JButton btnTim;
	private JButton btnLamMoiTable;
	public static KhachHang khachHang;
//	public static DatBanTiec_ChonBan datBanTiec_ChonBan = new DatBanTiec_ChonBan();
//	private static KhachHangDAOImpl khachHangDAO = new KhachHangDAOImpl();
	private static PhieuDatBanDAOImpl phieuDatBanDAO = new PhieuDatBanDAOImpl();

	String regexSDT = "^0[0-9]{9}$";

	private JButton btnDatBanTiec;

	public PhieuDatMonUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		setSize(1100, 567);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);

		JLabel lblKhchHng = new JLabel("KHÁCH HÀNG");
		lblKhchHng.setForeground(Color.RED);
		lblKhchHng.setFont(new Font("Times New Roman", Font.BOLD, 25));

		String[] header = "STT;Mã Phiếu Đặt; Tên Khách Hàng;Số Điện Thoại;Giới Tính;Ngày Sử Dụng;".split(";");
		tableModel = new DefaultTableModel(header, 0);
		scrollPane = new JScrollPane(tablePhieuDat = new JTable(tableModel),
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		tablePhieuDat.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		scrollPane.setViewportView(tablePhieuDat);
		tablePhieuDat.setBackground(Color.WHITE);

		panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)),
				"T\u00ECm Ki\u1EBFm Kh\u00E1ch H\u00E0ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		btnTim = new JButton("Tìm");
		btnTim.setIcon(new ImageIcon("images\\search.png"));
		btnTim.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		JLabel lblNhpSin = new JLabel("Nhập Số Điện Thoại");
		lblNhpSin.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		txtTimSDT = new JTextField();
		txtTimSDT.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTimSDT.setColumns(10);

		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));

		lblThngTinKhch = new JLabel("Thông Tin Phiếu Đặt");
		lblThngTinKhch.setForeground(new Color(0, 0, 0));
		lblThngTinKhch.setFont(new Font("Times New Roman", Font.BOLD, 20));

		lblMKhchHng = new JLabel("Mã Phiếu Đặt");
		lblMKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblTnKhchHng = new JLabel("Tên Khách Hàng");
		lblTnKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblMKhchHng_2 = new JLabel("Ngày Sử Dụng");
		lblMKhchHng_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblMKhchHng_3 = new JLabel("Giới Tính");
		lblMKhchHng_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblMKhchHng_1 = new JLabel("Số Điện Thoại");
		lblMKhchHng_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		txtTenKH = new JTextField();
		txtTenKH.setEditable(false);
		txtTenKH.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTenKH.setColumns(10);

		txtNgaySD = new JTextField();
		txtNgaySD.setEditable(false);
		txtNgaySD.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtNgaySD.setColumns(10);

		txtSDT = new JTextField();
		txtSDT.setEditable(false);
		txtSDT.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtSDT.setColumns(10);

		rdbNam = new JRadioButton("Nam");
		rdbNam.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rdbNam.setSelected(true);

		rdbNu = new JRadioButton("Nữ");
		rdbNu.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbNam);
		buttonGroup.add(rdbNu);

		btnLamMoiTable = new JButton("Làm Mới Dữ Liệu");
		btnLamMoiTable.setIcon(new ImageIcon("images\\refresh.png"));
		btnLamMoiTable.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap().addComponent(lblNhpSin).addGap(27)
						.addComponent(txtTimSDT, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE).addGap(26)
						.addComponent(btnTim, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE).addGap(18)
						.addComponent(btnLamMoiTable, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
						.addContainerGap()));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(19)
						.addComponent(lblNhpSin, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(29, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtTimSDT, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTim, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnLamMoiTable, GroupLayout.PREFERRED_SIZE, 37,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap(37, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);

		txtMaPD = new JTextField();
		txtMaPD.setEditable(false);
		txtMaPD.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtMaPD.setColumns(10);

		btnDatBanTiec = new JButton("Cập Nhật");
		btnDatBanTiec.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel_1
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
								.addComponent(lblMKhchHng, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addGap(18).addComponent(txtMaPD, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
								.addContainerGap())
						.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(lblMKhchHng_3, GroupLayout.PREFERRED_SIZE, 101,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblMKhchHng_1, GroupLayout.PREFERRED_SIZE, 104,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18).addGroup(
										gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_1.createSequentialGroup()
														.addComponent(txtSDT, GroupLayout.DEFAULT_SIZE, 277,
																Short.MAX_VALUE)
														.addContainerGap())
												.addGroup(gl_panel_1.createSequentialGroup()
														.addComponent(rdbNam, GroupLayout.DEFAULT_SIZE, 62,
																Short.MAX_VALUE)
														.addGap(18)
														.addComponent(rdbNu, GroupLayout.DEFAULT_SIZE, 61,
																Short.MAX_VALUE)
														.addGap(146))))
						.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_1.createSequentialGroup()
												.addComponent(lblTnKhchHng, GroupLayout.PREFERRED_SIZE, 108,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18))
										.addGroup(gl_panel_1.createSequentialGroup().addGap(2)
												.addComponent(lblMKhchHng_2, GroupLayout.DEFAULT_SIZE, 120,
														Short.MAX_VALUE)
												.addPreferredGap(ComponentPlacement.RELATED)))
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(txtNgaySD, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
										.addComponent(txtTenKH, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
								.addContainerGap())
						.addGroup(Alignment.LEADING,
								gl_panel_1.createSequentialGroup().addGap(102)
										.addComponent(lblThngTinKhch, GroupLayout.PREFERRED_SIZE, 221,
												GroupLayout.PREFERRED_SIZE)
										.addGap(86))))
				.addGroup(gl_panel_1.createSequentialGroup().addGap(199)
						.addComponent(btnDatBanTiec, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(99, Short.MAX_VALUE)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addGap(9).addComponent(lblThngTinKhch).addGap(18)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE, false)
								.addComponent(lblMKhchHng, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtMaPD, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTnKhchHng, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtTenKH, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addGap(20)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMKhchHng_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNgaySD, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGap(20)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMKhchHng_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbNam, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbNu, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMKhchHng_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtSDT, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGap(93)
						.addComponent(btnDatBanTiec, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addGap(78)));
		panel_1.setLayout(gl_panel_1);

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(360).addComponent(lblKhchHng,
						GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(10).addComponent(panel,
										GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE))
								.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 647,
										Short.MAX_VALUE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
				.createSequentialGroup().addComponent(lblKhchHng).addGap(6)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 484, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)))
				.addGap(0)));
		contentPane.setLayout(gl_contentPane);

		btnTim.addActionListener(this);
		btnLamMoiTable.addActionListener(this);
		btnDatBanTiec.addActionListener(this);

		updateTable();

		tablePhieuDat.addMouseListener(this);
		tablePhieuDat.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int c = 0; c < tablePhieuDat.getColumnCount(); c++) {
			Class<?> col_class = tablePhieuDat.getColumnClass(c);
			tablePhieuDat.setDefaultEditor(col_class, null); // remove editor
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		if (obj.equals(btnTim)) {

			String sDT = txtTimSDT.getText().trim();
			if (sDT.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại!", "Thông báo",
						JOptionPane.ERROR_MESSAGE, new ImageIcon("images\\warning.png"));
				txtTimSDT.requestFocus();
			} else if (sDT.matches(regexSDT) == false) {
				JOptionPane.showMessageDialog(this, "Số điện thoại không hợp lệ!", "Thông báo",
						JOptionPane.ERROR_MESSAGE, new ImageIcon("images\\warning.png"));
				txtTimSDT.selectAll();
				txtTimSDT.requestFocus();
			} else {
				try {

					List<PhieuDatBan> pdbs = phieuDatBanDAO.getPhieuDatBansBySDT(sDT);
					tableModel.getDataVector().removeAllElements();
					int i = 0;
					for (PhieuDatBan pdb : pdbs) {
						i++;
						tableModel.addRow(new Object[] { i, pdb.getMaBanTiec(), pdb.getKhachHang().getTenKhachHang(),
								pdb.getKhachHang().getSoDienThoai(), pdb.getKhachHang().getGioiTinh(),
								pdb.getNgaySuDung() });
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(this, "Phiếu đặt không tồn tại!", "Thông báo",
							JOptionPane.ERROR_MESSAGE, new ImageIcon("images\\warning.png"));
					txtTimSDT.selectAll();
					txtTimSDT.requestFocus();
					e2.printStackTrace();
				}
			}

		} else if (obj.equals(btnLamMoiTable)) {
			updateTable();
		} else if (obj.equals(btnDatBanTiec)) {

//			int row = tablePhieuDat.getSelectedRow();
//			if (row != -1) {
//				KhachHang kh = khachHangDAO.getKHByID(txtMaKH.getText());
//				
//				khachHang = new KhachHang(kh.getMaKhachHang(), kh.getTenKhachHang(), kh.getGioiTinh(),
//						kh.getSoDienThoai(), kh.getDiaChi());
//				
//				TrangChu.tabbedPane.remove(TrangChu.tabbedPane.getSelectedComponent());
//				TrangChu.tabbedPane.addTab("Chọn Bàn", null,
//						TrangChu.tabbedPane.add(datBanTiec_ChonBan.getContentPane()), "Chọn Bàn");
//				System.out.println("KH TT:"+PhieuDatMonUI.khachHang.getTenKhachHang());
//			} else {
//				JOptionPane.showMessageDialog(this, "Vui lòng chọn khách hàng!", "Thông báo", JOptionPane.ERROR_MESSAGE,
//						new ImageIcon("images\\warning.png"));
//			}
		}

	}

	public void updateTable() {
		tableModel.getDataVector().removeAllElements();
		try {
			List<PhieuDatBan> phieuDatBans = phieuDatBanDAO.getAllPhieuDatBan();
			int i = 0;
			for (PhieuDatBan pdb : phieuDatBans) {
				if (pdb.getTrangThai().equalsIgnoreCase("Đặt Trước")
						|| pdb.getTrangThai().equalsIgnoreCase("Sử Dụng Ngay")) {
					i++;
					tableModel.addRow(new Object[] { i, pdb.getMaBanTiec(), pdb.getKhachHang().getTenKhachHang(),
							pdb.getKhachHang().getSoDienThoai(), pdb.getKhachHang().getGioiTinh(),
							pdb.getNgaySuDung() });
				}
			}
			tablePhieuDat.setModel(tableModel);
			tablePhieuDat.getSelectionModel().clearSelection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int row = tablePhieuDat.getSelectedRow();
		String maPD = tableModel.getValueAt(row, 1).toString();
		try {
			PhieuDatBan pdb = phieuDatBanDAO.getPhieuDatBanById(maPD);
			txtMaPD.setText(maPD);
			txtTenKH.setText(pdb.getKhachHang().getTenKhachHang());
			txtSDT.setText(pdb.getKhachHang().getSoDienThoai());
			txtNgaySD.setText(pdb.getNgaySuDung().toString());
			String gioiTinh = pdb.getKhachHang().getGioiTinh().toString().trim();
			if (gioiTinh.equalsIgnoreCase("Nam")) {
				rdbNam.setSelected(true);
				rdbNu.setSelected(false);
			} else {
				rdbNu.setSelected(true);
				rdbNam.setSelected(false);
			}
		} catch (Exception e2) {
			System.out.println("error mouse clicked");
			e2.printStackTrace();
		}

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
