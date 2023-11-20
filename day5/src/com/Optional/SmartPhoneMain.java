package com.Optional;

import java.util.Optional;

public class SmartPhoneMain {

	public static void main(String[] args) {
//		ScreenResol screenResol = new ScreenResol(1280, 1300);
//		DisplayFeatures displayFeatures = new DisplayFeatures("large", screenResol);
//		SmartPhone smartphone = new SmartPhone(101, "realme", "poco", displayFeatures);
//		MobileServiceStation mss = new MobileServiceStation();
//		System.out.println(mss.getScreenWidth(smartphone));

		ScreenResol screenResol = new ScreenResol(1280, 1300);
		Camera camera = new Camera("wide", 48);
		DisplayFeatures displayFeatures = new DisplayFeatures("large", Optional.of(screenResol), Optional.of(camera));
		SmartPhone smartphone = new SmartPhone(101, "realme", "poco", Optional.of(displayFeatures));
		MobileServiceStation mss = new MobileServiceStation();
		System.out.println(mss.getLens(Optional.of(smartphone)));
		System.out.println(mss.getMegaPixels(Optional.of(smartphone)));
		System.out.println(mss.getWidth(Optional.of(smartphone)));

		SmartPhone smartphone2 = new SmartPhone(101, "realme", "poco", Optional.empty());
//		System.out.println(mss.getWidth(Optional.of(smartphone2)));
	}

}
