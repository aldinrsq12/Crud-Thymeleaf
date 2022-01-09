package com.aldin.crud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aldin.crud.entity.Mahasiswa;

public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Integer> {

	public List<Mahasiswa> findAll();
}
