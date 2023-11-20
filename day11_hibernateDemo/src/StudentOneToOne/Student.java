package StudentOneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue
	private int studentId;
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	private Semester sem;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Semester getSem() {
		return sem;
	}

	public void setSem(Semester sem) {
		this.sem = sem;
	}

	public Student(String name, Semester sem) {
		super();
		this.name = name;
		this.sem = sem;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", sem=" + sem + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
