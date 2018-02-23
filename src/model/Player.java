package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	@Column(name = "teamId")
	private int teamId;
	
	public Player() {
		
	}
	
	public Player(String fn, String ln, String pn, String sn, int tId) {
		this.firstName = fn;
		this.lastName = ln;
		this.phoneNumber = pn;
		this.screenName = sn;
		this.teamId = tId;
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
	
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public int getTeamId() {
		return teamId;
	}

}
