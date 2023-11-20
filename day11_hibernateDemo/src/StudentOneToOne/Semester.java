package StudentOneToOne;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Semester {

	@Id
	@GeneratedValue
	private int semNumber;
	private int duration;
	private int noOfStudent;

	public Semester(int duration, int noOfStudent) {
		super();
		this.duration = duration;
		this.noOfStudent = noOfStudent;
	}

	public int getSemNumber() {
		return semNumber;
	}

	public void setSemNumber(int semNumber) {
		this.semNumber = semNumber;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getNoOfStudent() {
		return noOfStudent;
	}

	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}

	@Override
	public String toString() {
		return "Semester [semNumber=" + semNumber + ", duration=" + duration + ", noOfStudent=" + noOfStudent + "]";
	}

	public Semester() {
		super();
	}

}
