package yaml.snake.dumpobjinyaml;

public class College extends Education{

	String collegeName;
	int collegeStudentCount;
	String collegeEstYear;
	boolean isFullyGovtFunded;
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getCollegeStudentCount() {
		return collegeStudentCount;
	}
	public void setCollegeStudentCount(int collegeStudentCount) {
		this.collegeStudentCount = collegeStudentCount;
	}
	public String getCollegeEstYear() {
		return collegeEstYear;
	}
	public void setCollegeEstYear(String collegeEstYear) {
		this.collegeEstYear = collegeEstYear;
	}
	public boolean isFullyGovtFunded() {
		return isFullyGovtFunded;
	}
	public void setFullyGovtFunded(boolean isFullyGovtFunded) {
		this.isFullyGovtFunded = isFullyGovtFunded;
	}

}
