package com.iuh.quanlynhahang;

<<<<<<< Updated upstream
import com.iuh.quanlynhahang.daoimpls.KhachHangDAOImpl;
=======
import java.math.BigDecimal;
import java.util.List;

import com.iuh.quanlynhahang.daoimpls.HoaDonDAOImpl;
import com.iuh.quanlynhahang.daoimpls.KhachHangDAOImpl;
import com.iuh.quanlynhahang.daoimpls.MonDAOImpl;
import com.iuh.quanlynhahang.entities.HoaDon;
import com.iuh.quanlynhahang.entities.KhachHang;
import com.iuh.quanlynhahang.entities.Mon;
import com.quanlynhahang.dto.PhieuDatBan_Mon;
>>>>>>> Stashed changes

/**
 * Hello world!
 *		
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		KhachHangDAOImpl khachHangDAOImpl = new KhachHangDAOImpl();
//		BanDAOImpl banDAOImpl=new BanDAOImpl();
<<<<<<< Updated upstream
=======
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
		
		MonDAOImpl daoImpl=new MonDAOImpl();
		//List<String> mon=daoImpl.ThongKeMonAnNhieuNhatTrongThang(5, 2021);
		List<Mon> list=daoImpl.searchMon("Cháo Cá Lóc", "Cháo", BigDecimal.valueOf(10000), BigDecimal.valueOf(300000));
		System.out.println(list.size());
		System.out.println("==============");
//		
//		List<String> doUong=daoImpl.ThongKeDoUongNhieuNhatTrongThang(5, 2021,"Đồ Uống");
//		System.out.println(doUong);
//		System.out.println("==============");

//		KhachHangDAOImpl khdao=new KhachHangDAOImpl();
//		List<KhachHang> kh=khdao.searchKH("AS", "0321555478", "ÂS", "Nam");
//		List<KhachHang> tenKH=khdao.getKHByTen("AS");
//		System.out.println(kh);
//		System.out.println(tenKH.size());
//		System.out.println("==============");
		
//		HoaDonDAOImpl hdDAO=new HoaDonDAOImpl();
//		List<HoaDon> listHD=hdDAO.searchHD("Nguyễn Ngọc Thoại", "Nguyễn Ngọc Thoại", "2021-05-21", "2021-05-23");
//		System.out.println(listHD);
//		List<String> solan=daoImpl.ThongKeSoLanDatNhieuNhatTrongThang(5, 2021);
//		System.out.println(solan);
		
		

>>>>>>> Stashed changes
	}
}
