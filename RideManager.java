package app;

import java.util.*;
import java.util.List;
import java.util.Arrays;


public class RideManager extends Listing{
	//String[] rideHistory ;
	boolean checked=false;
	List<Integer> DriverFavoriteAreas= new ArrayList<>();
	
    public void addPassengerRide(Passenger passenger)
    {
		List <String> namedRide = new ArrayList<>(Arrays.asList(passenger.username,passenger.ride.getPickup(),passenger.ride.getDestination()));
		
    		Rides.addAll(namedRide);
	}
    
    public boolean rideChecker(Driver driver)
    { 
    	for(int i =0; i<Rides.size();i++)
    	{
    		
    		for(int k =0 ; k<driver.FavLocations.size();k++)
    		{
    			if(Rides.get(i).contains(driver.FavLocations.get(k)))
    			{
    				
    				System.out.println(driver.username+ "has ride "+ Rides.get(i));
    				checked=true;
    				DriverFavoriteAreas.add(i);
    				 
    			}
    			
    		}
    	}
    	
    	if(checked==false)
    	{
    		return false;
    		
    	}
    	
    	
    	
    	return true;
    }

	
    
    
    
    /*public Ride addRideHistory() 
	{
		return null;
		
	}
	*/
}
 