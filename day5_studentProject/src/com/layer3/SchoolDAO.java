package com.layer3;

import java.util.Optional;

import com.layer2.School;

@FunctionalInterface
public interface SchoolDAO {

	public void showData(Optional<School> s);
}
