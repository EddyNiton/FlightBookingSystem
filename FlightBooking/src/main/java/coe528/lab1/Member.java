/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author Eddy Perez Macias
 */
public class Member extends Passenger{
    private int yearsOfMembership;
    
    public Member(String name, int age, int YOM){
        super(name, age);
        yearsOfMembership = YOM; 
    }
    
   @Override
    public double applyDiscount(double p){
    if(yearsOfMembership > 5){
        double DiscountedPrice = p * 0.5;
        System.out.println("Discounted 50%");
        return DiscountedPrice;
    }else if(yearsOfMembership > 1 && yearsOfMembership <= 5){
       double DiscountedPrice = p - (p * 0.1); 
       System.out.println("Discounted 10%");
       return DiscountedPrice;
    }else
       return p; 
}
    
    
}
