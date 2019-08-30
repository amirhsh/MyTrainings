package codeforces.AProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BowWowAndTheTimetable {
    public static void main(String[] args) {
        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String binaryStr = bufferedReader.readLine();
            char[] binaryChars = binaryStr.toCharArray();
            double decimalFromChar = 0;
            long binaryCharsLength = binaryChars.length;
            for (int i = (int) (binaryCharsLength - 1); i >=0 ; i-- ){
                double tmp = 0;
                if (binaryChars[i] == '1'){
                    tmp = (int) Math.pow(2 , (binaryCharsLength -1) - i  );
                    decimalFromChar += tmp;
                }
            }
            int finalOutput = 0;
            long base4 = 0;
            while (base4 < decimalFromChar){
                base4 = (long) Math.pow(4,finalOutput);
                if (base4 < decimalFromChar)
                    finalOutput ++;

            }


            System.out.println(finalOutput);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
