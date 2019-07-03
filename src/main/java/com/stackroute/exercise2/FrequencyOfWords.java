package stackroute.practice_assessment_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util .*;


public class FrequencyOfWords
{
        public String wordFrequencyFile(String path) throws IOException //io exception
        {
            FileReader fr = new FileReader(path);
            int i;
            String out = "";
            while ((i = fr.read()) != -1)
                out = out + ((char) i);
            fr.close();
            String[] arrOut = out.split(" |,");

            HashMap<String, Integer> h = new HashMap();
            for (i = 0; i < arrOut.length; i++) //loop starts here
            {
                arrOut[i] = arrOut[i].trim();
                h.put(arrOut[i], 0);
            }
            for (i = 0; i < arrOut.length; i++) //loop starts here
            {
                if (h.containsKey(arrOut[i])) //condition
                {
                    int temp = h.get(arrOut[i]);
                    h.put(arrOut[i], temp + 1);
                }
            }
            Set set = h.entrySet();
            Iterator iterator = set.iterator();
            while (iterator.hasNext()) //while starts here
            {
                Map.Entry mentry = (Map.Entry) iterator.next();
                out = out + (" " + mentry.getKey() + ":-");
                out = out + (mentry.getValue());
            }
            return out;
        }

    }
