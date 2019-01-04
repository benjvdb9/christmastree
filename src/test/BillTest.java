/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author MediaMonster
 */
public class BillTest {
    
    ArtificialTree  treeDecorator = new ArtificialTree("ArtificialTree", 20, "red", "plastic");
    Customer customer = new Customer("John", "Doe");
    DeliveryAddress deliveryAddress = new DeliveryAddress("New York");
    Order order = new Order(customer, deliveryAddress);
    Bill bill = new Bill(treeDecorator, order, "./billTest");

    @Test
    public void  testBallsWithArguments() {
        
        assertNotNull(ball1);
    }
}
