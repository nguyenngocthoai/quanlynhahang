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
import com.iuh.quanlynhahang.entities.KhachHang;

public class KhachHangUI extends JFrame implements ActionListener, MouseListener {

	private static final long serialVersionUID = 1L;

	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KhachHangUI frame = new KhachHangUI();
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
	private JTable tableKhachHang;
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
	private JTextField txtDiaChi;
	private JTextField txtSDT;
	private JTextField txtTimSDT;
	private JTextField txtMaKH;
	private JRadioButton rdbNam;
	private JRadioButton rdbNu;
	private JButton btnLamMoi;
	private JPanel panel_2;
	private JButton btnThem;
	private JButton btnCapNhat;

	private JButton btnTim;
	private static KhachHangDAOImpl khachHangDAO = new KhachHangDAOImpl();
	private JButton btnLamMoiTable;

	String regexSDT = "^0[0-9]{9}$";

	public KhachHangUI() {
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

		String[] header = "STT;Mã Khách Hàng;Tên Khách Hàng;Số Điện Thoại;Giới Tính;Địa Chỉ;".split(";");
		tableModel = new DefaultTableModel(header, 0);
		scrollPane = new JScrollPane(tableKhachHang = new JTable(tableModel),
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		tableKhachHang.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		scrollPane.setViewportView(tableKhachHang);
		tableKhachHang.setBackground(Color.WHITE);

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

		lblThngTinKhch = new JLabel("Thông Tin Khách Hàng");
		lblThngTinKhch.setForeground(new Color(0, 0, 0));
		lblThngTinKhch.setFont(new Font("Times New Roman", Font.BOLD, 20));

		lblMKhchHng = new JLabel("Mã Khách Hàng");
		lblMKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblTnKhchHng = new JLabel("Tên Khách Hàng");
		lblTnKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblMKhchHng_2 = new JLabel("Địa Chỉ");
		lblMKhchHng_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblMKhchHng_3 = new JLabel("Giới Tính");
		lblMKhchHng_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblMKhchHng_1 = new JLabel("Số Điện Thoại");
		lblMKhchHng_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		txtTenKH = new JTextField();
		txtTenKH.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTenKH.setColumns(10);

		txtDiaChi = new JTextField();
		txtDiaChi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtDiaChi.setColumns(10);

		txtSDT = new JTextField();
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

		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Thao T\u00E1c",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));

		btnLamMoi = new JButton("Làm Mới");
		btnLamMoi.setIcon(new ImageIcon("images\\refresh.png"));
		btnLamMoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLamMoi.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		btnThem = new JButton("Thêm");
		btnThem.setIcon(new ImageIcon("images\\add.png"));
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThem.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		btnCapNhat = new JButton("Cập Nhật");
		btnCapNhat.setIcon(new ImageIcon("images\\edit.png"));
		btnCapNhat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCapNhat.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		btnLamMoiTable = new JButton("Làm Mới Table");
		btnLamMoiTable.setIcon(new ImageIcon("images\\refresh.png"));
		btnLamMoiTable.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		txtMaKH = new JTextField();
		txtMaKH.setEditable(false);
		txtMaKH.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtMaKH.setColumns(10);

		btnTim.addActionListener(this);
		btnCapNhat.addActionListener(this);
		btnThem.addActionListener(this);
		btnLamMoi.addActionListener(this);
		btnLamMoiTable.addActionListener(this);

		txtMaKH.setText(randomMaKHNotExisted());
		updateTable();
		tableKhachHang.addMouseListener(this);
		tableKhachHang.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(360)
					.addComponent(lblKhchHng, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
					.addGap(496))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 641, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 425, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblKhchHng, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 377, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
					.addGap(11))
		);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(19)
					.addComponent(lblNhpSin, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
					.addGap(22)
					.addComponent(txtTimSDT, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
					.addGap(22)
					.addComponent(btnTim, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnLamMoiTable, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(15)
					.addComponent(lblNhpSin, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(15)
					.addComponent(txtTimSDT, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(13)
					.addComponent(btnTim))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(13)
					.addComponent(btnLamMoiTable))
		);
		panel.setLayout(gl_panel);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(19)
					.addComponent(btnLamMoi, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
					.addGap(27)
					.addComponent(btnThem, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnCapNhat, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(13)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnLamMoi)
						.addComponent(btnThem)
						.addComponent(btnCapNhat)))
		);
		panel_2.setLayout(gl_panel_2);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(111)
					.addComponent(lblThngTinKhch, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addComponent(lblMKhchHng, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(txtMaKH, GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addComponent(lblTnKhchHng, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(txtTenKH, GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addComponent(lblMKhchHng_2, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
					.addGap(70)
					.addComponent(txtDiaChi, GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addComponent(lblMKhchHng_3, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
					.addGap(30)
					.addComponent(rdbNam, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(rdbNu, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addGap(137))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addComponent(lblMKhchHng_1, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
					.addGap(24)
					.addComponent(txtSDT, GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(9)
					.addComponent(lblThngTinKhch)
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMKhchHng, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtMaKH, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(38)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTnKhchHng, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTenKH, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMKhchHng_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtDiaChi, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(38)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMKhchHng_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(rdbNam, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(rdbNu, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
					.addGap(31)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMKhchHng_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtSDT, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
		);
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);
//		tableKhachHang.setRowSelectionAllowed(false);
//		tableKhachHang.setEnabled(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		/**
		 * add success validate not yet
		 * 
		 */
		if (obj.equals(btnThem)) {
			String maKH = txtMaKH.getText();
			String tenKH = txtTenKH.getText().trim();
			String sDT = txtSDT.getText().trim();
			String diaChi = txtDiaChi.getText().trim();
			String gioiTinh = null;
			if (rdbNam.isSelected()) {
				gioiTinh = "Nam";
			} else if (rdbNu.isSelected()) {
				gioiTinh = "Nữ";
			}

			boolean check = true;
			StringBuilder mesgError = new StringBuilder();
			if (tenKH.isEmpty()) {
				mesgError.append("Vui lòng nhập tên khách hàng!\n");
				check = false;
			}
			if (diaChi.isEmpty()) {
				mesgError.append("Vui lòng nhập địa chỉ!\n");
				check = false;
			}
			if (sDT.isEmpty()) {
				mesgError.append("Vui lòng nhập số điện thoại!\n");
				check = false;
			} else if (sDT.matches(regexSDT) == false) {
				mesgError.append("Số điện thoại không hợp lệ!\n");
				check = false;
			}

			if (check == false) {
				JOptionPane.showMessageDialog(this, mesgError, "Thông báo", JOptionPane.ERROR_MESSAGE,
						new ImageIcon("images\\warning.png"));

				txtSDT.selectAll();
				txtSDT.requestFocus();
			} else {
				try {
					KhachHang kh = new KhachHang(maKH, tenKH, gioiTinh, sDT, diaChi);
					khachHangDAO.createKH(kh);
					updateTable();
					refresh();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(this, "Thêm khách hàng lỗi!", "Thông báo", JOptionPane.ERROR_MESSAGE,
							new ImageIcon("images\\warning.png"));
				}

			}

		} else if (obj.equals(btnCapNhat)) {
			int row = tableKhachHang.getSelectedRow();
			if (row != -1) {
				String maKH = txtMaKH.getText();
				String tenKH = txtTenKH.getText().trim();
				String sDT = txtSDT.getText().trim();
				String diaChi = txtDiaChi.getText().trim();
				String gioiTinh = null;
				if (rdbNam.isSelected()) {
					gioiTinh = "Nam";
				} else if (rdbNu.isSelected()) {
					gioiTinh = "Nữ";
				}

				boolean check = true;
				StringBuilder mesgError = new StringBuilder();
				if (tenKH.isEmpty()) {
					mesgError.append("Vui lòng nhập tên khách hàng!\n");
					check = false;
				}
				if (diaChi.isEmpty()) {
					mesgError.append("Vui lòng nhập địa chỉ!\n");
					check = false;
				}
				if (sDT.isEmpty()) {
					mesgError.append("Vui lòng nhập số điện thoại!\n");
					check = false;
				} else if (sDT.matches(regexSDT) == false) {
					mesgError.append("Số điện thoại không hợp lệ!\n");
					check = false;
				}

				if (check == false) {
					JOptionPane.showMessageDialog(this, mesgError, "Thông báo", JOptionPane.ERROR_MESSAGE,
							new ImageIcon("images\\warning.png"));

					txtSDT.selectAll();
					txtSDT.requestFocus();
				} else {
					try {
						KhachHang kh = new KhachHang(maKH, tenKH, gioiTinh, sDT, diaChi);
						khachHangDAO.updateKH(kh);
						updateTable();
						refresh();
						JOptionPane.showMessageDialog(this, "Cập nhật thành công!", "Thông báo",
								JOptionPane.CLOSED_OPTION);
//						tableKhachHang.get
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(this, "Thêm khách hàng lỗi!", "Thông báo",
								JOptionPane.ERROR_MESSAGE, new ImageIcon("images\\warning.png"));
					}

				}
			} else {
				JOptionPane.showMessageDialog(this, "Vui lòng chọn khách hàng để cập nhật!", "Thông báo",
						JOptionPane.ERROR_MESSAGE, new ImageIcon("images\\warning.png"));
			}

		} else if (obj.equals(btnLamMoi)) {
			refresh();
			txtTenKH.requestFocus();
		} else if (obj.equals(btnTim)) {

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
					KhachHang kh = khachHangDAO.getKHBySDT(sDT);
					tableModel.getDataVector().removeAllElements();
					tableModel.addRow(new Object[] { 1, kh.getMaKhachHang(), kh.getTenKhachHang(), kh.getSoDienThoai(),
							kh.getGioiTinh(), kh.getDiaChi() });
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(this, "Số điện thoại không hợp lệ!", "Thông báo",
							JOptionPane.ERROR_MESSAGE, new ImageIcon("images\\warning.png"));
					txtTimSDT.selectAll();
					txtTimSDT.requestFocus();
				}
			}

		} else if (obj.equals(btnLamMoiTable)) {
			updateTable();
		}

	}

	@SuppressWarnings("static-access")
	public String randomMaKHNotExisted() {
		String maKH;
		List<String> idKHs = new ArrayList<String>();
		List<KhachHang> khachHangs = khachHangDAO.getAllKH();
		for (KhachHang kh : khachHangs) {
			idKHs.add(kh.getMaKhachHang());
		}

		do {
			RandomStringUtils randomStringUtils = new RandomStringUtils();
			maKH = randomStringUtils.randomNumeric(8);

		} while (idKHs.contains(maKH));
		return "KH" + maKH;
	}

	public void refresh() {
		txtDiaChi.setText("");
		txtSDT.setText("");
		txtTenKH.setText("");
		txtMaKH.setText(randomMaKHNotExisted());
	}

	public void updateTable() {
		tableModel.getDataVector().removeAllElements();
		try {
			List<KhachHang> khachHangs = khachHangDAO.getAllKH();
			int i = 0;
			for (KhachHang kh : khachHangs) {
				i++;
				tableModel.addRow(new Object[] { i, kh.getMaKhachHang(), kh.getTenKhachHang(), kh.getSoDienThoai(),
						kh.getGioiTinh(), kh.getDiaChi() });
			}
			tableKhachHang.setModel(tableModel);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void validateSDT() {

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int row = tableKhachHang.getSelectedRow();
		String maKH = tableModel.getValueAt(row, 1).toString();
		try {
			KhachHang kh = khachHangDAO.getKHByID(maKH);
			txtMaKH.setText(maKH);
			txtTenKH.setText(kh.getTenKhachHang());
			txtSDT.setText(kh.getSoDienThoai());
			txtDiaChi.setText(kh.getDiaChi());
			String gioiTinh = kh.getGioiTinh().toString().trim();
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
