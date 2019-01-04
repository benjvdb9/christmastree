
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class OrderTest {

    private static Order order;
    
    
  
    @BeforeClass
    public static void setupBeforeClass() { 

        DeliveryAddress address = new DeliveryAddress("31 rue de Keersmaeker");
        order =new Order(new Customer("Arthur","Venon"), address);
    }

    @Test
    public void getDeliveryAddress() {
        
        assertEquals(order.getDeliveryAddress(),"31 rue de Keersmaeker");
    }

    @Test
    public void getName() {
        assertEquals(order.getName(),"Arthur");
    }

    @Test
    public void getSurname() {
        assertEquals(order.getSurname(),"Venon");
    }

}




