package com.HCM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HCM.dao.HCMDao;
import com.HCM.entity.Health;



@Service
public class HCMServiceImpl implements HCMService {
	@Autowired
	HCMDao hcmDao ;
	
	
	@Override
	public List<Health> getAll() {
		// TODO Auto-generated method stub
		return hcmDao.getAll();
	}

	@Override
	public boolean signUp(Health obb) {
		// TODO Auto-generated method stub
		return hcmDao.signUp(obb);
	}

	@Override
	public  List<Health> login(String id, String pass) {
		// TODO Auto-generated method stub
		return hcmDao.login(id, pass);
	}

	@Override
	public boolean adminLogin(String id, String pass) {
		// TODO Auto-generated method stub
		return hcmDao.adminLogin(id, pass);
	}

	@Override
	public Health edit(Health obb, String id) {
		// TODO Auto-generated method stub
		return hcmDao.edit(obb, id);
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return hcmDao.delete();
	}

}
