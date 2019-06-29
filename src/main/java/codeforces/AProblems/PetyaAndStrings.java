package codeforces.AProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem num: 112A
 */
public class PetyaAndStrings {
    public static void main(String[] args) {
        try(InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line1 = bufferedReader.readLine().toLowerCase();
            String line2 = bufferedReader.readLine().toLowerCase();
            int comapriosionValue = 0;
            comapriosionValue = line1.compareTo(line2);
            if(comapriosionValue < 0){
                System.out.println("-1");
            }else if (comapriosionValue == 0){
                System.out.println("0");
            }else if (comapriosionValue >=1){
                System.out.println("1");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
