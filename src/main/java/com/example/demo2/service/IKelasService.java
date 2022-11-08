package com.example.demo2.service;
import java.util.List;
import com.example.demo2.model.Kelas;


public interface IKelasService {


		public Kelas insertKelas(Kelas kelas);
		public List <Kelas> getAll();
		public Kelas getKelas(int id, Kelas kelas);
	}


