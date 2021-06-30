package com.HCM.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.HCM.entity.Health;


@Repository
@Transactional
public class HCMDaoImpl implements HCMDao{

	
		
		
		@PersistenceContext
		EntityManager entityManager;
		
		@Override
		public List<Health> getAll() {
			TypedQuery<Health> query = entityManager.createQuery("FROM Health", Health.class);
			List<Health> healthList = query.getResultList();
			return healthList;
		}

		@Override
		public boolean signUp(Health health) {
			entityManager.persist(health);
			return true;
		}

		@Override
		public List<Health> login(String username, String userpassword) {
			List<Health> health;
			
				TypedQuery<Health> query = entityManager.createQuery("FROM Health where username = :username AND userpassword =:userpassword", Health.class);
				
				query.setParameter("username", username);
				query.setParameter("userpassword", userpassword);

				 health = query.getResultList();
				 	
			return health;
		}

		@Override
		public boolean adminLogin(String id, String pass) {
			
			return id.equalsIgnoreCase("admin")&&pass.equalsIgnoreCase("admin");
		}

		@Override
		public Health edit(Health health, String username) {
			Health health1;
			TypedQuery<Health> query = entityManager.createQuery("FROM Health where username = :username", Health.class);
			query.setParameter("username", username);
			 health1 = query.getSingleResult() ;
			 	
			 		health1.setDoctor(health.getDoctor());
					health1.setPatient(health.getPatient());
					health1.setUserpassword(health.getUserpassword());
					health1.setAppointment(health.getAppointment());
					health1.setDate(LocalDate.now().toString());
					entityManager.merge(health1);
			return health1;
		}

		@Override
		public String delete() {
			TypedQuery<Health> query = entityManager.createQuery("FROM Health", Health.class);
			List<Health> healthList = query.getResultList();
			
			for (Health health : healthList) {
				
				String[] month=health.getDate().split("-",3);
				System.err.println((Integer.parseInt(month[1])+3)==LocalDate.now().getMonthValue());
				
				if((Integer.parseInt(month[1])+3)==LocalDate.now().getMonthValue())
				{
					entityManager.remove(health);
				}
			}
			
			
			return null;
			
		}

	}

