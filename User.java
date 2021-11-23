package app;


public abstract class User {
	protected String username , mobileNumber ,password , email , userType;
	
	public User (String username,String mobileNumber,String email, String password)
	{
		this.username=username;
		this.mobileNumber=mobileNumber;
		this.password= password;
	    this.email=email ;
	    this.userType=userType;
	    
	}
	 
	
}
