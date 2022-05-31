package hospital_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class MedOrder {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int medOrderId;
	private String dsecription;
	private double totalcost;
	
	@ManyToOne
	@JoinColumn
	private Encounter encounter;
	
	@OneToMany(mappedBy="medOrder")
	private List<Item> item;

	/**
	 * @return the medOrderId
	 */
	public int getMedOrderId() {
		return medOrderId;
	}

	/**
	 * @param medOrderId the medOrderId to set
	 */
	public void setMedOrderId(int medOrderId) {
		this.medOrderId = medOrderId;
	}

	/**
	 * @return the dsecription
	 */
	public String getDsecription() {
		return dsecription;
	}

	/**
	 * @param dsecription the dsecription to set
	 */
	public void setDsecription(String dsecription) {
		this.dsecription = dsecription;
	}

	/**
	 * @return the totalcost
	 */
	public double getTotalcost() {
		return totalcost;
	}

	/**
	 * @param totalcost the totalcost to set
	 */
	public void setTotalcost(double totalcost) {
		this.totalcost = totalcost;
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
	 * @return the item
	 */
	public List<Item> getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(List<Item> item) {
		this.item = item;
	}
	

}
