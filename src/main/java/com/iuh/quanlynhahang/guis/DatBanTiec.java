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
import javax.swing.SwingConstants;

public class DatBanTiec extends JFrame implements ActionListener{

	public JPanel contentPane;
//	private static String maKH="";
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					DatBanTiec frame = new DatBanTiec(maKH);
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
	private JScrollPane scrollPaneDatMon;
	private SpringLayout sl_txtNgaySuDung;
	private JButton btnDatBanTiec;

	public DatBanTiec(String maKH) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(15, 53, 449, 448);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(478, 380, 583, 121);
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
		txtNgaySuDung.setBounds(111, 27, 217, 21);
		txtNgaySuDung.getJFormattedTextField().setFont(new Font("Times New Roman", Font.PLAIN, 16));

		sl_txtNgaySuDung = (SpringLayout) txtNgaySuDung.getLayout();
		{
			lblChnNgy = new JLabel("Ngày Sử Dụng");
			lblChnNgy.setBounds(16, 27, 91, 21);
			lblChnNgy.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		}
		{
			lblNhpGi = new JLabel("Giờ");
			lblNhpGi.setBounds(353, 28, 37, 20);
			lblNhpGi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		}
		{
			lblPht = new JLabel("Phút");
			lblPht.setBounds(464, 28, 37, 20);
			lblPht.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		}

		JButton btnLamMoi = new JButton("Làm Mới");
		btnLamMoi.setBounds(251, 80, 110, 29);
		btnLamMoi.setIcon(new ImageIcon("images\\refresh.png"));
		btnLamMoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLamMoi.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		 btnDatBanTiec = new JButton("Đặt Bàn Tiệc");
		 btnDatBanTiec.setBounds(111, 81, 130, 27);
		 btnDatBanTiec.setIcon(new ImageIcon("images\\accept.png"));
		btnDatBanTiec.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnDatBanTiec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		{
			panel = new JPanel();
			panel.setBounds(478, 77, 583, 145);
			panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
			{
				lblThngTinBn = new JLabel("Thông Tin Bàn Tiệc");
				lblThngTinBn.setBounds(210, 10, 245, 27);
				lblThngTinBn.setFont(new Font("Times New Roman", Font.BOLD, 16));
			}
			{
				lblMBn = new JLabel("Mã Bàn");
				lblMBn.setBounds(19, 44, 59, 29);
				lblMBn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			}
			{
				lblChnNgy_2 = new JLabel("Thuộc Sảnh");
				lblChnNgy_2.setBounds(208, 43, 83, 30);
				lblChnNgy_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			}
			{
				lblChnNgy_3 = new JLabel("Trạng Thái");
				lblChnNgy_3.setBounds(375, 43, 71, 30);
				lblChnNgy_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			}
		}
		{
			panel_2 = new JPanel();
			panel_2.setBounds(474, 255, 587, 96);
			panel_2.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)),
					"T\u00ECm Ki\u1EBFm B\u00E0n Ti\u1EC7c Nhanh", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			{
				cbxSanh = new JComboBox();
				cbxSanh.setBounds(103, 38, 198, 28);
				cbxSanh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			}
			{
				lblChnSnh = new JLabel("Chọn Sảnh");
				lblChnSnh.setBounds(10, 37, 67, 30);
				lblChnSnh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			}
			{
				btnTimKiemBanTrong = new JButton("Tìm Kiếm Bàn Trống");
				btnTimKiemBanTrong.setBounds(366, 37, 177, 30);
				btnTimKiemBanTrong.setIcon(new ImageIcon("images\\search.png"));
				btnTimKiemBanTrong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			}
		}
		{
			{

				
			}
		}
		
		txtMaBan = new JTextField();
		txtMaBan.setEditable(false);
		txtMaBan.setBounds(82, 46, 116, 23);
		txtMaBan.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtMaBan.setColumns(10);
		
		txtThuocSanh = new JTextField();
		txtThuocSanh.setBounds(295, 46, 70, 23);
		txtThuocSanh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtThuocSanh.setEditable(false);
		txtThuocSanh.setColumns(10);
		
		txtTrangThai = new JTextField();
		txtTrangThai.setBounds(459, 48, 114, 23);
		txtTrangThai.setEditable(false);
		txtTrangThai.setColumns(10);
		
		JTable tableMonAn;
		String[] header = "Tên Món Ăn".split(";");
		DefaultTableModel tableModel = new DefaultTableModel(header, 0);
