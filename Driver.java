package app;

import java.util.ArrayList;
import java.util.List;

public class Driver extends User {
	public String license, nationalID;
	 List<String> FavLocations = new ArrayList<String>();
	 //PriceNotifier p = new PriceNotifier();
	Ride ride;
//Offer offer;
	//boolean verified;
	public boolean verified;
	
	public Driver(String username,String mobileNumber,String email, String password,String userType, String license, String nationalID) {
		super(username, mobileNumber, email, password );
		this.username=username;
		this.mobileNumber=mobileNumber;
		this.password= password;
	    this.email=email ;
	    this.userType="driver";
	    this.license=license;
	    this.nationalID=nationalID;
}
	
	//public Offer offerRide(Ride r1)
	//{return offer;}
	
	public void requestNotifier()
	{
		
		
	}
	
	 public void AddFavoriteArea(String favouritearea)
	    {
		 FavLocations.add(favouritearea);
	    }
	    public List DriverRides()
	    {
	        return FavLocations;
	    }
}
	
	
/* public Ride startRide ()
	{
		System.out.println("Ride started");
		workingRide=true;
		return ride;
		
		
	}
	
	public Ride endRide ()
	{
		System.out.println("Ride ended");
		workingRide=false;
		return ride;
		
	}
	
	public Offer addToBalance() 
	{
		if (workingRide=false)
		{
			
		}
		return offer;
		
	}*/


