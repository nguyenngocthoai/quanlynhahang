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
	private Button btnBan1_25;
	private Button btnBan1_26;
	private Button btnBan1_27;
	private Button btnBan1_28;
	private Button btnBan1_29;
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
	private JLabel lblChnNgy_4;
	private JLabel lblImg;
	private JPanel panel_2;
	private JComboBox cbxSanh;
	private JLabel lblChnSnh;
	private JButton btnTimKiemBanTrong;
	private JPanel panel_3;
	private JButton btnChnMnn;

	public DatBanTiec() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);

		tabbedPane.setBounds(10, 44, 491, 448);

		contentPane.add(tabbedPane);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "\u0110\u1EB7t B\u00E0n Ti\u1EC7c",
				TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_1.setBounds(511, 409, 565, 194);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

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
		datePicker.setBounds(126, 27, 187, 30);
		panel_1.add(datePicker);
		{
			lblChnNgy = new JLabel("Chọn Ngày :");
			lblChnNgy.setFont(new Font("Arial", Font.PLAIN, 13));
			lblChnNgy.setBounds(10, 27, 72, 30);
			panel_1.add(lblChnNgy);
		}
		{
			lblNhpGi = new JLabel("Giờ :");
			lblNhpGi.setFont(new Font("Arial", Font.PLAIN, 13));
			lblNhpGi.setBounds(10, 95, 72, 30);
			panel_1.add(lblNhpGi);
		}
		{
			lblPht = new JLabel("Phút :");
			lblPht.setFont(new Font("Arial", Font.PLAIN, 13));
			lblPht.setBounds(126, 95, 72, 30);
			panel_1.add(lblPht);
		}
		{
			lblGiy = new JLabel("Giây : ");
			lblGiy.setFont(new Font("Arial", Font.PLAIN, 13));
			lblGiy.setBounds(247, 95, 44, 30);
			panel_1.add(lblGiy);
		}

		textField = new JTextField();
		textField.setBounds(48, 96, 66, 30);
		panel_1.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(171, 95, 66, 30);
		panel_1.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(288, 96, 66, 30);
		panel_1.add(textField_2);

		JButton btnQuayLai = new JButton("Thoát");
		btnQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnQuayLai.setFont(new Font("Arial", Font.PLAIN, 13));
		btnQuayLai.setBounds(258, 145, 96, 38);
		panel_1.add(btnQuayLai);
		{
			lblImg = new JLabel("img");
			lblImg.setFont(new Font("Arial", Font.PLAIN, 13));
			lblImg.setBounds(390, 27, 151, 131);
			panel_1.add(lblImg);
		}

		JButton btnDatBanTiec = new JButton("Đặt Bàn Tiệc");
		btnDatBanTiec.setBounds(126, 145, 111, 38);
		panel_1.add(btnDatBanTiec);
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
		lblNewLabel_1.setBounds(20, 10, 297, 24);
		contentPane.add(lblNewLabel_1);
		{
			panel = new JPanel();
			panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
			panel.setBounds(511, 10, 565, 164);
			contentPane.add(panel);
			panel.setLayout(null);
			{
				lblThngTinBn = new JLabel("Thông Tin Bàn Tiệc");
				lblThngTinBn.setFont(new Font("Arial", Font.BOLD, 16));
				lblThngTinBn.setBounds(210, 10, 173, 44);
				panel.add(lblThngTinBn);
			}
			{
				lblMBn = new JLabel("Mã Bàn : 1");
				lblMBn.setFont(new Font("Arial", Font.PLAIN, 13));
				lblMBn.setBounds(10, 68, 72, 30);
				panel.add(lblMBn);
			}
			{
				lblChnNgy_2 = new JLabel("Thuộc Sảnh : C");
				lblChnNgy_2.setFont(new Font("Arial", Font.PLAIN, 13));
				lblChnNgy_2.setBounds(182, 68, 106, 30);
				panel.add(lblChnNgy_2);
			}
			{
				lblChnNgy_3 = new JLabel("Trạng Thái : Trống");
				lblChnNgy_3.setFont(new Font("Arial", Font.PLAIN, 13));
				lblChnNgy_3.setBounds(380, 68, 132, 30);
				panel.add(lblChnNgy_3);
			}
			{
				lblChnNgy_4 = new JLabel("Loại Bàn : VIP");
				lblChnNgy_4.setFont(new Font("Arial", Font.PLAIN, 13));
				lblChnNgy_4.setBounds(10, 120, 97, 30);
				panel.add(lblChnNgy_4);
			}
		}
		{
			panel_2 = new JPanel();
			panel_2.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)),
					"T\u00ECm Ki\u1EBFm B\u00E0n Ti\u1EC7c Nhanh", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_2.setBounds(10, 502, 491, 101);
			contentPane.add(panel_2);
			panel_2.setLayout(null);
			{
				cbxSanh = new JComboBox();
				cbxSanh.setFont(new Font("Arial", Font.PLAIN, 13));
				cbxSanh.setBounds(92, 40, 129, 30);
				panel_2.add(cbxSanh);
			}
			{
				lblChnSnh = new JLabel("Chọn Sảnh :");
				lblChnSnh.setFont(new Font("Arial", Font.PLAIN, 13));
				lblChnSnh.setBounds(10, 40, 72, 30);
				panel_2.add(lblChnSnh);
			}
			{
				btnTimKiemBanTrong = new JButton("Tìm Kiếm Bàn Trống");
				btnTimKiemBanTrong.setFont(new Font("Arial", Font.PLAIN, 13));
				btnTimKiemBanTrong.setBounds(270, 35, 152, 41);
				panel_2.add(btnTimKiemBanTrong);
			}
		}
		{
			panel_3 = new JPanel();
			panel_3.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Ch\u1ECDn M\u00F3n \u0102n",
					TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
			panel_3.setBounds(511, 184, 565, 215);
			contentPane.add(panel_3);
			panel_3.setLayout(null);
			{
				btnChnMnn = new JButton("Xem Danh Sách Món Ăn");
				btnChnMnn.setFont(new Font("Arial", Font.PLAIN, 13));
				btnChnMnn.setBounds(10, 33, 192, 30);
				panel_3.add(btnChnMnn);

				JTable table;
				String[] header = "Tên Món Ăn; Số Lượng".split(";");
				DefaultTableModel tableModel = new DefaultTableModel(header, 0);
				JScrollPane scrollPane = new JScrollPane(table = new JTable(tableModel), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
						JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				panel_3.add(scrollPane);
				scrollPane.setBounds(212, 22, 343, 183);
			}
		}

		SanhA();
		SanhB();
		SanhC();
	}

	public void SanhA() {
		panel_SanhA = new JPanel();
		panel_SanhA.setBorder(new LineBorder(Color.LIGHT_GRAY));
		tabbedPane.addTab("Sảnh A", null, panel_SanhA, "adada");
		panel_SanhA.setLayout(null);

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
		panel_SanhB.setLayout(null);
		{
			btnBan1 = new Button("Bàn 1");
			btnBan1.setBackground(Color.LIGHT_GRAY);
			btnBan1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBan1.setBounds(20, 10, 66, 50);
			panel_SanhB.add(btnBan1);
		}
		{
			btnBan1_1 = new Button("Bàn 1");
			btnBan1_1.setBackground(Color.LIGHT_GRAY);
			btnBan1_1.setBounds(116, 80, 66, 50);
			panel_SanhB.add(btnBan1_1);
		}
		{
			btnBan1_2 = new Button("Bàn 1");
			btnBan1_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBan1_2.setBackground(Color.LIGHT_GRAY);
			btnBan1_2.setBounds(206, 10, 66, 50);
			panel_SanhB.add(btnBan1_2);
		}
		{
			btnBan1_3 = new Button("Bàn 1");
			btnBan1_3.setBackground(Color.LIGHT_GRAY);
			btnBan1_3.setBounds(116, 10, 66, 50);
			panel_SanhB.add(btnBan1_3);
		}
		{
			btnBan1_4 = new Button("Bàn 1");
			btnBan1_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBan1_4.setBackground(Color.LIGHT_GRAY);
			btnBan1_4.setBounds(300, 10, 66, 50);
			panel_SanhB.add(btnBan1_4);
		}
		{
			btnBan1_5 = new Button("Bàn 1");
			btnBan1_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBan1_5.setBackground(Color.LIGHT_GRAY);
			btnBan1_5.setBounds(397, 10, 66, 50);
			panel_SanhB.add(btnBan1_5);
		}
		{
			btnBan1_6 = new Button("Bàn 1");
			btnBan1_6.setBackground(Color.LIGHT_GRAY);
			btnBan1_6.setBounds(20, 80, 66, 50);
			panel_SanhB.add(btnBan1_6);
		}
		{
			btnBan1_7 = new Button("Bàn 1");
			btnBan1_7.setBackground(Color.LIGHT_GRAY);
			btnBan1_7.setBounds(206, 80, 66, 50);
			panel_SanhB.add(btnBan1_7);
		}
		{
			btnBan1_8 = new Button("Bàn 1");
			btnBan1_8.setBackground(Color.LIGHT_GRAY);
			btnBan1_8.setBounds(300, 80, 66, 50);
			panel_SanhB.add(btnBan1_8);
		}
		{
			btnBan1_9 = new Button("Bàn 1");
			btnBan1_9.setBackground(Color.LIGHT_GRAY);
			btnBan1_9.setBounds(397, 80, 66, 50);
			panel_SanhB.add(btnBan1_9);
		}
		{
			btnBan1_10 = new Button("Bàn 1");
			btnBan1_10.setBackground(Color.LIGHT_GRAY);
			btnBan1_10.setBounds(20, 150, 66, 50);
			panel_SanhB.add(btnBan1_10);
		}
		{
			btnBan1_11 = new Button("Bàn 1");
			btnBan1_11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBan1_11.setBackground(Color.LIGHT_GRAY);
			btnBan1_11.setBounds(116, 150, 66, 50);
			panel_SanhB.add(btnBan1_11);
		}
		{
			btnBan1_12 = new Button("Bàn 1");
			btnBan1_12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBan1_12.setBackground(Color.LIGHT_GRAY);
			btnBan1_12.setBounds(206, 150, 66, 50);
			panel_SanhB.add(btnBan1_12);
		}
		{
			btnBan1_13 = new Button("Bàn 1");
			btnBan1_13.setBackground(Color.LIGHT_GRAY);
			btnBan1_13.setBounds(300, 150, 66, 50);
			panel_SanhB.add(btnBan1_13);
		}
		{
			btnBan1_14 = new Button("Bàn 1");
			btnBan1_14.setBackground(Color.LIGHT_GRAY);
			btnBan1_14.setBounds(397, 150, 66, 50);
			panel_SanhB.add(btnBan1_14);
		}
		{
			btnBan1_15 = new Button("Bàn 1");
			btnBan1_15.setBackground(Color.LIGHT_GRAY);
			btnBan1_15.setBounds(20, 220, 66, 50);
			panel_SanhB.add(btnBan1_15);
		}
		{
			btnBan1_16 = new Button("Bàn 1");
			btnBan1_16.setBackground(Color.LIGHT_GRAY);
			btnBan1_16.setBounds(116, 220, 66, 50);
			panel_SanhB.add(btnBan1_16);
		}
		{
			btnBan1_17 = new Button("Bàn 1");
			btnBan1_17.setBackground(Color.LIGHT_GRAY);
			btnBan1_17.setBounds(206, 220, 66, 50);
			panel_SanhB.add(btnBan1_17);
		}
		{
			btnBan1_18 = new Button("Bàn 1");
			btnBan1_18.setBackground(Color.LIGHT_GRAY);
			btnBan1_18.setBounds(300, 220, 66, 50);
			panel_SanhB.add(btnBan1_18);
		}
		{
			btnBan1_19 = new Button("Bàn 1");
			btnBan1_19.setBackground(Color.LIGHT_GRAY);
			btnBan1_19.setBounds(397, 220, 66, 50);
			panel_SanhB.add(btnBan1_19);
		}
		{
			btnBan1_20 = new Button("Bàn 1");
			btnBan1_20.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBan1_20.setBackground(Color.LIGHT_GRAY);
			btnBan1_20.setBounds(397, 290, 66, 50);
			panel_SanhB.add(btnBan1_20);
		}
		{
			btnBan1_21 = new Button("Bàn 1");
			btnBan1_21.setBackground(Color.LIGHT_GRAY);
			btnBan1_21.setBounds(20, 290, 66, 50);
			panel_SanhB.add(btnBan1_21);
		}
		{
			btnBan1_22 = new Button("Bàn 1");
			btnBan1_22.setBackground(Color.LIGHT_GRAY);
			btnBan1_22.setBounds(116, 290, 66, 50);
			panel_SanhB.add(btnBan1_22);
		}
		{
			btnBan1_23 = new Button("Bàn 1");
			btnBan1_23.setBackground(Color.LIGHT_GRAY);
			btnBan1_23.setBounds(206, 290, 66, 50);
			panel_SanhB.add(btnBan1_23);
		}
		{
			btnBan1_24 = new Button("Bàn 1");
			btnBan1_24.setBackground(Color.LIGHT_GRAY);
			btnBan1_24.setBounds(300, 290, 66, 50);
			panel_SanhB.add(btnBan1_24);
		}
		{
			btnBan1_25 = new Button("Bàn 1");
			btnBan1_25.setBackground(Color.LIGHT_GRAY);
			btnBan1_25.setBounds(20, 360, 66, 50);
			panel_SanhB.add(btnBan1_25);
		}
		{
			btnBan1_26 = new Button("Bàn 1");
			btnBan1_26.setBackground(Color.LIGHT_GRAY);
			btnBan1_26.setBounds(116, 360, 66, 50);
			panel_SanhB.add(btnBan1_26);
		}
		{
			btnBan1_27 = new Button("Bàn 1");
			btnBan1_27.setBackground(Color.LIGHT_GRAY);
			btnBan1_27.setBounds(206, 360, 66, 50);
			panel_SanhB.add(btnBan1_27);
		}
		{
			btnBan1_28 = new Button("Bàn 1");
			btnBan1_28.setBackground(Color.LIGHT_GRAY);
			btnBan1_28.setBounds(300, 360, 66, 50);
			panel_SanhB.add(btnBan1_28);
		}
		{
			btnBan1_29 = new Button("Bàn 1");
			btnBan1_29.setBackground(Color.LIGHT_GRAY);
			btnBan1_29.setBounds(397, 360, 66, 50);
			panel_SanhB.add(btnBan1_29);
		}
	}
}
