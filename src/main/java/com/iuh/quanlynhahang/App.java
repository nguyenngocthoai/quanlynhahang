package com.iuh.quanlynhahang;

import java.util.List;

import com.iuh.quanlynhahang.daoimpls.HoaDonDAOImpl;
import com.iuh.quanlynhahang.entities.HoaDon;

/**
 * Hello world!
 * 
 */
public class App {
//	KhachHangDAOImpl khachHangDAO = new KhachHangDAOImpl();
	public static void main(String[] args) {
		System.out.println("Hello World!");
//		KhachHangDAOImpl khachHangDAO = new KhachHangDAOImpl();
//		BanDAOImpl banDAOImpl=new BanDAOImpl();
//		MonDAOImpl monDAO = new MonDAOImpl();
		HoaDonDAOImpl dao = new HoaDonDAOImpl();
//		System.out.println(LocalDate.now());

//		List<String> s = new ArrayList<String>();
//		s.add("1");
//		s.add("2");
//		s.add("3");
//		s.add("4");
//		s.remove("2");
//
//		s.forEach(x -> System.out.println(x));
//		s.clear();
//		System.out.println("========");
//		s.forEach(x -> System.out.println(x));
//		
//		BigDecimal d=new BigDecimal(120);
//		BigDecimal a=new BigDecimal(0.3);
////		BigDecimal sum=d.add(a);
//		System.out.println(sum);
//		

//		MonDAOImpl dao=new MonDAOImpl();
//		Mon mon=dao.getMonByTen("Cam Vắt");
//		System.out.println(mon.getTenMon() + mon.getGiaTien() + mon.getDonViTinh());
//		
//		 List<String> aList = Arrays.asList("Geeks", "for",
//                 "GeeksQuiz", "GeeksforGeeks", "GFG");
//
//     // Converting to set using stream
//     Set<String> set = aList.stream().collect(Collectors.toSet());
//
//     for (String x : set)
//         System.out.println(x);

//    Set<String> tSet = new TreeSet<String>(aList);
//    tSet.addAll(aList);
//    System.out.println("Created TreeSet is");
//    for (String x : tSet)
//        System.out.println(x);
//		System.out.println(LocalDateTime.now().getHour());
//		System.out.println(LocalDateTime.now().getMinute());

//		System.out.println((d.divide(a, 2, BigDecimal.ROUND_HALF_UP)).subtract(d));

//		List<Integer> l = monDAO.getAllNamsInHoaDon();
//		Set<Integer> s= new HashSet<Integer>();
//		s.addAll(l);
//		l.forEach(x -> System.out.println(l));
//		System.out.println("lllllllllllll");
//		System.out.println(l);
//		Set<Integer> s= new HashSet<Integer>();
//		s.addAll(l);
//		System.out.println(";;;;;;;;;;;;;;;");
//		System.out.println(s);

//		List<String> l = dao.ThongKeKhachHangItNhatTrongNam(2021);
//		List<String> l1 = dao.ThongKeKhachHangItNhatTrongThang(5, 2021);
//		List<String> l2 = dao.ThongKeKhachHangItNhatTrongNam(2021);
//		List<String> l3 = dao.ThongKeKhachHangItNhatTrongNam(2021);
//		List<String> l4 = dao.ThongKeKhachHangItNhatTrongNam(2021);
//		List<String> l5 = dao.ThongKeKhachHangItNhatTrongNam(2021);
//		List<String> l6 = dao.ThongKeKhachHangItNhatTrongNam(2021);
//		List<String> l7 = dao.ThongKeKhachHangItNhatTrongNam(2021);
//		List<Long> l8 = dao.ThongKeSoLanDatKhachHangItNhatTrongNam(2021);
//		System.out.println(l8);
//		List<KhachHang> kh=convertStringtoKhachHang(l1);
//		for (KhachHang khachHang : kh) {
//			System.out.println(khachHang.getTenKhachHang());
//		}
		List<HoaDon> h = dao.getHoaDonsByTenNV("Nguyễn Ngọc Thoại");
		System.out.println(h.size());

	}
//	private static List<KhachHang> convertStringtoKhachHang(List<String> list) {
//		KhachHangDAOImpl khachHangDAO = new KhachHangDAOImpl();
//		List<KhachHang> khachHangs = new ArrayList<KhachHang>();
//		try {
//			for (String str : list) {
//				KhachHang khachHang = khachHangDAO.getKHByID(str);
//				khachHangs.add(khachHang);
//			}
//		} catch (Exception e) {
//		}
//		return khachHangs;
//	}
}
