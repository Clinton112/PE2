/*
 Write a program, which reads number of students and n grades as input (of int
 between 0 and 100, inclusive) and displays the average, minimum and maximum.Your
 program shall check for valid input. You should keep all the grades in an int[] and use a
 method for each of the computations.
 Output:
 Enter the number of students: 4
 Enter the grade for student 1: 86
 Enter the grade for student 2: 65
 Enter the grade for student 3: 98
 Enter the grade for student 4: 77
 */
package stackroute.practice_assessment_2;

public class AverageMinimumMaximum
{
    public String checkconditions(int[] grades)
    {
        double average=checkAverage(grades);//check average
        int minimum=checkMin(grades);//check minimum
        int maximum=checkMax(grades);//check maximum
        return "Average is "+average+" Minimum is "+minimum+" Maximum is "+maximum;
    }




    public static double checkAverage(int grades[])//check averagefunction
    {
        double sum=0;
        for(int loop=0;loop<grades.length;loop++)
        {
            sum=sum+grades[loop];
        }
        double average=sum/grades.length;

        return average;

    }
    public static int checkMin(int grades[])//check minimum
    {
        int minValue = grades[0];
        for(int loop=1;loop<grades.length;loop++)
        {
            if(grades[loop] < minValue)
            {
                minValue = grades[loop];

            }
        }
        return minValue;
    }
    public static int checkMax(int grades[])//check maximum
    {
        int maxValue = grades[0];
        for(int loop=1;loop < grades.length;loop++){
            if(grades[loop] > maxValue){
                maxValue = grades[loop];
            }
        }
        return maxValue;

    }
}
