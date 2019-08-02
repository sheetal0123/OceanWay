package yaml.snake.dumpobjinyaml;

public class School extends Education{

	String schoolName;
	int schoolStudentCount;
	String schoolEstYear;
	boolean isFullyGovtFunded;
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getSchoolStudentCount() {
		return schoolStudentCount;
	}
	public void setSchoolStudentCount(int schoolStudentCount) {
		this.schoolStudentCount = schoolStudentCount;
	}
	public String getSchoolEstYear() {
		return schoolEstYear;
	}
	public void setSchoolEstYear(String schoolEstYear) {
		this.schoolEstYear = schoolEstYear;
	}
	public boolean isFullyGovtFunded() {
		return isFullyGovtFunded;
	}
	public void setFullyGovtFunded(boolean isFullyGovtFunded) {
		this.isFullyGovtFunded = isFullyGovtFunded;
	}
	
	
	
}
