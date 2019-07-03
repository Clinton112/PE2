/*
 Write a Java method to Reverse the given input & Check if it is a Palindrome.
 */
package stackroute.practice_assessment_2;

public class ReversePalindromeCheck
{
    public String reversePalindrome(int givennumber)//function to check for palindrome
    {
        int tempinput=givennumber;//tempinput copies giveninput
        int modulusvar,reversesum=0;
        while(tempinput>0)//while starts here
        {
            modulusvar=tempinput%10;
            reversesum=reversesum*10+modulusvar;
            tempinput=tempinput/10;
        }
        if(reversesum==givennumber)//check for equality
        {
            return "It is Palindrome";
        }
        else
        {
            return "It is not Palindrome";
        }
    }
}
