/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Olive extends ToppingDecorator{
    Pizza pz;
    
    public Olive(Pizza p){
        this.pz = p;
    }
    
    @Override
    public String getDescription(){
        return pz.getDescription() + ", with olive";
    }
   
    @Override
    public double Cost(){
        return 0.90 + pz.Cost();
    }
    
}
