package stackroute.practice_assessment_2_test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import stackroute.practice_assessment_2.AverageMinimumMaximum;

import static org.junit.Assert.*;

public class AverageMinimumMaximumTest {
    AverageMinimumMaximum object;

    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
        object=new AverageMinimumMaximum();

    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");
        object=null;
    }

    @Test
    public void checkconditions() {
        int[] inp={86,68,77,91};
        String result=object.checkconditions(inp);
        assertEquals("Average is 80.5 Minimum is 68 Maximum is 91",result);
    }
    @Test
    public void secondcheckconditions() {
        int[] inp={56,48,73,51};
        String result=object.checkconditions(inp);
        assertEquals("Average is 57 Minimum is 48 Maximum is 73",result);
    }
    @Test
    public void thirdcheckconditions() {
        int[] inp={96,98,97,99};
        String result=object.checkconditions(inp);
        assertEquals("Average is 97.5 Minimum is 96 Maximum is 99",result);
    }
}