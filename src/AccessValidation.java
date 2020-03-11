
public class AccessValidation {

	private LoginService service;
	private String accessCode;
	private String status;

	public AccessValidation(LoginService service) {
		this.service = service;
	}

	public LoginService getService() {
		return service;
	}
	public void setService(LoginService service) {
		this.service = service;
	}
	public String getAccessCode() {
		return accessCode;
	}
	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}


}
