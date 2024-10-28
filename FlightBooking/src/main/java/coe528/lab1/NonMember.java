/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author Eddy Perez Macias
 */
public class NonMember extends Passenger {
    
    public NonMember(String name, int age){
        super(name, age);
    }
@Override
public double applyDiscount(double p){
    if(getAge() > 65){
    double DiscountedPrice = p - (p * 0.1);
    System.out.println("Discounted 10%");
    return DiscountedPrice;
    }else
        return p;
}
}
