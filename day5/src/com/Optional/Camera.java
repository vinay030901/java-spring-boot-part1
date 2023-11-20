package com.Optional;

public class Camera {

	private String lens;
	private int megapixels;

	public String getLens() {
		return lens;
	}

	public void setLens(String lens) {
		this.lens = lens;
	}

	public int getMegapixels() {
		return megapixels;
	}

	public void setMegapixels(int megapixels) {
		this.megapixels = megapixels;
	}

	public Camera(String lens, int megapixels) {
		super();
		this.lens = lens;
		this.megapixels = megapixels;
	}

	@Override
	public String toString() {
		return "Camera [lens=" + lens + ", megapixels=" + megapixels + "]";
	}

}
