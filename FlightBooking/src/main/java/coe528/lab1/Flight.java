/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author Eddy Perez Macias
 */
public class Flight {

    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capcity;
    private int numberOfSeatsLeft;
    private double originalPrice;
    
    public Flight(int flightNumber, String origin, String destination, String departureTime, int capcity, double originalPrice){
    
        this.flightNumber = flightNumber;
        if (origin.equals(destination)) {
            throw new IllegalArgumentException(" Origin and destination cannot be equal.");
        }
        this.origin = origin; //Supposed to put Exception here
        this.destination = destination;
        this.departureTime = departureTime;
        this.capcity = capcity;
        this.originalPrice = originalPrice;
        numberOfSeatsLeft = capcity;
    }

    public int getflightNum(){
        return flightNumber; 
    }
    
    public void setflightNum(int flightnum){
        flightNumber = flightnum;
    }
    
    public String getOrigin(){
        return origin;
    }
    
    public void setOrigin(String ori){
        origin = ori;
    }
    
    public String getdestination(){
        return destination;
    }
    
    public void setdestination(String des){
        destination = des;
    }
    
    public String getdepTime(){
        return departureTime; 
    }
    
    public void setdepTime(String depTime){
        departureTime = depTime;
    }
    
    public int getcap(){
        return capcity;
    }
    
    public void setcap(int cap){
        capcity = cap;
    }
    
    public int getnumOfSeatsL(){
        return numberOfSeatsLeft; 
    }
    
    public void setnumOfSeatsL(int numOSL){
        numberOfSeatsLeft = numOSL; 
    }
    
    public double getOriginalPrice(){
        return originalPrice;
    }
    
    public void setOriginalPrice(double oriPrice){
        originalPrice = oriPrice; 
    }
    
    public boolean bookASeat(){
        if (getnumOfSeatsL() > 0){
            
            numberOfSeatsLeft --;
            
            return true;
        }else
            return false;
  
    }
    
     @Override
  public String toString() {
      String fly = "Flight: " + flightNumber + ", " +  origin + " to " + destination + ", " + departureTime + ", " + originalPrice + "$";
      return fly; 
  }
  //Need to do some Junit testing 
  
}
