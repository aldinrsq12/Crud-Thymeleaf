package com.aldin.crud.service;

import java.util.List;

import com.aldin.crud.entity.Mahasiswa;


public interface MahasiswaService {
	
	public List<Mahasiswa> findAll();
	
	public Mahasiswa findById(int id);
	
	public void saveMahasiswa(Mahasiswa mahasiswa);
	
	public void deleteById(int id);
}
