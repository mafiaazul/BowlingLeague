package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Team;

public class TeamHelper {

	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("BowlingLeagueRocha");
	
	public void insertTeam(Team team) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(team);
		em.getTransaction().commit();
		em.close();
	}
	
}
