import java.util.regex.Pattern;
import java.io.*;
import java.util.regex.*;

public class Junitdemo {

	public static void main(String[] args) {

	}

	public String FirstName(String Name) {
		String personName = Name;

		String UpperCase = personName.toUpperCase();

		if (UpperCase.charAt(0) == personName.charAt(0) && personName.length() > 2)

		{
			return personName;
		} else {
			System.out.println("Write it in correct format ");
			return null;
		}

	}

	public String LastName(String Name) {
		String personLastName = Name;

		String UpperCase = personLastName.toUpperCase();

		if (UpperCase.charAt(0) == personLastName.charAt(0) && personLastName.length() > 2)

		{
			return personLastName;
		} else {
			System.out.println("Write it in correct format ");
			return null;
		}

	}

	public boolean Emailid(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

	public static boolean isValid(String s) {

		Pattern p = Pattern.compile("^\\d{10}$");

		Matcher m = p.matcher(s);

		return (m.matches());
	}

	public static boolean phoneNumber(String s) {

		String regex = "\\d{3}-\\d{3}-\\d{4}"; // XXX-XXX-XXXX
		return s.matches(regex);

	}

	public String passwordLength(String pass) {

		if (!((pass.length() >= 6) && (pass.length() <= 15))) {
			return null;
		}

		if (pass.contains(" ")) {
			return null;
		}
		if (true) {
			int count = 0;

			for (int i = 0; i <= 9; i++) {

				String str1 = Integer.toString(i);

				if (pass.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				return null;
			}

		}
		return null;

	}
}
