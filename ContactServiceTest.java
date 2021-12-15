import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ContactServiceTest {
	ContactService cService = new ContactService();
	Contact contact1 = new Contact("0123789", "Rhonda", "McIntyre", "7064567890", "46 Hiya Hwy, Wakiki, Hi 96863");
	Contact contact2 = new Contact("1123788", "Elizabeth", "Sousa", "7064467845", "564 Wakiki way, Hawaii");
	Contact contact3 = new Contact("2123787", "Eva-Lani", "McIntyre", "7064567890", "108 Kaneohe Lane, Hawaii");
	
	@Test
	public void testAddContactPass() {
		
		assertEquals(true , cService.addContact(contact1));
		assertEquals(true , cService.addContact(contact2));
		assertEquals(true , cService.addContact(contact3));
	}
	@Test
	public void testAddContactFail() {
		assertEquals(true , cService.addContact(contact1));
		assertEquals(true , cService.addContact(contact2));
		assertEquals(false , cService.addContact(contact2));
		assertEquals(true , cService.addContact(contact3));
	}
	@Test
	public void testDeleteContactPass() {
		assertEquals(true , cService.addContact(contact1));
		assertEquals(true , cService.addContact(contact2));
		assertEquals(true , cService.addContact(contact3));
		
		assertEquals(true, cService.deleteContact("0123789"));
		assertEquals(true, cService.deleteContact("2123787"));
	}
	@Test
	public void testDeleteContactFail() {
		assertEquals(true , cService.addContact(contact1));
		assertEquals(true , cService.addContact(contact2));
		assertEquals(true , cService.addContact(contact3));
		
		assertEquals(false, cService.deleteContact("11101088"));
		assertEquals(true, cService.deleteContact("2123787"));
	}
	@Test
	public void testUpdateContactFirstNamePass() {
		assertEquals(true , cService.addContact(contact1));
		assertEquals(true , cService.addContact(contact2));
		assertEquals(true , cService.addContact(contact3));
		
		assertEquals(true, cService.updateContactFirstName("1123788","Jessica"));
		assertEquals(true, cService.updateContactFirstName("2123787","Tim"));
	}
	@Test
	public void testUpdateContactFirstNameFail() {
		assertEquals(true , cService.addContact(contact1));
		assertEquals(true , cService.addContact(contact2));
		assertEquals(true , cService.addContact(contact3));
		
		assertEquals(false, cService.updateContactFirstName("1123788","Alexander the Great"));
		assertEquals(true, cService.updateContactFirstName("2123787","Tim"));
	}
	@Test
	public void testUpdateContactLastNamePass() {
		assertEquals(true , cService.addContact(contact1));
		assertEquals(true , cService.addContact(contact2));
		assertEquals(true , cService.addContact(contact3));
		
		assertEquals(true, cService.updateContactLastName("1123788","Simpson"));
		assertEquals(true, cService.updateContactLastName("2123787","McGraw"));
	}
	@Test
	public void testUpdateContactLastNameFail() {
		assertEquals(true , cService.addContact(contact1));
		assertEquals(true , cService.addContact(contact2));
		assertEquals(true , cService.addContact(contact3));
		
		assertEquals(false, cService.updateContactLastName("1123788","HumuHumuNukuNukuAPuAA"));
		assertEquals(true, cService.updateContactLastName("2123787","McGraw"));
	}
	@Test
	public void testUpdateContactNumberPass() {
		assertEquals(true , cService.addContact(contact1));
		assertEquals(true , cService.addContact(contact2));
		assertEquals(true , cService.addContact(contact3));
		
		assertEquals(true, cService.updateContactNumber("1123788","7068675309"));
		assertEquals(true, cService.updateContactNumber("2123787","7064145300"));
	}
	@Test
	public void testUpdateContactNumberFail() {
		assertEquals(true , cService.addContact(contact1));
		assertEquals(true , cService.addContact(contact2));
		assertEquals(true , cService.addContact(contact3));
		
		assertEquals(false, cService.updateContactNumber("1123788","(706)867-5309"));
		assertEquals(true, cService.updateContactNumber("2123787","7064145300"));
	}
	@Test
	public void testUpdateContactAddressPass() {
		assertEquals(true , cService.addContact(contact1));
		assertEquals(true , cService.addContact(contact2));
		assertEquals(true , cService.addContact(contact3));
		
		assertEquals(true, cService.updateContactAddress("1123788","102 BeeHive Way, Georgia"));
		assertEquals(true, cService.updateContactAddress("2123787","123 Seseme Street, CA"));
	}
	@Test
	public void testUpdateContactAddressFail() {
		assertEquals(true , cService.addContact(contact1));
		assertEquals(true , cService.addContact(contact2));
		assertEquals(true , cService.addContact(contact3));
		
		assertEquals(true, cService.updateContactAddress("1123788","123 Seseme Street, CA"));
		assertEquals(false, cService.updateContactAddress("2123787","189 BelleView Manor, Hollywood, CA"));
	}
	
}
