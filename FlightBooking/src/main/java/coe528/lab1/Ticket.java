/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author Eddy Perez Macias
 */
public class Ticket {
    private Passenger passenger;
    private Flight flight;
    private double price;
    static int number;
    
    public Ticket(Passenger p, Flight flight, double price){
    passenger = p;
    this.flight = flight;
    this.price = price;
    number ++;
}
    static int getnumber(){
        return number;
    }
    
    public Passenger getPassenger(){
        return passenger; 
    }
    
    public void setPassenger(Passenger p){
        passenger = p; 
    }
    
    public Flight getFlight(){
        return flight;
    }
    
    public void setFlight(Flight f){
        flight = f;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price; 
    }
    
    @Override
  public String toString() {
   String ticks = passenger.getName() + ", Flight: " +  flight.getflightNum() + ", " + flight.getOrigin() + " to "+ flight.getdestination() + ", "+ flight.getdepTime() + ", original price: " + flight.getOriginalPrice() + "$, ticket price: $"+ price + ", ";
   return ticks;   
  }
}
