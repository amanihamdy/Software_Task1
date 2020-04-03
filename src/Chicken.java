/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Chicken extends Pizza{
    public Chicken(){
        description = "Chicken Pizza";
    }
    @Override
    public double Cost(){
        return 11.25;
    }
    
}
