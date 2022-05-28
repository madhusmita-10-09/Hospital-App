package hospital_app.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Encounter {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int encounterId;
	private LocalDateTime admitDateTime;
	private LocalDateTime dischargeDateTime;
	private String reason;
	@ManyToOne
	private Branch branch;
	
	@ManyToOne
	private Person person;
	@OneToMany
	private List<Observation> observation;
	@OneToMany
	private List<MedOrder> medOrder;
	/**
	 * @return the encounterId
	 */
	public int getEncounterId() {
		return encounterId;
	}
	/**
	 * @param encounterId the encounterId to set
	 */
	public void setEncounterId(int encounterId) {
		this.encounterId = encounterId;
	}
	/**
	 * @return the admitDateTime
	 */
	public LocalDateTime getAdmitDateTime() {
		return admitDateTime;
	}
	/**
	 * @param admitDateTime the admitDateTime to set
	 */
	public void setAdmitDateTime(LocalDateTime admitDateTime) {
		this.admitDateTime = admitDateTime;
	}
	/**
	 * @return the dischargeDateTime
	 */
	public LocalDateTime getDischargeDateTime() {
		return dischargeDateTime;
	}
	/**
	 * @param dischargeDateTime the dischargeDateTime to set
	 */
	public void setDischargeDateTime(LocalDateTime dischargeDateTime) {
		this.dischargeDateTime = dischargeDateTime;
	}
	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
	/**
	 * @return the branch
	 */
	public Branch getBranch() {
		return branch;
	}
	/**
	 * @param branch the branch to set
	 */
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}
	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}
	/**
	 * @return the observation
	 */
	public List<Observation> getObservation() {
		return observation;
	}
	/**
	 * @param observation the observation to set
	 */
	public void setObservation(List<Observation> observation) {
		this.observation = observation;
	}
	/**
	 * @return the medOrder
	 */
	/**
	 * @return the medOrder
	 */
	public List<MedOrder> getMedOrder() {
		return medOrder;
	}
	/**
	 * @param medOrder the medOrder to set
	 */
	public void setMedOrder(List<MedOrder> medOrder) {
		this.medOrder = medOrder;
	}
	
	/**
	 * @param medOrder the medOrder to set
	 */

	
	
	

}
