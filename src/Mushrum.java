/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Mushrum extends ToppingDecorator{
    
   Pizza pz;
    public Mushrum(Pizza p){
        this.pz=p;
    }
    @Override
    public String getDescription(){
        return pz.getDescription()+" , with mushrum";
    }
    @Override
    public double Cost(){
        return 1.30 + pz.Cost();
    }
    
}
