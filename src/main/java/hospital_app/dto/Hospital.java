package hospital_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Hospital {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int hospitalId;
	private String name;
	private String gstNumber;
	@OneToMany(mappedBy="hospital")
	private List<Branch>branch;
	/**
	 * @return the hospitalId
	 */
	public int getHospitalId() {
		return hospitalId;
	}
	/**
	 * @param hospitalId the hospitalId to set
	 */
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
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
	 * @return the gstNumber
	 */
	public String getGstNumber() {
		return gstNumber;
	}
	/**
	 * @param gstNumber the gstNumber to set
	 */
	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}
	/**
	 * @return the branch
	 */
	public List<Branch> getBranch() {
		return branch;
	}
	/**
	 * @param branch the branch to set
	 */
	public void setBranch(List<Branch> branch) {
		this.branch = branch;
	}
	
	

}
