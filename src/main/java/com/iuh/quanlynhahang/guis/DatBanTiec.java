package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import net.sourceforge.jdatepicker.JDatePicker;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.List;
import java.awt.Button;
import java.awt.Label;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Month;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.ScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpringLayout;
import java.awt.Component;
import javax.swing.ScrollPaneConstants;
import javax.swing.ImageIcon;

public class DatBanTiec extends JFrame implements ActionListener{

	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatBanTiec frame = new DatBanTiec();
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
	private JTabbedPane tabbedPane;
	private JPanel panel_SanhA, panel_SanhB, panel_SanhC;
	private JComponent panel1;
	private Button btnBan1;
	private JLabel lblChnNgy;
	private JLabel lblNhpGi;
	private JLabel lblPht;
	private JPanel panel;
	private JLabel lblThngTinBn;
	private JLabel lblMBn;
	private JLabel lblChnNgy_2;
	private JLabel lblChnNgy_3;
	private JPanel panel_2;
	private JComboBox cbxSanh;
	private JLabel lblChnSnh;
	private JButton btnTimKiemBanTrong;
	private JPanel panel_3;
	private JScrollPane scrollPaneDatMon;
	private SpringLayout sl_txtNgaySuDung;
	private JButton btnDatBanTiec;

	public DatBanTiec() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "\u0110\u1EB7t B\u00E0n Ti\u1EC7c",
				TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));

		LocalDate date = LocalDate.now();
		int year = date.getYear();
		Month month = date.getMonth();
		int m = month.getValue();
		int day = date.getDayOfMonth();

		UtilDateModel model = new UtilDateModel();
		model.setDate(year, m, day);
		model.setSelected(true);
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		JDatePickerImpl txtNgaySuDung = new JDatePickerImpl(datePanel);
		txtNgaySuDung.getJFormattedTextField().setFont(new Font("Times New Roman", Font.PLAIN, 16));

		sl_txtNgaySuDung = (SpringLayout) txtNgaySuDung.getLayout();
		{
			lblChnNgy = new JLabel("Ngày Sử Dụng");
			lblChnNgy.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		}
		{
			lblNhpGi = new JLabel("Giờ");
			lblNhpGi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		}
		{
			lblPht = new JLabel("Phút");
			lblPht.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		}

		JButton btnLamMoi = new JButton("Làm Mới");
		btnLamMoi.setIcon(new ImageIcon("images\\refresh.png"));
		btnLamMoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLamMoi.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		 btnDatBanTiec = new JButton("Đặt Bàn Tiệc");
		 btnDatBanTiec.setIcon(new ImageIcon("images\\accept.png"));
		btnDatBanTiec.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnDatBanTiec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		{
			panel = new JPanel();
			panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
			{
				lblThngTinBn = new JLabel("Thông Tin Bàn Tiệc");
				lblThngTinBn.setFont(new Font("Times New Roman", Font.BOLD, 16));
			}
			{
				lblMBn = new JLabel("Mã Bàn");
				lblMBn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			}
			{
				lblChnNgy_2 = new JLabel("Thuộc Sảnh");
				lblChnNgy_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			}
			{
				lblChnNgy_3 = new JLabel("Trạng Thái");
				lblChnNgy_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			}
		}
		{
			panel_2 = new JPanel();
			panel_2.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)),
					"T\u00ECm Ki\u1EBFm B\u00E0n Ti\u1EC7c Nhanh", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			{
				cbxSanh = new JComboBox();
				cbxSanh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			}
			{
				lblChnSnh = new JLabel("Chọn Sảnh");
				lblChnSnh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			}
			{
				btnTimKiemBanTrong = new JButton("Tìm Kiếm Bàn Trống");
				btnTimKiemBanTrong.setIcon(new ImageIcon("images\\search.png"));
				btnTimKiemBanTrong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			}
		}
		{
			panel_3 = new JPanel();
			panel_3.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Ch\u1ECDn M\u00F3n \u0102n",
					TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
			{

				JTable tableDatMon;
				String[] header = "Tên Món Ăn; Số Lượng".split(";");
				DefaultTableModel tableModel = new DefaultTableModel(header, 0);
				scrollPaneDatMon = new JScrollPane(tableDatMon = new JTable(tableModel), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
						ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
			}
		}
		
		txtMaBan = new JTextField();
		txtMaBan.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtMaBan.setEditable(false);
		txtMaBan.setColumns(10);
		
		txtThuocSanh = new JTextField();
		txtThuocSanh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtThuocSanh.setEditable(false);
		txtThuocSanh.setColumns(10);
		
		txtTrangThai = new JTextField();
		txtTrangThai.setEditable(false);
		txtTrangThai.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addComponent(lblMBn, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtMaBan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblChnNgy_2, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtThuocSanh, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblChnNgy_3, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addGap(9))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(209)
							.addComponent(lblThngTinBn, GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtTrangThai, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(9)
					.addComponent(lblThngTinBn, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMBn, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtMaBan, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTrangThai, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblChnNgy_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtThuocSanh, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblChnNgy_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(26))
		);
		panel.setLayout(gl_panel);
		
		JTable tableMonAn;
		String[] header = "Tên Món Ăn".split(";");
		DefaultTableModel tableModel = new DefaultTableModel(header, 0);
//		scrollPane = new JScrollPane(table = new JTable(tableModel), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
//				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		scrollPaneMonAn = new JScrollPane(tableMonAn = new JTable(tableModel), ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		JComboBox cbxGio = new JComboBox();
		cbxGio.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JComboBox cbxPhut = new JComboBox();
		cbxPhut.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JLabel lbltBnTic = new JLabel("ĐẶT BÀN TIỆC");
		lbltBnTic.setForeground(Color.RED);
		lbltBnTic.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Th\u00F4ng tin kh\u00E1ch h\u00E0ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblMKh = new JLabel("Mã KH");
		lblMKh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		txtMaKH = new JTextField();
		txtMaKH.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtMaKH.setEditable(false);
		txtMaKH.setColumns(10);
		
		JLabel lblTnKh = new JLabel("Tên KH");
		lblTnKh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		txtTenKH = new JTextField();
		txtTenKH.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTenKH.setEditable(false);
		txtTenKH.setColumns(10);
		lblNhpSdtKh = new JLabel("Nhập SDT KH");
		lblNhpSdtKh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTimSDT = new JTextField();
		txtTimSDT.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTimSDT.setColumns(10);
		btnTimKH = new JButton("Tìm");
		btnTimKH.setIcon(new ImageIcon("images\\search.png"));
		btnTimKH.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(lblMKh)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtMaKH, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
							.addGap(32)
							.addComponent(lblTnKh, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtTenKH, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(lblNhpSdtKh)
							.addGap(18)
							.addComponent(txtTimSDT, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(btnTimKH, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
							.addGap(27)))
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMKh, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtMaKH, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTnKh, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTenKH, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNhpSdtKh, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTimSDT, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnTimKH, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
							.addGap(10))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 448, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(14)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)))
					.addGap(4))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(402)
					.addComponent(lbltBnTic)
					.addContainerGap(479, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lbltBnTic)
					.addGap(8)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(27)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 233, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(8))
		);
		btnThem = new JButton("Thêm");
		btnThem.setIcon(new ImageIcon("images\\add.png"));
		btnThem.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnXoa = new JButton("Xóa");
		btnXoa.setIcon(new ImageIcon("images\\delete.png"));
		btnXoa.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPaneMonAn, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(btnXoa, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnThem, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(18)
					.addComponent(scrollPaneDatMon, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPaneMonAn, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(42)
							.addComponent(btnThem, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnXoa, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(7)
							.addComponent(scrollPaneDatMon, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
					.addGap(7))
		);
		panel_3.setLayout(gl_panel_3);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(lblChnSnh)
					.addGap(10)
					.addComponent(cbxSanh, 0, 129, Short.MAX_VALUE)
					.addGap(39)
					.addComponent(btnTimKiemBanTrong, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
					.addGap(25))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblChnSnh, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGap(3)
									.addComponent(cbxSanh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap(12, Short.MAX_VALUE)
							.addComponent(btnTimKiemBanTrong, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(11)
					.addComponent(lblChnNgy)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(txtNgaySuDung, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
							.addGap(25)
							.addComponent(lblNhpGi, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cbxGio, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
							.addComponent(lblPht, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(cbxPhut, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnDatBanTiec)
							.addGap(18)
							.addComponent(btnLamMoi)))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(12)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(txtNgaySuDung, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblChnNgy, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(cbxGio, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNhpGi)
							.addComponent(cbxPhut, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblPht)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnDatBanTiec, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLamMoi))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);

		btnDatBanTiec.addActionListener(this);
		
		SanhA();
		SanhB();
		SanhC();
		
	}

	public void SanhA() {
		panel_SanhA = new JPanel();
		panel_SanhA.setBorder(new LineBorder(Color.LIGHT_GRAY));
		tabbedPane.addTab("Sảnh A", null, panel_SanhA, "Sảnh A");
		GroupLayout gl_panel_SanhA = new GroupLayout(panel_SanhA);
		gl_panel_SanhA.setHorizontalGroup(
			gl_panel_SanhA.createParallelGroup(Alignment.LEADING)
				.addGap(0, 484, Short.MAX_VALUE)
		);
		gl_panel_SanhA.setVerticalGroup(
			gl_panel_SanhA.createParallelGroup(Alignment.LEADING)
				.addGap(0, 352, Short.MAX_VALUE)
		);
		panel_SanhA.setLayout(gl_panel_SanhA);

		String[] ban = { "1", "2", "3" };
	}

	public void SanhB() {
		panel_SanhB = new JPanel();
		panel_SanhB.setBorder(new LineBorder(Color.LIGHT_GRAY));
		tabbedPane.addTab("Sảnh B", null, panel_SanhB, "Sảnh B");
		{
			btnBan1 = new Button("Bàn 1");
			btnBan1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			btnBan1.setBackground(Color.LIGHT_GRAY);
			
			btnBan1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
		}
	}

	public void SanhC() {
		
		
		
		panel_SanhC = new JPanel();
		panel_SanhC.setBorder(new LineBorder(Color.LIGHT_GRAY));
		tabbedPane.addTab("Sảnh C", null, panel_SanhC, "Sảnh C");
		panel_SanhC.setLayout(null);
		
		GroupLayout gl_panel_SanhB = new GroupLayout(panel_SanhB);
		gl_panel_SanhB.setHorizontalGroup(
			gl_panel_SanhB.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_SanhB.createSequentialGroup()
					.addGap(19)
					.addComponent(btnBan1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_SanhB.setVerticalGroup(
			gl_panel_SanhB.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_SanhB.createSequentialGroup()
					.addGap(9)
					.addComponent(btnBan1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
		);
		panel_SanhB.setLayout(gl_panel_SanhB);
	}

	private DanhSachKhachHangUI khUI=new DanhSachKhachHangUI();
	private JTextField txtMaBan;
	private JTextField txtThuocSanh;
	private JTextField txtTrangThai;
	private JScrollPane scrollPaneMonAn;
	private JButton btnThem;
	private JButton btnXoa;
	private JTextField txtMaKH;
	private JTextField txtTenKH;
	private JLabel lblNhpSdtKh;
	private JTextField txtTimSDT;
	private JButton btnTimKH;
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj.equals(btnDatBanTiec)) {
			
			khUI.setVisible(true);
		}
		
	}
}