//		scrollPane = new JScrollPane(table = new JTable(tableModel), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
//				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		
		
		JComboBox cbxGio = new JComboBox();
		cbxGio.setBounds(394, 28, 54, 20);
		cbxGio.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JComboBox cbxPhut = new JComboBox();
		cbxPhut.setBounds(511, 29, 57, 19);
		cbxPhut.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JLabel lbltBnTic = new JLabel("ĐẶT BÀN TIỆC");
		lbltBnTic.setBounds(407, 15, 178, 30);
		lbltBnTic.setForeground(Color.RED);
		lbltBnTic.setFont(new Font("Times New Roman", Font.BOLD, 25));
		contentPane.setLayout(null);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		panel_2.add(lblChnSnh);
		panel_2.add(cbxSanh);
		panel_2.add(btnTimKiemBanTrong);
		contentPane.add(tabbedPane);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.add(lblChnNgy);
		panel_1.add(txtNgaySuDung);
		panel_1.add(lblNhpGi);
		panel_1.add(cbxGio);
		panel_1.add(lblPht);
		panel_1.add(cbxPhut);
		panel_1.add(btnDatBanTiec);
		panel_1.add(btnLamMoi);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.add(lblMBn);
		panel.add(txtMaBan);
		panel.add(lblChnNgy_2);
		panel.add(txtThuocSanh);
		panel.add(lblChnNgy_3);
		panel.add(lblThngTinBn);
		panel.add(txtTrangThai);
		{
			lblBanSo = new JLabel("Bàn Số");
			lblBanSo.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			lblBanSo.setBounds(19, 106, 59, 29);
			panel.add(lblBanSo);
		}
		
		txtBanSo = new JTextField();
		txtBanSo.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtBanSo.setEditable(false);
		txtBanSo.setColumns(10);
		txtBanSo.setBounds(82, 106, 116, 23);
		panel.add(txtBanSo);
		contentPane.add(lbltBnTic);
		{
			txtMaKH = new JTextField();
			txtMaKH.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			txtMaKH.setEditable(false);
			txtMaKH.setColumns(10);
			txtMaKH.setBounds(945, 15, 116, 23);
			txtMaKH.setText(maKH);
			contentPane.add(txtMaKH);
		}

		btnDatBanTiec.addActionListener(this);
		
		SanhA();
		SanhB();
		SanhC();
		
	}

	public void SanhA() {
		panel_SanhA = new JPanel();
		panel_SanhA.setBorder(new LineBorder(Color.LIGHT_GRAY));
		tabbedPane.addTab("Sảnh A", null, panel_SanhA, "Sảnh A");
		panel_SanhA.setLayout(null);

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

	//private DanhSachKhachHangUI khUI=new DanhSachKhachHangUI();
	private JTextField txtMaBan;
	private JTextField txtThuocSanh;
	private JTextField txtTrangThai;
	private JScrollPane scrollPaneMonAn;
	private JLabel lblBanSo;
	private JTextField txtBanSo;
	private JTextField txtMaKH;
	//private DatMonAnUI datMonUI=new DatMonAnUI(maKH);
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj.equals(btnDatBanTiec)) {
			String maKH=txtMaKH.getText();
			System.out.println("MA KH LA : "+maKH);
			DatMonAnUI datMonUI=new DatMonAnUI(maKH);
			datMonUI.setVisible(true);
			//khUI.setVisible(true);
		}
		
	}
}
