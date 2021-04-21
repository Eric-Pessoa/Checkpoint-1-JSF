package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.model.Subscription;
import br.com.fiap.util.EntityManagerFacade;

public class SubscriptionDAO {
	
	private EntityManager manager = EntityManagerFacade.getEntityManager();

	public void save(Subscription sub) {
		manager.getTransaction().begin();
		manager.persist(sub);
		manager.getTransaction().commit();
		
		manager.clear();
	}

	public List<Subscription> getAll() {
		String jpql = "Select s FROM Subscription s";
		return manager.createQuery(jpql, Subscription.class).getResultList();
		
	}


}
