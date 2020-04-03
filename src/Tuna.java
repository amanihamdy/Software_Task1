/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Tuna extends Pizza{
    public Tuna(){
        description = "Tuna Description";
    }
  
    @Override
    public double Cost(){
        return 9.50;
    }

}
