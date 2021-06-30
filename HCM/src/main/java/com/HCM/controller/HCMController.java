package com.HCM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.HCM.entity.Health;
import com.HCM.service.HCMService;




@CrossOrigin("*")
@RestController
public class HCMController {


		
		@Autowired
		HCMService HCMService;
		
		@GetMapping(value = "/getAll")
		public List<Health> getAll(){
			return HCMService.getAll();
		}
		
		@PostMapping(value = "customersignup")
		public boolean signUp(@RequestBody Health HCM){
			
			return HCMService.signUp(HCM);
		}

		
		@GetMapping(value = "login/{id}/{pass}")
		public  List<Health> login(@PathVariable("id") String id, @PathVariable("pass") String pass){

			return HCMService.login(id, pass);
		}
		
		@GetMapping(value = "adminlogin/{id}/{pass}")
		public boolean adminLogin(@PathVariable("id") String id, @PathVariable("pass") String pass){

			return HCMService.adminLogin(id, pass);
		}
		
		@PostMapping("/edit/{id}")
		public Health edit(@RequestBody Health HCM,@PathVariable("id") String id) {
		    return HCMService.edit(HCM, id);
		}
		
		@GetMapping(value = "/autoDelete")
		public String delete() {
		    return HCMService.delete();
		}
		
	}
