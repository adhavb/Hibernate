package hibernate.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "PERMANENTWORKER")
@PrimaryKeyJoinColumn(name = "WORKER_SID")
public class PermanentWorker extends Worker{
	
	@Column(name="salary")    
	private float salary;  
	  
	@Column(name="bonus")     
	private int bonus;
	
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	} 
}
