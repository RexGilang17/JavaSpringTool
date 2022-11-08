package com.example.demo2.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.model.Kelas;
import com.example.demo2.service.IKelasService;

@RestController
@RequestMapping("/api/kelas")
public class KelasController {
	
		@Autowired
		IKelasService kelasService;
		
		@PostMapping("/insert")
		public Kelas insertKelas(@RequestBody Kelas kelas) {
			var result = kelasService.insertKelas(kelas);
			return result;
		}
		
		@GetMapping("/getAll")
		public List<Kelas> getAll() {
			var result = kelasService.getAll();
			return result;
		}
		
		@GetMapping("/getKelas/{id}")
		public Kelas getKelas(@PathVariable int id, @RequestBody Kelas kelas) {
			var result = kelasService.getKelas(id, kelas);
			return result;
		}
		
	}


