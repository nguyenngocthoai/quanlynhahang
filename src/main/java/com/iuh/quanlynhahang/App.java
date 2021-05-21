package com.iuh.quanlynhahang;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.iuh.quanlynhahang.daoimpls.BanDAOImpl;
import com.iuh.quanlynhahang.daoimpls.KhachHangDAOImpl;
import com.iuh.quanlynhahang.daoimpls.MonDAOImpl;
import com.iuh.quanlynhahang.entities.Mon;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
//		KhachHangDAOImpl khachHangDAOImpl = new KhachHangDAOImpl();
//		BanDAOImpl banDAOImpl=new BanDAOImpl();
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
		BigDecimal d=new BigDecimal(120);
		BigDecimal a=new BigDecimal(0.3);
//		BigDecimal sum=d.add(a);
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
		
		System.out.println((d.divide(a, 2, BigDecimal.ROUND_HALF_UP)).subtract(d));
		
		
	}
}
