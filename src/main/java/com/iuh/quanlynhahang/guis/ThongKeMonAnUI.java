package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.iuh.quanlynhahang.daoimpls.ConverDTOImpl;
import com.iuh.quanlynhahang.daoimpls.MonDAOImpl;
import com.iuh.quanlynhahang.daoimpls.PhieuDatBanDAOImpl;
import com.iuh.quanlynhahang.entities.LoaiMon;
import com.iuh.quanlynhahang.entities.Mon;
import com.iuh.quanlynhahang.entities.PhieuDatBan;
import com.quanlynhahang.dto.PhieuDatBan_Mon;
import com.toedter.calendar.JDateChooser;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpringLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.awt.event.ActionEvent;

public class ThongKeMonAnUI extends JFrame implements ActionListener {

	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongKeMonAnUI frame = new ThongKeMonAnUI();
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
	private JComboBox comboBox_1_1;
	private JButton btnThongKe, btnBaoCao;
	private JComboBox cbxTKMonAn, cbxThang, cbxNam;
	private UtilDateModel model1, model2;
	private JButton btnTroVe;

	public ThongKeMonAnUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblThngKMn = new JLabel("THỐNG KÊ MÓN ĂN");
		lblThngKMn.setForeground(Color.RED);
		lblThngKMn.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblThngKMn.setBounds(422, 23, 267, 30);
		contentPane.add(lblThngKMn);

		String[] header = "STT;Mã Món Ăn;Tên Món Ăn".split(";");
		tableModel = new DefaultTableModel(header, 0);
		scrollPane = new JScrollPane(table = new JTable(tableModel), ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(118, 138, 854, 277);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		scrollPane.setViewportView(table);
		contentPane.add(scrollPane);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Th\u1ED1ng k\u00EA m\u00F3n \u0103n",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(280, 425, 541, 89);
		contentPane.add(panel);
		panel.setLayout(null);

		btnBaoCao = new JButton("Báo Cáo");
		btnBaoCao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBaoCao.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnBaoCao.setBounds(122, 31, 95, 28);
		panel.add(btnBaoCao);

		btnTroVe = new JButton("Trở Về");
		btnTroVe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTroVe.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnTroVe.setBounds(321, 31, 95, 28);
		panel.add(btnTroVe);

		JLabel lblMnn = new JLabel("Món Ăn");
		lblMnn.setBounds(118, 84, 69, 28);
		contentPane.add(lblMnn);
		lblMnn.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		cbxTKMonAn = new JComboBox();
		cbxTKMonAn.setBounds(192, 85, 133, 28);
		contentPane.add(cbxTKMonAn);

		cbxThang = new JComboBox();
		cbxThang.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		cbxThang.setBounds(441, 84, 142, 28);
		contentPane.add(cbxThang);

		cbxNam = new JComboBox();
		cbxNam.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		cbxNam.setBounds(672, 84, 142, 28);
		contentPane.add(cbxNam);

		btnThongKe = new JButton("Thống Kê");
		btnThongKe.setBounds(877, 84, 95, 28);
		contentPane.add(btnThongKe);
		btnThongKe.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		lblTheoThng = new JLabel("Theo Tháng");
		lblTheoThng.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTheoThng.setBounds(351, 84, 80, 28);
		contentPane.add(lblTheoThng);

		lblNm = new JLabel("Năm");
		lblNm.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNm.setBounds(611, 84, 58, 28);
		contentPane.add(lblNm);

		cbxTKMonAn.addActionListener(this);
		loadCombobox();
		btnThongKe.addActionListener(this);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int c = 0; c < table.getColumnCount(); c++) {
			Class<?> col_class = table.getColumnClass(c);
			table.setDefaultEditor(col_class, null); // remove editor
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o.equals(btnThongKe)) {

			uploadTable();
		}

	}

	private List<String> listMaMon;
	private EntityManagerFactory emf;
	private MonDAOImpl monDAOImpl = new MonDAOImpl();
	private PhieuDatBanDAOImpl pdbDAO = new PhieuDatBanDAOImpl();
	private ConverDTOImpl converDTO = new ConverDTOImpl();
	private Set<Mon> setMon;
	private List<Mon> listM = new ArrayList<Mon>();
	private JLabel lblTheoThng;
	private JLabel lblNm;

	public void uploadTable() {
		setMon = new HashSet<Mon>();
		try {
			int rowCount = table.getRowCount();
			for (int i = rowCount; i > 0; i--) {
				tableModel.removeRow(i - 1);
			}
			int i = 0;
			int t = cbxThang.getSelectedIndex();
			String y = cbxNam.getSelectedItem() + "";
			int year = Integer.parseInt(y);
//			List<PhieuDatBan_Mon> listPM = converDTO.getAllPM();
			List<PhieuDatBan> listPDB = pdbDAO.getAllPhieuDatBan();
			List<Mon> listM = monDAOImpl.getAllMon();
			if(cbxTKMonAn.getSelectedIndex()==0) {
				List<String> listMon = monDAOImpl.ThongKeMonAnNhieuNhatTrongThang(t + 1, year);
				try {
					Mon m = monDAOImpl.getMonByMa(listMon.get(0));
					tableModel.addRow(new Object[] { i + 1, m.getMaMon(), m.getTenMon()});
				} catch (Exception e) {
					// TODO: handle exception
				}
			}else {
				List<String> listMon = monDAOImpl.ThongKeMonAnNhieuNhatTrongThang(t + 1, year);
				try {
					Mon m = monDAOImpl.getMonByMa(listMon.get(listMon.size()-1));
					tableModel.addRow(new Object[] { i + 1, m.getMaMon(), m.getTenMon()});
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		table.setModel(tableModel);

	}

	private static int namHoatDong = 2019;
	private Date date;

	public void loadCombobox() {
		
		cbxTKMonAn.addItem("Bán Chạy Nhất");
		cbxTKMonAn.addItem("Bán Ít Nhất");
		for (int i = 1; i <= 12; i++) {
			cbxThang.addItem("Tháng " + i);
		}

		int year = LocalDate.now().getYear();
		for (int j = year; j >= namHoatDong; j--) {
			cbxNam.addItem(j);
		}
		System.out.println(year);

	}

}
