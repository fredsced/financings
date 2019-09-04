package fr.formation.financings.entities;

import javax.persistence.Embeddable;

@Embeddable // Embarquable
public class ContactInfo {

    private String email;

    private String phone;

    private String mobile;

    public ContactInfo() {
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getPhone() {
	return phone;
    }

    public void setPhone(String phone) {
	this.phone = phone;
    }

    public String getMobile() {
	return mobile;
    }

    public void setMobile(String mobile) {
	this.mobile = mobile;
    }
}