package json.gson;

import java.math.BigDecimal;
import java.util.List;

public class EmployeesPojo {
	
	private String eID;
	private String eName;
	private String ePosition;
	private BigDecimal eSalary;
	private String eDept;
	private String eLocation;
	private List<String> skills;
	
	public String geteID() {
		return eID;
	}
	public void seteID(String eID) {
		this.eID = eID;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getePosition() {
		return ePosition;
	}
	public void setePosition(String ePosition) {
		this.ePosition = ePosition;
	}
	public BigDecimal geteSalary() {
		return eSalary;
	}
	public void seteSalary(BigDecimal eSalary) {
		this.eSalary = eSalary;
	}
	public String geteDept() {
		return eDept;
	}
	public void seteDept(String eDept) {
		this.eDept = eDept;
	}
	public String geteLocation() {
		return eLocation;
	}
	public void seteLocation(String eLocation) {
		this.eLocation = eLocation;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	
	@Override
	public String toString() {
		return "EmployeesPojo [eID=" + eID + ", eName=" + eName
				+ ", ePosition=" + ePosition + ", eSalary=" + eSalary
				+ ", eDept=" + eDept + ", eLocation=" + eLocation + ", skills="
				+ skills + "]";
	}
	
	
}
