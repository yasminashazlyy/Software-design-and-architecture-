package app;

import java.util.List;
import java.util.*;

public class Driveradmin extends Infomanager {
	boolean verf;
	
	List <Observer> observers = new ArrayList<>();
	public boolean pendingList(Infomanager manager) 
	{
		verf=false;
		for(int i =0 ; i<manager.DriverList.size();i++)
		{
			if(manager.DriverList.get(i).verified==false)
			{
				verf=true;
				System.out.println(manager.DriverList.get(i).username);
			}
			
		}
		return verf;	
	}
	
   
	//public Driver verifiedDrivers ; 	
public void VerifyDriverInfo(int driver ,Infomanager pendingDrivers)

	{
	   pendingDrivers.DriverList.get(driver-1).verified=true;
	}



}
