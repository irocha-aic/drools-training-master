package com.myspace.drools_training_master;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Passport implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String passportNumber;
	private java.lang.String name;
	private java.time.LocalDate expiresOn;
	private int unusedVisaPages;
	private int age;

	private java.lang.String cause = "";

	public Passport() {
	}

	public java.lang.String getPassportNumber() {
		return this.passportNumber;
	}

	public void setPassportNumber(java.lang.String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.time.LocalDate getExpiresOn() {
		return this.expiresOn;
	}

	public void setExpiresOn(java.time.LocalDate expiresOn) {
		this.expiresOn = expiresOn;
	}

	public int getUnusedVisaPages() {
		return this.unusedVisaPages;
	}

	public void setUnusedVisaPages(int unusedVisaPages) {
		this.unusedVisaPages = unusedVisaPages;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public java.lang.String getCause() {
		return this.cause;
	}

	public void setCause(java.lang.String cause) {
		this.cause = cause;
	}

	public boolean isExpired() {
		return this.expiresOn.isBefore(java.time.LocalDate.now());
	}

	@Override
	public String toString() {
		return java.lang.String.format("Passport[no:%s, name:%s]",
				passportNumber, name);
	}

	public static PassportBuilder newBuilder() {
		return new PassportBuilder();
	}

	public static final class PassportBuilder {
		private java.lang.String passportNumber;
		private java.lang.String name;
		private java.time.LocalDate expiresOn;
		private int unusedVisaPages;
		private int age;

		private PassportBuilder() {
		}

		public PassportBuilder withPassportNumber(
				java.lang.String passportNumber) {
			this.passportNumber = passportNumber;
			return this;
		}

		public PassportBuilder withName(java.lang.String name) {
			this.name = name;
			return this;
		}

		public PassportBuilder withExpiresOn(java.time.LocalDate expiresOn) {
			this.expiresOn = expiresOn;
			return this;
		}

		public PassportBuilder withUnusedVisaPages(int unusedVisaPages) {
			this.unusedVisaPages = unusedVisaPages;
			return this;
		}

		public PassportBuilder withAge(int age) {
			this.age = age;
			return this;
		}

		public Passport build() {
			Passport passport = new Passport();
			passport.passportNumber = passportNumber;
			passport.name = name;
			passport.expiresOn = expiresOn;
			passport.unusedVisaPages = unusedVisaPages;
			passport.age = age;
			return passport;
		}
	}

	public Passport(java.lang.String passportNumber, java.lang.String name,
			java.time.LocalDate expiresOn, int unusedVisaPages, int age,
			java.lang.String cause) {
		this.passportNumber = passportNumber;
		this.name = name;
		this.expiresOn = expiresOn;
		this.unusedVisaPages = unusedVisaPages;
		this.age = age;
		this.cause = cause;
	}
}