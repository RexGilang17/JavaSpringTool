package com.example.demo2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo2.dto.NamaAlamatDosen;
import com.example.demo2.model.Dosen;
import com.example.demo2.repository.IDosenRepository;
import com.example.demo2.service.IDosenService;

@Service
public class DosenService implements IDosenService{
	
	@Autowired
	IDosenRepository dosenRepository;

	@Override
	public Dosen insertDosen(Dosen dosen) {
		// TODO Auto-generated method stub
		var result = dosenRepository.insertDosen(dosen);
		return result;
	}

	@Override
	public List<Dosen> getAll() {
		// TODO Auto-generated method stub
		var result = dosenRepository.getAll();
		return result;
	}

	@Override
	public Dosen getDosen(int id, Dosen dosen) {
		// TODO Auto-generated method stub
		String alamat = dosen.getAlamat();
		var result = dosenRepository.getDosen(id, alamat);
		return result;
	}
	
	@Override
	public NamaAlamatDosen getNamaAlamat(Dosen dosen) {
		// TODO Auto-generated method stub
		String kd_dosen = dosen.getKd_dosen();
		var result = dosenRepository.getNamaAlamat(kd_dosen);
		return result;
	}

	@Override
	public Dosen changeName(int id, Dosen dosen) {
		// TODO Auto-generated method stub
		String nm_dosen = dosen.getNm_dosen();
		var result = dosenRepository.changeName(id, nm_dosen);
		return result;
	}

	@Override
	public Dosen deleteDosen(int id) {
		// TODO Auto-generated method stub
		var result = dosenRepository.deleteDosen(id);
		return result;
	}

	
}
