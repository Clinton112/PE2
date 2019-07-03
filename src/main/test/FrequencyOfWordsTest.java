
package stackroute.practice_assessment_2_test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import stackroute.practice_assessment_2.FrequencyOfWords;
import java.io.*;
import static org.junit.Assert.*;

public class FrequencyOfWordsTest
{

        FrequencyOfWords ob;

        @Before
        public void setUp() throws Exception {
            ob=new FrequencyOfWords();
        }

        @After
        public void tearDown() throws Exception {
            ob=null;
        }

        @Test
        public void countWordFrequencyFile() throws IOException {
            String res=ob.wordFrequencyFile("/home/clinton/Practice Assessment 2/src/stackroute/practice_assessment_2_test/Testdocument.txt");
            assertEquals("i am a man,\n" +
                    "i like to sleep,\n" +
                    "i have a home.\n" +
                    " sleep:-1 a:-2 home.:-1 like:-1 have:-1 i:-3 man:-1 to:-1 am:-1",res);

        }

    }
