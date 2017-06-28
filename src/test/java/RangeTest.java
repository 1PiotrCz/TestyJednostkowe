import org.junit.*;
import pl.piotrcz.Range;

/**
 * Created by Piotr Czubkowski on 2017-06-26.
 */
public class RangeTest {

    private static Range objectRange;

    @BeforeClass
    public static void setUpClass() throws Exception {
        // ta metoda wykona się raz przed rozpoczeciem
        objectRange = new Range(10, 20);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        // ta metoda wykona się raz po zakończeniu
        objectRange = null;

        /* DEBUG */
        System.out.println("Zamykam test");
    }

    @Before
    public void setUp (){
        System.out.println("Wykonuje metode przez rozpoczeciem kazdego pojedynczego testu");
    }

    @After
    public void tearDown (){
        //ta metoda wykona sie po każdym wykonanym teście
    }


    @Test
    public void testInRange() {
        Range objectRange = new Range(10, 20);
        objectRange.isInRange(5);
        Assert.assertEquals("Wynikiem powinno być fałsz", false, objectRange.isInRange(5));
        Assert.assertEquals("Wynikiem powinno być prawda", true, objectRange.isInRange(10));
        Assert.assertEquals("Wynikiem powinno być prawda", true, objectRange.isInRange(20));
        Assert.assertEquals("Wynikiem powinno być fałsz", false, objectRange.isInRange(-4));

        objectRange.setStop(50);
        Assert.assertEquals("Wynikiem powinno być prawda", true, objectRange.isInRange(49));

        //otwieram testy recznie
        //Assert.fail ("Nie powinno byc takiego samego stanu!");

    }

    @Test
    public void exampleTest (){
        System.out.println("Testujemy więcej niż jeden test per klasa");
    }

    @Test
    public void addMethodTest (){
        Assert.assertEquals("Wynikiem powinno byc 5", 5, objectRange.addMethod(3,2));

        boolean exceptionCached = false;
        try {
            objectRange.addMethod(-3,5);
        }catch (IllegalArgumentException e){
            exceptionCached= true;
        }
        if (!exceptionCached){
            Assert.fail("Brak wyjatku");
        }
        Assert.assertEquals("Wynikiem powinno byc 0", 0, objectRange.addMethod(0,0));
    }
}
