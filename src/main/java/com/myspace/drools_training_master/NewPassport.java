package com.myspace.drools_training_master;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class NewPassport implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String passportNumber;
	private java.lang.String name;
	private java.time.LocalDate expiresOn;
	private int unusedVisaPages;
	private int age;
	
	private java.lang.String cause = "";

	public NewPassport() {
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
    
	public NewPassport(java.lang.String passportNumber, java.lang.String name,
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