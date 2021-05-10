package com.iuh.quanlynhahang.guis;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import com.iuh.quanlynhahang.daoimpls.LoaiMonDAOImpl;
import com.iuh.quanlynhahang.daoimpls.MonDAOImpl;
import com.iuh.quanlynhahang.entities.LoaiMon;
import com.iuh.quanlynhahang.entities.Mon;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class DatBanTiec_ChonMon extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTree tree;
	private JButton btnTroVe;
	private JButton btnDat;

	private static MonDAOImpl monDAO = new MonDAOImpl();
	private static LoaiMonDAOImpl loaiMonDAO = new LoaiMonDAOImpl();
//	private DatBanTiec_ChonBan datBanTiec_ChonBan = new DatBanTiec_ChonBan();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatBanTiec_ChonMon frame = new DatBanTiec_ChonMon();
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
	public DatBanTiec_ChonMon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblChnMn = new JLabel("CHỌN MÓN");
		lblChnMn.setForeground(Color.RED);
		lblChnMn.setFont(new Font("Times New Roman", Font.BOLD, 25));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Danh s\u00E1ch m\u00F3n \u0111\u00E3 ch\u1ECDn", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE).addGap(18)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup().addGap(470)
								.addComponent(lblChnMn, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
								.addGap(409)))));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblChnMn).addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
						.addGap(10)));

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		btnTroVe = new JButton("Trở Về");
		btnTroVe.setIcon(new ImageIcon("images\\back.png"));
		btnTroVe.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		btnDat = new JButton("Đặt");
		btnDat.setIcon(new ImageIcon("images\\accept.png"));
		btnDat.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE).addGap(12))
				.addGroup(gl_panel.createSequentialGroup().addGap(161)
						.addComponent(btnTroVe, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(btnDat, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(144, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE).addGap(59)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnDat, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTroVe, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
						.addGap(38)));

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "STT", "Mã Món", "Tên Món", "Số Lượng", "Giá Tiền" }));
		table.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		scrollPane_1.setViewportView(table);
		panel.setLayout(gl_panel);

		tree = new JTree();
		tree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Danh Sách Món") {
			{
//				DefaultMutableTreeNode node_1;
//				node_1 = new DefaultMutableTreeNode("123");
//				node_1.add(new DefaultMutableTreeNode("123"));
//				node_1.add(new DefaultMutableTreeNode("123"));
//				add(node_1);
//
//				node_1 = new DefaultMutableTreeNode("1234");
//				node_1.add(new DefaultMutableTreeNode("1234"));
//				node_1.add(new DefaultMutableTreeNode("1234"));
//				add(node_1);

				List<LoaiMon> loaiMons = loaiMonDAO.getAllLoaiMon();
				List<Mon> mons = monDAO.getAllMon();
				DefaultMutableTreeNode mon;
				for (LoaiMon lm : loaiMons) {
					mon = new DefaultMutableTreeNode(lm.getTenLoaiMon());
					for (Mon m : mons) {
						if (m.getLoaiMon().getTenLoaiMon().equalsIgnoreCase(lm.getTenLoaiMon())) {
							mon.add(new DefaultMutableTreeNode(m.getTenMon()));
						}
					}
					add(mon);
				}
			}
		}));

		tree.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		scrollPane.setViewportView(tree);

		contentPane.setLayout(gl_contentPane);

		btnTroVe.addActionListener(this);
		btnDat.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj.equals(btnTroVe)) {
			DatBanTiec_ChonBan datBanTiec_ChonBan = new DatBanTiec_ChonBan();
			TrangChu.tabbedPane.remove(TrangChu.tabbedPane.getSelectedComponent());
			TrangChu.tabbedPane.addTab("Chọn Bàn", null, TrangChu.tabbedPane.add(datBanTiec_ChonBan.getContentPane()),
					"Chọn Bàn");
		} else if (obj.equals(btnDat)) {
			// to do something
		}

	}

	private void loadDataForMon() {
		List<LoaiMon> loaiMons = loaiMonDAO.getAllLoaiMon();
		List<Mon> mons = monDAO.getAllMon();
		DefaultMutableTreeNode mon;
		for (LoaiMon lm : loaiMons) {
			mon = new DefaultMutableTreeNode(lm.getTenLoaiMon());
			for (Mon m : mons) {
				if (m.getLoaiMon().getTenLoaiMon().equalsIgnoreCase(lm.getTenLoaiMon())) {
					mon.add(new DefaultMutableTreeNode(m.getTenMon()));
				}
			}
		}
	}
}
