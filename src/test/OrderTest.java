
import christmastree.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class OrderTest {

    private static Order order;
    
    
  
    @BeforeClass
    public static void setupBeforeClass() { 
        
        order =new Order("31 rue de Keersmaeker","Arthur","Venon");
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




