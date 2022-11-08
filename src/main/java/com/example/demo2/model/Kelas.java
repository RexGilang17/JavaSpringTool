package com.example.demo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_kelas")
public class Kelas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
	private int id;
	
	@Column(unique = true)
	private String kd_kelas;
	private String kd_dosen;
	private String kd_mk;
	private String ruang;
	public String getKd_kelas() {
		return kd_kelas;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setKd_kelas(String kd_kelas) {
		this.kd_kelas = kd_kelas;
	}
	public String getKd_dosen() {
		return kd_dosen;
	}
	public void setKd_dosen(String kd_dosen) {
		this.kd_dosen = kd_dosen;
	}
	public String getKd_mk() {
		return kd_mk;
	}
	public void setKd_mk(String kd_mk) {
		this.kd_mk = kd_mk;
	}
	public String getRuang() {
		return ruang;
	}
	public void setRuang(String ruang) {
		this.ruang = ruang;
	}
	
	
	
}
