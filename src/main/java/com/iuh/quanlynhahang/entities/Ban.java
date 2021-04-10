package com.iuh.quanlynhahang.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Ban
 *
 */
@Entity

public class Ban implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private String maBan;
//	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//	@JoinColumn(name = "maLoaiBan")
//	private LoaiBan loaiBan;
	private int soLuongBan;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "maSanh")
	private Sanh sanh;
	
//	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//	@JoinColumn(name = "maBanTiec")
//	private Ban ban;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "maBan")
//	private Set<BanTiec> banTiecs;

	public Ban() {
		super();
	}

	public String getMaBan() {
		return maBan;
	}

	public void setMaBan(String maBan) {
		this.maBan = maBan;
	}

//	public LoaiBan getLoaiBan() {
//		return loaiBan;
//	}
//
//	public void setLoaiBan(LoaiBan loaiBan) {
//		this.loaiBan = loaiBan;
//	}

	public int getSoLuongBan() {
		return soLuongBan;
	}

	public void setSoLuongBan(int soLuongBan) {
		this.soLuongBan = soLuongBan;
	}

	public Sanh getSanh() {
		return sanh;
	}

	public void setSanh(Sanh sanh) {
		this.sanh = sanh;
	}
	
   
}
