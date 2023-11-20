package com.Optional;

import java.util.Optional;

public class MobileServiceStation {

//	public int getScreenWidth(SmartPhone phone) {
//		if (phone != null) {
//			Optional<DisplayFeatures> displayFeatures = phone.getDf();
//			if (displayFeatures != null) {
//				DisplayFeatures c = displayFeatures.get();
////				if (c != null)
////					return c.getWidth();
//			}
//		}
//		return 0;
//	}

	public int getWidth(Optional<SmartPhone> mobile) {
		return mobile.flatMap(SmartPhone::getDf).flatMap(DisplayFeatures::getSr).map(ScreenResol::getWidth).orElse(0);
	}

	public String getLens(Optional<SmartPhone> mobile) {
		return mobile.flatMap(SmartPhone::getDf).flatMap(DisplayFeatures::getCamera).map(Camera::getLens).orElse("");
	}

	public int getMegaPixels(Optional<SmartPhone> mobile) {
		return mobile.flatMap(SmartPhone::getDf).flatMap(DisplayFeatures::getCamera).map(Camera::getMegapixels)
				.orElse(0);
	}
}
