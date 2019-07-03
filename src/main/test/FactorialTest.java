package stackroute.practice_assessment_2_test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import stackroute.practice_assessment_2.Factorial;

import static org.junit.Assert.*;

public class FactorialTest
{
    Factorial object;

    @Before
    public void setUp() throws Exception
    {
        System.out.println("Before");
        object=new Factorial();
    }

    @After
    public void tearDown() throws Exception
    {
        System.out.println("After");
        object=null;
    }
    @Test
    public void checkfactint()
    {
        int results=object.factorial(12);
        assertEquals(479001600,results);
    }
    @Test
    public void checkfactinttwo()
    {
        int results=object.factorial(13);
        assertEquals("Out of range",results);
    }
    @Test
    public void checkfactlong()
    {
        long results=object.factorial(20);
        assertEquals(2432902008176640000L,results);
    }
    @Test
    public void checkfactlongtwo()
    {
        int results=object.factorial(21);
        assertEquals("Out of range",results);
    }
}