package app;
import java.util.*;
import java.util.List;


public class Passenger extends User {
	Ride ride;
	Scanner input = new Scanner(System.in);
	Infomanager registeredPassenger ;
	 boolean loggedIn;
	
	public Passenger(String username,String mobileNumber,String email, String password) {
		super(username, mobileNumber, email, password);
		this.username=username;
		this.mobileNumber=mobileNumber;
		this.password= password;
	    this.email=email ;
	    this.userType="Passenger";
	    
	}
	
	
	/*public Offer acceptOffer (List <Offer> offerList)
	{
		return null;
		
	}
	
	public void rateRide(Ride ride){}*/

}
