package stackroute.practice_assessment_2_test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import stackroute.practice_assessment_2.checkpowerof4;

import static org.junit.Assert.*;

public class checkpowerof4Test
{
    checkpowerof4 object;
    @Before
    public void setUp() throws Exception
    {
        System.out.println("Before");
        object=new checkpowerof4();
    }

    @After
    public void tearDown() throws Exception
    {
        System.out.println("After");
        object=null;
    }
    @Test
    public void firstcheckpower4()
    {
        String result=object.checkpower4(45);
        assertEquals("Not Power of 4",result);
    }
    @Test
    public void secondcheckpower4()
    {
        String result=object.checkpower4(64);
        assertEquals("Power of 4",result);
    }
    @Test
    public void thirdcheckpower4()
    {
        String result=object.checkpower4(0);
        assertEquals("Not Power of 4",result);
    }
}