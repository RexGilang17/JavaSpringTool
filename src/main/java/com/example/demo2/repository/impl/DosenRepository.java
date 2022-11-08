package com.example.demo2.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo2.dto.NamaAlamatDosen;
import com.example.demo2.model.Dosen;
import com.example.demo2.repository.IDosenRepository;

@Repository
public class DosenRepository implements IDosenRepository{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Dosen insertDosen(Dosen dosen) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO tb_dosen(kd_dosen, nm_dosen, "
				+ "jenis_kelamin, alamat) VALUES(?, ?, ?, ?)";
		try {
			jdbcTemplate.update(query, new Object [] {dosen.getKd_dosen(), 
					dosen.getNm_dosen(), dosen.getJenis_kelamin(), dosen.getAlamat()});
			
			return dosen;
		} 
		catch (Exception e) {
			Dosen obj = new Dosen ();
			return obj;
		}
		
		
		
		
		
	}

	@Override
	public List<Dosen> getAll() {
		// TODO Auto-generated method stub		
		String query ="SELECT * FROM tb_dosen";
		List<Dosen> result = jdbcTemplate.query(query,
				new BeanPropertyRowMapper<>(Dosen.class));
		return result;
	}

	@Override
	public Dosen getDosen(int id, String alamat) {
		// TODO Auto-generated method stub
			String query ="SELECT * FROM tb_dosen"
					+ " WHERE id = ? AND alamat = ?";
			try {
			var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(Dosen.class),
					id, alamat);
			return result;
			} catch (Exception e) {
				Dosen obj = new Dosen ();
				return obj;
			}
	
	}
	
	@Override
	public NamaAlamatDosen getNamaAlamat(String kd_dosen) {
		// TODO Auto-generated method stub
			String query ="SELECT nm_dosen, alamat FROM tb_dosen"
					+ " WHERE kd_dosen = ?";
			
			try {
			var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(NamaAlamatDosen.class),
					kd_dosen);
			return result;
			} catch (Exception e) {
				NamaAlamatDosen obj = new NamaAlamatDosen ();
				return obj;
			}
	
	}
	
	@Override
	public Dosen changeName (int id, String nm_dosen) {
		// TODO Auto-generated method stub
			String query ="UPDATE tb_dosen SET nm_dosen = ?"
					+ " WHERE id = ?";
			
			try {
				jdbcTemplate.update(query, new Object[] {nm_dosen, id});
				query = "SELECT * FROM tb_dosen WHERE id = ?";
			var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(Dosen.class),
					id);
			return result;
			} catch (Exception e) {
				 Dosen dosen = new Dosen ();
				return dosen;
			}
	
	}

	@Override
	public Dosen deleteDosen (int id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_dosen WHERE "
				+ "id =?";
		
		try {
			var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(Dosen.class),
				id);
			query = "DELETE FROM tb_dosen WHERE"
					+ " id =?";
			jdbcTemplate.update(query,id);
			return result;
		} catch (Exception e) {
			 Dosen dosen = new Dosen ();
			return dosen;
		}
	
	}
	
}
