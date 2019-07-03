/*
 Write a Java method to check if a given number is power of 4
 */
package stackroute.practice_assessment_2;

public class checkpowerof4
{
    public String checkpower4(int input1)//function to check power of 4
    {
        if (input1==0)//input1 is 0
        {
            return "Not Power of 4";
        }
        while (input1!=1)//as long as input1 is not 1
        {
            if (input1%4!=0)//multiple of 4
            {
                return "Not Power of 4";

            }
            input1=input1/4;
        }
        return "Power of 4";
    }
}
