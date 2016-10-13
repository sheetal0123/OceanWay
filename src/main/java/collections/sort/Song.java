package collections.sort;

public class Song implements Comparable<Song>{

	String title, film, singer;
	
	public Song(String t, String f, String sin){
		title = t;
		film = f;
		singer = sin;
	}

	public String getTitle() {
		return title;
	}

	public String getFilm() {
		return film;
	}

	public String getSinger() {
		return singer;
	}
	
	/**
	 * overridded toString as we are printing Song objects and we want to print song title
	 * if we dont override then sysout will not be in readable format
	 */
	@Override
	public String toString() {
		return title;
	}

	@Override
	public int compareTo(Song s) {
		return title.compareTo(s.getTitle());
	}

	
	
}
