package stackroute.practice_assessment_2_test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import stackroute.practice_assessment_2.ReversePalindromeCheck;

import static org.junit.Assert.*;
public class ReversePalindromeCheckTest {

    ReversePalindromeCheck object;
    @Before
    public void setUp() throws Exception {
        object=new ReversePalindromeCheck();
        System.out.println("Before ");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");
        object=null;
    }
    @Test
    public void firstcheckreversepalindrome()
    {
        String result=object.reversePalindrome(146);
        Assert.assertEquals("It is not Palindrome",result);
    }
    @Test
    public void secondcheckreversepalindrome()
    {
        String result=object.reversePalindrome(14641);
        Assert.assertEquals("It is Palindrome",result);
    }
    @Test
    public void thirdcheckreversepalindrome()
    {
        String result=object.reversePalindrome(78912);
        Assert.assertEquals("It is not Palindrome",result);
    }
}