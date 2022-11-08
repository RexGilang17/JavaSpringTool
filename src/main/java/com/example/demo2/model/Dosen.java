package com.example.demo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_dosen")
public class Dosen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
	private int id;

	@Column(unique = true)
	private String kd_dosen;
	private String nm_dosen;
	private String jenis_kelamin;
	private String alamat;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKd_dosen() {
		return kd_dosen;
	}
	public void setKd_dosen(String kd_dosen) {
		this.kd_dosen = kd_dosen;
	}
	public String getNm_dosen() {
		return nm_dosen;
	}
	public void setNm_dosen(String nm_dosen) {
		this.nm_dosen = nm_dosen;
	}
	public String getJenis_kelamin() {
		return jenis_kelamin;
	}
	public void setJenis_kelamin(String jenis_kelamin) {
		this.jenis_kelamin = jenis_kelamin;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

}
