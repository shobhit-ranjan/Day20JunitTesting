import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ForTesting {

	Junitdemo testcase = new Junitdemo();

	@Test
	public void ShouldBeMoreThenThreeLetterAndFirstShouldBeLetterCaptial() {
		assertEquals("Shobhit", testcase.FirstName("Shobhit"));
	}

}
