package controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PlayerHelper {
	
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("BowlingLeagueRocha");
}
