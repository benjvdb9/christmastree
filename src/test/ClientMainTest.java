import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import christmastree.*;
import static org.mockito.Mockito.*;

public class ClientMainTest {

    private static ClientMain client =new ClientMain();


    @Test
    public void getOrder() throws Exception {

        AskString asker = mock(AskString.class);
        when(asker.ask("Client's name :")).thenReturn("Arthur");
        when(asker.ask("Client's surname :")).thenReturn("Venon");
        when(asker.ask("Client's adress :")).thenReturn("31 rue de Keersmaeker");
        Order order;
        order = client.makeOrder(asker);
        assertEquals(order.getName(),"Arthur");
    }

    @Test
    public void treeDecorationStandardBallsTest() throws Exception {

        AskString asker = mock(AskString.class);
        when(asker.ask("Choose a decoration please: ")).thenReturn("a","q");
        Decorator deco = client.treeDecorationStandard(
                new ArtificialTree("artificiel",23.8,"jaune","bisphenol A"),asker,"a");
        assertEquals(deco.toString(),"ChrismasTree{TreeDescriptionartificiel " +
                "BallsDecorator: Balls, price=44.79,TreeColorjaune BallsColor: " +
                "Red}Balls{ BallsMaterial: Plastic, BallsSize: Small}");
    }

    @Test
    public void treeDecorationStandardCandleTest() throws Exception {

        AskString asker = mock(AskString.class);
        when(asker.ask("Choose a decoration please: ")).thenReturn("c","q");
        Decorator deco = client.treeDecorationStandard(
                new ArtificialTree("artificiel",23.8,"jaune","bisphenol A"),asker,"c");
        assertEquals(deco.toString(),"ChrismasTree{TreeDescriptionartificiel " +
                "CandleDecorator: Candle, price=40.79,TreeColorjaune CandleColor: " +
                "White}Candle{lifeTime=5, CandleParfum: Senteurs d'inspiration}");
    }

    @Test
    public void treeDecorationStandardElectricGarlandTest() throws Exception {

        AskString asker = mock(AskString.class);
        when(asker.ask("Choose a decoration please: ")).thenReturn("b","q");
        when(asker.ask("Choose a Garland decorations options : ")).thenReturn("b","q");
        Decorator deco = client.treeDecorationStandard(
                new ArtificialTree("artificiel",23.8,"jaune","bisphenol A"),asker,"b");
        assertEquals(deco.toString(),"ChrismasTree{TreeDescriptionartificiel " +
                "SyntheticGarlandDecorator: Garland, price=34.79,TreeColorjaune" +
                " SyntheticGarlandColor: yellow} Garland{length=15.0} SyntheticGarland{" +
                " SyntheticGarlandPaillette: Square}");
    }
    @Test
    public void treeDecorationPersonnalizedBallsTest() throws Exception {

        AskString asker = mock(AskString.class);
        when(asker.ask("Choose a decoration please: ")).thenReturn("a","q");
        when(asker.ask("description: ")).thenReturn("test");
        when(asker.askDouble("price: ")).thenReturn(100.0);
        when(asker.ask("color: ")).thenReturn("blouge");
        when(asker.ask("material: ")).thenReturn("pierre");
        when(asker.ask("size: ")).thenReturn("grand");


        Decorator deco = client.treeDecorationPersonalized(
                new ArtificialTree("artificiel",23.8,"jaune","bisphenol A"),asker,"a");
        assertEquals(deco.toString(),"ChrismasTree{TreeDescriptionartificiel " +
                "BallsDecorator: test, price=123.8,TreeColorjaune BallsColor: " +
                "blouge}Balls{ BallsMaterial: pierre, BallsSize: grand}");
    }

    @Test
    public void treeDecorationPersonnalizedCandleTest() throws Exception {

        AskString asker = mock(AskString.class);
        when(asker.ask("Choose a decoration please: ")).thenReturn("c","q");
        when(asker.ask("description: ")).thenReturn("test");
        when(asker.askDouble("price: ")).thenReturn(100.0);
        when(asker.ask("color: ")).thenReturn("blouge");
        when(asker.askInt("LifeTime : ")).thenReturn(15);
        when(asker.ask("Parfum : ")).thenReturn("pomme");
        Decorator deco = client.treeDecorationPersonalized(
                new ArtificialTree("artificiel",23.8,"jaune","bisphenol A"),asker,"c");
        assertEquals(deco.toString(),"ChrismasTree{TreeDescriptionartificiel " +
                "CandleDecorator: test, price=123.8,TreeColorjaune CandleColor: " +
                "blouge}Candle{lifeTime=15, CandleParfum: pomme}");
    }

    @Test
    public void treeDecorationPersonnalizedElectricGarlandTest() throws Exception {

        AskString asker = mock(AskString.class);
        when(asker.ask("Choose a decoration please: ")).thenReturn("b","q");
        when(asker.ask("Choose a Garland decorations options : ")).thenReturn("b","q");
        when(asker.ask("description: ")).thenReturn("test");
        when(asker.askDouble("price: ")).thenReturn(100.0);
        when(asker.ask("color: ")).thenReturn("blouge");
        when(asker.askDouble("Length : ")).thenReturn(0.0);
        when(asker.ask("paillette : ")).thenReturn("Circle");
        Decorator deco = client.treeDecorationPersonalized(
                new ArtificialTree("artificiel",23.8,"jaune","bisphenol A"),asker,"b");
        assertEquals(deco.toString(),"ChrismasTree{TreeDescriptionartificiel " +
                "SyntheticGarlandDecorator: test, price=123.8,TreeColorjaune" +
                " SyntheticGarlandColor: blouge} Garland{length=0.0} SyntheticGarland{" +
                " SyntheticGarlandPaillette: Circle}");
    }
}