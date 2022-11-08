package com.example.demo2.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.dto.NamaAlamatDosen;
import com.example.demo2.model.Dosen;
import com.example.demo2.service.IDosenService;

@RestController
@RequestMapping("/api/dosen")
public class DosenController {
	@Autowired
	IDosenService dosenService;
	
	@PostMapping("/insert")
	public Dosen insertDosen(@RequestBody Dosen dosen) {
		var result = dosenService.insertDosen(dosen);
		return result;
	}
	
	@GetMapping("/getAll")
	public List<Dosen> getAll() {
		var result = dosenService.getAll();
		return result;
	}
	
	@GetMapping("/getDosen/{id}")
	public Dosen getDosen(@PathVariable int id, @RequestBody Dosen dosen) {
		var result = dosenService.getDosen(id, dosen);
		return result;
	}
	
	@GetMapping("/getNamaAlamat")
	public NamaAlamatDosen getNamaAlamat(@RequestBody Dosen dosen) {
		var result = dosenService.getNamaAlamat(dosen);
		return result;
	}
	
	@GetMapping("/changeName/{id}")
	public Dosen changeName(@PathVariable int id, @RequestBody Dosen dosen) {
		var result = dosenService.changeName(id, dosen);
		return result;
	}
	
	@DeleteMapping("/delete/{id}")
	public Dosen deleteDosen(@PathVariable int id) {
		var result = dosenService.deleteDosen(id);
		return result;
	}
	
	
	
	
}
