package stackroute.practice_assessment_2_test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import stackroute.practice_assessment_2.EvenNum;

import static org.junit.Assert.*;

public class EvenNumTest {
    private static EvenNum object;

    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
        object=new EvenNum();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");
        object=null;
    }

    @Test
    public  void isEvencheck()
    {
        boolean result=object.isEven(4);
        assertEquals(true,result);
    }
    @Test
    public  void isEvenchecktwo()
    {
        boolean result=object.isEven(45);
        assertEquals(false,result);
    }
    @Test
    public  void isEvencheckthree()
    {
        boolean result=object.isEven(2);
        assertEquals(true,result);
    }

}