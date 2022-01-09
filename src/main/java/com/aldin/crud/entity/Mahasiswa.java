package com.aldin.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mahasiswas")
public class Mahasiswa {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nim")
	private int nim;
	
	@Column(name="name")
	private String name;
	
	@Column(name="jurusan")
	private String jurusan;
	
	@Column(name="fakultas")
	private String fakultas;
	
	@Column(name="matkul")
	private String matkul;
	
		
	
	public Mahasiswa() {
		
	}
	
	public Mahasiswa(int id, int nim, String name, String jurusan, String fakultas, String matkul) {
		this.id = id;
		this.nim = nim;
		this.name = name;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
		this.matkul = matkul;
	}


	

	public Mahasiswa(int nim, String name, String jurusan, String fakultas, String matkul) {
		this.nim = nim;
		this.name = name;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
		this.matkul = matkul;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNim() {
		return nim;
	}

	public void setNim(int nim) {
		this.nim = nim;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJurusan() {
		return jurusan;
	}

	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}

	public String getFakultas() {
		return fakultas;
	}

	public void setFakultas(String fakultas) {
		this.fakultas = fakultas;
	}

	public String getMatkul() {
		return matkul;
	}

	public void setMatkul(String matkul) {
		this.matkul = matkul;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", nim=" + nim + ", name=" + name + ", jurusan=" + jurusan + ", fakultas=" + fakultas + ", matkul=" + matkul + "]";
	}

			
}

