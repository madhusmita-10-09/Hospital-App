package hospital_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Branch {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int branchId;
	private String name;
	private String email;
	private long phone;
	private int numberOfStaff;
	@ManyToOne
	private Hospital hospital;
	
	@OneToMany
	private List<Encounter> encounter;
	@OneToOne
	private Address address;
	/**
	 * @return the branchId
	 */
	public int getBranchId() {
		return branchId;
	}
	/**
	 * @param branchId the branchId to set
	 */
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phone
	 */
	public long getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(long phone) {
		this.phone = phone;
	}
	/**
	 * @return the numberOfStaff
	 */
	public int getNumberOfStaff() {
		return numberOfStaff;
	}
	/**
	 * @param numberOfStaff the numberOfStaff to set
	 */
	public void setNumberOfStaff(int numberOfStaff) {
		this.numberOfStaff = numberOfStaff;
	}
	/**
	 * @return the hospital
	 */
	public Hospital getHospital() {
		return hospital;
	}
	/**
	 * @param hospital the hospital to set
	 */
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	/**
	 * @return the encounter
	 */
	public List<Encounter> getEncounter() {
		return encounter;
	}
	/**
	 * @param encounter the encounter to set
	 */
	public void setEncounter(List<Encounter> encounter) {
		this.encounter = encounter;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
