import java.util.regex.Pattern;
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
	 public boolean Emailid(String email)
	    {
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
	                            "[a-zA-Z0-9_+&*-]+)*@" +
	                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
	                            "A-Z]{2,7}$";
	                              
	        Pattern pat = Pattern.compile(emailRegex);
	        if (email == null)
	            return false;
	        return pat.matcher(email).matches();
	    }



}
