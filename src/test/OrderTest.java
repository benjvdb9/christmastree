
import org.junit.Before;
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

    @Before
    public void setNames() {
        order.setName("Arthur");
        order.setSurname("Venon");
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

    @Test
    public void getDate() {
        assertEquals(order.getDate().toString(), (new java.util.Date()).toString());
    }

    @Test
    public void deliveryAddressSuite() {
        order.setDeliveryAdress("Las Vegas");
        assertEquals(order.getDeliveryAddress(), "Las Vegas");
    }

    @Test
    public void nameSuite() {
        order.setName("John");
        assertEquals(order.getName(), "John");
    }

    @Test
    public void surnameSuite() {
        order.setSurname("Doe");
        assertEquals(order.getSurname(), "Doe");
    }
}




