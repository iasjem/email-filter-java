/*
 * This program filters and reveal user email
 */

public class MainSrc {

	public static void main(String[] args) {
		String email = "joshua.garcia@gmail.com";
	
		System.out.println(filterEmail(email));
		System.out.println(email);
	}

	private static String filterEmail(String email) {
		
		String[] emailSplit = email.split("@");	// split email provider from email address	
		String filter =""; int i=0;
		char[] arrEmail = emailSplit[0].toCharArray(); // domain name converts to character array
		emailSplit[0] = ""; // initialize domain name

		for ( i=1; i < arrEmail.length-1; i++) {
			if (arrEmail[i] != '.') { arrEmail[i] = '*'; }
		}  
		
		for(i=0; i< arrEmail.length; i++) {
			emailSplit[0] += String.valueOf(arrEmail[i]); // convert character array to string
		}
		
		// concatenate string arrays with new values
		email = filter.concat(emailSplit[0]).concat("@" + emailSplit[1]); 
		return email;
	}
	
}
