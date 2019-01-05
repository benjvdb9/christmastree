/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

import java.io.IOException;

/**
 *
 * @author MediaMonster
 */
public class BillTest {
    
    ArtificialTree  treeDecorator = new ArtificialTree("ArtificialTree", 20, "red", "plastic");
    Customer customer = new Customer("John", "Doe");
    DeliveryAddress deliveryAddress = new DeliveryAddress("New York");
    Order order = new Order(customer, deliveryAddress);

    @Before
    public void init() throws IOException {
        Bill bill = new Bill(treeDecorator, order,"./test");
    }

    @Test
    public void  testBallsWithArguments() {
        //assertNotNull(ball1);
    }
}
