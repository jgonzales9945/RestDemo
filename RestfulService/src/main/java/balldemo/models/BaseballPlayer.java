package balldemo.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="BASEBALL_PLAYER")
public class BaseballPlayer implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="playerId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="BATTING_AVERAGE")
	private double battingAverage;
	
	@Column(name="NUM_OF_HRS")
	private int numOfHomeRuns;
	
	@Column(name="NUM_OF_STKS")
	private int numOfStrikeOuts;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getBattingAverage() {
		return battingAverage;
	}

	public void setBattingAverage(double battingAverage) {
		this.battingAverage = battingAverage;
	}

	public int getNumOfHomeRuns() {
		return numOfHomeRuns;
	}

	public void setNumOfHomeRuns(int numOfHomeRuns) {
		this.numOfHomeRuns = numOfHomeRuns;
	}

	public int getNumOfStrikeOuts() {
		return numOfStrikeOuts;
	}

	public void setNumOfStrikeOuts(int numOfStrikeOuts) {
		this.numOfStrikeOuts = numOfStrikeOuts;
	}
	
	
}
