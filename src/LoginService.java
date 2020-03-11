
public interface LoginService {

	Boolean isValidPass(String password);
	
	String generateCode();
}
