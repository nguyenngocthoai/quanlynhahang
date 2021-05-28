package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.iuh.quanlynhahang.daoimpls.LoaiMonDAOImpl;
import com.iuh.quanlynhahang.entities.LoaiMon;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class TimKiemMonAnUI extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtTenMon;
	private JTextField txtTienTu;
	private JTextField txtTienDen;
	private JButton btnTimKiem,btnTroVe;
	private JComboBox cbxLoaiMon;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimKiemMonAnUI frame = new TimKiemMonAnUI();
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
	public TimKiemMonAnUI() {
		setTitle("Tìm Kiếm Món Ăn");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 414, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblTmKimHa = new JLabel("Tìm Kiếm Món Ăn");
		lblTmKimHa.setBounds(99, 11, 200, 39);
		lblTmKimHa.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		contentPane.add(lblTmKimHa);
		
		JLabel lblTnKhchHng = new JLabel("Tên Món Ăn :");
		lblTnKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTnKhchHng.setBounds(10, 66, 108, 28);
		contentPane.add(lblTnKhchHng);
		
		txtTenMon = new JTextField();
		txtTenMon.setColumns(10);
		txtTenMon.setBounds(129, 68, 240, 28);
		contentPane.add(txtTenMon);
		
		JLabel lblLoiMnn = new JLabel("Loại Món Ăn :");
		lblLoiMnn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblLoiMnn.setBounds(10, 139, 108, 28);
		contentPane.add(lblLoiMnn);
		
		txtTienTu = new JTextField();
		txtTienTu.setColumns(10);
		txtTienTu.setBounds(34, 264, 163, 28);
		contentPane.add(txtTienTu);
		
		 cbxLoaiMon = new JComboBox();
		cbxLoaiMon.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		cbxLoaiMon.setBounds(129, 139, 240, 28);
		contentPane.add(cbxLoaiMon);
		
		JLabel lblGiTin = new JLabel("Giá Tiền :");
		lblGiTin.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblGiTin.setBounds(10, 215, 108, 28);
		contentPane.add(lblGiTin);
		
		txtTienDen = new JTextField();
		txtTienDen.setColumns(10);
		txtTienDen.setBounds(222, 264, 163, 28);
		contentPane.add(txtTienDen);
		
		 btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnTimKiem.setBounds(89, 351, 108, 28);
		contentPane.add(btnTimKiem);
		
		 btnTroVe = new JButton("Trở Về");
		btnTroVe.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnTroVe.setBounds(236, 351, 108, 28);
		contentPane.add(btnTroVe);
		
		JLabel lblGiTin_1 = new JLabel("_");
		lblGiTin_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblGiTin_1.setBounds(205, 257, 30, 28);
		contentPane.add(lblGiTin_1);
		loadCombobox();
		btnTroVe.addActionListener(this);
		btnTimKiem.addActionListener(this);
	}
	
	private LoaiMonDAOImpl lmDAO=new LoaiMonDAOImpl();
	
	public void loadCombobox() {
		List<LoaiMon> listLM=lmDAO.getAllLoaiMon();
		for (LoaiMon lm : listLM) {
			cbxLoaiMon.addItem(lm.getTenLoaiMon());
		}

	}
	private MonUI monUI;
	public void SearchMonAn() {
		String tenMon=txtTenMon.getText();
		String loaiMon=(String) cbxLoaiMon.getSelectedItem();
		String tienMin=txtTienTu.getText();
		String tienMax=txtTienDen.getText();
		monUI=new MonUI( tenMon, loaiMon, tienMin,  tienMax);
		monUI.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object o=e.getSource();
		if(o.equals(btnTroVe)) {
			setVisible(false);
		}else if(o.equals(btnTimKiem)) {
			SearchMonAn();
			setVisible(false);
		}
		
	}
}
