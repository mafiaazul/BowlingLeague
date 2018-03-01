package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "playerId")
	private int playerId;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "phoneNumber")
	private String phoneNumber;
	@Column(name = "screenName")
	private String screenName;
	@ManyToOne
	@JoinColumn(name = "teamId")
	private Team team; 
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "teamId")
	private Team team;
	
	public Player() {
	}
	
	public Player(String fn, String ln, String pn, String sn, Team team) {
		this.setFirstName(fn);
		this.setLastName(ln);
		this.setPhoneNumber(pn);
		this.setScreenName(sn);
		this.setTeam(team);
	}

	public Player(String firstName, String lastName, String phoneNumber, String screenName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.screenName = screenName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public int getPlayerId() {
		return playerId;
	}
	
	public Team getTeam() {
		return team;
		 	}

	public void setTeam(Team team) {
		this.team = team;
		 	}

	}
	public void setTeam(Team team) {
		this.team = team;
	}

}
