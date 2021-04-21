package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;


import br.com.fiap.model.Setup;
import br.com.fiap.util.EntityManagerFacade;

public class SetupDAO {
	
	private EntityManager manager = EntityManagerFacade.getEntityManager();

	public void save(Setup setup) {
		manager.getTransaction().begin();
		manager.persist(setup);
		manager.getTransaction().commit();
		
		manager.clear();
	}

	public List<Setup> getAll() {
		String jpql = "Select s FROM Setup s";
		return manager.createQuery(jpql, Setup.class).getResultList();
		
	}

}
