package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Infomanager extends Listing {
	 String username, mobileNumber, email, password, UserType,license, favoriteLocations,nationalID;
 	Scanner n = new Scanner(System.in);
    boolean loggedIn;
    
    
 public void registerPassenger(Passenger passenger) {  	
        	/*UserType="Passenger";
            System.out.println("Enter user name");
            username=n.nextLine();
            System.out.println("Enter mobile number");
            mobileNumber=n.nextLine();
            System.out.println("Enter email");
            email=n.nextLine();
            System.out.println("Enter password");
            password=n.nextLine();
           Passenger p1;
            p1 = new Passenger(username, mobileNumber, email, password, UserType);*/
            PassengerList.add(passenger);
            System.out.println("Registered");
           
      }
        
 public void registerDriver(Driver driver) {
        	/*UserType="driver";
            System.out.println("Enter user name");
            username=n.nextLine();
            System.out.println("Enter mobile number");
            mobileNumber=n.nextLine();
            System.out.println("Enter email");
            email=n.nextLine();
            System.out.println("Enter password");
            password=n.nextLine();
            System.out.println("Enter license number");
            license=n.nextLine();
            System.out.println("Enter favourite locations");
            favoriteLocations=n.nextLine();
            System.out.println("Enter national ID");
            nationalID=n.nextLine();
            
        	Driver d1;
            d1= new Driver(username, mobileNumber, email, password, UserType,license, favoriteLocations,nationalID  );*/
            DriverList.add(driver);
  	}
      
 
 public void Login(String email, String password) {
     if (this.email.equals(email) && this.password.equals(password)) {
         System.out.println("Logged in");
     } else {
         System.out.println("Wrong username or password");
     }
}
}