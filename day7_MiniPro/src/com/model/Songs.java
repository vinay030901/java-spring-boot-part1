package com.model;

import java.util.Optional;

public class Songs implements Comparable<Songs> {

	private String albumName, singerName, rating, genre;

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Songs [albumName=" + albumName + ", singerName=" + singerName + ", rating=" + rating + ", genre="
				+ genre + "]";
	}

	public Songs(String albumName, String singerName, String rating, String genre) {
		super();
		this.albumName = albumName;
		this.singerName = singerName;
		this.rating = rating;
		this.genre = genre;
	}

//	@Override
//	public int compareTo(Optional<Songs> o) {
//		// TODO Auto-generated method stub
//		return this.getSingerName().compareTo(o.getSingerName());
//	}

	@Override
	public int compareTo(Songs o) {
		// TODO Auto-generated method stub
		return this.getSingerName().compareTo(o.getSingerName());
	}

}
