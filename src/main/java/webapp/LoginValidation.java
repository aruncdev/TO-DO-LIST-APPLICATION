package webapp;

public class LoginValidation {

	public boolean isUserValid(String username, String password){
		
		if(username.equals("admin") && password.equals("admin1234")){
			return true;
		}
		
		return false;
	}
}
