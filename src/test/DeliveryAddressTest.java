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
    
    String address = 'test address';
    DeliveryAddress deliveryAddress1 = new DeliveryAddress(address);
    DeliveryAddress deliveryAddress2 = new DeliveryAddress(address);

    @Test
    public void  testGetAddress() {
        assertEquals(deliveryAddress.getAddress(), address);
    }

    @Test
    public void testSetAddress() {
        String test = 'test';
        deliveryAddress2.setAddress('test');
        assertEquals(deliveryAddress2.getAddress(), test);
    }
}