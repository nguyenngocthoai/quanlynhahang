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

public class DatBanTiec extends JFrame {

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
	private Button btnBan1_1;
	private Button btnBan1_2;
	private Button btnBan1_3;
	private Button btnBan1_4;
	private Button btnBan1_5;
	private Button btnBan1_6;
	private Button btnBan1_7;
	private Button btnBan1_8;
	private Button btnBan1_9;
	private Button btnBan1_10;
	private Button btnBan1_11;
	private Button btnBan1_12;
	private Button btnBan1_13;
	private Button btnBan1_14;
	private Button btnBan1_15;
	private Button btnBan1_16;
	private Button btnBan1_17;
	private Button btnBan1_18;
	private Button btnBan1_19;
	private Button btnBan1_20;
	private Button btnBan1_21;
	private Button btnBan1_22;
	private Button btnBan1_23;
	private Button btnBan1_24;
	private JLabel lblChnNgy;
	private JLabel lblNhpGi;
	private JLabel lblPht;
	private JLabel lblGiy;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPanel panel;
	private JLabel lblThngTinBn;
	private JLabel lblMBn;
	private JLabel lblChnNgy_2;
	private JLabel lblChnNgy_3;
	private JLabel lblImg;
	private JPanel panel_2;
	private JComboBox cbxSanh;
	private JLabel lblChnSnh;
	private JButton btnTimKiemBanTrong;
	private JPanel panel_3;
	private JButton btnDSMonAn;
	private JScrollPane scrollPane;
	private SpringLayout springLayout;

	public DatBanTiec() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 575);
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
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);

		springLayout = (SpringLayout) datePicker.getLayout();
		{
			lblChnNgy = new JLabel("Chọn Ngày :");
			lblChnNgy.setFont(new Font("Arial", Font.PLAIN, 13));
		}
		{
			lblNhpGi = new JLabel("Giờ :");
			lblNhpGi.setFont(new Font("Arial", Font.PLAIN, 13));
		}
		{
			lblPht = new JLabel("Phút :");
			lblPht.setFont(new Font("Arial", Font.PLAIN, 13));
		}
		{
			lblGiy = new JLabel("Giây : ");
			lblGiy.setFont(new Font("Arial", Font.PLAIN, 13));
		}

		textField = new JTextField();
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		JButton btnQuayLai = new JButton("Thoát");
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnQuayLai.setFont(new Font("Arial", Font.PLAIN, 13));
		{
			lblImg = new JLabel("img");
			lblImg.setFont(new Font("Arial", Font.PLAIN, 13));
		}

		JButton btnDatBanTiec = new JButton("Đặt Bàn Tiệc");
		btnDatBanTiec.setFont(new Font("Arial", Font.PLAIN, 13));
		btnDatBanTiec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

