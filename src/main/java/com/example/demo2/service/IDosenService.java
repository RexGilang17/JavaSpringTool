package com.example.demo2.service;

import java.util.List;

import com.example.demo2.dto.NamaAlamatDosen;
import com.example.demo2.model.Dosen;

public interface IDosenService {

	public Dosen insertDosen(Dosen dosen);
	public List <Dosen> getAll();
	public Dosen getDosen(int id, Dosen dosen);
	public Dosen changeName(int id, Dosen dosen);
	public Dosen deleteDosen(int id);
	
	
	public NamaAlamatDosen getNamaAlamat(Dosen dosen);
	
}
