
public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
		if(contactId.length() <= 10 && contactId != null) {
			this.contactID = contactId;
		}
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhoneNumber(phone);
		this.setAddress(address);
		
	}

	public void setFirstName(String firstName) {
		if(firstName.length() <= 10 && firstName != null) {
			this.firstName = firstName;
		}
	}
	public void setLastName(String lastName) {
		if(lastName.length() <= 10 && lastName != null) {
			this.lastName = lastName;
		}
	}
	public void setPhoneNumber(String phone) {
		if(phone.length() == 10 && phone != null) {
			this.phone = phone;
		}
	}
	public void setAddress(String address) {
		if(address.length() <= 30 && address != null) {
			this.address = address;
		}
	}
	public String getContactID() {
		return contactID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getPhoneNumber() {
		return phone;
	}
	public String getLastName() {
		return lastName;
	}
	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "Contact [contactID = " + contactID + ", firstName = " + firstName + ", lastName = " + lastName + ", phoneNumber = " + phone + " ,address = " + address + "]";
	}

}
