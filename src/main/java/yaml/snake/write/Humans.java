package yaml.snake.write;

public class Humans {
	
	int age;
	String smile;
	String innovation;
	boolean isBestCreature;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSmile() {
		return smile;
	}

	public void setSmile(String smile) {
		this.smile = smile;
	}

	public String getInnovation() {
		return innovation;
	}

	public void setInnovation(String innovation) {
		this.innovation = innovation;
	}

	public boolean isBestCreature() {
		return isBestCreature;
	}

	public void setBestCreature(boolean isBestCreature) {
		this.isBestCreature = isBestCreature;
	}

	@Override
	public String toString() {
		return "Humans [age=" + age + ", smile=" + smile + ", innovation=" + innovation + ", isBestCreature="
				+ isBestCreature + "]";
	}
	
	
	
}
