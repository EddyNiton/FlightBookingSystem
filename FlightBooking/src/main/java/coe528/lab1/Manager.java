/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package coe528.lab1;
import java.util.ArrayList;

/**
 *
 * @author Eddy Perez Macias
 */
public class Manager {
    
 ArrayList<Flight> flight = new ArrayList<>();
 ArrayList<Object> members = new ArrayList<>();
public void createFlights(){
try{
flight.add(new Flight(1234, "Toronto", "Toronto", "03/03/24 7:50 pm", 300, 1000)); 
}catch(IllegalArgumentException e) {
        System.out.println("Error in Flight:" + e.getMessage());
        
    } 
flight.add(new Flight(2468, "Toronto", "New York", "08/12/24 2:00 am", 200, 500));   
flight.add(new Flight(5152, "Toronto", "Madagascar ", "01/09/24 5:00 am", 100, 5000));   
flight.add(new Flight(1987, "Toronto", "New York", "08/12/24 9:00 am", 200, 500));   
flight.add(new Flight(3456, "Toronto", "Florida", "04/01/24 5:00 pm", 500, 600));   
flight.add(new Flight(8911, "Toronto", "Italy", "01/27/24 9:00 pm", 400, 6000));   
  
   
}   

public void displayAvailableFlights(String origin, String destination){
Flight flightaccess;
for (int i =0; i < flight.size(); i++){
    flightaccess = flight.get(i);
    if(flightaccess.bookASeat() && origin.equals(flightaccess.getOrigin()) && destination.equals(flightaccess.getdestination())){
   System.out.println(flightaccess.toString());
    }
} 
}

public Flight getFlight( int flightNumber){
Flight flightaccess;
 for (int i =0; i < flight.size(); i++){
    flightaccess = flight.get(i);
    if(flightaccess.getflightNum() == flightNumber){
    return flightaccess;
    }
}
System.out.println("Error with Flight or No Flight With that Number");  
     return null;            
}

public boolean IsMember(Passenger p){

members.add("Eddy Perez");
members.add("Mica Perez");
members.add("Julian Goncalves");
members.add("Amy Costa");
members.add("Dylan Moreria");
members.add("Valeiry Povpov");


for (int i =0; i < members.size(); i++){
    if(p.getName().equals(members.get(i))){
        return true;
    }
}
return false;
}

public void bookSeat(int flightNumber, Passenger p){
try{ 
Flight SelectedFlight = getFlight(flightNumber);
double price;
Ticket tick; 
System.out.println("The number of Seats Left: "+ SelectedFlight.getnumOfSeatsL());
if(SelectedFlight.bookASeat()){
    System.out.println("Seat Booked: "+ true);
System.out.println("The number of Seats Left: "+ SelectedFlight.getnumOfSeatsL());
if(IsMember(p)){
    System.out.println("You are a Member!");
     price = p.applyDiscount(SelectedFlight.getOriginalPrice()); 
     tick = new Ticket(p, SelectedFlight, price);
     System.out.println("This is Your Ticket: "+ tick.toString());
     System.out.println("This is Your Ticket number: "+ tick.getnumber());
}else{
    System.out.println("You are not a Member");
    price = p.applyDiscount(SelectedFlight.getOriginalPrice());
    tick = new Ticket(p, SelectedFlight, price);
    System.out.println("This is Your Ticket: "+ tick.toString());
    System.out.println("This is Your Ticket number: "+ tick.getnumber());
}
}else{
    System.out.println("The plane is Full ");
}
}catch(NullPointerException e){
    System.out.println("Booking Failed");
}
}



public static void main(String[] args){
Manager manager = new Manager();
manager.createFlights();

System.out.println("----------------------------------");
System.out.println("Booking Seat... For "+ manager.flight.get(0).toString()); 
manager.bookSeat(1234, new Member("Eddy Perez", 19, 7));

System.out.println("----------------------------------");
System.out.println("Booking Seat... For "+ manager.flight.get(0).toString()); 
manager.bookSeat(2468, new Member("Mica Perez", 16, 2));

System.out.println("----------------------------------");
System.out.println("Booking Seat... For "+ manager.flight.get(2).toString()); 
manager.bookSeat(1987, new NonMember("Lupin Third", 23));

System.out.println("----------------------------------");
System.out.println("Booking Seat... For "+ manager.flight.get(1).toString()); 
manager.bookSeat(5152, new NonMember("Inspector Zenigata", 90));

System.out.println("----------------------------------");
System.out.println("Booking Seat... For "+ manager.flight.get(1).toString()); 
manager.bookSeat(5152, new NonMember("Inspector Zenigata", 90));

System.out.println("----------------------------------");
System.out.println("Booking Seat... For "+ manager.flight.get(3).toString()); 
manager.bookSeat(3456, new NonMember("Walter White", 1));

System.out.println("----------------------------------");
System.out.println("Booking Seat... For "+ manager.flight.get(4).toString()); 
manager.bookSeat(8911, new Member("Amy Costa", 19, 10));

manager.flight.get(4).setnumOfSeatsL(0);
System.out.println("----------------------------------");
System.out.println("Booking Seat... For "+ manager.flight.get(4).toString()); 
manager.bookSeat(8911, new Member("Dylan Moreria", 19, 10));

System.out.println("----------------------------------");
System.out.println("Displaying Availble flights for Toronto to New York ");
manager.displayAvailableFlights("Toronto", "New York");

}


}
