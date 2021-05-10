package com.iuh.quanlynhahang.guis;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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

import com.iuh.quanlynhahang.daoimpls.LoaiMonDAOImpl;
import com.iuh.quanlynhahang.daoimpls.MonDAOImpl;
import com.iuh.quanlynhahang.entities.KhachHang;
import com.iuh.quanlynhahang.entities.LoaiMon;
import com.iuh.quanlynhahang.entities.Mon;

public class MonUI extends JFrame implements ActionListener, MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4306434632363466260L;
	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MonUI frame = new MonUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JScrollPane scrollPane;
	private DefaultTableModel tableModel;
	private JTable tableMonAn;
	private JPanel panel;
	private JButton btnTimKiem;
	private JLabel lblNhpTnNgi;
	private JPanel panel_1;
	private JLabel lblThngTinTi;
	private JLabel lblMTiKhon;
	private JLabel lblTnTiKhon;
	private JLabel lblMKhchHng;
	private JButton btnLamMoi;
	private JButton btnThem;
	private JButton btnXoa;
	private JButton btnCapNhat;
	private JTextField txtTimMonAn;
	private JTextField txtMaMon;
	private JButton btnLamMoiDuLieu;
	private JLabel lblTrngThit;
	private JTextField txtTenMon;
	private JTextField txtGiaTien;
	@SuppressWarnings("rawtypes")
	private JComboBox cbxLoaiMon;
	private static final String PRICE_PATTERN = "^[0-9]*$";

	private static LoaiMonDAOImpl loaiMonDAO = new LoaiMonDAOImpl();
	private static MonDAOImpl monDAO = new MonDAOImpl();

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public MonUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblTiKhon = new JLabel("MÓN ĂN");
		lblTiKhon.setForeground(Color.RED);
		lblTiKhon.setFont(new Font("Times New Roman", Font.BOLD, 25));

		String[] header = "STT;Mã Món;Tên Món;Loại Món;Giá Tiền".split(";");
		tableModel = new DefaultTableModel(header, 0);
		scrollPane = new JScrollPane(tableMonAn = new JTable(tableModel), ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		tableMonAn.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "T\u00ECm M\u00F3n \u0102n",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		btnTimKiem = new JButton("Tìm");
		btnTimKiem.setIcon(new ImageIcon("images\\search.png"));
		btnTimKiem.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblNhpTnNgi = new JLabel("Nhập Tên Món");
		lblNhpTnNgi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));

		lblThngTinTi = new JLabel("Thông TinMón Ăn");
		lblThngTinTi.setForeground(Color.BLACK);
		lblThngTinTi.setFont(new Font("Times New Roman", Font.BOLD, 18));

		lblMTiKhon = new JLabel("Mã Món");
		lblMTiKhon.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblTnTiKhon = new JLabel("Tên Món");
		lblTnTiKhon.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblMKhchHng = new JLabel("Loại Món");
		lblMKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING,
								gl_contentPane.createSequentialGroup().addGap(440).addComponent(lblTiKhon,
										GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE).addGap(12)))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE).addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap().addComponent(lblTiKhon).addGap(23)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
				.addGap(4)));

		txtTimMonAn = new JTextField();
		txtTimMonAn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTimMonAn.setColumns(10);

		btnLamMoiDuLieu = new JButton("Làm Mới Dữ Liệu");
		btnLamMoiDuLieu.setIcon(new ImageIcon("images\\refresh.png"));
		btnLamMoiDuLieu.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(5).addComponent(lblNhpTnNgi)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(txtTimMonAn, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnTimKiem, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnLamMoiDuLieu, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
						.addContainerGap()));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap(17, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNhpTnNgi, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTimMonAn, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnTimKiem, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLamMoiDuLieu, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGap(19)));
		panel.setLayout(gl_panel);

		txtMaMon = new JTextField();
		txtMaMon.setEditable(false);
		txtMaMon.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtMaMon.setColumns(10);

		btnThem = new JButton("Thêm");
		btnThem.setIcon(new ImageIcon("images\\add.png"));
		btnThem.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		btnXoa = new JButton("Xóa");
		btnXoa.setIcon(new ImageIcon("images\\delete.png"));
		btnXoa.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		btnCapNhat = new JButton("Cập Nhật");
		btnCapNhat.setIcon(new ImageIcon("images\\edit.png"));
		btnCapNhat.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		btnLamMoi = new JButton("Làm Mới");
		btnLamMoi.setIcon(new ImageIcon("images\\refresh.png"));
		btnLamMoi.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblTrngThit = new JLabel("Giá Tiền");
		lblTrngThit.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		txtTenMon = new JTextField();
		txtTenMon.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTenMon.setColumns(10);

		cbxLoaiMon = new JComboBox();
		cbxLoaiMon.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		txtGiaTien = new JTextField();
		txtGiaTien.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtGiaTien.setColumns(10);

		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1
				.setHorizontalGroup(
						gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(
										gl_panel_1.createSequentialGroup()
												.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
																.addComponent(lblTrngThit, GroupLayout.PREFERRED_SIZE,
																		73, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(
																		txtGiaTien, GroupLayout.DEFAULT_SIZE, 312,
																		Short.MAX_VALUE)
																.addPreferredGap(ComponentPlacement.RELATED))
														.addGroup(gl_panel_1.createSequentialGroup().addGroup(gl_panel_1
																.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_panel_1.createSequentialGroup().addGap(9)
																		.addGroup(gl_panel_1
																				.createParallelGroup(Alignment.LEADING,
																						false)
																				.addGroup(gl_panel_1
																						.createSequentialGroup()
																						.addPreferredGap(
																								ComponentPlacement.RELATED)
																						.addComponent(lblTnTiKhon,
																								GroupLayout.PREFERRED_SIZE,
																								65,
																								GroupLayout.PREFERRED_SIZE))
																				.addComponent(lblMTiKhon,
																						GroupLayout.PREFERRED_SIZE, 65,
																						GroupLayout.PREFERRED_SIZE)))
																.addGroup(
																		gl_panel_1
																				.createSequentialGroup()
																				.addContainerGap()
																				.addComponent(lblMKhchHng)))
																.addGap(18)
																.addGroup(gl_panel_1
																		.createParallelGroup(Alignment.TRAILING)
																		.addGroup(Alignment.LEADING, gl_panel_1
																				.createSequentialGroup()
																				.addPreferredGap(
																						ComponentPlacement.UNRELATED)
																				.addGroup(gl_panel_1
																						.createParallelGroup(
																								Alignment.TRAILING,
																								false)
																						.addGroup(gl_panel_1
																								.createSequentialGroup()
																								.addGroup(gl_panel_1
																										.createParallelGroup(
																												Alignment.TRAILING,
																												false)
																										.addComponent(
																												btnCapNhat,
																												GroupLayout.PREFERRED_SIZE,
																												154,
																												GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												btnThem,
																												Alignment.LEADING,
																												GroupLayout.PREFERRED_SIZE,
																												154,
																												GroupLayout.PREFERRED_SIZE))
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addGroup(gl_panel_1
																										.createParallelGroup(
																												Alignment.LEADING,
																												false)
																										.addComponent(
																												btnLamMoi,
																												GroupLayout.PREFERRED_SIZE,
																												153,
																												GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												btnXoa,
																												GroupLayout.PREFERRED_SIZE,
																												153,
																												GroupLayout.PREFERRED_SIZE)))
																						.addComponent(
																								lblThngTinTi,
																								Alignment.LEADING,
																								GroupLayout.PREFERRED_SIZE,
																								147,
																								GroupLayout.PREFERRED_SIZE)))
																		.addComponent(cbxLoaiMon, Alignment.LEADING, 0,
																				313, Short.MAX_VALUE)
																		.addGroup(gl_panel_1.createSequentialGroup()
																				.addGap(1)
																				.addGroup(gl_panel_1
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(txtTenMon,
																								GroupLayout.DEFAULT_SIZE,
																								312, Short.MAX_VALUE)
																						.addComponent(txtMaMon,
																								GroupLayout.DEFAULT_SIZE,
																								312,
																								Short.MAX_VALUE))))))
												.addGap(44)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap().addComponent(lblThngTinTi).addGap(31)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMTiKhon, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtMaMon, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(txtTenMon, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTnTiKhon, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGap(29)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(cbxLoaiMon, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMKhchHng, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGap(23)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblTrngThit, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtGiaTien, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addGap(28)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnThem, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnXoa, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnCapNhat, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnLamMoi, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);
		cbxLoaiMon.addActionListener(this);
		btnTimKiem.addActionListener(this);
		btnCapNhat.addActionListener(this);
		btnThem.addActionListener(this);
		btnLamMoiDuLieu.addActionListener(this);
		btnLamMoi.addActionListener(this);
		btnXoa.addActionListener(this);

		tableMonAn.addMouseListener(this);
		tableMonAn.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int c = 0; c < tableMonAn.getColumnCount(); c++) {
			Class<?> col_class = tableMonAn.getColumnClass(c);
			tableMonAn.setDefaultEditor(col_class, null); // remove editor
		}

		List<LoaiMon> loaiMons = loaiMonDAO.getAllLoaiMon();
		for (LoaiMon loaiMon : loaiMons) {
			cbxLoaiMon.addItem(loaiMon.getTenLoaiMon());
		}

		updateTable();
		txtMaMon.setText(randomMaMonNotExisted());

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int row = tableMonAn.getSelectedRow();
		String maMon = tableModel.getValueAt(row, 1).toString();
		try {
			Mon mon = monDAO.getMonByMa(maMon);
			txtMaMon.setText(mon.getMaMon());
			txtTenMon.setText(mon.getTenMon());
			txtGiaTien.setText(mon.getGiaTien().toString());
			cbxLoaiMon.setSelectedItem(mon.getLoaiMon().getTenLoaiMon());
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

	@SuppressWarnings("unchecked")
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj.equals(btnThem)) {
			String maMon = txtMaMon.getText().trim();
			String tenMon = txtTenMon.getText().trim();
			String tenLoaiMon = cbxLoaiMon.getSelectedItem().toString();
			String giaTien = txtGiaTien.getText().trim();
			StringBuilder msg = new StringBuilder();
			boolean check = true;
			if (tenMon.isEmpty()) {
				msg.append("Vui lòng nhập tên món!\n");
				check = false;
			}
			if (giaTien.isEmpty()) {
				msg.append("Vui lòng nhập giá tiền!\n");
				check = false;
			} else if (giaTien.matches(PRICE_PATTERN) == false) {
				msg.append("Giá tiền không hợp lệ!\n");
				check = false;
			}

			if (check == false) {
				JOptionPane.showMessageDialog(this, msg, "Thông báo", JOptionPane.ERROR_MESSAGE,
						new ImageIcon("images\\warning.png"));
			} else {
				boolean checkIdExisted = checkExistedId();
				if (checkIdExisted == false) {
					JOptionPane.showMessageDialog(this, "Mã món đã tồn tại. Vui lòng làm mới dữ liệu nhập!",
							"Thông báo", JOptionPane.ERROR_MESSAGE, new ImageIcon("images\\warning.png"));
				} else {
					BigDecimal giaTienBD = new BigDecimal(giaTien);
					LoaiMon loaiMon = loaiMonDAO.getLoaiMonByTenLoai(tenLoaiMon);
					Mon mon = new Mon(maMon, tenMon, loaiMon, giaTienBD);
					monDAO.createMon(mon);
					JOptionPane.showMessageDialog(this, "Thêm món thành công!", "Thông báo", JOptionPane.CLOSED_OPTION,
							new ImageIcon("images\\yes.png"));
					updateTable();
					refresh();
				}

			}
		} else if (obj.equals(btnLamMoi)) {
			cbxLoaiMon.removeAllItems();
			List<LoaiMon> loaiMons = loaiMonDAO.getAllLoaiMon();
			for (LoaiMon loaiMon : loaiMons) {
				cbxLoaiMon.addItem(loaiMon.getTenLoaiMon());
			}
			refresh();
		} else if (obj.equals(btnXoa)) {
			int row = tableMonAn.getSelectedRow();
			if (row != -1) {
				String maMon = txtMaMon.getText();
				try {
					Mon mon = monDAO.getMonByMa(maMon);
					boolean check = monDAO.deleteMon(mon);
					if (check) {
						JOptionPane.showMessageDialog(this, "Xóa món thành công!", "Thông báo",
								JOptionPane.CLOSED_OPTION, new ImageIcon("images\\yes.png"));
						updateTable();
						refresh();
					} else {
						JOptionPane.showMessageDialog(this, "Xóa bàn thất bại!", "Thông báo", JOptionPane.ERROR_MESSAGE,
								new ImageIcon("images\\warning.png"));
					}
				} catch (Exception e2) {
					e2.printStackTrace();
					JOptionPane.showMessageDialog(this, "Lỗi. Vui lòng thử lại!", "Thông báo",
							JOptionPane.ERROR_MESSAGE, new ImageIcon("images\\warning.png"));
				}
			} else {
				JOptionPane.showMessageDialog(this, "Vui lòng chọn món để xóa!", "Thông báo", JOptionPane.ERROR_MESSAGE,
						new ImageIcon("images\\warning.png"));
			}
		} else if (obj.equals(btnCapNhat)) {
			int row = tableMonAn.getSelectedRow();
			if (row != -1) {
				String maMon = txtMaMon.getText().trim();
				String tenMon = txtTenMon.getText().trim();
				String tenLoaiMon = cbxLoaiMon.getSelectedItem().toString();
				String giaTien = txtGiaTien.getText().trim();
				StringBuilder msg = new StringBuilder();
				boolean check = true;
				if (tenMon.isEmpty()) {
					msg.append("Vui lòng nhập tên món!\n");
					check = false;
				}
				if (giaTien.isEmpty()) {
					msg.append("Vui lòng nhập giá tiền!\n");
					check = false;
				} else if (giaTien.matches(PRICE_PATTERN)) {
					msg.append("Giá tiền không hợp lệ!\n");
					check = false;
				}

				if (check == false) {
					JOptionPane.showMessageDialog(this, msg, "Thông báo", JOptionPane.ERROR_MESSAGE,
							new ImageIcon("images\\warning.png"));
				} else {

					BigDecimal giaTienBD = new BigDecimal(giaTien);
					Mon mon = monDAO.getMonByMa(maMon);
					LoaiMon loaiMon = loaiMonDAO.getLoaiMonByTenLoai(tenLoaiMon);
					mon.setTenMon(tenMon);
					mon.setLoaiMon(loaiMon);
					mon.setGiaTien(giaTienBD);
					monDAO.updateMon(mon);
					JOptionPane.showMessageDialog(this, "Cập nhật món thành công!", "Thông báo",
							JOptionPane.CLOSED_OPTION);
					updateTable();
					refresh();
				}

			}
		} else if (obj.equals(btnTimKiem)) {
			String tenMon = txtTimMonAn.getText();
			if (tenMon.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Vui lòng nhập tên món cần tìm!", "Thông báo",
						JOptionPane.ERROR_MESSAGE, new ImageIcon("images\\warning.png"));
				txtTimMonAn.requestFocus();
			} else {
				try {
					Mon mon = monDAO.getMonByTen(tenMon);
					tableModel.getDataVector().removeAllElements();
					tableModel.addRow(new Object[] { 1, mon.getMaMon(), mon.getTenMon(),
							mon.getLoaiMon().getTenLoaiMon(), mon.getGiaTien() });
					txtTimMonAn.selectAll();
					txtTimMonAn.requestFocus();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(this, "Không tồn tại món!", "Thông báo", JOptionPane.ERROR_MESSAGE,
							new ImageIcon("images\\warning.png"));
					txtTimMonAn.selectAll();
					txtTimMonAn.requestFocus();
				}
			}

		} else if (obj.equals(btnLamMoiDuLieu)) {
			updateTable();
		}
	}

	public void updateTable() {
		tableModel = (DefaultTableModel) tableMonAn.getModel();
		tableModel.getDataVector().removeAllElements();
		try {
			List<Mon> mons = monDAO.getAllMon();
			int i = 0;
			for (Mon mon : mons) {
				i++;
				tableModel.addRow(new Object[] { i, mon.getMaMon(), mon.getTenMon(), mon.getLoaiMon().getTenLoaiMon(),
						mon.getGiaTien() });
			}
			tableMonAn.setModel(tableModel);
			tableMonAn.getSelectionModel().clearSelection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("static-access")
	public String randomMaMonNotExisted() {
		String maMon;
		List<String> idMons = new ArrayList<String>();
		List<Mon> mons = monDAO.getAllMon();
		for (Mon mon : mons) {
			idMons.add(mon.getMaMon());
		}
		do {
			RandomStringUtils randomStringUtils = new RandomStringUtils();
			maMon = randomStringUtils.randomNumeric(8);

		} while (idMons.contains(maMon));
		return "M" + maMon;
	}

	private boolean checkExistedId() {
		List<String> ids = new ArrayList<String>();
		List<Mon> mons = monDAO.getAllMon();
		for (Mon mon : mons) {
			ids.add(mon.getMaMon());
		}
		if (ids.contains(txtMaMon.getText())) {
			return false;
		} else {
			return true;
		}
	}

	private void refresh() {
		txtMaMon.setText(randomMaMonNotExisted());
		txtGiaTien.setText("");
		txtTenMon.setText("");
	}
}
