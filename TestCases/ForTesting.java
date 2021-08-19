import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ForTesting {

	Junitdemo testcase = new Junitdemo();

	@Test
	public void FirstNameShouldBeMoreThenThreeLetterAndFirstLetterShouldBeLetterCaptial() {
		assertEquals("Shobhit", testcase.FirstName("Shobhit"));
	}

	@Test
	public void LastNameShouldBeMoreThenThreeLetterAndLastLetterShouldBeLetterCaptial() {
		assertEquals("Ranjan", testcase.LastName("Ranjan"));
	}
	@Test
	public void EmailIdshouldBeInProperFormat() {
		assertEquals("shobhit.ranjan03@gmail.com", testcase.Emailid("shobhit.ranjan03@gmail.com"));
		
	}
	
	

}
