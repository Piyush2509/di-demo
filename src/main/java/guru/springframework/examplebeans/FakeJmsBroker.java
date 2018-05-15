package guru.springframework.examplebeans;

/**
 * Created by piyush.b.kumar on May 15, 2018.
 */
public class FakeJmsBroker {
	
	private String username;
	private String password;
	private String url;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String user) {
		this.username = user;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}	

}
