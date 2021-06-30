package com.HCM.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.HCM.entity.Health;



public interface HCMService {
	public List<Health> getAll();
	public boolean signUp(Health Health);
	public  List<Health> login(String id, String pass);
	public boolean adminLogin(String id, String pass);
	public Health edit(Health Health, String id);
	public String delete();
	
}
