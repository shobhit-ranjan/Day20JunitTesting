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

	@Test
	public void PhoneNumberShouldBeinProperFormat() {
		assertTrue(Junitdemo.isValid("8934888299"));
	}

	@Test
	public void PhoneNumberShouldBeinProperFormatGiveWrong() {
		assertTrue(Junitdemo.isValid("8934888232322199"));
	}

	@Test
	public void PasswordLengthShouldBeMoreThenEight() {
		assertEquals("shobhit123", testcase.passwordLength("shobhit123"));
	}

	@Test
	public void passwordIsWrongWithLessLetters() {
		assertEquals("shob", testcase.passwordLength("shob"));
	}

	@Test
	public void passwordShouldBeRight() {
		assertEquals("Shobhit123Ranjan", testcase.passwordLength("Shobhit123Ranjan"));
	}

	@Test
	public void passwordIsWrongWithNoUpperCase() {
		assertEquals(null, testcase.passwordLength("ShobhitRanjan"));
	}


}
