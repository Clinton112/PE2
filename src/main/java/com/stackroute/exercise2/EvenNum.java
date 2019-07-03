/*
 Write a boolean method called isEven() in a class called EvenNumTest, which takes
 an int as input and returns true if the input is even. The signature of the method is as
 follows: public static boolean isEven(int number)
 */
package stackroute.practice_assessment_2;

public class EvenNum
{
    public static boolean isEven(int input1)//check for even number
    {
        if(input1%2==0)//even or not
        {
            return true;
        }
        return false;
    }
}
