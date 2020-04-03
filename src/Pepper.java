/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Pepper extends ToppingDecorator{
   
    Pizza pz;
    public Pepper(Pizza p){
        this.pz=p;
    }
    @Override
    public String getDescription(){
        return pz.getDescription()+" , with Pepper";
    }
    @Override
    public double Cost(){
        return 0.08 + pz.Cost();
    }
    
}
