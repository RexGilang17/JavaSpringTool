package com.example.demo2.repository.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.example.demo2.model.Kelas;
import com.example.demo2.repository.IKelasRepository;

@Repository

public class KelasRepository  implements IKelasRepository {
	
		
		@Autowired
		JdbcTemplate jdbcTemplate;

		@Override
		public Kelas insertKelas(Kelas kelas) {
			// TODO Auto-generated method stub
			String query = "INSERT INTO tb_kelas(kd_kelas, kd_dosen, "
					+ "kd_mk, ruang) VALUES(?, ?, ?, ?)";
			
			jdbcTemplate.update(query, new Object [] {kelas.getKd_kelas(), 
					kelas.getKd_dosen(), kelas.getKd_mk(), kelas.getRuang()});
			
			return kelas;
		}

		@Override
		public List<Kelas> getAll() {
			// TODO Auto-generated method stub		
			String query ="SELECT * FROM tb_kelas";
			List<Kelas> result = jdbcTemplate.query(query,
					new BeanPropertyRowMapper<>(Kelas.class));
			return result;
		}

		@Override
		public Kelas getKelas(int id, String ruang) {
			// TODO Auto-generated method stub
				String query ="SELECT * FROM tb_kelas"
						+ " WHERE id = ? AND ruang = ?";
				
				try {
					var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(Kelas.class),
							id, ruang);
					return result;
				} catch (Exception e) {
					Kelas kelas = new Kelas ();
					return kelas;
				}
				
		
		}
		
		
		
	}


