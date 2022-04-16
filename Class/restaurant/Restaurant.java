/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import form.RestaurantFrame;
import form.Login;
/**
 *
 * @author RAMA
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login login = new Login ();
        RestaurantFrame frame = new RestaurantFrame();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        //frame.setLocationRelativeTo(null);
        //frame.setVisible(true);

    }
    
}
