package com.aldin.crud.controller;



import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aldin.crud.entity.Mahasiswa;
import com.aldin.crud.service.MahasiswaService;


@Controller
@RequestMapping("/mahasiswa")
public class MahasiswaController {
	
	private MahasiswaService mahasiswaService;
		
	public MahasiswaController(MahasiswaService mahasiswaService) {
		this.mahasiswaService = mahasiswaService;
	}

	@GetMapping("/list")
	public String listEmployees(Model theModel) {
			
		List<Mahasiswa> theMahasiswa = mahasiswaService.findAll();
			
		theModel.addAttribute("mahasiswa", theMahasiswa);
			
		return "mahasiswa/list-mahasiswa";
		
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		// create the model attribute to bind form data
		Mahasiswa mahasiswa = new Mahasiswa();
		
		model.addAttribute("mahasiswa" , mahasiswa);
		
		return "mahasiswa/mahasiswa-form";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("id") int id, Model model) {
		
		Mahasiswa mahasiswa = mahasiswaService.findById(id);
		
		model.addAttribute("employee", new Mahasiswa());
		
		return "mahasiswa/mahasiswa-form";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("mahasiswa") Mahasiswa mahasiswa) {
		mahasiswaService.saveMahasiswa(mahasiswa);
		
		return "redirect:/mahasiswa/list";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		
		mahasiswaService.deleteById(id);
		
		return "redirect:/mahasiswa/list";
	}
		

}

