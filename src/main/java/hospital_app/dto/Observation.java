package hospital_app.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Observation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int observationId;
	private String description;
	private LocalDateTime date;
	private LocalDateTime time;
	
	/**
	 * @return the time
	 */
	public LocalDateTime getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	@ManyToOne
	private Encounter encounter;
	/**
	 * @return the observationId
	 */
	public int getObservationId() {
		return observationId;
	}
	/**
	 * @param observationId the observationId to set
	 */
	public void setObservationId(int observationId) {
		this.observationId = observationId;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the datetime
	 */

	/**
	 * @return the encounter
	 */
	/**
	 * @return the encounter
	 */
	
	/**
	 * @return the date
	 */
	public LocalDateTime getDate() {
		return date;
	}
	/**
	 * @return the encounter
	 */
	public Encounter getEncounter() {
		return encounter;
	}
	/**
	 * @param encounter the encounter to set
	 */
	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	/**
	 * @param encounter the encounter to set
	 */
	
	
	
	

}
