
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lenovo
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        showMessageDialog(null, "Welcome to Our Restaurant  ^^ " , "Pizza Hut", 1);
        showMessageDialog(null, "Choose your favourite type of pizza \n1- Chicken pizza\n2- Margherita pizza\n3- Cheese pizza\n4- Tuna pizza\n5- Exit");
        String x = JOptionPane.showInputDialog("Enter your order :- ");
        int y = Integer.parseInt(x);
        Pizza p1;
        switch (y) {
            case 1:
                p1 = new Chicken();
                print(p1);
                
                break;

            case 2:

                p1 = new Margherita();
                print(p1);

                break;

            case 3:
                p1 = new Cheese();
                print(p1);

                break;

            case 4:
                p1 = new Tuna();
                print(p1);

                break;
            case 5:
                break;

        }

    }

    public static void print(Pizza p1) {

        String a2 = JOptionPane.showInputDialog("Do you want any topping : [0|1]");
        int b2 = Integer.parseInt(a2);
        switch (b2) {
            case 0:
                showMessageDialog(null, "The description is " + p1.description + " and the cost is " + p1.Cost() + "$");
                break;
            case 1:
                showMessageDialog(null, "Our available toppings are:\n1- Tomato\n2- Olive\n3- Mushrum\n4- Pepper\n5- pizza with all these toppings\n6- Exit");
                String z = JOptionPane.showInputDialog("Enter your topping : ");
                int w = Integer.parseInt(z);
                
                switch (w) {
                    case 1:
                        p1 = new Tomato(p1);
                        showMessageDialog(null, "The description is " + p1.getDescription() + " ,and the cost is " + p1.Cost());
                        break;
                    case 2:
                        p1 = new Olive(p1);
                        showMessageDialog(null, "The description is " + p1.getDescription() + " ,and the cost is " + p1.Cost());
                        break;
                    case 3:
                        p1 = new Mushrum(p1);
                        showMessageDialog(null, "The description is " + p1.getDescription() + " ,and the cost is " + p1.Cost());
                        break;
                    case 4:
                        p1 = new Pepper(p1);
                        showMessageDialog(null, "The description is " + p1.getDescription() + " ,and the cost is " + p1.Cost());
                        break;
                    case 5:
                        p1 = new Tomato(p1);
                        p1 = new Olive(p1);
                        p1 = new Mushrum(p1);
                        p1 = new Pepper(p1);
                        showMessageDialog(null,"The description is " + p1.getDescription() + " , and the cost is " + p1.Cost());
                         break;
                    case 6:
                        showMessageDialog(null, "The description without topping is " + p1.description + " and the cost is " + p1.Cost() + "$");
                        break;

                }
              

                break;
        }

    }
}
