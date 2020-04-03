/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Tomato extends ToppingDecorator{
      Pizza pz;
      
      public Tomato(Pizza p){
          this.pz = p;
      }
      @Override
      public String getDescription(){
          return pz.getDescription() + " , with tomato";
      }
      
      @Override
      public double Cost(){
          return 0.30 + pz.Cost();
      }

} 
