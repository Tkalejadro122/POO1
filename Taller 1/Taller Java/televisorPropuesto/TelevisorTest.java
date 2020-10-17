

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TelevisorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TelevisorTest
{
    /**
     * Default constructor for test class TelevisorTest
     */
    public TelevisorTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testVolumen()
    {
        Televisor televisor = new Televisor(0, 20, 1);
        assertEquals(false, televisor.subirVolumen());
        assertEquals(true, televisor.bajarVolumen());
        assertEquals(true, televisor.subirVolumen());
        assertEquals(false, televisor.subirVolumen());
    }

    @Test
    public void testCanales()
    {
        Televisor televisor = new Televisor(1, 1, 13);
        televisor.avanzarCanal();
        assertEquals(1, televisor.getCanal());
        televisor.avanzarCanal();
        assertEquals(2, televisor.getCanal());
        televisor.retrocederCanal();
        televisor.retrocederCanal();
        assertEquals(13, televisor.getCanal());
        televisor.retrocederCanal();
        assertEquals(12, televisor.getCanal());
    }

    @Test
    public void testmaximoCanales()
    {
        Televisor televisor = new Televisor();
	assertEquals(0, televisor.getMaximoCanal());
        televisor.setTipoDeEntrada(1);
        assertEquals(13, televisor.getMaximoCanal());
        televisor.setTipoDeEntrada(2);
        assertEquals(100, televisor.getMaximoCanal());
	televisor.setTipoDeEntrada(3);
        assertEquals(3, televisor.getMaximoCanal());

    }
}



