package com.lijie.java.headfirst.chapter16Collection.collection;

/**实现Comparable接口**/
public class Song implements Comparable<Song>{
	
	String title;
	String artist;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public Song(String title,String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	
	
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + "]";
	}
	@Override
	public int compareTo(Song o) {
		return title.compareTo(o.getTitle());
	}
	
	/**重写equals**/
	public boolean equals(Object song) {
		Song s = (Song)song;
		return this.title.equals(s.getTitle());
	}
	
	/**重写hashCode**/
	public int hashCode(){
		return title.hashCode();
	}

}
