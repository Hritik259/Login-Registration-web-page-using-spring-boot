package net.javaguides.springboot.web.dto;

public class UserRegistrationDto {
	private String FullName;
	private String Contact;
	private String email;
	private String password;
	
	public UserRegistrationDto(){
		
	}
	
	public UserRegistrationDto(String fullName, String Contact, String email, String password) {
		super();
		this.FullName = fullName;
		this.Contact = Contact;
		this.email = email;
		this.password = password;
	}
	
	public String getFirstName() {
		return FullName;
	}
	public void setFirstName(String fullName) {
		this.FullName = fullName;
	}
	public String getLastName() {
		return Contact;
	}
	public void setLastName(String Contact) {
		this.Contact = Contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}