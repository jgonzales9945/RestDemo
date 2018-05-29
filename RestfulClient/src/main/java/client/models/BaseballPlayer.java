package client.models;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseballPlayer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private int id;
	private String firstName;
	private String lastName;
	private double battingAverage;
	private int numOfHomeRuns;
	private int numOfStrikeOuts;
	
	public BaseballPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public BaseballPlayer(int id, String firstName, String lastName, double battingAverage, int numOfHomeRuns,
			int numOfStrikeOuts) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.battingAverage = battingAverage;
		this.numOfHomeRuns = numOfHomeRuns;
		this.numOfStrikeOuts = numOfStrikeOuts;
	}



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

	@Override
	public String toString() {
		return "BaseballPlayer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", battingAverage="
				+ battingAverage + ", numOfHomeRuns=" + numOfHomeRuns + ", numOfStrikeOuts=" + numOfStrikeOuts + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(battingAverage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + numOfHomeRuns;
		result = prime * result + numOfStrikeOuts;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseballPlayer other = (BaseballPlayer) obj;
		if (Double.doubleToLongBits(battingAverage) != Double.doubleToLongBits(other.battingAverage))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (numOfHomeRuns != other.numOfHomeRuns)
			return false;
		if (numOfStrikeOuts != other.numOfStrikeOuts)
			return false;
		return true;
	}
	
	
}
