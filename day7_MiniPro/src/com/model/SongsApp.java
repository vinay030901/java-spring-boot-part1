package com.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SongsApp {

	List<Optional<Songs>> al = new ArrayList<>();

	public void addSongs(String lineToParse) {
		String[] tokens = lineToParse.split("/");
		Optional<Songs> userSongs = Optional.of(new Songs(tokens[0], tokens[1], tokens[2], tokens[3]));
		al.add(userSongs);
	}

	public void getSongs() {
		try {
			File file = new File("dataFile/songs.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				addSongs(line);
			}
		} catch (Exception e) {

		}

	}

	public void displayData() {
		Optional.of(al).stream().forEach(i -> System.out.println(i));
	}

	public void sortData() {
		al.stream().filter(Optional::isPresent).map(Optional::get).sorted()
				.forEach(song -> System.out.println(song));
	}

	public void show() {
		getSongs();
		System.out.println(al);
	}

}
