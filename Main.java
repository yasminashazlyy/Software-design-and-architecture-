package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Infomanager IM = new Infomanager();
        boolean rideRequested;
        RideManager rm = new RideManager();
        List<User> List = new ArrayList<User>(3);
        List<Driver> DriverList = new ArrayList<Driver>(3);
        String uname = null ,pword = null,mNumber = null,mail = null,li = null,ID = null;
        Driver dri1= new Driver(uname ,pword,mNumber,mail,li,ID, ID);
        String username ,password,mobileNumber,email,license,nationalID,pickup,destination;
            System.out.println("Do you have an account (if no press 1 if yes press 2)");
            int answer;
            answer=input.nextInt();
            if(answer==1)
            {
            	System.out.println("Press 1 for passanger or 2 for driver ");
            	int ans;
                ans=input.nextInt();
            	if(ans==1)
            	{
            		
            		 System.out.println("enter Username");
                     username = input.nextLine();
                     System.out.println("enter Password");
                     password = input.nextLine();
                     System.out.println("enter MobileNumber");
                     mobileNumber = input.nextLine();
                     System.out.println("enter Email");
                     email = input.nextLine();
                     Passenger p1 = new Passenger (username, mobileNumber, email, password);
                     List.add(p1);
                     IM.registerPassenger(p1);
            	}
            	else if (ans==2) 
            	{
           		 System.out.println("enter Username");
                    username = input.nextLine();
                    System.out.println("enter Password");
                    password = input.nextLine();
                    System.out.println("enter MobileNumber");
                    mobileNumber = input.nextLine();
                    System.out.println("enter Email");
                    email = input.nextLine();
                    System.out.println("enter license");
                    license = input.nextLine();
                    System.out.println("enter Password");
                    nationalID = input.nextLine();
            		Driver d1 = new Driver (username, mobileNumber, email, password, email ,license, nationalID);
                    List.add(d1);
                    IM.registerDriver(d1);
                  }
            	
            	else if (answer==2)
            	{
            		System.out.println("Chosse 1.Passenger login 2.Driver login");
            		int a;
            		a=input.nextInt();
            		if(a==1)
            		{
            			System.out.println("enter email");
                        email = input.nextLine();
                        System.out.println("enter Password");
                        password = input.nextLine();
            			IM.Login(email, password);
            			System.out.println("Do you want torequest a ride?"
            					+ " press 1 if yes , 2 if no");
            			int choice;
            			choice=input.nextInt();
            			if(choice == 1)
            			{
            				System.out.println("Enter pickup location");
            				pickup=input.next();
            				System.out.println("Enter dropoff location");
            				destination=input.next();
            				 Ride ride= new Ride(pickup, destination);
            				ride.requestRide(pickup, destination);
            				rideRequested=true;
            			}
            			else if(choice == 2)
            			{
            				System.out.println("Thank you");
            			}
            			
            		}
            		
            		else if(a==2)
            		{
            			System.out.println("enter email");
                        email = input.nextLine();
                        System.out.println("enter Password");
                        password = input.nextLine();
            			IM.Login(email, password);
            			if(rideRequested=true)
            			{}
            				/*if(rm.rideChecker(dri1))
            				{
            					for(int i=0;i<rm.addPassengerRide.size();i++)
            					{
            						
            						dir1.p.registerObserver();
            						dri.setOffer(offer);
            		                dri.Offers.add(offer);
            					}
            					
            					
            				}
            			}*/
            			
            			
            		}
            	}
            	
            	
            	
            }
            
               
                /*case 5: {
                    if(UserList.size()>1)
                    {
                        System.out.println("Plz enter your which User you want to Request with");
                        int z = Integer.parseInt(s.nextLine());
                        tempu=z-1;
                        System.out.println("Plz enter SourceArea");
                        String sourcearea = s.nextLine();
                        System.out.println("Plz enter Destination");
                        String Destination = s.nextLine();
                        UserList.get(z-1).r.RequestRide(sourcearea,Destination);
                        rm.AddRide(UserList.get(z-1));
                    }
                    else if(UserList.size()==1)
                    {
                        System.out.println("sourceArea");
                        String sourcearea = s.nextLine();
                        System.out.println("destination");
                        String Destination = s.nextLine();
                        UserList.get(0).r.RequestRide(sourcearea,Destination);
                        rm.AddRide(UserList.get(0));
                    }
                    else
                    {
                        System.out.println("the system has no registered users you can't request ride");
                    }
                    break;
                }
                case 6: {
                    if(DriverList.size()>1)
                    {
                        System.out.println("please choose which driver you want to add his favorite areas");
                        temp = Integer.parseInt(s.nextLine());
                    }

                    System.out.println("enter number of favorite areas");
                    int x = Integer.parseInt(s.nextLine());
                    System.out.println("enter favorite areas");

                    for (int i = 0; i < x; i++) {
                        String Favoritearea = s.nextLine();
                        DriverList.get(temp).AddFavoriteArea(Favoritearea);
                    }

                    break;
                }
                case 7: {
                    rm.checkDriverFavoriteAreas(DriverList.get(temp));
                    System.out.println("");
                    for (int i = counter; i < rm.keys.size(); i++) {
                        System.out.println("Do you want to add an offer to this Ride :" + rm.data.Rides.get(rm.keys.get(i)));
                        String t = s.nextLine();
                        if (t.equals("yes")) {
                            System.out.println("Please enter the offer");
                            Integer o = Integer.valueOf(s.nextLine());
                            DriverList.get(temp).p.registerObserver(UserList.get(tempu));
                            System.out.println("Ride " + rm.data.Rides.get(rm.keys.get(i)) + " had an offer");
                            DriverList.get(temp).p.SetOffer(o);
                            DriverList.get(temp).r.Offers.add(o);
                            counter++;
                        } else {
                            continue;
                        }

                    }
                    break;
                }
                case 8: {
                    System.exit(0);
                }
            }
        }while(true);*/

    }


}