package yaml.jackson.yaml2pojo.completeyaml;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "firstname", "lastname", "age", "rating", "marks", "birthday", "male", "fav_num", "hobbies",
		"movies", "friends", "summary", "signature" })
public class Person {

	@JsonProperty("firstname")
	private String firstname;
	@JsonProperty("lastname")
	private String lastname;
	@JsonProperty("age")
	private int age;
	@JsonProperty("rating")
	private String rating;
	@JsonProperty("marks")
	private int marks;
	@JsonProperty("birthday")
	private String birthday;
	@JsonProperty("male")
	private boolean male;
	@JsonProperty("fav_num")
	private int favNum;
	@JsonProperty("hobbies")
	private List<String> hobbies = null;
	@JsonProperty("movies")
	private List<String> movies = null;
	@JsonProperty("friends")
	private List<Friend> friends = null;
	@JsonProperty("summary")
	private String summary;
	@JsonProperty("signature")
	private String signature;
//	@JsonProperty("schoolfriends")
//	private List<Friend> schoolfriends = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("firstname")
	public String getFirstname() {
		return firstname;
	}

	@JsonProperty("firstname")
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@JsonProperty("lastname")
	public String getLastname() {
		return lastname;
	}

	@JsonProperty("lastname")
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@JsonProperty("age")
	public int getAge() {
		return age;
	}

	@JsonProperty("age")
	public void setAge(int age) {
		this.age = age;
	}

	@JsonProperty("rating")
	public String getRating() {
		return rating;
	}

	@JsonProperty("rating")
	public void setRating(String rating) {
		this.rating = rating;
	}

	@JsonProperty("marks")
	public int getMarks() {
		return marks;
	}

	@JsonProperty("marks")
	public void setMarks(int marks) {
		this.marks = marks;
	}

	@JsonProperty("birthday")
	public String getBirthday() {
		return birthday;
	}

	@JsonProperty("birthday")
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@JsonProperty("male")
	public boolean isMale() {
		return male;
	}

	@JsonProperty("male")
	public void setMale(boolean male) {
		this.male = male;
	}

	@JsonProperty("fav_num")
	public int getFavNum() {
		return favNum;
	}

	@JsonProperty("fav_num")
	public void setFavNum(int favNum) {
		this.favNum = favNum;
	}

	@JsonProperty("hobbies")
	public List<String> getHobbies() {
		return hobbies;
	}

	@JsonProperty("hobbies")
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	@JsonProperty("movies")
	public List<String> getMovies() {
		return movies;
	}

	@JsonProperty("movies")
	public void setMovies(List<String> movies) {
		this.movies = movies;
	}

	@JsonProperty("friends")
	public List<Friend> getFriends() {
		return friends;
	}

	@JsonProperty("friends")
	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}

	@JsonProperty("summary")
	public String getSummary() {
		return summary;
	}

	@JsonProperty("summary")
	public void setSummary(String summary) {
		this.summary = summary;
	}

	@JsonProperty("signature")
	public String getSignature() {
		return signature;
	}

	@JsonProperty("signature")
	public void setSignature(String signature) {
		this.signature = signature;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	
	
//	public List<Friend> getSchoolfriends() {
//		return schoolfriends;
//	}
//
//	public void setSchoolfriends(List<Friend> schoolfriends) {
//		this.schoolfriends = schoolfriends;
//	}

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", rating=" + rating
				+ ", marks=" + marks + ", birthday=" + birthday + ", male=" + male + ", favNum=" + favNum + ", hobbies="
				+ hobbies + ", movies=" + movies + ", friends=" + friends + ", summary=" + summary + ", signature="
				+ signature + ", additionalProperties=" + additionalProperties + "]";
	}

	

}
