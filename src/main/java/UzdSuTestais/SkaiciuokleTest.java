package UzdSuTestais;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class SkaiciuokleTest {

    @Test
    public void testSudetis(){
        Skaiciuokle skaiciuokle = new Skaiciuokle(4, 2);
        assertEquals(6, skaiciuokle.sudetis());
    }

    @Test
    public void testAtimtis(){
        Skaiciuokle skaiciuokle = new Skaiciuokle(4,2);
        assertEquals(2, skaiciuokle.atimtis());
    }

    @Test
    public void testDaugyba(){
        Skaiciuokle skaiciuokle = new Skaiciuokle(4,2);
        assertEquals(8, skaiciuokle.daugyba());
    }

    @Test
    public void testDalyba(){
        Skaiciuokle skaiciuokle = new Skaiciuokle(4,2);
        assertEquals(2, skaiciuokle.dalyba());
    }

    @Test
    public void testDalyba0(){
        Skaiciuokle skaiciuokle = new Skaiciuokle(4,0);
        assertThrows(ArithmeticException.class, skaiciuokle::dalyba);
    }

}
