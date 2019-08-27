package yaml.snake.read;

public class Child {

	String photoId;
	String category;

	public String getPhotoId() {
		return photoId;
	}

	public void setPhotoId(String photoId) {
		this.photoId = photoId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Child [photoId=" + photoId + ", category=" + category + "]";
	}

}