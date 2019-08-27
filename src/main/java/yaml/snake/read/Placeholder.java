package yaml.snake.read;

import java.util.List;

public class Placeholder {

	List<Child> child;

	public List<Child> getChild() {
		return child;
	}

	public void setChild(List<Child> child) {
		this.child = child;
	}

	@Override
	public String toString() {
		return "Placeholder [child=" + child + "]";
	}

}