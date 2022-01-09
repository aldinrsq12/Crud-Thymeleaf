package com.aldin.crud.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aldin.crud.dao.MahasiswaRepository;
import com.aldin.crud.entity.Mahasiswa;


@Service
public class MahasiswaServiceImpl implements MahasiswaService {
	
	private MahasiswaRepository mahasiswaRepository;
	
	@Autowired
	public MahasiswaServiceImpl(MahasiswaRepository mahasiswaRepository) {
		this.mahasiswaRepository = mahasiswaRepository;
		
	}
	
	@Override
	public List<Mahasiswa> findAll() {
		
		return mahasiswaRepository.findAll();
	}

	@Override
	public Mahasiswa findById(int id) {
		// TODO Auto-generated method stub
		Optional<Mahasiswa> result = mahasiswaRepository.findById(id);
		
		Mahasiswa mahasiswa = null;
		if (result.isPresent()) {
			mahasiswa = result.get();
		}
		else {
			throw new RuntimeException("Did not find product with id - " + id);
		}
		return mahasiswa;
	}

	@Override
	public void saveMahasiswa(Mahasiswa mahasiswa) {
		 mahasiswaRepository.save(mahasiswa);
	}

	@Override
	public void deleteById(int id) {
		mahasiswaRepository.deleteById(id);

	}

}
