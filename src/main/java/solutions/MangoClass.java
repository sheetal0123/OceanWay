package solutions;

import com.mastercard.pts.integrated.acquiring.domain.institution.SearchViewTransaction;

public class MangoClass {

	int id;
	String name;
	String color;
	String taste;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		MangoClass actual;
		if (obj instanceof MangoClass) {
			actual = (MangoClass) obj;
		} else {
			return false;
		}
		
		
		boolean result = false;
		if (verifyData(actual)) {
			result = true;
		}
		return result;
	}

	/**
	 *  this will represent expected obj as expected obj calls equals method
	 */
	public boolean verifyData(MangoClass actual) {
		return actual.getId() == this.getId()
			&& actual.getName().equals(this.getName())
			&& actual.getColor().equals(this.getColor())
			&& actual.getTaste().equals(this.getTaste());
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MangoClass [id=").append(id).append(", name=")
				.append(name).append(", color=").append(color)
				.append(", taste=").append(taste).append("]");
		return builder.toString();
	}
	
}
