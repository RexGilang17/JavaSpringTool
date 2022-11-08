package com.example.demo2.repository;
import com.example.demo2.model.Kelas;
import java.util.List;


public interface IKelasRepository {
	
		public Kelas insertKelas(Kelas kelas);
		public List<Kelas> getAll();
		public Kelas getKelas(int id, String ruang);
	}

