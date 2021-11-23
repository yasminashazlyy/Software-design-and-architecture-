package app;

public class Ride {
 private String pickup;
 private String destination;
 double estimatedTime;
 //Offer offer;
  
 public Ride( String pickup, String destination) 
 {
	 this.setPickup(pickup);
	 this.setDestination(destination);
 }

 public void requestRide(String pickup, String destination)
 {
    this.setPickup(pickup);
    this.setDestination(destination);
    System.out.println("Ride requested");
 }
 /*public Offer priceOffer (Offer [] offers) 
 {
	return offer;
	 
 }
 
 public double getEstimatedTime() 
  { return estimatedTime;}
*/

public String getPickup() {
	return pickup;
}

public void setPickup(String pickup) {
	this.pickup = pickup;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}
 
 
}
