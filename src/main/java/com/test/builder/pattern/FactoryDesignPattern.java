package com.test.builder.pattern;

import java.security.GeneralSecurityException;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		
		Mobile comp = new Mobile.ComputerBuilder(
				"500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
	}
}

class Mobile {

	private String ram;
	private String internalMemory;

	// Optional parameter
	private boolean isExternalMemoryCardSupports;
	private boolean isFrontCameraAvailable;

	public Mobile(MobileBuilder mobileBuilder) {
		this.ram = mobileBuilder.ram;
		this.internalMemory = mobileBuilder.internalMemory;
		this.isExternalMemoryCardSupports = mobileBuilder.isExternalMemoryCardSupports();
		this.isFrontCameraAvailable = mobileBuilder.isFrontCameraAvailable();
	}

	private static class MobileBuilder {
		private String ram;
		private String internalMemory;

		// Optional parameter
		private boolean isExternalMemoryCardSupports;
		private boolean isFrontCameraAvailable;

		
		public MobileBuilder(String ram,String internalMemory) {
			this.ram=ram;
			this.internalMemory=internalMemory;
		}
		
		public Mobile build(){
			return new Mobile(this);
		}

		
		
		public boolean isExternalMemoryCardSupports() {
			return isExternalMemoryCardSupports;
		}

		public void setExternalMemoryCardSupports(boolean isExternalMemoryCardSupports) {
			this.isExternalMemoryCardSupports = isExternalMemoryCardSupports;
		}

		public boolean isFrontCameraAvailable() {
			return isFrontCameraAvailable;
		}

		public void setFrontCameraAvailable(boolean isFrontCameraAvailable) {
			this.isFrontCameraAvailable = isFrontCameraAvailable;
		}

	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getInternalMemory() {
		return internalMemory;
	}

	public void setInternalMemory(String internalMemory) {
		this.internalMemory = internalMemory;
	}

	public boolean isExternalMemoryCardSupports() {
		return isExternalMemoryCardSupports;
	}

	public void setExternalMemoryCardSupports(boolean isExternalMemoryCardSupports) {
		this.isExternalMemoryCardSupports = isExternalMemoryCardSupports;
	}

	public boolean isFrontCameraAvailable() {
		return isFrontCameraAvailable;
	}

	public void setFrontCameraAvailable(boolean isFrontCameraAvailable) {
		this.isFrontCameraAvailable = isFrontCameraAvailable;
	}
}
