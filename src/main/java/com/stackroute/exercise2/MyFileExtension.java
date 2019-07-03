/*
 Write a program to find all files of a folder and select only given extention fileName and
 read content of this file using byte array
 */
package stackroute.practice_assessment_2;
import java.io.File;
import java.io.FilenameFilter;
public class MyFileExtension
{
    public static void main(String a[])//main function
    {
        File file = new File("/home");
        File[] files = file.listFiles(new FilenameFilter()
        {
            @Override
            public boolean accept(File dir, String name)//accept function
            {
                if(name.toLowerCase().endsWith(".sh"))//condition
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        });
        for(File f:files)//for each function
        {
            System.out.println(f.getName());
        }
    }
}
