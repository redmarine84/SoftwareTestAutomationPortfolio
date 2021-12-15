//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class ContactTest {
	Contact contact1 = new Contact("0123789", "Rhonda", "McIntyre", "7064567890", "46 Hiya Hwy, Wakiki, Hi 96863");
	Contact contact2 = new Contact("1123788", "Elizabeth", "Sousa", "7064467845", "564 Wakiki way, Hawaii");
	Contact contact3 = new Contact("2123787", "Eva-Lani", "McIntyre", "7064561230", "108 Kaneohe Lane, Hawaii");
	
	@Test
	public void testGetFirstPass() {
	
		assertEquals("Rhonda" , contact1.getFirstName(),"Rhonda");
		assertEquals("Elizabeth", contact2.getFirstName(),"Elizabeth");
		assertEquals("Eva-Lani", contact3.getFirstName(),"Eva-Lani");
	}
	@Test
	public void testGetFirstFail() {
		assertEquals("Rhonda" , contact1.getFirstName(),"Rhonda");
		assertEquals("Rhonda" , contact1.getFirstName(),"Ron");
		assertEquals("Elizabeth", contact2.getFirstName(),"Elizabeth");;
		assertEquals("Eva-Lani", contact3.getFirstName(),"Eva-Lani");
	}
	@Test
	public void testGetLastPass() {
		assertEquals("McIntyre" , contact1.getLastName(),"McIntyre");
		assertEquals("Sousa" , contact2.getLastName(),"Sousa");
		assertEquals("McIntyre" , contact3.getLastName(),"McIntyre");
	}
	@Test
	public void testGetLastFail() {
		assertEquals("McIntyre" , contact1.getLastName(),"McIntyre");
		assertEquals("McIntyre" , contact1.getLastName(),"Sousa");
		assertEquals("Sousa" , contact2.getLastName(),"Sousa");
		assertEquals("McIntyre" , contact3.getLastName(),"McIntyre");
	}
	@Test
	public void testGetPhoneNumberPass() {
		assertEquals("7064567890" , contact1.getPhoneNumber(),"7064567890");
		assertEquals("7064467845" , contact2.getPhoneNumber(),"7064467845");
		assertEquals("7064561230" , contact3.getPhoneNumber(),"7064561230");
	}
	@Test
	public void testGetPhoneNumberFail() {
		assertEquals("7064567890" , contact1.getPhoneNumber(),"7064567890");
		assertEquals("7064567890" , contact1.getPhoneNumber(),"7068675309");
		assertEquals("7064467845" , contact2.getPhoneNumber(),"7064467845");
		assertEquals("7064561230" , contact3.getPhoneNumber(),"7064561230");
	}
	@Test
	public void testGetAddressPass() {
		assertEquals("46 Hiya Hwy, Wakiki, Hi 96863" , contact1.getAddress(), "46 Hiya Hwy, Wakiki, Hi 96863");
		assertEquals("564 Wakiki way, Hawaii" , contact2.getAddress(), "564 Wakiki way, Hawaii");
		assertEquals("108 Kaneohe Lane, Hawaii" , contact3.getAddress(), "108 Kaneohe Lane, Hawaii");
	}
	@Test
	public void testGetAddressFail() {
		assertEquals("46 Hiya Hwy, Wakiki, Hi 96863" , contact1.getAddress(), "46 Hiya Hwy, Wakiki, Hi 96863");
		assertEquals("46 Hiya Hwy, Wakiki, Hi 96863" , contact1.getAddress(), "1654 RiverDale Drive, California");
		assertEquals("564 Wakiki way, Hawaii" , contact2.getAddress(), "564 Wakiki way, Hawaii");
		assertEquals("108 Kaneohe Lane, Hawaii" , contact3.getAddress(), "108 Kaneohe Lane, Hawaii");
	}
	
	
}
