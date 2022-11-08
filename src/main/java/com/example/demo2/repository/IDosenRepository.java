package com.example.demo2.repository;

import com.example.demo2.dto.NamaAlamatDosen;
import com.example.demo2.model.Dosen;
import java.util.List;

public interface IDosenRepository {
	public Dosen insertDosen(Dosen dosen);
	public List<Dosen> getAll();
	
	public Dosen getDosen(int id, String alamat);
	public Dosen changeName(int id, String nm_dosen);
	
	public NamaAlamatDosen getNamaAlamat(String kd_dosen);
	public Dosen deleteDosen(int id);
}
