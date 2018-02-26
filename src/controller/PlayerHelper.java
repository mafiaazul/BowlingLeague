package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Player;

public class PlayerHelper {
	
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("BowlingLeagueRocha");
	
	public void insertPlayer(Player p) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();
	}
}
