package hibernate.annotations;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "WORKER")
@Inheritance(strategy = InheritanceType.JOINED)
public class Worker {
	
	@Id
	@Column(name="WORKER_SID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int workerID;	

	@Column(name="NAME")
	private String workerName;
	
	@Column(name="PHONE")
	private String workerPhone;
	
	@Column(name="BIRTHDATE")
	private Date DOB;
	
	@Column(name="GENDER")
	private String workerGender;

	public int getWorkerID() {
		return workerID;
	}

	public void setWorkerID(int workerID) {
		this.workerID = workerID;
	}

	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public String getWorkerPhone() {
		return workerPhone;
	}

	public void setWorkerPhone(String workerPhone) {
		this.workerPhone = workerPhone;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getWorkerGender() {
		return workerGender;
	}

	public void setWorkerGender(String workerGender) {
		this.workerGender = workerGender;
	}
}
