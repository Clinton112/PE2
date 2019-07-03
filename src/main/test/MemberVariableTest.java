
package stackroute.practice_assessment_2_test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import stackroute.practice_assessment_2.MemberVariable;

import static org.junit.Assert.*;

public class MemberVariableTest {
    MemberVariable object;

    @Before
    public void setUp() throws Exception {
        System.out.println("before");
        object=new MemberVariable();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after");
        object=null;
    }
    @Test
    public void checkmember()
    {
        String result=object.set("Clinton",22,1000000);
        assertEquals("Members Name: Clinton\nMembers Age: 22\nMembers Salary: 1000000.0\n",result);
    }
    @Test
    public void secondcheckmember()
    {
        String result=object.set("Narcos",42,100000000);
        assertEquals("Members Name: Narcos\nMembers Age: 42\nMembers Salary: 100000000.0\n",result);
    }
    @Test
    public void thirdcheckmember()
    {
        String result=object.set("Thanos",22222,10000);
        assertEquals("Members Name: Clinton\nMembers Age:22222 \nMembers Salary: 10000.0\n",result);
    }
}