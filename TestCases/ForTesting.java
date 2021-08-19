import static org.junit.Assert.assertEquals;
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

}
