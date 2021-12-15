import java.util.*;

public class ContactService {
	ArrayList<Contact> contacts;

    public ContactService() {
    	contacts = new ArrayList<>();
    }

    // The contact service shall be able to add contacts with a unique ID
    public boolean addContact(Contact newContact) {
    	boolean contains = false;
    	for (Contact c : contacts) {
    		if (c.getContactID().equalsIgnoreCase(newContact.getContactID())) {
    			contains = true;
                break;
            }
    		
        }
    	if (!contains) {
    		contacts.add(newContact);
    		return true;
        } else {
        	return false;
        }
    }

    // The contact service shall be able to delete contacts per contact ID.
    public boolean deleteContact(String contactID) {
    	boolean deleted = false;
        for (Contact c : contacts) {
        	if (c.getContactID().equalsIgnoreCase(contactID)) {
        		contacts.remove(c);
                deleted = true;
                break;
            }
        }
        return deleted;
    }

    // Update First name for the given contact ID
    public boolean updateContactFirstName(String contactID, String newFirstName) {
    	boolean updated = false;
    	for (Contact c : contacts) {
    		if (c.getContactID().equalsIgnoreCase(contactID) && newFirstName.length() <= 10 && newFirstName != null) {
    			c.setFirstName(newFirstName);
    			updated = true;
    			break;
    			}
    		}
    	return updated;
    }

    // Update Last name for the given contact ID
    public boolean updateContactLastName(String contactID, String newLastName) {
    	boolean updated = false;
    	for (Contact c : contacts) {
    		if (c.getContactID().equalsIgnoreCase(contactID) && newLastName.length() <= 10 && newLastName != null) {
    			c.setLastName(newLastName);
    			updated = true;
    			break;
    			}
    		}
            return updated;
    }

    // Update number for the given contact ID
    public boolean updateContactNumber(String contactID, String newNumber) {
    	boolean updated = false;
    	for (Contact c : contacts) {
    		if (c.getContactID().equalsIgnoreCase(contactID) && newNumber.length() == 10 && newNumber != null) {
    			c.setPhoneNumber(newNumber);
    			updated = true;
    			break;
    			}
            }
    	return updated;
    }

    // Update Address for the given contact ID
    public boolean updateContactAddress(String contactID, String newAddress) {
    	boolean updated = false;
    	for (Contact c : contacts) {
    		if (c.getContactID().equalsIgnoreCase(contactID) && newAddress.length() <= 30 && newAddress != null) {
    			c.setAddress(newAddress);
    			updated = true;
    			break;
    			}
    		}
    	return updated;
    	}
    

}
