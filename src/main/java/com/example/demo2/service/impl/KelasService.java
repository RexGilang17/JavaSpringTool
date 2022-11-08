package com.example.demo2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo2.model.Kelas;
import com.example.demo2.repository.IKelasRepository;
import com.example.demo2.service.IKelasService;

@Service
public class KelasService implements IKelasService{
	
		
		@Autowired
		IKelasRepository kelasRepository;

		@Override
		public Kelas insertKelas(Kelas kelas) {
			// TODO Auto-generated method stub
			var result = kelasRepository.insertKelas(kelas);
			return result;
		}

		@Override
		public List<Kelas> getAll() {
			// TODO Auto-generated method stub
			var result = kelasRepository.getAll();
			return result;
		}

		@Override
		public Kelas getKelas(int id, Kelas kelas) {
			// TODO Auto-generated method stub
			String ruang = kelas.getRuang();
			var result = kelasRepository.getKelas(id, ruang);
			return result;
		}



		
	}


