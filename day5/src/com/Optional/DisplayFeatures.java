package com.Optional;

import java.util.Optional;

public class DisplayFeatures {

	private String size;
	private Optional<ScreenResol> sr;
	private Optional<Camera> camera;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Optional<ScreenResol> getSr() {
		return sr;
	}

	public void setSr(Optional<ScreenResol> sr) {
		this.sr = sr;
	}

	public Optional<Camera> getCamera() {
		return camera;
	}

	public void setCamera(Optional<Camera> camera) {
		this.camera = camera;
	}

	@Override
	public String toString() {
		return "DisplayFeatures [size=" + size + ", sr=" + sr + ", camera=" + camera + "]";
	}

	public DisplayFeatures(String size, Optional<ScreenResol> sr, Optional<Camera> camera) {
		super();
		this.size = size;
		this.sr = sr;
		this.camera = camera;
	}

}