//		JDatePicker comboBox = new JComboBox();
//		comboBox.setBounds(10, 27, 187, 30);
//		panel_1.add(comboBox);
//		
		JLabel lblNewLabel_1 = new JLabel("Danh Sách Các Bàn Tiệc Hiện Có Của Nhà Hàng :");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 13));
		{
			panel = new JPanel();
			panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
			{
				lblThngTinBn = new JLabel("Thông Tin Bàn Tiệc");
				lblThngTinBn.setFont(new Font("Arial", Font.BOLD, 16));
			}
			{
				lblMBn = new JLabel("Mã Bàn : 1");
				lblMBn.setFont(new Font("Arial", Font.PLAIN, 13));
			}
			{
				lblChnNgy_2 = new JLabel("Thuộc Sảnh : C");
				lblChnNgy_2.setFont(new Font("Arial", Font.PLAIN, 13));
			}
			{
				lblChnNgy_3 = new JLabel("Trạng Thái : Trống");
				lblChnNgy_3.setFont(new Font("Arial", Font.PLAIN, 13));
			}
		}
		{
			panel_2 = new JPanel();
			panel_2.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)),
					"T\u00ECm Ki\u1EBFm B\u00E0n Ti\u1EC7c Nhanh", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			{
				cbxSanh = new JComboBox();
				cbxSanh.setFont(new Font("Arial", Font.PLAIN, 13));
			}
			{
				lblChnSnh = new JLabel("Chọn Sảnh :");
				lblChnSnh.setFont(new Font("Arial", Font.PLAIN, 13));
			}
			{
				btnTimKiemBanTrong = new JButton("Tìm Kiếm Bàn Trống");
				btnTimKiemBanTrong.setFont(new Font("Arial", Font.PLAIN, 13));
			}
		}
		{
			panel_3 = new JPanel();
			panel_3.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Ch\u1ECDn M\u00F3n \u0102n",
					TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
			{
				btnDSMonAn = new JButton("Xem Danh Sách Món Ăn");
				btnDSMonAn.setFont(new Font("Arial", Font.PLAIN, 13));

				JTable table;
				String[] header = "Tên Món Ăn; Số Lượng".split(";");
				DefaultTableModel tableModel = new DefaultTableModel(header, 0);
				scrollPane = new JScrollPane(table = new JTable(tableModel), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
						JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			}
		}
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE))
						.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE))
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE))
					.addGap(5))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(tabbedPane)
							.addGap(3)
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
							.addGap(11))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(209)
					.addComponent(lblThngTinBn, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
					.addGap(181))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(9)
					.addComponent(lblMBn, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addGap(100)
					.addComponent(lblChnNgy_2, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
					.addGap(92)
					.addComponent(lblChnNgy_3, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(9)
					.addComponent(lblThngTinBn, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMBn, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblChnNgy_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblChnNgy_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
		);
		panel.setLayout(gl_panel);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(5)
					.addComponent(btnDSMonAn, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
					.addGap(5))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(18)
					.addComponent(btnDSMonAn, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(7)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE))
		);
		panel_3.setLayout(gl_panel_3);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblChnNgy, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNhpGi, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addGap(3)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)))
					.addGap(10)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(datePicker, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
							.addGap(40))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblPht, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
							.addGap(10)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(40)
									.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
								.addComponent(lblGiy, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnDatBanTiec, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
							.addGap(21)
							.addComponent(btnQuayLai, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)))
					.addGap(37)
					.addComponent(lblImg, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
					.addGap(19))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(12)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblChnNgy, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(20)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNhpGi, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(1)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(datePicker, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(20)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPht, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(1)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(1)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblGiy, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addGap(25)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(btnDatBanTiec, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnQuayLai, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblImg, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(5)
					.addComponent(lblChnSnh, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(cbxSanh, 0, 129, Short.MAX_VALUE)
					.addGap(49)
					.addComponent(btnTimKiemBanTrong, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
					.addGap(64))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(25)
					.addComponent(lblChnSnh, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(25)
					.addComponent(cbxSanh, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(20)
					.addComponent(btnTimKiemBanTrong, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
		);
		panel_2.setLayout(gl_panel_2);
		contentPane.setLayout(gl_contentPane);

		SanhA();
		SanhB();
		SanhC();
	}

	public void SanhA() {
		panel_SanhA = new JPanel();
		panel_SanhA.setBorder(new LineBorder(Color.LIGHT_GRAY));
		tabbedPane.addTab("Sảnh A", null, panel_SanhA, "adada");
		GroupLayout gl_panel_SanhA = new GroupLayout(panel_SanhA);
		gl_panel_SanhA.setHorizontalGroup(
			gl_panel_SanhA.createParallelGroup(Alignment.LEADING)
				.addGap(0, 484, Short.MAX_VALUE)
		);
		gl_panel_SanhA.setVerticalGroup(
			gl_panel_SanhA.createParallelGroup(Alignment.LEADING)
				.addGap(0, 345, Short.MAX_VALUE)
		);
		panel_SanhA.setLayout(gl_panel_SanhA);

		String[] ban = { "1", "2", "3" };
	}

	public void SanhB() {
	}

	public void SanhC() {
		panel_SanhC = new JPanel();
		panel_SanhC.setBorder(new LineBorder(Color.LIGHT_GRAY));
		tabbedPane.addTab("Sảnh C", null, panel_SanhC, "HIHi");
		panel_SanhC.setLayout(null);
		panel_SanhB = new JPanel();
		panel_SanhB.setBorder(new LineBorder(Color.LIGHT_GRAY));
		tabbedPane.addTab("Sảnh B", null, panel_SanhB, "HIHi");
		{
			btnBan1 = new Button("Bàn 1");
			btnBan1.setBackground(Color.LIGHT_GRAY);
			btnBan1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
		}
		{
			btnBan1_1 = new Button("Bàn 1");
			btnBan1_1.setBackground(Color.LIGHT_GRAY);
		}
		{
			btnBan1_2 = new Button("Bàn 1");
			btnBan1_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBan1_2.setBackground(Color.LIGHT_GRAY);
		}
		{
			btnBan1_3 = new Button("Bàn 1");
			btnBan1_3.setBackground(Color.LIGHT_GRAY);
		}
		{
			btnBan1_4 = new Button("Bàn 1");
			btnBan1_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBan1_4.setBackground(Color.LIGHT_GRAY);
		}
		{
			btnBan1_5 = new Button("Bàn 1");
			btnBan1_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBan1_5.setBackground(Color.LIGHT_GRAY);
		}
		{
			btnBan1_6 = new Button("Bàn 1");
			btnBan1_6.setBackground(Color.LIGHT_GRAY);
		}
		{
			btnBan1_7 = new Button("Bàn 1");
			btnBan1_7.setBackground(Color.LIGHT_GRAY);
		}
		{
			btnBan1_8 = new Button("Bàn 1");
			btnBan1_8.setBackground(Color.LIGHT_GRAY);
		}
		{
			btnBan1_9 = new Button("Bàn 1");
			btnBan1_9.setBackground(Color.LIGHT_GRAY);
		}
		{
			btnBan1_10 = new Button("Bàn 1");
			btnBan1_10.setBackground(Color.LIGHT_GRAY);
		}
		{
			btnBan1_11 = new Button("Bàn 1");
			btnBan1_11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBan1_11.setBackground(Color.LIGHT_GRAY);
		}
		{
			btnBan1_12 = new Button("Bàn 1");
			btnBan1_12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBan1_12.setBackground(Color.LIGHT_GRAY);
		}
		{
			btnBan1_13 = new Button("Bàn 1");
			btnBan1_13.setBackground(Color.LIGHT_GRAY);
		}
		{
			btnBan1_14 = new Button("Bàn 1");
			btnBan1_14.setBackground(Color.LIGHT_GRAY);
		}
		{
			btnBan1_15 = new Button("Bàn 1");
			btnBan1_15.setBackground(Color.LIGHT_GRAY);
		}
		{
			btnBan1_16 = new Button("Bàn 1");
			btnBan1_16.setBackground(Color.LIGHT_GRAY);
		}
		{
			btnBan1_17 = new Button("Bàn 1");
			btnBan1_17.setBackground(Color.LIGHT_GRAY);
		}
		{
			btnBan1_18 = new Button("Bàn 1");
			btnBan1_18.setBackground(Color.LIGHT_GRAY);
		}
		{
			btnBan1_19 = new Button("Bàn 1");
			btnBan1_19.setBackground(Color.LIGHT_GRAY);
		}
		{
			btnBan1_20 = new Button("Bàn 1");
			btnBan1_20.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBan1_20.setBackground(Color.LIGHT_GRAY);
		}
		{
			btnBan1_21 = new Button("Bàn 1");
			btnBan1_21.setBackground(Color.LIGHT_GRAY);
		}
		{
			btnBan1_22 = new Button("Bàn 1");
			btnBan1_22.setBackground(Color.LIGHT_GRAY);
		}
		{
			btnBan1_23 = new Button("Bàn 1");
			btnBan1_23.setBackground(Color.LIGHT_GRAY);
		}
		{
			btnBan1_24 = new Button("Bàn 1");
			btnBan1_24.setBackground(Color.LIGHT_GRAY);
		}
		GroupLayout gl_panel_SanhB = new GroupLayout(panel_SanhB);
		gl_panel_SanhB.setHorizontalGroup(
			gl_panel_SanhB.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_SanhB.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_panel_SanhB.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_SanhB.createSequentialGroup()
							.addComponent(btnBan1, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
							.addGap(30)
							.addComponent(btnBan1_3, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
							.addGap(24)
							.addComponent(btnBan1_2, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
							.addGap(28)
							.addComponent(btnBan1_4, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
							.addGap(31)
							.addComponent(btnBan1_5, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
						.addGroup(gl_panel_SanhB.createSequentialGroup()
							.addComponent(btnBan1_6, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(btnBan1_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(24)
							.addComponent(btnBan1_7, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(28)
							.addComponent(btnBan1_8, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(btnBan1_9, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_SanhB.createSequentialGroup()
							.addComponent(btnBan1_10, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(btnBan1_11, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(24)
							.addComponent(btnBan1_12, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(28)
							.addComponent(btnBan1_13, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(btnBan1_14, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_SanhB.createSequentialGroup()
							.addComponent(btnBan1_15, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(btnBan1_16, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(24)
							.addComponent(btnBan1_17, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(28)
							.addComponent(btnBan1_18, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(btnBan1_19, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_SanhB.createSequentialGroup()
							.addComponent(btnBan1_21, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(btnBan1_22, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(24)
							.addComponent(btnBan1_23, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(28)
							.addComponent(btnBan1_24, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(btnBan1_20, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)))
					.addGap(22))
		);
		gl_panel_SanhB.setVerticalGroup(
			gl_panel_SanhB.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_SanhB.createSequentialGroup()
					.addGap(9)
					.addGroup(gl_panel_SanhB.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBan1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBan1_3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBan1_2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBan1_4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBan1_5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(gl_panel_SanhB.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBan1_6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBan1_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBan1_7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBan1_8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBan1_9, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(gl_panel_SanhB.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBan1_10, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBan1_11, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBan1_12, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBan1_13, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBan1_14, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(gl_panel_SanhB.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBan1_15, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBan1_16, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBan1_17, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBan1_18, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBan1_19, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(gl_panel_SanhB.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBan1_21, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBan1_22, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBan1_23, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBan1_24, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBan1_20, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
		);
		panel_SanhB.setLayout(gl_panel_SanhB);
	}
}
